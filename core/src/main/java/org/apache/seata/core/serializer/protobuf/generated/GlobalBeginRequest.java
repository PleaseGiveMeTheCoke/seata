// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalBeginRequest.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class GlobalBeginRequest {
  private GlobalBeginRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_GlobalBeginRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_GlobalBeginRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030globalBeginRequest.proto\022\"org.apache.s" +
      "eata.protocol.protobuf\032 abstractTransact" +
      "ionRequest.proto\"\254\001\n\027GlobalBeginRequestP" +
      "roto\022g\n\032abstractTransactionRequest\030\001 \001(\013" +
      "2C.org.apache.seata.protocol.protobuf.Ab" +
      "stractTransactionRequestProto\022\017\n\007timeout" +
      "\030\002 \001(\005\022\027\n\017transactionName\030\003 \001(\tBF\n.org.a" +
      "pache.seata.serializer.protobuf.generate" +
      "dB\022GlobalBeginRequestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AbstractTransactionRequest.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_GlobalBeginRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_GlobalBeginRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_GlobalBeginRequestProto_descriptor,
        new String[] { "AbstractTransactionRequest", "Timeout", "TransactionName", });
    AbstractTransactionRequest.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
