// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ar4k_beacon.proto

package org.ar4k.agent.tunnels.http.grpc.beacon;

/**
 * Protobuf enum {@code beacon.HomunculusStates}
 */
public enum HomunculusStates
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INIT = 0;</code>
   */
  INIT(0),
  /**
   * <code>STAMINAL = 1;</code>
   */
  STAMINAL(1),
  /**
   * <code>CONFIGURED = 2;</code>
   */
  CONFIGURED(2),
  /**
   * <code>RUNNING = 3;</code>
   */
  RUNNING(3),
  /**
   * <code>KILLED = 4;</code>
   */
  KILLED(4),
  /**
   * <code>FAULTED = 5;</code>
   */
  FAULTED(5),
  /**
   * <code>STASIS = 6;</code>
   */
  STASIS(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INIT = 0;</code>
   */
  public static final int INIT_VALUE = 0;
  /**
   * <code>STAMINAL = 1;</code>
   */
  public static final int STAMINAL_VALUE = 1;
  /**
   * <code>CONFIGURED = 2;</code>
   */
  public static final int CONFIGURED_VALUE = 2;
  /**
   * <code>RUNNING = 3;</code>
   */
  public static final int RUNNING_VALUE = 3;
  /**
   * <code>KILLED = 4;</code>
   */
  public static final int KILLED_VALUE = 4;
  /**
   * <code>FAULTED = 5;</code>
   */
  public static final int FAULTED_VALUE = 5;
  /**
   * <code>STASIS = 6;</code>
   */
  public static final int STASIS_VALUE = 6;


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
  public static HomunculusStates valueOf(int value) {
    return forNumber(value);
  }

  public static HomunculusStates forNumber(int value) {
    switch (value) {
      case 0: return INIT;
      case 1: return STAMINAL;
      case 2: return CONFIGURED;
      case 3: return RUNNING;
      case 4: return KILLED;
      case 5: return FAULTED;
      case 6: return STASIS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HomunculusStates>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HomunculusStates> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HomunculusStates>() {
          public HomunculusStates findValueByNumber(int number) {
            return HomunculusStates.forNumber(number);
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
    return org.ar4k.agent.tunnels.http.grpc.beacon.BeaconMirrorService.getDescriptor().getEnumTypes().get(1);
  }

  private static final HomunculusStates[] VALUES = values();

  public static HomunculusStates valueOf(
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

  private HomunculusStates(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:beacon.HomunculusStates)
}

