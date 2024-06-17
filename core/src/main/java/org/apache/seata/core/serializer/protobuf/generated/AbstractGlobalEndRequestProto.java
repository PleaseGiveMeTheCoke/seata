// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractGlobalEndRequest.proto

package org.apache.seata.core.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code org.apache.seata.protocol.protobuf.AbstractGlobalEndRequestProto}
 */
public  final class AbstractGlobalEndRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.apache.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
        AbstractGlobalEndRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AbstractGlobalEndRequestProto.newBuilder() to construct.
  private AbstractGlobalEndRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbstractGlobalEndRequestProto() {
    xid_ = "";
    extraData_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AbstractGlobalEndRequestProto();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AbstractGlobalEndRequestProto(
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
            org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.Builder subBuilder = null;
            if (abstractTransactionRequest_ != null) {
              subBuilder = abstractTransactionRequest_.toBuilder();
            }
            abstractTransactionRequest_ = input.readMessage(org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractTransactionRequest_);
              abstractTransactionRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            xid_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            extraData_ = s;
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
    return org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndRequest.internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndRequest.internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AbstractGlobalEndRequestProto.class, Builder.class);
  }

  public static final int ABSTRACTTRANSACTIONREQUEST_FIELD_NUMBER = 1;
  private org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto abstractTransactionRequest_;
  /**
   * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   * @return Whether the abstractTransactionRequest field is set.
   */
  public boolean hasAbstractTransactionRequest() {
    return abstractTransactionRequest_ != null;
  }
  /**
   * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   * @return The abstractTransactionRequest.
   */
  public org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto getAbstractTransactionRequest() {
    return abstractTransactionRequest_ == null ? org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
  }
  /**
   * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  public AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder() {
    return getAbstractTransactionRequest();
  }

  public static final int XID_FIELD_NUMBER = 2;
  private volatile Object xid_;
  /**
   * <code>string xid = 2;</code>
   * @return The xid.
   */
  public String getXid() {
    Object ref = xid_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      xid_ = s;
      return s;
    }
  }
  /**
   * <code>string xid = 2;</code>
   * @return The bytes for xid.
   */
  public com.google.protobuf.ByteString
      getXidBytes() {
    Object ref = xid_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      xid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTRADATA_FIELD_NUMBER = 3;
  private volatile Object extraData_;
  /**
   * <code>string extraData = 3;</code>
   * @return The extraData.
   */
  public String getExtraData() {
    Object ref = extraData_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      extraData_ = s;
      return s;
    }
  }
  /**
   * <code>string extraData = 3;</code>
   * @return The bytes for extraData.
   */
  public com.google.protobuf.ByteString
      getExtraDataBytes() {
    Object ref = extraData_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      extraData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (abstractTransactionRequest_ != null) {
      output.writeMessage(1, getAbstractTransactionRequest());
    }
    if (!getXidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, xid_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extraData_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractTransactionRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractTransactionRequest());
    }
    if (!getXidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, xid_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, extraData_);
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
    if (!(obj instanceof AbstractGlobalEndRequestProto)) {
      return super.equals(obj);
    }
    AbstractGlobalEndRequestProto other = (AbstractGlobalEndRequestProto) obj;

    if (hasAbstractTransactionRequest() != other.hasAbstractTransactionRequest()) return false;
    if (hasAbstractTransactionRequest()) {
      if (!getAbstractTransactionRequest()
          .equals(other.getAbstractTransactionRequest())) return false;
    }
    if (!getXid()
        .equals(other.getXid())) return false;
    if (!getExtraData()
        .equals(other.getExtraData())) return false;
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
    if (hasAbstractTransactionRequest()) {
      hash = (37 * hash) + ABSTRACTTRANSACTIONREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractTransactionRequest().hashCode();
    }
    hash = (37 * hash) + XID_FIELD_NUMBER;
    hash = (53 * hash) + getXid().hashCode();
    hash = (37 * hash) + EXTRADATA_FIELD_NUMBER;
    hash = (53 * hash) + getExtraData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AbstractGlobalEndRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AbstractGlobalEndRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AbstractGlobalEndRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AbstractGlobalEndRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AbstractGlobalEndRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AbstractGlobalEndRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AbstractGlobalEndRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AbstractGlobalEndRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AbstractGlobalEndRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AbstractGlobalEndRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AbstractGlobalEndRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AbstractGlobalEndRequestProto parseFrom(
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
  public static Builder newBuilder(AbstractGlobalEndRequestProto prototype) {
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
   * Protobuf type {@code org.apache.seata.protocol.protobuf.AbstractGlobalEndRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.apache.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
      AbstractGlobalEndRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndRequest.internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndRequest.internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AbstractGlobalEndRequestProto.class, Builder.class);
    }

    // Construct using org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndRequestProto.newBuilder()
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
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = null;
      } else {
        abstractTransactionRequest_ = null;
        abstractTransactionRequestBuilder_ = null;
      }
      xid_ = "";

      extraData_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.seata.core.serializer.protobuf.generated.AbstractGlobalEndRequest.internal_static_org_apache_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor;
    }

    @Override
    public AbstractGlobalEndRequestProto getDefaultInstanceForType() {
      return AbstractGlobalEndRequestProto.getDefaultInstance();
    }

    @Override
    public AbstractGlobalEndRequestProto build() {
      AbstractGlobalEndRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AbstractGlobalEndRequestProto buildPartial() {
      AbstractGlobalEndRequestProto result = new AbstractGlobalEndRequestProto(this);
      if (abstractTransactionRequestBuilder_ == null) {
        result.abstractTransactionRequest_ = abstractTransactionRequest_;
      } else {
        result.abstractTransactionRequest_ = abstractTransactionRequestBuilder_.build();
      }
      result.xid_ = xid_;
      result.extraData_ = extraData_;
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
      if (other instanceof AbstractGlobalEndRequestProto) {
        return mergeFrom((AbstractGlobalEndRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AbstractGlobalEndRequestProto other) {
      if (other == AbstractGlobalEndRequestProto.getDefaultInstance()) return this;
      if (other.hasAbstractTransactionRequest()) {
        mergeAbstractTransactionRequest(other.getAbstractTransactionRequest());
      }
      if (!other.getXid().isEmpty()) {
        xid_ = other.xid_;
        onChanged();
      }
      if (!other.getExtraData().isEmpty()) {
        extraData_ = other.extraData_;
        onChanged();
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
      AbstractGlobalEndRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AbstractGlobalEndRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto abstractTransactionRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto, org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.Builder, AbstractTransactionRequestProtoOrBuilder> abstractTransactionRequestBuilder_;
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     * @return Whether the abstractTransactionRequest field is set.
     */
    public boolean hasAbstractTransactionRequest() {
      return abstractTransactionRequestBuilder_ != null || abstractTransactionRequest_ != null;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     * @return The abstractTransactionRequest.
     */
    public org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto getAbstractTransactionRequest() {
      if (abstractTransactionRequestBuilder_ == null) {
        return abstractTransactionRequest_ == null ? org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
      } else {
        return abstractTransactionRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder setAbstractTransactionRequest(org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto value) {
      if (abstractTransactionRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractTransactionRequest_ = value;
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder setAbstractTransactionRequest(
        org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.Builder builderForValue) {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = builderForValue.build();
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder mergeAbstractTransactionRequest(org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto value) {
      if (abstractTransactionRequestBuilder_ == null) {
        if (abstractTransactionRequest_ != null) {
          abstractTransactionRequest_ =
            org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.newBuilder(abstractTransactionRequest_).mergeFrom(value).buildPartial();
        } else {
          abstractTransactionRequest_ = value;
        }
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder clearAbstractTransactionRequest() {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = null;
        onChanged();
      } else {
        abstractTransactionRequest_ = null;
        abstractTransactionRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.Builder getAbstractTransactionRequestBuilder() {
      
      onChanged();
      return getAbstractTransactionRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder() {
      if (abstractTransactionRequestBuilder_ != null) {
        return abstractTransactionRequestBuilder_.getMessageOrBuilder();
      } else {
        return abstractTransactionRequest_ == null ?
            org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
      }
    }
    /**
     * <code>.org.apache.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto, org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.Builder, AbstractTransactionRequestProtoOrBuilder>
        getAbstractTransactionRequestFieldBuilder() {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto, org.apache.seata.core.serializer.protobuf.generated.AbstractTransactionRequestProto.Builder, AbstractTransactionRequestProtoOrBuilder>(
                getAbstractTransactionRequest(),
                getParentForChildren(),
                isClean());
        abstractTransactionRequest_ = null;
      }
      return abstractTransactionRequestBuilder_;
    }

    private Object xid_ = "";
    /**
     * <code>string xid = 2;</code>
     * @return The xid.
     */
    public String getXid() {
      Object ref = xid_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        xid_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string xid = 2;</code>
     * @return The bytes for xid.
     */
    public com.google.protobuf.ByteString
        getXidBytes() {
      Object ref = xid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        xid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string xid = 2;</code>
     * @param value The xid to set.
     * @return This builder for chaining.
     */
    public Builder setXid(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      xid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string xid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearXid() {
      
      xid_ = getDefaultInstance().getXid();
      onChanged();
      return this;
    }
    /**
     * <code>string xid = 2;</code>
     * @param value The bytes for xid to set.
     * @return This builder for chaining.
     */
    public Builder setXidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      xid_ = value;
      onChanged();
      return this;
    }

    private Object extraData_ = "";
    /**
     * <code>string extraData = 3;</code>
     * @return The extraData.
     */
    public String getExtraData() {
      Object ref = extraData_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        extraData_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string extraData = 3;</code>
     * @return The bytes for extraData.
     */
    public com.google.protobuf.ByteString
        getExtraDataBytes() {
      Object ref = extraData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        extraData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extraData = 3;</code>
     * @param value The extraData to set.
     * @return This builder for chaining.
     */
    public Builder setExtraData(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      extraData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtraData() {
      
      extraData_ = getDefaultInstance().getExtraData();
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 3;</code>
     * @param value The bytes for extraData to set.
     * @return This builder for chaining.
     */
    public Builder setExtraDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      extraData_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:org.apache.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
  }

  // @@protoc_insertion_point(class_scope:org.apache.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
  private static final AbstractGlobalEndRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AbstractGlobalEndRequestProto();
  }

  public static AbstractGlobalEndRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbstractGlobalEndRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<AbstractGlobalEndRequestProto>() {
    @Override
    public AbstractGlobalEndRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AbstractGlobalEndRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbstractGlobalEndRequestProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AbstractGlobalEndRequestProto> getParserForType() {
    return PARSER;
  }

  @Override
  public AbstractGlobalEndRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

