// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public interface ValidationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dictionary.Validation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string uuid = 2;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string validationType = 4;</code>
   */
  java.lang.String getValidationType();
  /**
   * <code>string validationType = 4;</code>
   */
  com.google.protobuf.ByteString
      getValidationTypeBytes();

  /**
   * <code>string code = 5;</code>
   */
  java.lang.String getCode();
  /**
   * <code>string code = 5;</code>
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>bool isActive = 6;</code>
   */
  boolean getIsActive();
}