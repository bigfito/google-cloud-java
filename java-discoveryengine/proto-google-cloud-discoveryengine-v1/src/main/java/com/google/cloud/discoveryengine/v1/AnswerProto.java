/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/discoveryengine/v1/answer.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public final class AnswerProto {
  private AnswerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_GroundingSupport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_GroundingSupport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/discoveryengine/v1/answer"
          + ".proto\022\037google.cloud.discoveryengine.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032,google/cloud/discov"
          + "eryengine/v1/safety.proto\032\034google/protob"
          + "uf/struct.proto\032\037google/protobuf/timesta"
          + "mp.proto\"\362&\n\006Answer\022\021\n\004name\030\001 \001(\tB\003\340A\005\022<"
          + "\n\005state\030\002 \001(\0162-.google.cloud.discoveryen"
          + "gine.v1.Answer.State\022\023\n\013answer_text\030\003 \001("
          + "\t\022\034\n\017grounding_score\030\014 \001(\001H\000\210\001\001\022C\n\tcitat"
          + "ions\030\004 \003(\01320.google.cloud.discoveryengin"
          + "e.v1.Answer.Citation\022Y\n\022grounding_suppor"
          + "ts\030\r \003(\01328.google.cloud.discoveryengine."
          + "v1.Answer.GroundingSupportB\003\340A\001\022E\n\nrefer"
          + "ences\030\005 \003(\01321.google.cloud.discoveryengi"
          + "ne.v1.Answer.Reference\022\031\n\021related_questi"
          + "ons\030\006 \003(\t\022;\n\005steps\030\007 \003(\0132,.google.cloud."
          + "discoveryengine.v1.Answer.Step\022`\n\030query_"
          + "understanding_info\030\n \001(\0132>.google.cloud."
          + "discoveryengine.v1.Answer.QueryUnderstan"
          + "dingInfo\022[\n\026answer_skipped_reasons\030\013 \003(\016"
          + "2;.google.cloud.discoveryengine.v1.Answe"
          + "r.AnswerSkippedReason\0224\n\013create_time\030\010 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0226\n\rc"
          + "omplete_time\030\t \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\022J\n\016safety_ratings\030\016 \003(\0132-.go"
          + "ogle.cloud.discoveryengine.v1.SafetyRati"
          + "ngB\003\340A\001\032{\n\010Citation\022\023\n\013start_index\030\001 \001(\003"
          + "\022\021\n\tend_index\030\002 \001(\003\022G\n\007sources\030\003 \003(\01326.g"
          + "oogle.cloud.discoveryengine.v1.Answer.Ci"
          + "tationSource\032&\n\016CitationSource\022\024\n\014refere"
          + "nce_id\030\001 \001(\t\032\210\002\n\020GroundingSupport\022\030\n\013sta"
          + "rt_index\030\001 \001(\003B\003\340A\002\022\026\n\tend_index\030\002 \001(\003B\003"
          + "\340A\002\022\034\n\017grounding_score\030\003 \001(\001H\000\210\001\001\022%\n\030gro"
          + "unding_check_required\030\004 \001(\010H\001\210\001\001\022L\n\007sour"
          + "ces\030\005 \003(\01326.google.cloud.discoveryengine"
          + ".v1.Answer.CitationSourceB\003\340A\001B\022\n\020_groun"
          + "ding_scoreB\033\n\031_grounding_check_required\032"
          + "\250\n\n\tReference\022p\n\032unstructured_document_i"
          + "nfo\030\001 \001(\0132J.google.cloud.discoveryengine"
          + ".v1.Answer.Reference.UnstructuredDocumen"
          + "tInfoH\000\022Q\n\nchunk_info\030\002 \001(\0132;.google.clo"
          + "ud.discoveryengine.v1.Answer.Reference.C"
          + "hunkInfoH\000\022l\n\030structured_document_info\030\003"
          + " \001(\0132H.google.cloud.discoveryengine.v1.A"
          + "nswer.Reference.StructuredDocumentInfoH\000"
          + "\032\201\003\n\030UnstructuredDocumentInfo\022>\n\010documen"
          + "t\030\001 \001(\tB,\372A)\n\'discoveryengine.googleapis"
          + ".com/Document\022\013\n\003uri\030\002 \001(\t\022\r\n\005title\030\003 \001("
          + "\t\022o\n\016chunk_contents\030\004 \003(\0132W.google.cloud"
          + ".discoveryengine.v1.Answer.Reference.Uns"
          + "tructuredDocumentInfo.ChunkContent\022,\n\013st"
          + "ruct_data\030\005 \001(\0132\027.google.protobuf.Struct"
          + "\032j\n\014ChunkContent\022\017\n\007content\030\001 \001(\t\022\027\n\017pag"
          + "e_identifier\030\002 \001(\t\022\034\n\017relevance_score\030\003 "
          + "\001(\002H\000\210\001\001B\022\n\020_relevance_score\032\251\003\n\tChunkIn"
          + "fo\0228\n\005chunk\030\001 \001(\tB)\372A&\n$discoveryengine."
          + "googleapis.com/Chunk\022\017\n\007content\030\002 \001(\t\022\034\n"
          + "\017relevance_score\030\003 \001(\002H\000\210\001\001\022g\n\021document_"
          + "metadata\030\004 \001(\0132L.google.cloud.discoverye"
          + "ngine.v1.Answer.Reference.ChunkInfo.Docu"
          + "mentMetadata\032\265\001\n\020DocumentMetadata\022>\n\010doc"
          + "ument\030\001 \001(\tB,\372A)\n\'discoveryengine.google"
          + "apis.com/Document\022\013\n\003uri\030\002 \001(\t\022\r\n\005title\030"
          + "\003 \001(\t\022\027\n\017page_identifier\030\004 \001(\t\022,\n\013struct"
          + "_data\030\005 \001(\0132\027.google.protobuf.StructB\022\n\020"
          + "_relevance_score\032\254\001\n\026StructuredDocumentI"
          + "nfo\022>\n\010document\030\001 \001(\tB,\372A)\n\'discoveryeng"
          + "ine.googleapis.com/Document\022,\n\013struct_da"
          + "ta\030\002 \001(\0132\027.google.protobuf.Struct\022\022\n\005tit"
          + "le\030\003 \001(\tB\003\340A\003\022\020\n\003uri\030\004 \001(\tB\003\340A\003B\t\n\007conte"
          + "nt\032\274\010\n\004Step\022A\n\005state\030\001 \001(\01622.google.clou"
          + "d.discoveryengine.v1.Answer.Step.State\022\023"
          + "\n\013description\030\002 \001(\t\022\017\n\007thought\030\003 \001(\t\022D\n\007"
          + "actions\030\004 \003(\01323.google.cloud.discoveryen"
          + "gine.v1.Answer.Step.Action\032\270\006\n\006Action\022Y\n"
          + "\rsearch_action\030\002 \001(\0132@.google.cloud.disc"
          + "overyengine.v1.Answer.Step.Action.Search"
          + "ActionH\000\022T\n\013observation\030\003 \001(\0132?.google.c"
          + "loud.discoveryengine.v1.Answer.Step.Acti"
          + "on.Observation\032\035\n\014SearchAction\022\r\n\005query\030"
          + "\001 \001(\t\032\323\004\n\013Observation\022d\n\016search_results\030"
          + "\002 \003(\0132L.google.cloud.discoveryengine.v1."
          + "Answer.Step.Action.Observation.SearchRes"
          + "ult\032\335\003\n\014SearchResult\022\020\n\010document\030\001 \001(\t\022\013"
          + "\n\003uri\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022n\n\014snippet_in"
          + "fo\030\004 \003(\0132X.google.cloud.discoveryengine."
          + "v1.Answer.Step.Action.Observation.Search"
          + "Result.SnippetInfo\022j\n\nchunk_info\030\005 \003(\0132V"
          + ".google.cloud.discoveryengine.v1.Answer."
          + "Step.Action.Observation.SearchResult.Chu"
          + "nkInfo\022,\n\013struct_data\030\006 \001(\0132\027.google.pro"
          + "tobuf.Struct\0326\n\013SnippetInfo\022\017\n\007snippet\030\001"
          + " \001(\t\022\026\n\016snippet_status\030\002 \001(\t\032]\n\tChunkInf"
          + "o\022\r\n\005chunk\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\034\n\017rel"
          + "evance_score\030\003 \001(\002H\000\210\001\001B\022\n\020_relevance_sc"
          + "oreB\010\n\006action\"J\n\005State\022\025\n\021STATE_UNSPECIF"
          + "IED\020\000\022\017\n\013IN_PROGRESS\020\001\022\n\n\006FAILED\020\002\022\r\n\tSU"
          + "CCEEDED\020\003\032\272\003\n\026QueryUnderstandingInfo\022y\n\031"
          + "query_classification_info\030\001 \003(\0132V.google"
          + ".cloud.discoveryengine.v1.Answer.QueryUn"
          + "derstandingInfo.QueryClassificationInfo\032"
          + "\244\002\n\027QueryClassificationInfo\022i\n\004type\030\001 \001("
          + "\0162[.google.cloud.discoveryengine.v1.Answ"
          + "er.QueryUnderstandingInfo.QueryClassific"
          + "ationInfo.Type\022\020\n\010positive\030\002 \001(\010\"\213\001\n\004Typ"
          + "e\022\024\n\020TYPE_UNSPECIFIED\020\000\022\025\n\021ADVERSARIAL_Q"
          + "UERY\020\001\022\034\n\030NON_ANSWER_SEEKING_QUERY\020\002\022\027\n\023"
          + "JAIL_BREAKING_QUERY\020\003\022\037\n\033NON_ANSWER_SEEK"
          + "ING_QUERY_V2\020\004\"Y\n\005State\022\025\n\021STATE_UNSPECI"
          + "FIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\n\n\006FAILED\020\002\022\r\n\tS"
          + "UCCEEDED\020\003\022\r\n\tSTREAMING\020\004\"\335\002\n\023AnswerSkip"
          + "pedReason\022%\n!ANSWER_SKIPPED_REASON_UNSPE"
          + "CIFIED\020\000\022\035\n\031ADVERSARIAL_QUERY_IGNORED\020\001\022"
          + "$\n NON_ANSWER_SEEKING_QUERY_IGNORED\020\002\022\037\n"
          + "\033OUT_OF_DOMAIN_QUERY_IGNORED\020\003\022\036\n\032POTENT"
          + "IAL_POLICY_VIOLATION\020\004\022\027\n\023NO_RELEVANT_CO"
          + "NTENT\020\005\022\037\n\033JAIL_BREAKING_QUERY_IGNORED\020\006"
          + "\022\035\n\031CUSTOMER_POLICY_VIOLATION\020\007\022\'\n#NON_A"
          + "NSWER_SEEKING_QUERY_IGNORED_V2\020\010\022\027\n\023LOW_"
          + "GROUNDED_ANSWER\020\t:\205\003\352A\201\003\n%discoveryengin"
          + "e.googleapis.com/Answer\022cprojects/{proje"
          + "ct}/locations/{location}/dataStores/{dat"
          + "a_store}/sessions/{session}/answers/{ans"
          + "wer}\022|projects/{project}/locations/{loca"
          + "tion}/collections/{collection}/dataStore"
          + "s/{data_store}/sessions/{session}/answer"
          + "s/{answer}\022uprojects/{project}/locations"
          + "/{location}/collections/{collection}/eng"
          + "ines/{engine}/sessions/{session}/answers"
          + "/{answer}B\022\n\020_grounding_scoreB\376\001\n#com.go"
          + "ogle.cloud.discoveryengine.v1B\013AnswerPro"
          + "toP\001ZMcloud.google.com/go/discoveryengin"
          + "e/apiv1/discoveryenginepb;discoveryengin"
          + "epb\242\002\017DISCOVERYENGINE\252\002\037Google.Cloud.Dis"
          + "coveryEngine.V1\312\002\037Google\\Cloud\\Discovery"
          + "Engine\\V1\352\002\"Google::Cloud::DiscoveryEngi"
          + "ne::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.SafetyProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "AnswerText",
              "GroundingScore",
              "Citations",
              "GroundingSupports",
              "References",
              "RelatedQuestions",
              "Steps",
              "QueryUnderstandingInfo",
              "AnswerSkippedReasons",
              "CreateTime",
              "CompleteTime",
              "SafetyRatings",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Citation_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Sources",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_descriptor,
            new java.lang.String[] {
              "ReferenceId",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_GroundingSupport_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_Answer_GroundingSupport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_GroundingSupport_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "GroundingScore", "GroundingCheckRequired", "Sources",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor,
            new java.lang.String[] {
              "UnstructuredDocumentInfo", "ChunkInfo", "StructuredDocumentInfo", "Content",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "ChunkContents", "StructData",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor,
            new java.lang.String[] {
              "Content", "PageIdentifier", "RelevanceScore",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore", "DocumentMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "PageIdentifier", "StructData",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_descriptor,
            new java.lang.String[] {
              "Document", "StructData", "Title", "Uri",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor,
            new java.lang.String[] {
              "State", "Description", "Thought", "Actions",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor,
            new java.lang.String[] {
              "SearchAction", "Observation", "Action",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_descriptor,
            new java.lang.String[] {
              "Query",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor,
            new java.lang.String[] {
              "SearchResults",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "SnippetInfo", "ChunkInfo", "StructData",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor,
            new java.lang.String[] {
              "Snippet", "SnippetStatus",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor,
            new java.lang.String[] {
              "QueryClassificationInfo",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor,
            new java.lang.String[] {
              "Type", "Positive",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.SafetyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
