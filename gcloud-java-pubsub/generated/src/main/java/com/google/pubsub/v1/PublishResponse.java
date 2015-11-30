// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * Protobuf type {@code google.pubsub.v1.PublishResponse}
 *
 * <pre>
 * Response for the Publish method.
 * </pre>
 */
public  final class PublishResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.PublishResponse)
    PublishResponseOrBuilder {
  // Use PublishResponse.newBuilder() to construct.
  private PublishResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PublishResponse() {
    messageIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PublishResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              messageIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            messageIds_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        messageIds_ = messageIds_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.PublishResponse.class, com.google.pubsub.v1.PublishResponse.Builder.class);
  }

  public static final int MESSAGE_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList messageIds_;
  /**
   * <code>repeated string message_ids = 1;</code>
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   */
  public com.google.protobuf.ProtocolStringList
      getMessageIdsList() {
    return messageIds_;
  }
  /**
   * <code>repeated string message_ids = 1;</code>
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   */
  public int getMessageIdsCount() {
    return messageIds_.size();
  }
  /**
   * <code>repeated string message_ids = 1;</code>
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   */
  public java.lang.String getMessageIds(int index) {
    return messageIds_.get(index);
  }
  /**
   * <code>repeated string message_ids = 1;</code>
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getMessageIdsBytes(int index) {
    return messageIds_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < messageIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, messageIds_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < messageIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(messageIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessageIdsList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.pubsub.v1.PublishResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.PublishResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.PublishResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.pubsub.v1.PublishResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.pubsub.v1.PublishResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.pubsub.v1.PublishResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.pubsub.v1.PublishResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.pubsub.v1.PublishResponse}
   *
   * <pre>
   * Response for the Publish method.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.PublishResponse)
      com.google.pubsub.v1.PublishResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.PublishResponse.class, com.google.pubsub.v1.PublishResponse.Builder.class);
    }

    // Construct using com.google.pubsub.v1.PublishResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      messageIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishResponse_descriptor;
    }

    public com.google.pubsub.v1.PublishResponse getDefaultInstanceForType() {
      return com.google.pubsub.v1.PublishResponse.getDefaultInstance();
    }

    public com.google.pubsub.v1.PublishResponse build() {
      com.google.pubsub.v1.PublishResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.PublishResponse buildPartial() {
      com.google.pubsub.v1.PublishResponse result = new com.google.pubsub.v1.PublishResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        messageIds_ = messageIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.messageIds_ = messageIds_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.PublishResponse) {
        return mergeFrom((com.google.pubsub.v1.PublishResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.PublishResponse other) {
      if (other == com.google.pubsub.v1.PublishResponse.getDefaultInstance()) return this;
      if (!other.messageIds_.isEmpty()) {
        if (messageIds_.isEmpty()) {
          messageIds_ = other.messageIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessageIdsIsMutable();
          messageIds_.addAll(other.messageIds_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.pubsub.v1.PublishResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.PublishResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList messageIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMessageIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        messageIds_ = new com.google.protobuf.LazyStringArrayList(messageIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getMessageIdsList() {
      return messageIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public int getMessageIdsCount() {
      return messageIds_.size();
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public java.lang.String getMessageIds(int index) {
      return messageIds_.get(index);
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMessageIdsBytes(int index) {
      return messageIds_.getByteString(index);
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public Builder setMessageIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessageIdsIsMutable();
      messageIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public Builder addMessageIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessageIdsIsMutable();
      messageIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public Builder addAllMessageIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureMessageIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, messageIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public Builder clearMessageIds() {
      messageIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message_ids = 1;</code>
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     */
    public Builder addMessageIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMessageIdsIsMutable();
      messageIds_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.PublishResponse)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.PublishResponse)
  private static final com.google.pubsub.v1.PublishResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.PublishResponse();
  }

  public static com.google.pubsub.v1.PublishResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishResponse>
      PARSER = new com.google.protobuf.AbstractParser<PublishResponse>() {
    public PublishResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new PublishResponse(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<PublishResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishResponse> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.PublishResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
