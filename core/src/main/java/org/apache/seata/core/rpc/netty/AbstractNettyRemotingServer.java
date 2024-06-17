/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.seata.core.rpc.netty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeoutException;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.http2.Http2DataFrame;
import io.netty.handler.codec.http2.Http2Headers;
import io.netty.handler.codec.http2.Http2HeadersFrame;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.ReferenceCounted;
import org.apache.seata.common.exception.ShouldNeverHappenException;
import org.apache.seata.common.util.NetUtil;
import org.apache.seata.core.compressor.Compressor;
import org.apache.seata.core.compressor.CompressorFactory;
import org.apache.seata.core.compressor.CompressorType;
import org.apache.seata.core.protocol.HeartbeatMessage;
import org.apache.seata.core.protocol.ProtocolConstants;
import org.apache.seata.core.protocol.RpcMessage;
import org.apache.seata.core.protocol.generated.GrpcMessageProto;
import org.apache.seata.core.rpc.RemotingServer;
import org.apache.seata.core.rpc.RpcContext;
import org.apache.seata.core.rpc.netty.grpc.GrpcHeaderEnum;
import org.apache.seata.core.rpc.processor.Pair;
import org.apache.seata.core.rpc.processor.RemotingProcessor;
import org.apache.seata.core.serializer.protobuf.convertor.PbConvertor;
import org.apache.seata.core.serializer.protobuf.manager.ProtobufConvertManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type abstract remoting server.
 *
 * @since 1.3.0
 */
public abstract class AbstractNettyRemotingServer extends AbstractNettyRemoting implements RemotingServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractNettyRemotingServer.class);

    private final NettyServerBootstrap serverBootstrap;

    @Override
    public void init() {
        super.init();
        serverBootstrap.start();
    }

    public AbstractNettyRemotingServer(ThreadPoolExecutor messageExecutor, NettyServerConfig nettyServerConfig) {
        super(messageExecutor);
        serverBootstrap = new NettyServerBootstrap(nettyServerConfig);
        serverBootstrap.setChannelHandlers(new Http2ServerHandler());
        serverBootstrap.setChannelHandlers(new ServerHandler());
    }

    @Override
    public Object sendSyncRequest(String resourceId, String clientId, Object msg, boolean tryOtherApp)
        throws TimeoutException {
        Channel channel = ChannelManager.getChannel(resourceId, clientId, tryOtherApp);
        if (channel == null) {
            throw new RuntimeException("rm client is not connected. dbkey:" + resourceId + ",clientId:" + clientId);
        }
        RpcMessage rpcMessage = buildRequestMessage(msg, ProtocolConstants.MSGTYPE_RESQUEST_SYNC);
        return super.sendSync(channel, rpcMessage, NettyServerConfig.getRpcRequestTimeout());
    }

    @Override
    public Object sendSyncRequest(Channel channel, Object msg) throws TimeoutException {
        if (channel == null) {
            throw new RuntimeException("client is not connected");
        }
        RpcMessage rpcMessage = buildRequestMessage(msg, ProtocolConstants.MSGTYPE_RESQUEST_SYNC);
        return super.sendSync(channel, rpcMessage, NettyServerConfig.getRpcRequestTimeout());
    }

    @Override
    public void sendAsyncRequest(Channel channel, Object msg) {
        if (channel == null) {
            throw new RuntimeException("client is not connected");
        }
        RpcMessage rpcMessage = buildRequestMessage(msg, ProtocolConstants.MSGTYPE_RESQUEST_ONEWAY);
        super.sendAsync(channel, rpcMessage);
    }

    @Override
    public void sendAsyncResponse(RpcMessage rpcMessage, Channel channel, Object msg) {
        Channel clientChannel = channel;
        if (!(msg instanceof HeartbeatMessage)) {
            clientChannel = ChannelManager.getSameClientChannel(channel);
        }
        if (clientChannel != null) {
            RpcMessage rpcMsg = buildResponseMessage(rpcMessage, msg, msg instanceof HeartbeatMessage
                ? ProtocolConstants.MSGTYPE_HEARTBEAT_RESPONSE
                : ProtocolConstants.MSGTYPE_RESPONSE);
            super.sendAsync(clientChannel, rpcMsg);
        } else {
            throw new RuntimeException("channel is error.");
        }
    }

    @Override
    public void registerProcessor(int messageType, RemotingProcessor processor, ExecutorService executor) {
        Pair<RemotingProcessor, ExecutorService> pair = new Pair<>(processor, executor);
        this.processorTable.put(messageType, pair);
    }

    /**
     * Gets listen port.
     *
     * @return the listen port
     */
    public int getListenPort() {
        return serverBootstrap.getListenPort();
    }

    @Override
    public void destroy() {
        serverBootstrap.shutdown();
        super.destroy();
    }

    /**
     * Debug log.
     *
     * @param format the info
     * @param arguments the arguments
     */
    protected void debugLog(String format, Object... arguments) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(format, arguments);
        }
    }

    private void closeChannelHandlerContext(ChannelHandlerContext ctx) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("closeChannelHandlerContext channel:" + ctx.channel());
        }
        ctx.disconnect();
        ctx.close();
    }

    /**
     * The type ServerHandler.
     */
    @ChannelHandler.Sharable
    class ServerHandler extends ChannelDuplexHandler {

        /**
         * Channel read.
         *
         * @param ctx the ctx
         * @param msg the msg
         * @throws Exception the exception
         */
        @Override
        public void channelRead(final ChannelHandlerContext ctx, Object msg) throws Exception {
            if (!(msg instanceof RpcMessage)) {
                return;
            }
            processMessage(ctx, (RpcMessage) msg);
        }

        @Override
        public void channelWritabilityChanged(ChannelHandlerContext ctx) {
            synchronized (lock) {
                if (ctx.channel().isWritable()) {
                    lock.notifyAll();
                }
            }
            ctx.fireChannelWritabilityChanged();
        }

        /**
         * Channel inactive.
         *
         * @param ctx the ctx
         * @throws Exception the exception
         */
        @Override
        public void channelInactive(ChannelHandlerContext ctx) throws Exception {
            debugLog("inactive:{}", ctx);
            if (messageExecutor.isShutdown()) {
                return;
            }
            handleDisconnect(ctx);
            super.channelInactive(ctx);
        }

        private void handleDisconnect(ChannelHandlerContext ctx) {
            final String ipAndPort = NetUtil.toStringAddress(ctx.channel().remoteAddress());
            RpcContext rpcContext = ChannelManager.getContextFromIdentified(ctx.channel());
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info(ipAndPort + " to server channel inactive.");
            }
            if (rpcContext != null && rpcContext.getClientRole() != null) {
                rpcContext.release();
                if (LOGGER.isInfoEnabled()) {
                    LOGGER.info("remove channel:" + ctx.channel() + "context:" + rpcContext);
                }
            } else {
                if (LOGGER.isInfoEnabled()) {
                    LOGGER.info("remove unused channel:" + ctx.channel());
                }
            }
        }

        /**
         * Exception caught.
         *
         * @param ctx   the ctx
         * @param cause the cause
         * @throws Exception the exception
         */
        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
            try {
                if (cause instanceof DecoderException && null == ChannelManager.getContextFromIdentified(ctx.channel())) {
                    return;
                }
                LOGGER.error("exceptionCaught:{}, channel:{}", cause.getMessage(), ctx.channel());
                super.exceptionCaught(ctx, cause);
            } finally {
                ChannelManager.releaseRpcContext(ctx.channel());
            }
        }

        /**
         * User event triggered.
         *
         * @param ctx the ctx
         * @param evt the evt
         * @throws Exception the exception
         */
        @Override
        public void userEventTriggered(ChannelHandlerContext ctx, Object evt) {
            if (evt instanceof IdleStateEvent) {
                debugLog("idle:{}", evt);
                IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
                if (idleStateEvent.state() == IdleState.READER_IDLE) {
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info("channel:" + ctx.channel() + " read idle.");
                    }
                    handleDisconnect(ctx);
                    try {
                        closeChannelHandlerContext(ctx);
                    } catch (Exception e) {
                        LOGGER.error(e.getMessage());
                    }
                }
            }
        }

        @Override
        public void close(ChannelHandlerContext ctx, ChannelPromise future) throws Exception {
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info(ctx + " will closed");
            }
            super.close(ctx, future);
        }

    }


    @ChannelHandler.Sharable
    class Http2ServerHandler extends ChannelDuplexHandler {
        private Compressor compressor;

        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            if (msg instanceof Http2HeadersFrame) {
                onHeadersRead(ctx, (Http2HeadersFrame) msg);
            } else if (msg instanceof Http2DataFrame) {
                onDataRead(ctx, (Http2DataFrame) msg);
            } else if (msg instanceof ReferenceCounted) {
                // ignored
                ctx.fireChannelRead(msg);
            }
        }

        public void onDataRead(ChannelHandlerContext ctx, Http2DataFrame msg) throws Exception {
            ByteBuf content = msg.content();
            byte[] bytes = compressor.compress(content.array());
            GrpcMessageProto grpcMessageProto = GrpcMessageProto.parseFrom(bytes);
            Any body = grpcMessageProto.getBody();
            int messageType = grpcMessageProto.getMessageType();
            int messageId = grpcMessageProto.getId();
            final Class clazz = ProtobufConvertManager.getInstance().fetchProtoClass(
                    getTypeNameFromTypeUrl(body.getTypeUrl()));
            if (body.is(clazz)) {
                try {
                    Object ob = body.unpack(clazz);
                    final PbConvertor pbConvertor = ProtobufConvertManager.getInstance().fetchReversedConvertor(
                            clazz.getName());
                    Object model = pbConvertor.convert2Model(ob);

                    RpcMessage rpcMsg = new RpcMessage();
                    rpcMsg.setMessageType((byte) messageType);
                    rpcMsg.setBody(model);
                    rpcMsg.setId(messageId);
                    rpcMsg.setHeadMap(grpcMessageProto.getHeadMapMap());

                    ctx.fireChannelRead(rpcMsg);
                } catch (InvalidProtocolBufferException e) {
                    throw new ShouldNeverHappenException(e);
                }
            }
        }

        public void onHeadersRead(ChannelHandlerContext ctx, Http2HeadersFrame headersFrame) throws Exception {
            Http2Headers headers = headersFrame.headers();
            CharSequence messageEncoding = headers.get(GrpcHeaderEnum.GRPC_ENCODING.header);
            Compressor compressor = CompressorFactory.getCompressor(CompressorType.NONE.getCode());
            if (null != messageEncoding) {
                byte compressorType = messageEncoding.toString().getBytes()[0];
                compressor = CompressorFactory.getCompressor(compressorType);
                if (null == compressor) {
                    // error
                    return;
                }
            }
            this.compressor = compressor;
        }



        private String getTypeNameFromTypeUrl(java.lang.String typeUrl) {
            int pos = typeUrl.lastIndexOf('/');
            return pos == -1 ? "" : typeUrl.substring(pos + 1);
        }
    }
}
