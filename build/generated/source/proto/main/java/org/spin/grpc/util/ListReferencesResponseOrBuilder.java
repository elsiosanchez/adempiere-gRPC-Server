// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface ListReferencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListReferencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.RecordReferenceInfo references = 2;</code>
   */
  java.util.List<org.spin.grpc.util.RecordReferenceInfo> 
      getReferencesList();
  /**
   * <code>repeated .data.RecordReferenceInfo references = 2;</code>
   */
  org.spin.grpc.util.RecordReferenceInfo getReferences(int index);
  /**
   * <code>repeated .data.RecordReferenceInfo references = 2;</code>
   */
  int getReferencesCount();
  /**
   * <code>repeated .data.RecordReferenceInfo references = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.RecordReferenceInfoOrBuilder> 
      getReferencesOrBuilderList();
  /**
   * <code>repeated .data.RecordReferenceInfo references = 2;</code>
   */
  org.spin.grpc.util.RecordReferenceInfoOrBuilder getReferencesOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 3;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
