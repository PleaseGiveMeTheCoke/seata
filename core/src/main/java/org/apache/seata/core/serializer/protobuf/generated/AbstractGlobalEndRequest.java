// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractGlobalEndRequest.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class AbstractGlobalEndRequest {
  private AbstractGlobalEndRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\036abstractGlobalEndRequest.proto\022\"org.ap" +
      "ache.seata.protocol.protobuf\032 abstractTr" +
      "ansactionRequest.proto\"\250\001\n\035AbstractGloba" +
      "lEndRequestProto\022g\n\032abstractTransactionR" +
      "equest\030\001 \001(\0132C.org.apache.seata.protocol" +
      ".protobuf.AbstractTransactionRequestProt" +
      "o\022\013\n\003xid\030\002 \001(\t\022\021\n\textraData\030\003 \001(\tBL\n.org" +
      ".apache.seata.serializer.protobuf.genera" +
      "tedB\030AbstractGlobalEndRequestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AbstractTransactionRequest.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor,
        new String[] { "AbstractTransactionRequest", "Xid", "ExtraData", });
    AbstractTransactionRequest.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
