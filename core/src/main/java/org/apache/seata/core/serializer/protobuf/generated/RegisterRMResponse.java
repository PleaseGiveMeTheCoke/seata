// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registerRMResponse.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class RegisterRMResponse {
  private RegisterRMResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_RegisterRMResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_RegisterRMResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030registerRMResponse.proto\022\"org.apache.s" +
      "eata.protocol.protobuf\032\036abstractIdentify" +
      "Response.proto\"~\n\027RegisterRMResponseProt" +
      "o\022c\n\030abstractIdentifyResponse\030\001 \001(\0132A.or" +
      "g.apache.seata.protocol.protobuf.Abstrac" +
      "tIdentifyResponseProtoBF\n.org.apache.sea" +
      "ta.serializer.protobuf.generatedB\022Regist" +
      "erRMResponseP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AbstractIdentifyResponse.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_RegisterRMResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_RegisterRMResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_RegisterRMResponseProto_descriptor,
        new String[] { "AbstractIdentifyResponse", });
    AbstractIdentifyResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
