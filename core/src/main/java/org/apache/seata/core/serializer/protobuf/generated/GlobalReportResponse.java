// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalReportResponse.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class GlobalReportResponse {
  private GlobalReportResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_GlobalReportResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_GlobalReportResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\032globalReportResponse.proto\022\"org.apache" +
      ".seata.protocol.protobuf\032\037abstractGlobal" +
      "EndResponse.proto\"\202\001\n\031GlobalReportRespon" +
      "seProto\022e\n\031abstractGlobalEndResponse\030\001 \001" +
      "(\0132B.org.apache.seata.protocol.protobuf." +
      "AbstractGlobalEndResponseProtoBH\n.org.ap" +
      "ache.seata.serializer.protobuf.generated" +
      "B\024GlobalReportResponseP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndResponse.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_GlobalReportResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_GlobalReportResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_GlobalReportResponseProto_descriptor,
        new String[] { "AbstractGlobalEndResponse", });
    org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
