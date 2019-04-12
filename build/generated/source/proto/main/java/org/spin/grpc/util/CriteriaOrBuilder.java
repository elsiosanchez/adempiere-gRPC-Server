// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface CriteriaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.Criteria)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tableName = 1;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string tableName = 1;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>int64 limit = 2;</code>
   */
  long getLimit();

  /**
   * <code>string whereClause = 3;</code>
   */
  java.lang.String getWhereClause();
  /**
   * <code>string whereClause = 3;</code>
   */
  com.google.protobuf.ByteString
      getWhereClauseBytes();

  /**
   * <code>string orderByClause = 4;</code>
   */
  java.lang.String getOrderByClause();
  /**
   * <code>string orderByClause = 4;</code>
   */
  com.google.protobuf.ByteString
      getOrderByClauseBytes();

  /**
   * <code>repeated .data.Condition conditions = 5;</code>
   */
  java.util.List<org.spin.grpc.util.Condition> 
      getConditionsList();
  /**
   * <code>repeated .data.Condition conditions = 5;</code>
   */
  org.spin.grpc.util.Condition getConditions(int index);
  /**
   * <code>repeated .data.Condition conditions = 5;</code>
   */
  int getConditionsCount();
  /**
   * <code>repeated .data.Condition conditions = 5;</code>
   */
  java.util.List<? extends org.spin.grpc.util.ConditionOrBuilder> 
      getConditionsOrBuilderList();
  /**
   * <code>repeated .data.Condition conditions = 5;</code>
   */
  org.spin.grpc.util.ConditionOrBuilder getConditionsOrBuilder(
      int index);

  /**
   * <code>repeated .data.OrderByProperty orderByColumn = 6;</code>
   */
  java.util.List<org.spin.grpc.util.OrderByProperty> 
      getOrderByColumnList();
  /**
   * <code>repeated .data.OrderByProperty orderByColumn = 6;</code>
   */
  org.spin.grpc.util.OrderByProperty getOrderByColumn(int index);
  /**
   * <code>repeated .data.OrderByProperty orderByColumn = 6;</code>
   */
  int getOrderByColumnCount();
  /**
   * <code>repeated .data.OrderByProperty orderByColumn = 6;</code>
   */
  java.util.List<? extends org.spin.grpc.util.OrderByPropertyOrBuilder> 
      getOrderByColumnOrBuilderList();
  /**
   * <code>repeated .data.OrderByProperty orderByColumn = 6;</code>
   */
  org.spin.grpc.util.OrderByPropertyOrBuilder getOrderByColumnOrBuilder(
      int index);
}