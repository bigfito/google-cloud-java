/*
 * Copyright 2024 Google LLC
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
// source: google/ads/admanager/v1/creative_service.proto

// Protobuf Java Version: 3.25.4
package com.google.ads.admanager.v1;

public interface CreativeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.Creative)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the Creative.
   * Format: `networks/{network_code}/creatives/{creative_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the Creative.
   * Format: `networks/{network_code}/creatives/{creative_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. `Creative` ID.
   * </pre>
   *
   * <code>int64 creative_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The creativeId.
   */
  long getCreativeId();

  /**
   *
   *
   * <pre>
   * Optional. Display name of the `Creative`. This attribute has a maximum
   * length of 255 characters.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. Display name of the `Creative`. This attribute has a maximum
   * length of 255 characters.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Company, which is of type
   * Company.Type.ADVERTISER, to which this Creative belongs. Format:
   * "networks/{network_code}/companies/{company_id}"
   * </pre>
   *
   * <code>
   * string advertiser = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The advertiser.
   */
  java.lang.String getAdvertiser();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Company, which is of type
   * Company.Type.ADVERTISER, to which this Creative belongs. Format:
   * "networks/{network_code}/companies/{company_id}"
   * </pre>
   *
   * <code>
   * string advertiser = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for advertiser.
   */
  com.google.protobuf.ByteString getAdvertiserBytes();

  /**
   *
   *
   * <pre>
   * Output only. The instant this Creative was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The instant this Creative was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The instant this Creative was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The URL of the creative for previewing the media.
   * </pre>
   *
   * <code>string preview_url = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The previewUrl.
   */
  java.lang.String getPreviewUrl();
  /**
   *
   *
   * <pre>
   * Output only. The URL of the creative for previewing the media.
   * </pre>
   *
   * <code>string preview_url = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for previewUrl.
   */
  com.google.protobuf.ByteString getPreviewUrlBytes();

  /**
   *
   *
   * <pre>
   * Output only. String representations of creative size.
   * This field is temporarily available and will be deprecated when
   * `Creative.size` becomes available.
   * </pre>
   *
   * <code>string size_label = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeLabel.
   */
  java.lang.String getSizeLabel();
  /**
   *
   *
   * <pre>
   * Output only. String representations of creative size.
   * This field is temporarily available and will be deprecated when
   * `Creative.size` becomes available.
   * </pre>
   *
   * <code>string size_label = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for sizeLabel.
   */
  com.google.protobuf.ByteString getSizeLabelBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Ad Partners associated with this creative.
   * This is distinct from any associated companies that Google may detect
   * programmatically.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.AdPartnerDeclaration ad_partner_declaration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the adPartnerDeclaration field is set.
   */
  boolean hasAdPartnerDeclaration();
  /**
   *
   *
   * <pre>
   * Optional. The Ad Partners associated with this creative.
   * This is distinct from any associated companies that Google may detect
   * programmatically.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.AdPartnerDeclaration ad_partner_declaration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The adPartnerDeclaration.
   */
  com.google.ads.admanager.v1.AdPartnerDeclaration getAdPartnerDeclaration();
  /**
   *
   *
   * <pre>
   * Optional. The Ad Partners associated with this creative.
   * This is distinct from any associated companies that Google may detect
   * programmatically.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.AdPartnerDeclaration ad_partner_declaration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.ads.admanager.v1.AdPartnerDeclarationOrBuilder getAdPartnerDeclarationOrBuilder();
}
