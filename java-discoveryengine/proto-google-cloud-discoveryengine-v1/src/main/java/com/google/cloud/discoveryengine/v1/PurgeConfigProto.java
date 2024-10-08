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
// source: google/cloud/discoveryengine/v1/purge_config.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.discoveryengine.v1;

public final class PurgeConfigProto {
  private PurgeConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/discoveryengine/v1/purge_"
          + "config.proto\022\037google.cloud.discoveryengi"
          + "ne.v1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\032\027google/rpc/status.pr"
          + "oto\"z\n\025PurgeDocumentsRequest\022=\n\006parent\030\001"
          + " \001(\tB-\340A\002\372A\'\n%discoveryengine.googleapis"
          + ".com/Branch\022\023\n\006filter\030\002 \001(\tB\003\340A\002\022\r\n\005forc"
          + "e\030\003 \001(\010\"q\n\026PurgeDocumentsResponse\022\023\n\013pur"
          + "ge_count\030\001 \001(\003\022B\n\014purge_sample\030\002 \003(\tB,\372A"
          + ")\n\'discoveryengine.googleapis.com/Docume"
          + "nt\"\277\001\n\026PurgeDocumentsMetadata\022/\n\013create_"
          + "time\030\001 \001(\0132\032.google.protobuf.Timestamp\022/"
          + "\n\013update_time\030\002 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfailur"
          + "e_count\030\004 \001(\003\022\025\n\rignored_count\030\005 \001(\003\"i\n%"
          + "PurgeSuggestionDenyListEntriesRequest\022@\n"
          + "\006parent\030\001 \001(\tB0\340A\002\372A*\n(discoveryengine.g"
          + "oogleapis.com/DataStore\"h\n&PurgeSuggesti"
          + "onDenyListEntriesResponse\022\023\n\013purge_count"
          + "\030\001 \001(\003\022)\n\rerror_samples\030\002 \003(\0132\022.google.r"
          + "pc.Status\"\212\001\n&PurgeSuggestionDenyListEnt"
          + "riesMetadata\022/\n\013create_time\030\001 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022/\n\013update_time\030\002 \001"
          + "(\0132\032.google.protobuf.Timestamp\"e\n!PurgeC"
          + "ompletionSuggestionsRequest\022@\n\006parent\030\001 "
          + "\001(\tB0\340A\002\372A*\n(discoveryengine.googleapis."
          + "com/DataStore\"h\n\"PurgeCompletionSuggesti"
          + "onsResponse\022\027\n\017purge_succeeded\030\001 \001(\010\022)\n\r"
          + "error_samples\030\002 \003(\0132\022.google.rpc.Status\""
          + "\206\001\n\"PurgeCompletionSuggestionsMetadata\022/"
          + "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022/\n\013update_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\203\002\n#com.google.cloud.di"
          + "scoveryengine.v1B\020PurgeConfigProtoP\001ZMcl"
          + "oud.google.com/go/discoveryengine/apiv1/"
          + "discoveryenginepb;discoveryenginepb\242\002\017DI"
          + "SCOVERYENGINE\252\002\037Google.Cloud.DiscoveryEn"
          + "gine.V1\312\002\037Google\\Cloud\\DiscoveryEngine\\V"
          + "1\352\002\"Google::Cloud::DiscoveryEngine::V1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "Force",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_descriptor,
            new java.lang.String[] {
              "PurgeCount", "PurgeSample",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount", "IgnoredCount",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesResponse_descriptor,
            new java.lang.String[] {
              "PurgeCount", "ErrorSamples",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeSuggestionDenyListEntriesMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsResponse_descriptor,
            new java.lang.String[] {
              "PurgeSucceeded", "ErrorSamples",
            });
    internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_PurgeCompletionSuggestionsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
