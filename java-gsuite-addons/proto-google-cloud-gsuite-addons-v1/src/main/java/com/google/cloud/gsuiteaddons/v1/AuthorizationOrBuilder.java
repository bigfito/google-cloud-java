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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

package com.google.cloud.gsuiteaddons.v1;

public interface AuthorizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gsuiteaddons.v1.Authorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The canonical full name of this resource.
   * Example:  `projects/123/authorization`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The canonical full name of this resource.
   * Example:  `projects/123/authorization`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The email address of the service account used to authenticate requests to
   * add-on callback endpoints.
   * </pre>
   *
   * <code>string service_account_email = 2;</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * The email address of the service account used to authenticate requests to
   * add-on callback endpoints.
   * </pre>
   *
   * <code>string service_account_email = 2;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * The OAuth client ID used to obtain OAuth access tokens for a user on the
   * add-on's behalf.
   * </pre>
   *
   * <code>string oauth_client_id = 3;</code>
   *
   * @return The oauthClientId.
   */
  java.lang.String getOauthClientId();
  /**
   *
   *
   * <pre>
   * The OAuth client ID used to obtain OAuth access tokens for a user on the
   * add-on's behalf.
   * </pre>
   *
   * <code>string oauth_client_id = 3;</code>
   *
   * @return The bytes for oauthClientId.
   */
  com.google.protobuf.ByteString getOauthClientIdBytes();
}