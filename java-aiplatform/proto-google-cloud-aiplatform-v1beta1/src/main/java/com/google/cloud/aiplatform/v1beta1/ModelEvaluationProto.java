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
// source: google/cloud/aiplatform/v1beta1/model_evaluation.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelEvaluationProto {
  private ModelEvaluationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/model_"
          + "evaluation.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\0321google/cl"
          + "oud/aiplatform/v1beta1/explanation.proto"
          + "\032\034google/protobuf/struct.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\275\005\n\017ModelEvaluat"
          + "ion\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014display_name\030\n"
          + " \001(\t\022\032\n\022metrics_schema_uri\030\002 \001(\t\022\'\n\007metr"
          + "ics\030\003 \001(\0132\026.google.protobuf.Value\0224\n\013cre"
          + "ate_time\030\004 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\022\030\n\020slice_dimensions\030\005 \003(\t\022L\n\021mod"
          + "el_explanation\030\010 \001(\01321.google.cloud.aipl"
          + "atform.v1beta1.ModelExplanation\022j\n\021expla"
          + "nation_specs\030\t \003(\0132O.google.cloud.aiplat"
          + "form.v1beta1.ModelEvaluation.ModelEvalua"
          + "tionExplanationSpec\022(\n\010metadata\030\013 \001(\0132\026."
          + "google.protobuf.Value\032\206\001\n\036ModelEvaluatio"
          + "nExplanationSpec\022\030\n\020explanation_type\030\001 \001"
          + "(\t\022J\n\020explanation_spec\030\002 \001(\01320.google.cl"
          + "oud.aiplatform.v1beta1.ExplanationSpec:\177"
          + "\352A|\n)aiplatform.googleapis.com/ModelEval"
          + "uation\022Oprojects/{project}/locations/{lo"
          + "cation}/models/{model}/evaluations/{eval"
          + "uation}B\361\001\n#com.google.cloud.aiplatform."
          + "v1beta1B\024ModelEvaluationProtoP\001ZIgoogle."
          + "golang.org/genproto/googleapis/cloud/aip"
          + "latform/v1beta1;aiplatform\252\002\037Google.Clou"
          + "d.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPl"
          + "atform\\V1beta1\352\002\"Google::Cloud::AIPlatfo"
          + "rm::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MetricsSchemaUri",
              "Metrics",
              "CreateTime",
              "SliceDimensions",
              "ModelExplanation",
              "ExplanationSpecs",
              "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor,
            new java.lang.String[] {
              "ExplanationType", "ExplanationSpec",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}