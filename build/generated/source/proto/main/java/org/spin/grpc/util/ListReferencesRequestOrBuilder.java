// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface ListReferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListReferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string tableName = 2;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string tableName = 2;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>int32 recordId = 3;</code>
   */
  int getRecordId();

  /**
   * <code>string windowUuid = 4;</code>
   */
  java.lang.String getWindowUuid();
  /**
   * <code>string windowUuid = 4;</code>
   */
  com.google.protobuf.ByteString
      getWindowUuidBytes();

  /**
   * <code>.data.ClientRequest clientRequest = 5;</code>
   */
  boolean hasClientRequest();
  /**
   * <code>.data.ClientRequest clientRequest = 5;</code>
   */
  org.spin.grpc.util.ClientRequest getClientRequest();
  /**
   * <code>.data.ClientRequest clientRequest = 5;</code>
   */
  org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder();

  /**
   * <code>int32 page_size = 6;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 7;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 7;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
