// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractIdentifyRequest.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class AbstractIdentifyRequest {
  private AbstractIdentifyRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_AbstractIdentifyRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\035abstractIdentifyRequest.proto\022\"org.apa" +
      "che.seata.protocol.protobuf\032\025abstractMes" +
      "sage.proto\"\315\001\n\034AbstractIdentifyRequestPr" +
      "oto\022Q\n\017abstractMessage\030\001 \001(\01328.org.apach" +
      "e.seata.protocol.protobuf.AbstractMessag" +
      "eProto\022\017\n\007version\030\002 \001(\t\022\025\n\rapplicationId" +
      "\030\003 \001(\t\022\037\n\027transactionServiceGroup\030\004 \001(\t\022" +
      "\021\n\textraData\030\005 \001(\tBK\n.org.apache.seata.s" +
      "erializer.protobuf.generatedB\027AbstractId" +
      "entifyRequestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AbstractMessage.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_AbstractIdentifyRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor,
        new String[] { "AbstractMessage", "Version", "ApplicationId", "TransactionServiceGroup", "ExtraData", });
    AbstractMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
