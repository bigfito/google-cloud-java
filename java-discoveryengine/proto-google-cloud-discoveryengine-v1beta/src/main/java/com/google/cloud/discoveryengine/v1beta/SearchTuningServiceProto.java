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
// source: google/cloud/discoveryengine/v1beta/search_tuning_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public final class SearchTuningServiceProto {
  private SearchTuningServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/discoveryengine/v1beta/se"
          + "arch_tuning_service.proto\022#google.cloud."
          + "discoveryengine.v1beta\032\034google/api/annot"
          + "ations.proto\032\027google/api/client.proto\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\0327google/cloud/discover"
          + "yengine/v1beta/import_config.proto\032#goog"
          + "le/longrunning/operations.proto\032\037google/"
          + "protobuf/timestamp.proto\032\027google/rpc/sta"
          + "tus.proto\"\270\003\n\027TrainCustomModelRequest\022k\n"
          + "\022gcs_training_input\030\002 \001(\0132M.google.cloud"
          + ".discoveryengine.v1beta.TrainCustomModel"
          + "Request.GcsTrainingInputH\000\022D\n\ndata_store"
          + "\030\001 \001(\tB0\340A\002\372A*\n(discoveryengine.googleap"
          + "is.com/DataStore\022\022\n\nmodel_type\030\003 \001(\t\022L\n\014"
          + "error_config\030\004 \001(\01326.google.cloud.discov"
          + "eryengine.v1beta.ImportErrorConfig\032v\n\020Gc"
          + "sTrainingInput\022\030\n\020corpus_data_path\030\001 \001(\t"
          + "\022\027\n\017query_data_path\030\002 \001(\t\022\027\n\017train_data_"
          + "path\030\003 \001(\t\022\026\n\016test_data_path\030\004 \001(\tB\020\n\016tr"
          + "aining_input\"\266\002\n\030TrainCustomModelRespons"
          + "e\022)\n\rerror_samples\030\001 \003(\0132\022.google.rpc.St"
          + "atus\022L\n\014error_config\030\002 \001(\01326.google.clou"
          + "d.discoveryengine.v1beta.ImportErrorConf"
          + "ig\022\024\n\014model_status\030\003 \001(\t\022[\n\007metrics\030\004 \003("
          + "\0132J.google.cloud.discoveryengine.v1beta."
          + "TrainCustomModelResponse.MetricsEntry\032.\n"
          + "\014MetricsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\001:\0028\001\"|\n\030TrainCustomModelMetadata\022/\n\013cre"
          + "ate_time\030\001 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013update_time\030\002 \001(\0132\032.google.protobu"
          + "f.Timestamp2\277\003\n\023SearchTuningService\022\323\002\n\020"
          + "TrainCustomModel\022<.google.cloud.discover"
          + "yengine.v1beta.TrainCustomModelRequest\032\035"
          + ".google.longrunning.Operation\"\341\001\312A|\n<goo"
          + "gle.cloud.discoveryengine.v1beta.TrainCu"
          + "stomModelResponse\022<google.cloud.discover"
          + "yengine.v1beta.TrainCustomModelMetadata\202"
          + "\323\344\223\002\\\"W/v1beta/{data_store=projects/*/lo"
          + "cations/*/collections/*/dataStores/*}:tr"
          + "ainCustomModel:\001*\032R\312A\036discoveryengine.go"
          + "ogleapis.com\322A.https://www.googleapis.co"
          + "m/auth/cloud-platformB\237\002\n\'com.google.clo"
          + "ud.discoveryengine.v1betaB\030SearchTuningS"
          + "erviceProtoP\001ZQcloud.google.com/go/disco"
          + "veryengine/apiv1beta/discoveryenginepb;d"
          + "iscoveryenginepb\242\002\017DISCOVERYENGINE\252\002#Goo"
          + "gle.Cloud.DiscoveryEngine.V1Beta\312\002#Googl"
          + "e\\Cloud\\DiscoveryEngine\\V1beta\352\002&Google:"
          + ":Cloud::DiscoveryEngine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor,
            new java.lang.String[] {
              "GcsTrainingInput", "DataStore", "ModelType", "ErrorConfig", "TrainingInput",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_descriptor,
            new java.lang.String[] {
              "CorpusDataPath", "QueryDataPath", "TrainDataPath", "TestDataPath",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig", "ModelStatus", "Metrics",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
