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
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

package com.google.cloud.vision.v1p3beta1;

public interface AnnotateImageRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.AnnotateImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The image to be processed.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Image image = 1;</code>
   *
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * The image to be processed.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Image image = 1;</code>
   *
   * @return The image.
   */
  com.google.cloud.vision.v1p3beta1.Image getImage();
  /**
   *
   *
   * <pre>
   * The image to be processed.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Image image = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.ImageOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Feature features = 2;</code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.Feature> getFeaturesList();
  /**
   *
   *
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Feature features = 2;</code>
   */
  com.google.cloud.vision.v1p3beta1.Feature getFeatures(int index);
  /**
   *
   *
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Feature features = 2;</code>
   */
  int getFeaturesCount();
  /**
   *
   *
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Feature features = 2;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p3beta1.FeatureOrBuilder>
      getFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Feature features = 2;</code>
   */
  com.google.cloud.vision.v1p3beta1.FeatureOrBuilder getFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional context that may accompany the image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImageContext image_context = 3;</code>
   *
   * @return Whether the imageContext field is set.
   */
  boolean hasImageContext();
  /**
   *
   *
   * <pre>
   * Additional context that may accompany the image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImageContext image_context = 3;</code>
   *
   * @return The imageContext.
   */
  com.google.cloud.vision.v1p3beta1.ImageContext getImageContext();
  /**
   *
   *
   * <pre>
   * Additional context that may accompany the image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImageContext image_context = 3;</code>
   */
  com.google.cloud.vision.v1p3beta1.ImageContextOrBuilder getImageContextOrBuilder();
}