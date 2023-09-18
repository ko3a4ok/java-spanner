/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

public interface UpdateDatabaseMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.UpdateDatabaseMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The request for
   * [UpdateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabase].
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.UpdateDatabaseRequest request = 1;</code>
   *
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   *
   *
   * <pre>
   * The request for
   * [UpdateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabase].
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.UpdateDatabaseRequest request = 1;</code>
   *
   * @return The request.
   */
  com.google.spanner.admin.database.v1.UpdateDatabaseRequest getRequest();
  /**
   *
   *
   * <pre>
   * The request for
   * [UpdateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabase].
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.UpdateDatabaseRequest request = 1;</code>
   */
  com.google.spanner.admin.database.v1.UpdateDatabaseRequestOrBuilder getRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * The progress of the
   * [UpdateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabase]
   * operation.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
   *
   * @return Whether the progress field is set.
   */
  boolean hasProgress();
  /**
   *
   *
   * <pre>
   * The progress of the
   * [UpdateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabase]
   * operation.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
   *
   * @return The progress.
   */
  com.google.spanner.admin.database.v1.OperationProgress getProgress();
  /**
   *
   *
   * <pre>
   * The progress of the
   * [UpdateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabase]
   * operation.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
   */
  com.google.spanner.admin.database.v1.OperationProgressOrBuilder getProgressOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which this operation was cancelled. If set, this operation is
   * in the process of undoing itself (which is best-effort).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cancel_time = 3;</code>
   *
   * @return Whether the cancelTime field is set.
   */
  boolean hasCancelTime();
  /**
   *
   *
   * <pre>
   * The time at which this operation was cancelled. If set, this operation is
   * in the process of undoing itself (which is best-effort).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cancel_time = 3;</code>
   *
   * @return The cancelTime.
   */
  com.google.protobuf.Timestamp getCancelTime();
  /**
   *
   *
   * <pre>
   * The time at which this operation was cancelled. If set, this operation is
   * in the process of undoing itself (which is best-effort).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cancel_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCancelTimeOrBuilder();
}
