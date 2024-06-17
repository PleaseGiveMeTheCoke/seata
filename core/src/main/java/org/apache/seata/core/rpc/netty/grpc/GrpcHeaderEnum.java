package org.apache.seata.core.rpc.netty.grpc;

public enum GrpcHeaderEnum {
    /**
     * 超时时间
     */
    TIMEOUT("grpc-timeout"),

    /**
     * 压缩/解压缩
     */
    GRPC_ENCODING("grpc-encoding");

    public final String header;

    GrpcHeaderEnum(String header) {
        this.header = header;
    }
}
