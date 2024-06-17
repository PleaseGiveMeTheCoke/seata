// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: branchCommitRequest.proto

package org.apache.seata.core.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code org.apache.seata.protocol.protobuf.BranchCommitRequestProto}
 */
public  final class BranchCommitRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.apache.seata.protocol.protobuf.BranchCommitRequestProto)
        BranchCommitRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BranchCommitRequestProto.newBuilder() to construct.
  private BranchCommitRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BranchCommitRequestProto() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new BranchCommitRequestProto();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BranchCommitRequestProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            AbstractBranchEndRequestProto.Builder subBuilder = null;
            if (abstractBranchEndRequest_ != null) {
              subBuilder = abstractBranchEndRequest_.toBuilder();
            }
            abstractBranchEndRequest_ = input.readMessage(AbstractBranchEndRequestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractBranchEndRequest_);
              abstractBranchEndRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.seata.core.serializer.protobuf.generated.BranchCommitRequest.internal_static_org_apache_seata_protocol_protobuf_BranchCommitRequestProto_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.seata.core.serializer.protobuf.generated.BranchCommitRequest.internal_static_org_apache_seata_protocol_protobuf_BranchCommitRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BranchCommitRequestProto.class, Builder.class);
  }

  public static final int ABSTRACTBRANCHENDREQUEST_FIELD_NUMBER = 1;
  private AbstractBranchEndRequestProto abstractBranchEndRequest_;
  /**
   * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
   * @return Whether the abstractBranchEndRequest field is set.
   */
  public boolean hasAbstractBranchEndRequest() {
    return abstractBranchEndRequest_ != null;
  }
  /**
   * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
   * @return The abstractBranchEndRequest.
   */
  public AbstractBranchEndRequestProto getAbstractBranchEndRequest() {
    return abstractBranchEndRequest_ == null ? AbstractBranchEndRequestProto.getDefaultInstance() : abstractBranchEndRequest_;
  }
  /**
   * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
   */
  public org.apache.seata.core.serializer.protobuf.generated.AbstractBranchEndRequestProtoOrBuilder getAbstractBranchEndRequestOrBuilder() {
    return getAbstractBranchEndRequest();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (abstractBranchEndRequest_ != null) {
      output.writeMessage(1, getAbstractBranchEndRequest());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractBranchEndRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractBranchEndRequest());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof BranchCommitRequestProto)) {
      return super.equals(obj);
    }
    BranchCommitRequestProto other = (BranchCommitRequestProto) obj;

    if (hasAbstractBranchEndRequest() != other.hasAbstractBranchEndRequest()) return false;
    if (hasAbstractBranchEndRequest()) {
      if (!getAbstractBranchEndRequest()
          .equals(other.getAbstractBranchEndRequest())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAbstractBranchEndRequest()) {
      hash = (37 * hash) + ABSTRACTBRANCHENDREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractBranchEndRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BranchCommitRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BranchCommitRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BranchCommitRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BranchCommitRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BranchCommitRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BranchCommitRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BranchCommitRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BranchCommitRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BranchCommitRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BranchCommitRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BranchCommitRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BranchCommitRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(BranchCommitRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * PublishRequest is a publish request.
   * </pre>
   *
   * Protobuf type {@code org.apache.seata.protocol.protobuf.BranchCommitRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.apache.seata.protocol.protobuf.BranchCommitRequestProto)
      BranchCommitRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.seata.core.serializer.protobuf.generated.BranchCommitRequest.internal_static_org_apache_seata_protocol_protobuf_BranchCommitRequestProto_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.seata.core.serializer.protobuf.generated.BranchCommitRequest.internal_static_org_apache_seata_protocol_protobuf_BranchCommitRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BranchCommitRequestProto.class, Builder.class);
    }

    // Construct using org.apache.seata.core.serializer.protobuf.generated.BranchCommitRequestProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (abstractBranchEndRequestBuilder_ == null) {
        abstractBranchEndRequest_ = null;
      } else {
        abstractBranchEndRequest_ = null;
        abstractBranchEndRequestBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.seata.core.serializer.protobuf.generated.BranchCommitRequest.internal_static_org_apache_seata_protocol_protobuf_BranchCommitRequestProto_descriptor;
    }

    @Override
    public BranchCommitRequestProto getDefaultInstanceForType() {
      return BranchCommitRequestProto.getDefaultInstance();
    }

    @Override
    public BranchCommitRequestProto build() {
      BranchCommitRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public BranchCommitRequestProto buildPartial() {
      BranchCommitRequestProto result = new BranchCommitRequestProto(this);
      if (abstractBranchEndRequestBuilder_ == null) {
        result.abstractBranchEndRequest_ = abstractBranchEndRequest_;
      } else {
        result.abstractBranchEndRequest_ = abstractBranchEndRequestBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BranchCommitRequestProto) {
        return mergeFrom((BranchCommitRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BranchCommitRequestProto other) {
      if (other == BranchCommitRequestProto.getDefaultInstance()) return this;
      if (other.hasAbstractBranchEndRequest()) {
        mergeAbstractBranchEndRequest(other.getAbstractBranchEndRequest());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      BranchCommitRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BranchCommitRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private AbstractBranchEndRequestProto abstractBranchEndRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractBranchEndRequestProto, AbstractBranchEndRequestProto.Builder, org.apache.seata.core.serializer.protobuf.generated.AbstractBranchEndRequestProtoOrBuilder> abstractBranchEndRequestBuilder_;
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     * @return Whether the abstractBranchEndRequest field is set.
     */
    public boolean hasAbstractBranchEndRequest() {
      return abstractBranchEndRequestBuilder_ != null || abstractBranchEndRequest_ != null;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     * @return The abstractBranchEndRequest.
     */
    public AbstractBranchEndRequestProto getAbstractBranchEndRequest() {
      if (abstractBranchEndRequestBuilder_ == null) {
        return abstractBranchEndRequest_ == null ? AbstractBranchEndRequestProto.getDefaultInstance() : abstractBranchEndRequest_;
      } else {
        return abstractBranchEndRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     */
    public Builder setAbstractBranchEndRequest(AbstractBranchEndRequestProto value) {
      if (abstractBranchEndRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractBranchEndRequest_ = value;
        onChanged();
      } else {
        abstractBranchEndRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     */
    public Builder setAbstractBranchEndRequest(
        AbstractBranchEndRequestProto.Builder builderForValue) {
      if (abstractBranchEndRequestBuilder_ == null) {
        abstractBranchEndRequest_ = builderForValue.build();
        onChanged();
      } else {
        abstractBranchEndRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     */
    public Builder mergeAbstractBranchEndRequest(AbstractBranchEndRequestProto value) {
      if (abstractBranchEndRequestBuilder_ == null) {
        if (abstractBranchEndRequest_ != null) {
          abstractBranchEndRequest_ =
            AbstractBranchEndRequestProto.newBuilder(abstractBranchEndRequest_).mergeFrom(value).buildPartial();
        } else {
          abstractBranchEndRequest_ = value;
        }
        onChanged();
      } else {
        abstractBranchEndRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     */
    public Builder clearAbstractBranchEndRequest() {
      if (abstractBranchEndRequestBuilder_ == null) {
        abstractBranchEndRequest_ = null;
        onChanged();
      } else {
        abstractBranchEndRequest_ = null;
        abstractBranchEndRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     */
    public AbstractBranchEndRequestProto.Builder getAbstractBranchEndRequestBuilder() {
      
      onChanged();
      return getAbstractBranchEndRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     */
    public org.apache.seata.core.serializer.protobuf.generated.AbstractBranchEndRequestProtoOrBuilder getAbstractBranchEndRequestOrBuilder() {
      if (abstractBranchEndRequestBuilder_ != null) {
        return abstractBranchEndRequestBuilder_.getMessageOrBuilder();
      } else {
        return abstractBranchEndRequest_ == null ?
            AbstractBranchEndRequestProto.getDefaultInstance() : abstractBranchEndRequest_;
      }
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractBranchEndRequestProto abstractBranchEndRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractBranchEndRequestProto, AbstractBranchEndRequestProto.Builder, org.apache.seata.core.serializer.protobuf.generated.AbstractBranchEndRequestProtoOrBuilder>
        getAbstractBranchEndRequestFieldBuilder() {
      if (abstractBranchEndRequestBuilder_ == null) {
        abstractBranchEndRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            AbstractBranchEndRequestProto, AbstractBranchEndRequestProto.Builder, org.apache.seata.core.serializer.protobuf.generated.AbstractBranchEndRequestProtoOrBuilder>(
                getAbstractBranchEndRequest(),
                getParentForChildren(),
                isClean());
        abstractBranchEndRequest_ = null;
      }
      return abstractBranchEndRequestBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.apache.seata.protocol.protobuf.BranchCommitRequestProto)
  }

  // @@protoc_insertion_point(class_scope:org.apache.seata.protocol.protobuf.BranchCommitRequestProto)
  private static final BranchCommitRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BranchCommitRequestProto();
  }

  public static BranchCommitRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BranchCommitRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<BranchCommitRequestProto>() {
    @Override
    public BranchCommitRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BranchCommitRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BranchCommitRequestProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<BranchCommitRequestProto> getParserForType() {
    return PARSER;
  }

  @Override
  public BranchCommitRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

