// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ar4k_beacon.proto

package org.ar4k.agent.tunnels.http.grpc.beacon;

public interface DataNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:beacon.DataNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.beacon.Agent agentOwner = 1;</code>
   */
  boolean hasAgentOwner();
  /**
   * <code>.beacon.Agent agentOwner = 1;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.Agent getAgentOwner();
  /**
   * <code>.beacon.Agent agentOwner = 1;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.AgentOrBuilder getAgentOwnerOrBuilder();

  /**
   * <code>string nodeId = 2;</code>
   */
  java.lang.String getNodeId();
  /**
   * <code>string nodeId = 2;</code>
   */
  com.google.protobuf.ByteString
      getNodeIdBytes();

  /**
   * <code>string jsonValue = 3;</code>
   */
  java.lang.String getJsonValue();
  /**
   * <code>string jsonValue = 3;</code>
   */
  com.google.protobuf.ByteString
      getJsonValueBytes();

  /**
   * <code>string stringValue = 4;</code>
   */
  java.lang.String getStringValue();
  /**
   * <code>string stringValue = 4;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>string base64Value = 5;</code>
   */
  java.lang.String getBase64Value();
  /**
   * <code>string base64Value = 5;</code>
   */
  com.google.protobuf.ByteString
      getBase64ValueBytes();

  /**
   * <code>.beacon.Status quality = 6;</code>
   */
  boolean hasQuality();
  /**
   * <code>.beacon.Status quality = 6;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.Status getQuality();
  /**
   * <code>.beacon.Status quality = 6;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.StatusOrBuilder getQualityOrBuilder();

  /**
   * <code>.beacon.Timestamp timestamp = 7;</code>
   */
  boolean hasTimestamp();
  /**
   * <code>.beacon.Timestamp timestamp = 7;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.Timestamp getTimestamp();
  /**
   * <code>.beacon.Timestamp timestamp = 7;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>.beacon.DataType type = 8;</code>
   */
  int getTypeValue();
  /**
   * <code>.beacon.DataType type = 8;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.DataType getType();

  /**
   * <code>repeated string errors = 9;</code>
   */
  java.util.List<java.lang.String>
      getErrorsList();
  /**
   * <code>repeated string errors = 9;</code>
   */
  int getErrorsCount();
  /**
   * <code>repeated string errors = 9;</code>
   */
  java.lang.String getErrors(int index);
  /**
   * <code>repeated string errors = 9;</code>
   */
  com.google.protobuf.ByteString
      getErrorsBytes(int index);

  /**
   * <code>.beacon.Timestamp timeToExpire = 10;</code>
   */
  boolean hasTimeToExpire();
  /**
   * <code>.beacon.Timestamp timeToExpire = 10;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.Timestamp getTimeToExpire();
  /**
   * <code>.beacon.Timestamp timeToExpire = 10;</code>
   */
  org.ar4k.agent.tunnels.http.grpc.beacon.TimestampOrBuilder getTimeToExpireOrBuilder();
}
