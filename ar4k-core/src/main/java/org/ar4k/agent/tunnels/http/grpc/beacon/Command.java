// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ar4k_beacon.proto

package org.ar4k.agent.tunnels.http.grpc.beacon;

/**
 * Protobuf type {@code beacon.Command}
 */
public  final class Command extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:beacon.Command)
    CommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Command.newBuilder() to construct.
  private Command(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Command() {
    command_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Command(
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

            command_ = s;
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
    return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_Command_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_Command_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.ar4k.agent.tunnels.http.grpc.beacon.Command.class, org.ar4k.agent.tunnels.http.grpc.beacon.Command.Builder.class);
  }

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

  public static final int COMMAND_FIELD_NUMBER = 2;
  private volatile java.lang.Object command_;
  /**
   * <code>string command = 2;</code>
   */
  public java.lang.String getCommand() {
    java.lang.Object ref = command_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      command_ = s;
      return s;
    }
  }
  /**
   * <code>string command = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCommandBytes() {
    java.lang.Object ref = command_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      command_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getCommandBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, command_);
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
    if (!getCommandBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, command_);
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
    if (!(obj instanceof org.ar4k.agent.tunnels.http.grpc.beacon.Command)) {
      return super.equals(obj);
    }
    org.ar4k.agent.tunnels.http.grpc.beacon.Command other = (org.ar4k.agent.tunnels.http.grpc.beacon.Command) obj;

    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
    if (!getCommand()
        .equals(other.getCommand())) return false;
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
    hash = (37 * hash) + COMMAND_FIELD_NUMBER;
    hash = (53 * hash) + getCommand().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command parseFrom(
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
  public static Builder newBuilder(org.ar4k.agent.tunnels.http.grpc.beacon.Command prototype) {
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
   * Protobuf type {@code beacon.Command}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:beacon.Command)
      org.ar4k.agent.tunnels.http.grpc.beacon.CommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_Command_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_Command_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.ar4k.agent.tunnels.http.grpc.beacon.Command.class, org.ar4k.agent.tunnels.http.grpc.beacon.Command.Builder.class);
    }

    // Construct using org.ar4k.agent.tunnels.http.grpc.beacon.Command.newBuilder()
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
      command_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.internal_static_beacon_Command_descriptor;
    }

    @java.lang.Override
    public org.ar4k.agent.tunnels.http.grpc.beacon.Command getDefaultInstanceForType() {
      return org.ar4k.agent.tunnels.http.grpc.beacon.Command.getDefaultInstance();
    }

    @java.lang.Override
    public org.ar4k.agent.tunnels.http.grpc.beacon.Command build() {
      org.ar4k.agent.tunnels.http.grpc.beacon.Command result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.ar4k.agent.tunnels.http.grpc.beacon.Command buildPartial() {
      org.ar4k.agent.tunnels.http.grpc.beacon.Command result = new org.ar4k.agent.tunnels.http.grpc.beacon.Command(this);
      if (agentSenderBuilder_ == null) {
        result.agentSender_ = agentSender_;
      } else {
        result.agentSender_ = agentSenderBuilder_.build();
      }
      result.command_ = command_;
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
      if (other instanceof org.ar4k.agent.tunnels.http.grpc.beacon.Command) {
        return mergeFrom((org.ar4k.agent.tunnels.http.grpc.beacon.Command)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.ar4k.agent.tunnels.http.grpc.beacon.Command other) {
      if (other == org.ar4k.agent.tunnels.http.grpc.beacon.Command.getDefaultInstance()) return this;
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
      }
      if (!other.getCommand().isEmpty()) {
        command_ = other.command_;
        onChanged();
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
      org.ar4k.agent.tunnels.http.grpc.beacon.Command parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.ar4k.agent.tunnels.http.grpc.beacon.Command) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private java.lang.Object command_ = "";
    /**
     * <code>string command = 2;</code>
     */
    public java.lang.String getCommand() {
      java.lang.Object ref = command_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        command_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string command = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCommandBytes() {
      java.lang.Object ref = command_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        command_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string command = 2;</code>
     */
    public Builder setCommand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      command_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string command = 2;</code>
     */
    public Builder clearCommand() {
      
      command_ = getDefaultInstance().getCommand();
      onChanged();
      return this;
    }
    /**
     * <code>string command = 2;</code>
     */
    public Builder setCommandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      command_ = value;
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


    // @@protoc_insertion_point(builder_scope:beacon.Command)
  }

  // @@protoc_insertion_point(class_scope:beacon.Command)
  private static final org.ar4k.agent.tunnels.http.grpc.beacon.Command DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.ar4k.agent.tunnels.http.grpc.beacon.Command();
  }

  public static org.ar4k.agent.tunnels.http.grpc.beacon.Command getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Command>
      PARSER = new com.google.protobuf.AbstractParser<Command>() {
    @java.lang.Override
    public Command parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Command(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Command> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Command> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.ar4k.agent.tunnels.http.grpc.beacon.Command getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

