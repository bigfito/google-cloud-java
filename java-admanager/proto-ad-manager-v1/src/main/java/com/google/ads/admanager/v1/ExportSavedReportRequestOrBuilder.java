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
// source: google/ads/admanager/v1/report_service.proto

// Protobuf Java Version: 3.25.4
package com.google.ads.admanager.v1;

public interface ExportSavedReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.ExportSavedReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of a particular saved report resource.
   *
   * A report will be run based on the specification of this saved report.
   * It must have the format of
   * "networks/{network_code}/reports/{report_id}"
   * </pre>
   *
   * <code>string report = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The report.
   */
  java.lang.String getReport();
  /**
   *
   *
   * <pre>
   * The name of a particular saved report resource.
   *
   * A report will be run based on the specification of this saved report.
   * It must have the format of
   * "networks/{network_code}/reports/{report_id}"
   * </pre>
   *
   * <code>string report = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for report.
   */
  com.google.protobuf.ByteString getReportBytes();

  /**
   *
   *
   * <pre>
   * Required. The export format requested.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.ExportSavedReportRequest.Format format = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   *
   *
   * <pre>
   * Required. The export format requested.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.ExportSavedReportRequest.Format format = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The format.
   */
  com.google.ads.admanager.v1.ExportSavedReportRequest.Format getFormat();

  /**
   *
   *
   * <pre>
   * Whether or not to include the report properties (e.g. network, user, date
   * generated...) in the generated report.
   * </pre>
   *
   * <code>bool include_report_properties = 3;</code>
   *
   * @return The includeReportProperties.
   */
  boolean getIncludeReportProperties();

  /**
   *
   *
   * <pre>
   * Whether or not to include the IDs if there are any (e.g. advertiser ID,
   *  order ID...) present in the report.
   * </pre>
   *
   * <code>bool include_ids = 4;</code>
   *
   * @return The includeIds.
   */
  boolean getIncludeIds();

  /**
   *
   *
   * <pre>
   * Whether or not to include a row containing metric totals.
   * </pre>
   *
   * <code>bool include_totals_row = 5;</code>
   *
   * @return The includeTotalsRow.
   */
  boolean getIncludeTotalsRow();

  /**
   *
   *
   * <pre>
   * The file name of report download. The file extension is determined by
   * export_format and gzip_compressed.
   *
   * Defaults to "DFP Report" if not specified.
   * </pre>
   *
   * <code>string file_name = 6;</code>
   *
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   *
   *
   * <pre>
   * The file name of report download. The file extension is determined by
   * export_format and gzip_compressed.
   *
   * Defaults to "DFP Report" if not specified.
   * </pre>
   *
   * <code>string file_name = 6;</code>
   *
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString getFileNameBytes();
}
