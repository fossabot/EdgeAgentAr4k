// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ar4k_beacon.proto

package org.ar4k.agent.tunnels.http.grpc.beacon;

/**
 * Protobuf type {@code beacon.ListStringReply}
 */
public  final class ListStringReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:beacon.ListStringReply)
    ListStringReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListStringReply.newBuilder() to construct.
  private ListStringReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListStringReply() {
    listDatas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListStringReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            org.ar4k.agent.tunnels.http.grpc.beacon.Agent.Builder subBuilder = null;
            if (agentSender_ != null) {
              subBuilder = agentSender_.toBuilder();
            }
            agentSender_ = input.readMessage(org.ar4k.agent.tunnels.http.grpc.beacon.Agent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(agentSender_);
              agentSender_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              listDatas_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            listDatas_.add(s);
            break;
          }
          case 24: {

            linesNumber_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        listDatas_ = listDatas_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_ListStringReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_ListStringReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply.class, org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply.Builder.class);
  }

  private int bitField0_;
  public static final int AGENTSENDER_FIELD_NUMBER = 1;
  private org.ar4k.agent.tunnels.http.grpc.beacon.Agent agentSender_;
  /**
   * <code>.beacon.Agent agentSender = 1;</code>
   */
  public boolean hasAgentSender() {
    return agentSender_ != null;
  }
  /**
   * <code>.beacon.Agent agentSender = 1;</code>
   */
  public org.ar4k.agent.tunnels.http.grpc.beacon.Agent getAgentSender() {
    return agentSender_ == null ? org.ar4k.agent.tunnels.http.grpc.beacon.Agent.getDefaultInstance() : agentSender_;
  }
  /**
   * <code>.beacon.Agent agentSender = 1;</code>
   */
  public org.ar4k.agent.tunnels.http.grpc.beacon.AgentOrBuilder getAgentSenderOrBuilder() {
    return getAgentSender();
  }

  public static final int LISTDATAS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList listDatas_;
  /**
   * <code>repeated string listDatas = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getListDatasList() {
    return listDatas_;
  }
  /**
   * <code>repeated string listDatas = 2;</code>
   */
  public int getListDatasCount() {
    return listDatas_.size();
  }
  /**
   * <code>repeated string listDatas = 2;</code>
   */
  public java.lang.String getListDatas(int index) {
    return listDatas_.get(index);
  }
  /**
   * <code>repeated string listDatas = 2;</code>
   */
  public com.google.protobuf.ByteString
      getListDatasBytes(int index) {
    return listDatas_.getByteString(index);
  }

  public static final int LINESNUMBER_FIELD_NUMBER = 3;
  private int linesNumber_;
  /**
   * <code>int32 linesNumber = 3;</code>
   */
  public int getLinesNumber() {
    return linesNumber_;
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
    if (agentSender_ != null) {
      output.writeMessage(1, getAgentSender());
    }
    for (int i = 0; i < listDatas_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, listDatas_.getRaw(i));
    }
    if (linesNumber_ != 0) {
      output.writeInt32(3, linesNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentSender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgentSender());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < listDatas_.size(); i++) {
        dataSize += computeStringSizeNoTag(listDatas_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getListDatasList().size();
    }
    if (linesNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, linesNumber_);
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
    if (!(obj instanceof org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply)) {
      return super.equals(obj);
    }
    org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply other = (org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply) obj;

    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
    if (!getListDatasList()
        .equals(other.getListDatasList())) return false;
    if (getLinesNumber()
        != other.getLinesNumber()) return false;
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
    if (hasAgentSender()) {
      hash = (37 * hash) + AGENTSENDER_FIELD_NUMBER;
      hash = (53 * hash) + getAgentSender().hashCode();
    }
    if (getListDatasCount() > 0) {
      hash = (37 * hash) + LISTDATAS_FIELD_NUMBER;
      hash = (53 * hash) + getListDatasList().hashCode();
    }
    hash = (37 * hash) + LINESNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getLinesNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parseFrom(
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
  public static Builder newBuilder(org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply prototype) {
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
   * Protobuf type {@code beacon.ListStringReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:beacon.ListStringReply)
      org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_ListStringReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_ListStringReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply.class, org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply.Builder.class);
    }

    // Construct using org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply.newBuilder()
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
      if (agentSenderBuilder_ == null) {
        agentSender_ = null;
      } else {
        agentSender_ = null;
        agentSenderBuilder_ = null;
      }
      listDatas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      linesNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_ListStringReply_descriptor;
    }

    @java.lang.Override
    public org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply getDefaultInstanceForType() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply.getDefaultInstance();
    }

    @java.lang.Override
    public org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply build() {
      org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply buildPartial() {
      org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply result = new org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (agentSenderBuilder_ == null) {
        result.agentSender_ = agentSender_;
      } else {
        result.agentSender_ = agentSenderBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        listDatas_ = listDatas_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.listDatas_ = listDatas_;
      result.linesNumber_ = linesNumber_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply) {
        return mergeFrom((org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply other) {
      if (other == org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply.getDefaultInstance()) return this;
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
      }
      if (!other.listDatas_.isEmpty()) {
        if (listDatas_.isEmpty()) {
          listDatas_ = other.listDatas_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureListDatasIsMutable();
          listDatas_.addAll(other.listDatas_);
        }
        onChanged();
      }
      if (other.getLinesNumber() != 0) {
        setLinesNumber(other.getLinesNumber());
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
      org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.ar4k.agent.tunnels.http.grpc.beacon.Agent agentSender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.ar4k.agent.tunnels.http.grpc.beacon.Agent, org.ar4k.agent.tunnels.http.grpc.beacon.Agent.Builder, org.ar4k.agent.tunnels.http.grpc.beacon.AgentOrBuilder> agentSenderBuilder_;
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public boolean hasAgentSender() {
      return agentSenderBuilder_ != null || agentSender_ != null;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public org.ar4k.agent.tunnels.http.grpc.beacon.Agent getAgentSender() {
      if (agentSenderBuilder_ == null) {
        return agentSender_ == null ? org.ar4k.agent.tunnels.http.grpc.beacon.Agent.getDefaultInstance() : agentSender_;
      } else {
        return agentSenderBuilder_.getMessage();
      }
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(org.ar4k.agent.tunnels.http.grpc.beacon.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentSender_ = value;
        onChanged();
      } else {
        agentSenderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(
        org.ar4k.agent.tunnels.http.grpc.beacon.Agent.Builder builderForValue) {
      if (agentSenderBuilder_ == null) {
        agentSender_ = builderForValue.build();
        onChanged();
      } else {
        agentSenderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder mergeAgentSender(org.ar4k.agent.tunnels.http.grpc.beacon.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (agentSender_ != null) {
          agentSender_ =
            org.ar4k.agent.tunnels.http.grpc.beacon.Agent.newBuilder(agentSender_).mergeFrom(value).buildPartial();
        } else {
          agentSender_ = value;
        }
        onChanged();
      } else {
        agentSenderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder clearAgentSender() {
      if (agentSenderBuilder_ == null) {
        agentSender_ = null;
        onChanged();
      } else {
        agentSender_ = null;
        agentSenderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public org.ar4k.agent.tunnels.http.grpc.beacon.Agent.Builder getAgentSenderBuilder() {
      
      onChanged();
      return getAgentSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public org.ar4k.agent.tunnels.http.grpc.beacon.AgentOrBuilder getAgentSenderOrBuilder() {
      if (agentSenderBuilder_ != null) {
        return agentSenderBuilder_.getMessageOrBuilder();
      } else {
        return agentSender_ == null ?
            org.ar4k.agent.tunnels.http.grpc.beacon.Agent.getDefaultInstance() : agentSender_;
      }
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.ar4k.agent.tunnels.http.grpc.beacon.Agent, org.ar4k.agent.tunnels.http.grpc.beacon.Agent.Builder, org.ar4k.agent.tunnels.http.grpc.beacon.AgentOrBuilder> 
        getAgentSenderFieldBuilder() {
      if (agentSenderBuilder_ == null) {
        agentSenderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.ar4k.agent.tunnels.http.grpc.beacon.Agent, org.ar4k.agent.tunnels.http.grpc.beacon.Agent.Builder, org.ar4k.agent.tunnels.http.grpc.beacon.AgentOrBuilder>(
                getAgentSender(),
                getParentForChildren(),
                isClean());
        agentSender_ = null;
      }
      return agentSenderBuilder_;
    }

    private com.google.protobuf.LazyStringList listDatas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureListDatasIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        listDatas_ = new com.google.protobuf.LazyStringArrayList(listDatas_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getListDatasList() {
      return listDatas_.getUnmodifiableView();
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public int getListDatasCount() {
      return listDatas_.size();
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public java.lang.String getListDatas(int index) {
      return listDatas_.get(index);
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public com.google.protobuf.ByteString
        getListDatasBytes(int index) {
      return listDatas_.getByteString(index);
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public Builder setListDatas(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureListDatasIsMutable();
      listDatas_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public Builder addListDatas(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureListDatasIsMutable();
      listDatas_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public Builder addAllListDatas(
        java.lang.Iterable<java.lang.String> values) {
      ensureListDatasIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, listDatas_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public Builder clearListDatas() {
      listDatas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string listDatas = 2;</code>
     */
    public Builder addListDatasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureListDatasIsMutable();
      listDatas_.add(value);
      onChanged();
      return this;
    }

    private int linesNumber_ ;
    /**
     * <code>int32 linesNumber = 3;</code>
     */
    public int getLinesNumber() {
      return linesNumber_;
    }
    /**
     * <code>int32 linesNumber = 3;</code>
     */
    public Builder setLinesNumber(int value) {
      
      linesNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 linesNumber = 3;</code>
     */
    public Builder clearLinesNumber() {
      
      linesNumber_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:beacon.ListStringReply)
  }

  // @@protoc_insertion_point(class_scope:beacon.ListStringReply)
  private static final org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply();
  }

  public static org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListStringReply>
      PARSER = new com.google.protobuf.AbstractParser<ListStringReply>() {
    @java.lang.Override
    public ListStringReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListStringReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListStringReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListStringReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.ar4k.agent.tunnels.http.grpc.beacon.ListStringReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

