// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ar4k_beacon.proto

package org.ar4k.agent.tunnels.http.grpc.beacon;

public interface CompleteCommandReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:beacon.CompleteCommandReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string replies = 1;</code>
   */
  java.util.List<java.lang.String>
      getRepliesList();
  /**
   * <code>repeated string replies = 1;</code>
   */
  int getRepliesCount();
  /**
   * <code>repeated string replies = 1;</code>
   */
  java.lang.String getReplies(int index);
  /**
   * <code>repeated string replies = 1;</code>
   */
  com.google.protobuf.ByteString
      getRepliesBytes(int index);

  /**
   * <code>repeated string errors = 2;</code>
   */
  java.util.List<java.lang.String>
      getErrorsList();
  /**
   * <code>repeated string errors = 2;</code>
   */
  int getErrorsCount();
  /**
   * <code>repeated string errors = 2;</code>
   */
  java.lang.String getErrors(int index);
  /**
   * <code>repeated string errors = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorsBytes(int index);
}
