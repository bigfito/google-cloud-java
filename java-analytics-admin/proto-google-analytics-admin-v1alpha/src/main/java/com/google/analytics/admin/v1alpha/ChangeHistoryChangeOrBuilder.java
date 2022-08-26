/*
 * Copyright 2020 Google LLC
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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface ChangeHistoryChangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ChangeHistoryChange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the resource whose changes are described by this entry.
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Resource name of the resource whose changes are described by this entry.
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The type of action that changed this resource.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ActionType action = 2;</code>
   *
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   *
   *
   * <pre>
   * The type of action that changed this resource.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ActionType action = 2;</code>
   *
   * @return The action.
   */
  com.google.analytics.admin.v1alpha.ActionType getAction();

  /**
   *
   *
   * <pre>
   * Resource contents from before the change was made. If this resource was
   * created in this change, this field will be missing.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource resource_before_change = 3;
   * </code>
   *
   * @return Whether the resourceBeforeChange field is set.
   */
  boolean hasResourceBeforeChange();
  /**
   *
   *
   * <pre>
   * Resource contents from before the change was made. If this resource was
   * created in this change, this field will be missing.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource resource_before_change = 3;
   * </code>
   *
   * @return The resourceBeforeChange.
   */
  com.google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource
      getResourceBeforeChange();
  /**
   *
   *
   * <pre>
   * Resource contents from before the change was made. If this resource was
   * created in this change, this field will be missing.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource resource_before_change = 3;
   * </code>
   */
  com.google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResourceOrBuilder
      getResourceBeforeChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource contents from after the change was made. If this resource was
   * deleted in this change, this field will be missing.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource resource_after_change = 4;
   * </code>
   *
   * @return Whether the resourceAfterChange field is set.
   */
  boolean hasResourceAfterChange();
  /**
   *
   *
   * <pre>
   * Resource contents from after the change was made. If this resource was
   * deleted in this change, this field will be missing.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource resource_after_change = 4;
   * </code>
   *
   * @return The resourceAfterChange.
   */
  com.google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource
      getResourceAfterChange();
  /**
   *
   *
   * <pre>
   * Resource contents from after the change was made. If this resource was
   * deleted in this change, this field will be missing.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResource resource_after_change = 4;
   * </code>
   */
  com.google.analytics.admin.v1alpha.ChangeHistoryChange.ChangeHistoryResourceOrBuilder
      getResourceAfterChangeOrBuilder();
}