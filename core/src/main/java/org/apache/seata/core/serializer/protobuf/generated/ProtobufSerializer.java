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
package org.apache.seata.core.serializer.protobuf.generated;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import com.google.protobuf.GeneratedMessageV3;

import org.apache.seata.common.loader.LoadLevel;
import org.apache.seata.common.util.BufferUtils;
import org.apache.seata.core.serializer.Serializer;
import org.apache.seata.core.serializer.protobuf.convertor.PbConvertor;
import org.apache.seata.core.serializer.protobuf.manager.ProtobufConvertManager;

/**
 * The type Protobuf codec.
 *
 */
@LoadLevel(name = "PROTOBUF", order = 0)
public class ProtobufSerializer implements Serializer {

    protected static final Charset UTF8 = StandardCharsets.UTF_8;

    @Override
    public <T> byte[] serialize(T t) {
        if (t == null) {
            throw new NullPointerException();
        }


        //translate to pb
        final PbConvertor pbConvertor = ProtobufConvertManager.getInstance().fetchConvertor(
            t.getClass().getName());
        //for cross language,write FullName to data,which defines in proto file
        GeneratedMessageV3 newBody = (GeneratedMessageV3)pbConvertor.convert2Proto(t);
        byte[] body = ProtobufInnerSerializer.serializeContent(newBody);
        final String name = newBody.getDescriptorForType().getFullName();
        final byte[] nameBytes = name.getBytes(UTF8);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + nameBytes.length + body.length);
        byteBuffer.putInt(nameBytes.length);
        byteBuffer.put(nameBytes);
        byteBuffer.put(body);
        BufferUtils.flip(byteBuffer);
        byte[] content = new byte[byteBuffer.limit()];
        byteBuffer.get(content);
        return content;
    }

    @Override
    public <T> T deserialize(byte[] bytes) {
        if (bytes == null) {
            throw new NullPointerException();
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        int clazzNameLength = byteBuffer.getInt();
        byte[] clazzName = new byte[clazzNameLength];
        byteBuffer.get(clazzName);
        byte[] body = new byte[bytes.length - clazzNameLength - 4];
        byteBuffer.get(body);
        final String descriptorName = new String(clazzName, UTF8);
        Class protobufClazz = ProtobufConvertManager.getInstance().fetchProtoClass(descriptorName);
        Object protobufObject = ProtobufInnerSerializer.deserializeContent(protobufClazz.getName(), body);
        //translate back to core model
        final PbConvertor pbConvertor = ProtobufConvertManager.getInstance().fetchReversedConvertor(protobufClazz.getName());
        Object newBody = pbConvertor.convert2Model(protobufObject);
        return (T)newBody;
    }

}
