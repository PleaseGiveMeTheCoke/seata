// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractResultMessage.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class AbstractResultMessage {
  private AbstractResultMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_AbstractResultMessageProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_AbstractResultMessageProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033abstractResultMessage.proto\022\"org.apach" +
      "e.seata.protocol.protobuf\032\020resultCode.pr" +
      "oto\032\025abstractMessage.proto\"\305\001\n\032AbstractR" +
      "esultMessageProto\022Q\n\017AbstractMessage\030\001 \001" +
      "(\01328.org.apache.seata.protocol.protobuf." +
      "AbstractMessageProto\022G\n\nresultCode\030\002 \001(\016" +
      "23.org.apache.seata.protocol.protobuf.Re" +
      "sultCodeProto\022\013\n\003msg\030\003 \001(\tBI\n.org.apache" +
      ".seata.serializer.protobuf.generatedB\025Ab" +
      "stractResultMessageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.seata.core.serializer.protobuf.generated.ResultCode.getDescriptor(),
          AbstractMessage.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_AbstractResultMessageProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_AbstractResultMessageProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_AbstractResultMessageProto_descriptor,
        new String[] { "AbstractMessage", "ResultCode", "Msg", });
    org.apache.seata.core.serializer.protobuf.generated.ResultCode.getDescriptor();
    AbstractMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
