// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: batchResultMessage.proto

package org.apache.seata.core.serializer.protobuf.generated;

public final class BatchResultMessage {
  private BatchResultMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_seata_protocol_protobuf_BatchResultMessageProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_seata_protocol_protobuf_BatchResultMessageProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030batchResultMessage.proto\022\"org.apache.s" +
      "eata.protocol.protobuf\032\025abstractMessage." +
      "proto\032\031google/protobuf/any.proto\"\252\001\n\027Bat" +
      "chResultMessageProto\022Q\n\017abstractMessage\030" +
      "\001 \001(\01328.org.apache.seata.protocol.protob" +
      "uf.AbstractMessageProto\022,\n\016resultMessage" +
      "s\030\002 \003(\0132\024.google.protobuf.Any\022\016\n\006msgIds\030" +
      "\003 \003(\005BF\n.org.apache.seata.serializer.pro" +
      "tobuf.generatedB\022BatchResultMessageP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.seata.core.serializer.protobuf.generated.AbstractMessage.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_org_apache_seata_protocol_protobuf_BatchResultMessageProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_seata_protocol_protobuf_BatchResultMessageProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_seata_protocol_protobuf_BatchResultMessageProto_descriptor,
        new String[] { "AbstractMessage", "ResultMessages", "MsgIds", });
    org.apache.seata.core.serializer.protobuf.generated.AbstractMessage.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
