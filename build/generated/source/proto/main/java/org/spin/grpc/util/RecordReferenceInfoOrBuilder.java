// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface RecordReferenceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.RecordReferenceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string windowUuid = 1;</code>
   */
  java.lang.String getWindowUuid();
  /**
   * <code>string windowUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getWindowUuidBytes();

  /**
   * <code>string displayName = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <code>string displayName = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <code>string tableName = 3;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string tableName = 3;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>string whereClause = 4;</code>
   */
  java.lang.String getWhereClause();
  /**
   * <code>string whereClause = 4;</code>
   */
  com.google.protobuf.ByteString
      getWhereClauseBytes();

  /**
   * <code>int64 recordCount = 5;</code>
   */
  long getRecordCount();
}
