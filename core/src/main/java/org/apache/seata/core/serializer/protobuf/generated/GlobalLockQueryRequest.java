// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalLockQueryRequest.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class GlobalLockQueryRequest {
  private GlobalLockQueryRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_GlobalLockQueryRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_GlobalLockQueryRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034globalLockQueryRequest.proto\022\"org.apac" +
      "he.seata.protocol.protobuf\032\033branchRegist" +
      "erRequest.proto\"|\n\033GlobalLockQueryReques" +
      "tProto\022]\n\025branchRegisterRequest\030\001 \001(\0132>." +
      "org.apache.seata.protocol.protobuf.Branc" +
      "hRegisterRequestProtoBJ\n.org.apache.seat" +
      "a.serializer.protobuf.generatedB\026GlobalL" +
      "ockQueryRequestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.seata.core.serializer.protobuf.generated.BranchRegisterRequest.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_GlobalLockQueryRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_GlobalLockQueryRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_GlobalLockQueryRequestProto_descriptor,
        new String[] { "BranchRegisterRequest", });
    org.apache.seata.core.serializer.protobuf.generated.BranchRegisterRequest.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
