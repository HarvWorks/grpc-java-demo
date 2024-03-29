// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Sum/sum.proto

package com.proto.sum;

/**
 * Protobuf type {@code sum.SumRequest}
 */
public  final class SumRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sum.SumRequest)
    SumRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SumRequest.newBuilder() to construct.
  private SumRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SumRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SumRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SumRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
            com.proto.sum.SumValue.Builder subBuilder = null;
            if (sumValue_ != null) {
              subBuilder = sumValue_.toBuilder();
            }
            sumValue_ = input.readMessage(com.proto.sum.SumValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sumValue_);
              sumValue_ = subBuilder.buildPartial();
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
    return com.proto.sum.Sum.internal_static_sum_SumRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.sum.Sum.internal_static_sum_SumRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.sum.SumRequest.class, com.proto.sum.SumRequest.Builder.class);
  }

  public static final int SUM_VALUE_FIELD_NUMBER = 1;
  private com.proto.sum.SumValue sumValue_;
  /**
   * <code>.sum.SumValue sum_value = 1;</code>
   * @return Whether the sumValue field is set.
   */
  public boolean hasSumValue() {
    return sumValue_ != null;
  }
  /**
   * <code>.sum.SumValue sum_value = 1;</code>
   * @return The sumValue.
   */
  public com.proto.sum.SumValue getSumValue() {
    return sumValue_ == null ? com.proto.sum.SumValue.getDefaultInstance() : sumValue_;
  }
  /**
   * <code>.sum.SumValue sum_value = 1;</code>
   */
  public com.proto.sum.SumValueOrBuilder getSumValueOrBuilder() {
    return getSumValue();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (sumValue_ != null) {
      output.writeMessage(1, getSumValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sumValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSumValue());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.sum.SumRequest)) {
      return super.equals(obj);
    }
    com.proto.sum.SumRequest other = (com.proto.sum.SumRequest) obj;

    if (hasSumValue() != other.hasSumValue()) return false;
    if (hasSumValue()) {
      if (!getSumValue()
          .equals(other.getSumValue())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSumValue()) {
      hash = (37 * hash) + SUM_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getSumValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.sum.SumRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.SumRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.SumRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.SumRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.sum.SumRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.sum.SumRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.sum.SumRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.sum.SumRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code sum.SumRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sum.SumRequest)
      com.proto.sum.SumRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.sum.Sum.internal_static_sum_SumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.sum.Sum.internal_static_sum_SumRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.sum.SumRequest.class, com.proto.sum.SumRequest.Builder.class);
    }

    // Construct using com.proto.sum.SumRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sumValueBuilder_ == null) {
        sumValue_ = null;
      } else {
        sumValue_ = null;
        sumValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.sum.Sum.internal_static_sum_SumRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.sum.SumRequest getDefaultInstanceForType() {
      return com.proto.sum.SumRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.sum.SumRequest build() {
      com.proto.sum.SumRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.sum.SumRequest buildPartial() {
      com.proto.sum.SumRequest result = new com.proto.sum.SumRequest(this);
      if (sumValueBuilder_ == null) {
        result.sumValue_ = sumValue_;
      } else {
        result.sumValue_ = sumValueBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.sum.SumRequest) {
        return mergeFrom((com.proto.sum.SumRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.sum.SumRequest other) {
      if (other == com.proto.sum.SumRequest.getDefaultInstance()) return this;
      if (other.hasSumValue()) {
        mergeSumValue(other.getSumValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.sum.SumRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.sum.SumRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.sum.SumValue sumValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.sum.SumValue, com.proto.sum.SumValue.Builder, com.proto.sum.SumValueOrBuilder> sumValueBuilder_;
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     * @return Whether the sumValue field is set.
     */
    public boolean hasSumValue() {
      return sumValueBuilder_ != null || sumValue_ != null;
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     * @return The sumValue.
     */
    public com.proto.sum.SumValue getSumValue() {
      if (sumValueBuilder_ == null) {
        return sumValue_ == null ? com.proto.sum.SumValue.getDefaultInstance() : sumValue_;
      } else {
        return sumValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     */
    public Builder setSumValue(com.proto.sum.SumValue value) {
      if (sumValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sumValue_ = value;
        onChanged();
      } else {
        sumValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     */
    public Builder setSumValue(
        com.proto.sum.SumValue.Builder builderForValue) {
      if (sumValueBuilder_ == null) {
        sumValue_ = builderForValue.build();
        onChanged();
      } else {
        sumValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     */
    public Builder mergeSumValue(com.proto.sum.SumValue value) {
      if (sumValueBuilder_ == null) {
        if (sumValue_ != null) {
          sumValue_ =
            com.proto.sum.SumValue.newBuilder(sumValue_).mergeFrom(value).buildPartial();
        } else {
          sumValue_ = value;
        }
        onChanged();
      } else {
        sumValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     */
    public Builder clearSumValue() {
      if (sumValueBuilder_ == null) {
        sumValue_ = null;
        onChanged();
      } else {
        sumValue_ = null;
        sumValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     */
    public com.proto.sum.SumValue.Builder getSumValueBuilder() {
      
      onChanged();
      return getSumValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     */
    public com.proto.sum.SumValueOrBuilder getSumValueOrBuilder() {
      if (sumValueBuilder_ != null) {
        return sumValueBuilder_.getMessageOrBuilder();
      } else {
        return sumValue_ == null ?
            com.proto.sum.SumValue.getDefaultInstance() : sumValue_;
      }
    }
    /**
     * <code>.sum.SumValue sum_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.sum.SumValue, com.proto.sum.SumValue.Builder, com.proto.sum.SumValueOrBuilder> 
        getSumValueFieldBuilder() {
      if (sumValueBuilder_ == null) {
        sumValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.sum.SumValue, com.proto.sum.SumValue.Builder, com.proto.sum.SumValueOrBuilder>(
                getSumValue(),
                getParentForChildren(),
                isClean());
        sumValue_ = null;
      }
      return sumValueBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sum.SumRequest)
  }

  // @@protoc_insertion_point(class_scope:sum.SumRequest)
  private static final com.proto.sum.SumRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.sum.SumRequest();
  }

  public static com.proto.sum.SumRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SumRequest>
      PARSER = new com.google.protobuf.AbstractParser<SumRequest>() {
    @java.lang.Override
    public SumRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SumRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SumRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SumRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.sum.SumRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

