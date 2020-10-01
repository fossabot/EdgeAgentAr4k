// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ar4k_beacon.proto

package org.ar4k.agent.tunnels.http.grpc.beacon;

/**
 * Protobuf enum {@code beacon.CommandType}
 */
public enum CommandType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ELABORATE_MESSAGE_COMMAND = 0;</code>
   */
  ELABORATE_MESSAGE_COMMAND(0),
  /**
   * <code>LIST_COMMANDS = 1;</code>
   */
  LIST_COMMANDS(1),
  /**
   * <code>COMPLETE_COMMAND = 2;</code>
   */
  COMPLETE_COMMAND(2),
  /**
   * <code>OPEN_PROXY_SOCKS = 3;</code>
   */
  OPEN_PROXY_SOCKS(3),
  /**
   * <code>EXPOSE_PORT = 4;</code>
   */
  EXPOSE_PORT(4),
  /**
   * <code>CLOSE_PORT = 5;</code>
   */
  CLOSE_PORT(5),
  /**
   * <code>CONNECT_DATA_CHANNEL = 6;</code>
   */
  CONNECT_DATA_CHANNEL(6),
  /**
   * <code>SET_CONFIGURATION = 7;</code>
   */
  SET_CONFIGURATION(7),
  /**
   * <code>GET_CONFIGURATION = 8;</code>
   */
  GET_CONFIGURATION(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ELABORATE_MESSAGE_COMMAND = 0;</code>
   */
  public static final int ELABORATE_MESSAGE_COMMAND_VALUE = 0;
  /**
   * <code>LIST_COMMANDS = 1;</code>
   */
  public static final int LIST_COMMANDS_VALUE = 1;
  /**
   * <code>COMPLETE_COMMAND = 2;</code>
   */
  public static final int COMPLETE_COMMAND_VALUE = 2;
  /**
   * <code>OPEN_PROXY_SOCKS = 3;</code>
   */
  public static final int OPEN_PROXY_SOCKS_VALUE = 3;
  /**
   * <code>EXPOSE_PORT = 4;</code>
   */
  public static final int EXPOSE_PORT_VALUE = 4;
  /**
   * <code>CLOSE_PORT = 5;</code>
   */
  public static final int CLOSE_PORT_VALUE = 5;
  /**
   * <code>CONNECT_DATA_CHANNEL = 6;</code>
   */
  public static final int CONNECT_DATA_CHANNEL_VALUE = 6;
  /**
   * <code>SET_CONFIGURATION = 7;</code>
   */
  public static final int SET_CONFIGURATION_VALUE = 7;
  /**
   * <code>GET_CONFIGURATION = 8;</code>
   */
  public static final int GET_CONFIGURATION_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CommandType valueOf(int value) {
    return forNumber(value);
  }

  public static CommandType forNumber(int value) {
    switch (value) {
      case 0: return ELABORATE_MESSAGE_COMMAND;
      case 1: return LIST_COMMANDS;
      case 2: return COMPLETE_COMMAND;
      case 3: return OPEN_PROXY_SOCKS;
      case 4: return EXPOSE_PORT;
      case 5: return CLOSE_PORT;
      case 6: return CONNECT_DATA_CHANNEL;
      case 7: return SET_CONFIGURATION;
      case 8: return GET_CONFIGURATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommandType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CommandType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommandType>() {
          public CommandType findValueByNumber(int number) {
            return CommandType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.getDescriptor().getEnumTypes().get(2);
  }

  private static final CommandType[] VALUES = values();

  public static CommandType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CommandType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:beacon.CommandType)
}

