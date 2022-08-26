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
// source: google/cloud/video/livestream/v1/outputs.proto

package com.google.cloud.video.livestream.v1;

public interface VideoStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.VideoStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * H264 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoStream.H264CodecSettings h264 = 20;</code>
   *
   * @return Whether the h264 field is set.
   */
  boolean hasH264();
  /**
   *
   *
   * <pre>
   * H264 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoStream.H264CodecSettings h264 = 20;</code>
   *
   * @return The h264.
   */
  com.google.cloud.video.livestream.v1.VideoStream.H264CodecSettings getH264();
  /**
   *
   *
   * <pre>
   * H264 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoStream.H264CodecSettings h264 = 20;</code>
   */
  com.google.cloud.video.livestream.v1.VideoStream.H264CodecSettingsOrBuilder getH264OrBuilder();

  public com.google.cloud.video.livestream.v1.VideoStream.CodecSettingsCase getCodecSettingsCase();
}