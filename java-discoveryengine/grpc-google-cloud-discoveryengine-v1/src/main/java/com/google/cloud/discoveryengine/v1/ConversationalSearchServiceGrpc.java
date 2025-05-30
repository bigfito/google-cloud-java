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
package com.google.cloud.discoveryengine.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Service for conversational search.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/discoveryengine/v1/conversational_search_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConversationalSearchServiceGrpc {

  private ConversationalSearchServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME =
      "google.cloud.discoveryengine.v1.ConversationalSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.ConverseConversationRequest,
          com.google.cloud.discoveryengine.v1.ConverseConversationResponse>
      getConverseConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConverseConversation",
      requestType = com.google.cloud.discoveryengine.v1.ConverseConversationRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.ConverseConversationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.ConverseConversationRequest,
          com.google.cloud.discoveryengine.v1.ConverseConversationResponse>
      getConverseConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.ConverseConversationRequest,
            com.google.cloud.discoveryengine.v1.ConverseConversationResponse>
        getConverseConversationMethod;
    if ((getConverseConversationMethod =
            ConversationalSearchServiceGrpc.getConverseConversationMethod)
        == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getConverseConversationMethod =
                ConversationalSearchServiceGrpc.getConverseConversationMethod)
            == null) {
          ConversationalSearchServiceGrpc.getConverseConversationMethod =
              getConverseConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.ConverseConversationRequest,
                          com.google.cloud.discoveryengine.v1.ConverseConversationResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ConverseConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.ConverseConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.ConverseConversationResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier(
                              "ConverseConversation"))
                      .build();
        }
      }
    }
    return getConverseConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.CreateConversationRequest,
          com.google.cloud.discoveryengine.v1.Conversation>
      getCreateConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConversation",
      requestType = com.google.cloud.discoveryengine.v1.CreateConversationRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.CreateConversationRequest,
          com.google.cloud.discoveryengine.v1.Conversation>
      getCreateConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.CreateConversationRequest,
            com.google.cloud.discoveryengine.v1.Conversation>
        getCreateConversationMethod;
    if ((getCreateConversationMethod = ConversationalSearchServiceGrpc.getCreateConversationMethod)
        == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getCreateConversationMethod =
                ConversationalSearchServiceGrpc.getCreateConversationMethod)
            == null) {
          ConversationalSearchServiceGrpc.getCreateConversationMethod =
              getCreateConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.CreateConversationRequest,
                          com.google.cloud.discoveryengine.v1.Conversation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.CreateConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.Conversation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier(
                              "CreateConversation"))
                      .build();
        }
      }
    }
    return getCreateConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.DeleteConversationRequest, com.google.protobuf.Empty>
      getDeleteConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConversation",
      requestType = com.google.cloud.discoveryengine.v1.DeleteConversationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.DeleteConversationRequest, com.google.protobuf.Empty>
      getDeleteConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.DeleteConversationRequest,
            com.google.protobuf.Empty>
        getDeleteConversationMethod;
    if ((getDeleteConversationMethod = ConversationalSearchServiceGrpc.getDeleteConversationMethod)
        == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getDeleteConversationMethod =
                ConversationalSearchServiceGrpc.getDeleteConversationMethod)
            == null) {
          ConversationalSearchServiceGrpc.getDeleteConversationMethod =
              getDeleteConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.DeleteConversationRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.DeleteConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier(
                              "DeleteConversation"))
                      .build();
        }
      }
    }
    return getDeleteConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.UpdateConversationRequest,
          com.google.cloud.discoveryengine.v1.Conversation>
      getUpdateConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConversation",
      requestType = com.google.cloud.discoveryengine.v1.UpdateConversationRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.UpdateConversationRequest,
          com.google.cloud.discoveryengine.v1.Conversation>
      getUpdateConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.UpdateConversationRequest,
            com.google.cloud.discoveryengine.v1.Conversation>
        getUpdateConversationMethod;
    if ((getUpdateConversationMethod = ConversationalSearchServiceGrpc.getUpdateConversationMethod)
        == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getUpdateConversationMethod =
                ConversationalSearchServiceGrpc.getUpdateConversationMethod)
            == null) {
          ConversationalSearchServiceGrpc.getUpdateConversationMethod =
              getUpdateConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.UpdateConversationRequest,
                          com.google.cloud.discoveryengine.v1.Conversation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.UpdateConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.Conversation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier(
                              "UpdateConversation"))
                      .build();
        }
      }
    }
    return getUpdateConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.GetConversationRequest,
          com.google.cloud.discoveryengine.v1.Conversation>
      getGetConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConversation",
      requestType = com.google.cloud.discoveryengine.v1.GetConversationRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.GetConversationRequest,
          com.google.cloud.discoveryengine.v1.Conversation>
      getGetConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.GetConversationRequest,
            com.google.cloud.discoveryengine.v1.Conversation>
        getGetConversationMethod;
    if ((getGetConversationMethod = ConversationalSearchServiceGrpc.getGetConversationMethod)
        == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getGetConversationMethod = ConversationalSearchServiceGrpc.getGetConversationMethod)
            == null) {
          ConversationalSearchServiceGrpc.getGetConversationMethod =
              getGetConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.GetConversationRequest,
                          com.google.cloud.discoveryengine.v1.Conversation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.GetConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.Conversation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier(
                              "GetConversation"))
                      .build();
        }
      }
    }
    return getGetConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.ListConversationsRequest,
          com.google.cloud.discoveryengine.v1.ListConversationsResponse>
      getListConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConversations",
      requestType = com.google.cloud.discoveryengine.v1.ListConversationsRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.ListConversationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.ListConversationsRequest,
          com.google.cloud.discoveryengine.v1.ListConversationsResponse>
      getListConversationsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.ListConversationsRequest,
            com.google.cloud.discoveryengine.v1.ListConversationsResponse>
        getListConversationsMethod;
    if ((getListConversationsMethod = ConversationalSearchServiceGrpc.getListConversationsMethod)
        == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getListConversationsMethod =
                ConversationalSearchServiceGrpc.getListConversationsMethod)
            == null) {
          ConversationalSearchServiceGrpc.getListConversationsMethod =
              getListConversationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.ListConversationsRequest,
                          com.google.cloud.discoveryengine.v1.ListConversationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConversations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.ListConversationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.ListConversationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier(
                              "ListConversations"))
                      .build();
        }
      }
    }
    return getListConversationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
          com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
      getAnswerQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnswerQuery",
      requestType = com.google.cloud.discoveryengine.v1.AnswerQueryRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.AnswerQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
          com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
      getAnswerQueryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
            com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
        getAnswerQueryMethod;
    if ((getAnswerQueryMethod = ConversationalSearchServiceGrpc.getAnswerQueryMethod) == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getAnswerQueryMethod = ConversationalSearchServiceGrpc.getAnswerQueryMethod) == null) {
          ConversationalSearchServiceGrpc.getAnswerQueryMethod =
              getAnswerQueryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
                          com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnswerQuery"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.AnswerQueryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.AnswerQueryResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier("AnswerQuery"))
                      .build();
        }
      }
    }
    return getAnswerQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
          com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
      getStreamAnswerQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAnswerQuery",
      requestType = com.google.cloud.discoveryengine.v1.AnswerQueryRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.AnswerQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
          com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
      getStreamAnswerQueryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
            com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
        getStreamAnswerQueryMethod;
    if ((getStreamAnswerQueryMethod = ConversationalSearchServiceGrpc.getStreamAnswerQueryMethod)
        == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getStreamAnswerQueryMethod =
                ConversationalSearchServiceGrpc.getStreamAnswerQueryMethod)
            == null) {
          ConversationalSearchServiceGrpc.getStreamAnswerQueryMethod =
              getStreamAnswerQueryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
                          com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAnswerQuery"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.AnswerQueryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.AnswerQueryResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier(
                              "StreamAnswerQuery"))
                      .build();
        }
      }
    }
    return getStreamAnswerQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.GetAnswerRequest,
          com.google.cloud.discoveryengine.v1.Answer>
      getGetAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnswer",
      requestType = com.google.cloud.discoveryengine.v1.GetAnswerRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.Answer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.GetAnswerRequest,
          com.google.cloud.discoveryengine.v1.Answer>
      getGetAnswerMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.GetAnswerRequest,
            com.google.cloud.discoveryengine.v1.Answer>
        getGetAnswerMethod;
    if ((getGetAnswerMethod = ConversationalSearchServiceGrpc.getGetAnswerMethod) == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getGetAnswerMethod = ConversationalSearchServiceGrpc.getGetAnswerMethod) == null) {
          ConversationalSearchServiceGrpc.getGetAnswerMethod =
              getGetAnswerMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.GetAnswerRequest,
                          com.google.cloud.discoveryengine.v1.Answer>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnswer"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.GetAnswerRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.Answer.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier("GetAnswer"))
                      .build();
        }
      }
    }
    return getGetAnswerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.CreateSessionRequest,
          com.google.cloud.discoveryengine.v1.Session>
      getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = com.google.cloud.discoveryengine.v1.CreateSessionRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.CreateSessionRequest,
          com.google.cloud.discoveryengine.v1.Session>
      getCreateSessionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.CreateSessionRequest,
            com.google.cloud.discoveryengine.v1.Session>
        getCreateSessionMethod;
    if ((getCreateSessionMethod = ConversationalSearchServiceGrpc.getCreateSessionMethod) == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getCreateSessionMethod = ConversationalSearchServiceGrpc.getCreateSessionMethod)
            == null) {
          ConversationalSearchServiceGrpc.getCreateSessionMethod =
              getCreateSessionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.CreateSessionRequest,
                          com.google.cloud.discoveryengine.v1.Session>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.CreateSessionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.Session.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier("CreateSession"))
                      .build();
        }
      }
    }
    return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.DeleteSessionRequest, com.google.protobuf.Empty>
      getDeleteSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSession",
      requestType = com.google.cloud.discoveryengine.v1.DeleteSessionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.DeleteSessionRequest, com.google.protobuf.Empty>
      getDeleteSessionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.DeleteSessionRequest, com.google.protobuf.Empty>
        getDeleteSessionMethod;
    if ((getDeleteSessionMethod = ConversationalSearchServiceGrpc.getDeleteSessionMethod) == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getDeleteSessionMethod = ConversationalSearchServiceGrpc.getDeleteSessionMethod)
            == null) {
          ConversationalSearchServiceGrpc.getDeleteSessionMethod =
              getDeleteSessionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.DeleteSessionRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSession"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.DeleteSessionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier("DeleteSession"))
                      .build();
        }
      }
    }
    return getDeleteSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.UpdateSessionRequest,
          com.google.cloud.discoveryengine.v1.Session>
      getUpdateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSession",
      requestType = com.google.cloud.discoveryengine.v1.UpdateSessionRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.UpdateSessionRequest,
          com.google.cloud.discoveryengine.v1.Session>
      getUpdateSessionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.UpdateSessionRequest,
            com.google.cloud.discoveryengine.v1.Session>
        getUpdateSessionMethod;
    if ((getUpdateSessionMethod = ConversationalSearchServiceGrpc.getUpdateSessionMethod) == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getUpdateSessionMethod = ConversationalSearchServiceGrpc.getUpdateSessionMethod)
            == null) {
          ConversationalSearchServiceGrpc.getUpdateSessionMethod =
              getUpdateSessionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.UpdateSessionRequest,
                          com.google.cloud.discoveryengine.v1.Session>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSession"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.UpdateSessionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.Session.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier("UpdateSession"))
                      .build();
        }
      }
    }
    return getUpdateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.GetSessionRequest,
          com.google.cloud.discoveryengine.v1.Session>
      getGetSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSession",
      requestType = com.google.cloud.discoveryengine.v1.GetSessionRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.GetSessionRequest,
          com.google.cloud.discoveryengine.v1.Session>
      getGetSessionMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.GetSessionRequest,
            com.google.cloud.discoveryengine.v1.Session>
        getGetSessionMethod;
    if ((getGetSessionMethod = ConversationalSearchServiceGrpc.getGetSessionMethod) == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getGetSessionMethod = ConversationalSearchServiceGrpc.getGetSessionMethod) == null) {
          ConversationalSearchServiceGrpc.getGetSessionMethod =
              getGetSessionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.GetSessionRequest,
                          com.google.cloud.discoveryengine.v1.Session>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSession"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.GetSessionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.Session.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier("GetSession"))
                      .build();
        }
      }
    }
    return getGetSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.ListSessionsRequest,
          com.google.cloud.discoveryengine.v1.ListSessionsResponse>
      getListSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessions",
      requestType = com.google.cloud.discoveryengine.v1.ListSessionsRequest.class,
      responseType = com.google.cloud.discoveryengine.v1.ListSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1.ListSessionsRequest,
          com.google.cloud.discoveryengine.v1.ListSessionsResponse>
      getListSessionsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1.ListSessionsRequest,
            com.google.cloud.discoveryengine.v1.ListSessionsResponse>
        getListSessionsMethod;
    if ((getListSessionsMethod = ConversationalSearchServiceGrpc.getListSessionsMethod) == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        if ((getListSessionsMethod = ConversationalSearchServiceGrpc.getListSessionsMethod)
            == null) {
          ConversationalSearchServiceGrpc.getListSessionsMethod =
              getListSessionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1.ListSessionsRequest,
                          com.google.cloud.discoveryengine.v1.ListSessionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.ListSessionsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1.ListSessionsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationalSearchServiceMethodDescriptorSupplier("ListSessions"))
                      .build();
        }
      }
    }
    return getListSessionsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static ConversationalSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationalSearchServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConversationalSearchServiceStub>() {
          @java.lang.Override
          public ConversationalSearchServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConversationalSearchServiceStub(channel, callOptions);
          }
        };
    return ConversationalSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversationalSearchServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationalSearchServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConversationalSearchServiceBlockingStub>() {
          @java.lang.Override
          public ConversationalSearchServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConversationalSearchServiceBlockingStub(channel, callOptions);
          }
        };
    return ConversationalSearchServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static ConversationalSearchServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationalSearchServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConversationalSearchServiceFutureStub>() {
          @java.lang.Override
          public ConversationalSearchServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConversationalSearchServiceFutureStub(channel, callOptions);
          }
        };
    return ConversationalSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service for conversational search.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Converses a conversation.
     * </pre>
     */
    default void converseConversation(
        com.google.cloud.discoveryengine.v1.ConverseConversationRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.discoveryengine.v1.ConverseConversationResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getConverseConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * create already exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    default void createConversation(
        com.google.cloud.discoveryengine.v1.CreateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * delete does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    default void deleteConversation(
        com.google.cloud.discoveryengine.v1.DeleteConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a Conversation.
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] action type
     * cannot be changed. If the
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] to update does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    default void updateConversation(
        com.google.cloud.discoveryengine.v1.UpdateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Conversation.
     * </pre>
     */
    default void getConversation(
        com.google.cloud.discoveryengine.v1.GetConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all Conversations by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    default void listConversations(
        com.google.cloud.discoveryengine.v1.ListConversationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.ListConversationsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListConversationsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Answer query method.
     * </pre>
     */
    default void answerQuery(
        com.google.cloud.discoveryengine.v1.AnswerQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getAnswerQueryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Answer query method (streaming).
     * It takes one
     * [AnswerQueryRequest][google.cloud.discoveryengine.v1.AnswerQueryRequest]
     * and returns multiple
     * [AnswerQueryResponse][google.cloud.discoveryengine.v1.AnswerQueryResponse]
     * messages in a stream.
     * </pre>
     */
    default void streamAnswerQuery(
        com.google.cloud.discoveryengine.v1.AnswerQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getStreamAnswerQueryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Answer.
     * </pre>
     */
    default void getAnswer(
        com.google.cloud.discoveryengine.v1.GetAnswerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Answer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnswerMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to create already
     * exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    default void createSession(
        com.google.cloud.discoveryengine.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateSessionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to delete does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    default void deleteSession(
        com.google.cloud.discoveryengine.v1.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteSessionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a Session.
     * [Session][google.cloud.discoveryengine.v1.Session] action type cannot be
     * changed. If the [Session][google.cloud.discoveryengine.v1.Session] to
     * update does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    default void updateSession(
        com.google.cloud.discoveryengine.v1.UpdateSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateSessionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Session.
     * </pre>
     */
    default void getSession(
        com.google.cloud.discoveryengine.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all Sessions by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    default void listSessions(
        com.google.cloud.discoveryengine.v1.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.ListSessionsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListSessionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConversationalSearchService.
   *
   * <pre>
   * Service for conversational search.
   * </pre>
   */
  public abstract static class ConversationalSearchServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return ConversationalSearchServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConversationalSearchService.
   *
   * <pre>
   * Service for conversational search.
   * </pre>
   */
  public static final class ConversationalSearchServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConversationalSearchServiceStub> {
    private ConversationalSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationalSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationalSearchServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Converses a conversation.
     * </pre>
     */
    public void converseConversation(
        com.google.cloud.discoveryengine.v1.ConverseConversationRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.discoveryengine.v1.ConverseConversationResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConverseConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * create already exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    public void createConversation(
        com.google.cloud.discoveryengine.v1.CreateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * delete does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public void deleteConversation(
        com.google.cloud.discoveryengine.v1.DeleteConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a Conversation.
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] action type
     * cannot be changed. If the
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] to update does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public void updateConversation(
        com.google.cloud.discoveryengine.v1.UpdateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Conversation.
     * </pre>
     */
    public void getConversation(
        com.google.cloud.discoveryengine.v1.GetConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all Conversations by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    public void listConversations(
        com.google.cloud.discoveryengine.v1.ListConversationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.ListConversationsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Answer query method.
     * </pre>
     */
    public void answerQuery(
        com.google.cloud.discoveryengine.v1.AnswerQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnswerQueryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Answer query method (streaming).
     * It takes one
     * [AnswerQueryRequest][google.cloud.discoveryengine.v1.AnswerQueryRequest]
     * and returns multiple
     * [AnswerQueryResponse][google.cloud.discoveryengine.v1.AnswerQueryResponse]
     * messages in a stream.
     * </pre>
     */
    public void streamAnswerQuery(
        com.google.cloud.discoveryengine.v1.AnswerQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamAnswerQueryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Answer.
     * </pre>
     */
    public void getAnswer(
        com.google.cloud.discoveryengine.v1.GetAnswerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Answer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnswerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to create already
     * exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    public void createSession(
        com.google.cloud.discoveryengine.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to delete does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public void deleteSession(
        com.google.cloud.discoveryengine.v1.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSessionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a Session.
     * [Session][google.cloud.discoveryengine.v1.Session] action type cannot be
     * changed. If the [Session][google.cloud.discoveryengine.v1.Session] to
     * update does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public void updateSession(
        com.google.cloud.discoveryengine.v1.UpdateSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSessionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a Session.
     * </pre>
     */
    public void getSession(
        com.google.cloud.discoveryengine.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all Sessions by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    public void listSessions(
        com.google.cloud.discoveryengine.v1.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.ListSessionsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConversationalSearchService.
   *
   * <pre>
   * Service for conversational search.
   * </pre>
   */
  public static final class ConversationalSearchServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConversationalSearchServiceBlockingStub> {
    private ConversationalSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationalSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationalSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Converses a conversation.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.ConverseConversationResponse converseConversation(
        com.google.cloud.discoveryengine.v1.ConverseConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConverseConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * create already exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.Conversation createConversation(
        com.google.cloud.discoveryengine.v1.CreateConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * delete does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.protobuf.Empty deleteConversation(
        com.google.cloud.discoveryengine.v1.DeleteConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a Conversation.
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] action type
     * cannot be changed. If the
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] to update does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.Conversation updateConversation(
        com.google.cloud.discoveryengine.v1.UpdateConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Conversation.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.Conversation getConversation(
        com.google.cloud.discoveryengine.v1.GetConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all Conversations by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.ListConversationsResponse listConversations(
        com.google.cloud.discoveryengine.v1.ListConversationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConversationsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Answer query method.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.AnswerQueryResponse answerQuery(
        com.google.cloud.discoveryengine.v1.AnswerQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnswerQueryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Answer query method (streaming).
     * It takes one
     * [AnswerQueryRequest][google.cloud.discoveryengine.v1.AnswerQueryRequest]
     * and returns multiple
     * [AnswerQueryResponse][google.cloud.discoveryengine.v1.AnswerQueryResponse]
     * messages in a stream.
     * </pre>
     */
    public java.util.Iterator<com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
        streamAnswerQuery(com.google.cloud.discoveryengine.v1.AnswerQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamAnswerQueryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Answer.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.Answer getAnswer(
        com.google.cloud.discoveryengine.v1.GetAnswerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnswerMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to create already
     * exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.Session createSession(
        com.google.cloud.discoveryengine.v1.CreateSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to delete does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSession(
        com.google.cloud.discoveryengine.v1.DeleteSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSessionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a Session.
     * [Session][google.cloud.discoveryengine.v1.Session] action type cannot be
     * changed. If the [Session][google.cloud.discoveryengine.v1.Session] to
     * update does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.Session updateSession(
        com.google.cloud.discoveryengine.v1.UpdateSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSessionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Session.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.Session getSession(
        com.google.cloud.discoveryengine.v1.GetSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all Sessions by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1.ListSessionsResponse listSessions(
        com.google.cloud.discoveryengine.v1.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service
   * ConversationalSearchService.
   *
   * <pre>
   * Service for conversational search.
   * </pre>
   */
  public static final class ConversationalSearchServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConversationalSearchServiceFutureStub> {
    private ConversationalSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationalSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationalSearchServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Converses a conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.ConverseConversationResponse>
        converseConversation(
            com.google.cloud.discoveryengine.v1.ConverseConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConverseConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * create already exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.Conversation>
        createConversation(com.google.cloud.discoveryengine.v1.CreateConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Conversation.
     * If the [Conversation][google.cloud.discoveryengine.v1.Conversation] to
     * delete does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteConversation(com.google.cloud.discoveryengine.v1.DeleteConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a Conversation.
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] action type
     * cannot be changed. If the
     * [Conversation][google.cloud.discoveryengine.v1.Conversation] to update does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.Conversation>
        updateConversation(com.google.cloud.discoveryengine.v1.UpdateConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.Conversation>
        getConversation(com.google.cloud.discoveryengine.v1.GetConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all Conversations by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.ListConversationsResponse>
        listConversations(com.google.cloud.discoveryengine.v1.ListConversationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Answer query method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.AnswerQueryResponse>
        answerQuery(com.google.cloud.discoveryengine.v1.AnswerQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnswerQueryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Answer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.Answer>
        getAnswer(com.google.cloud.discoveryengine.v1.GetAnswerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnswerMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to create already
     * exists, an ALREADY_EXISTS error is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.Session>
        createSession(com.google.cloud.discoveryengine.v1.CreateSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Session.
     * If the [Session][google.cloud.discoveryengine.v1.Session] to delete does
     * not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteSession(com.google.cloud.discoveryengine.v1.DeleteSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSessionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a Session.
     * [Session][google.cloud.discoveryengine.v1.Session] action type cannot be
     * changed. If the [Session][google.cloud.discoveryengine.v1.Session] to
     * update does not exist, a NOT_FOUND error is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.Session>
        updateSession(com.google.cloud.discoveryengine.v1.UpdateSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSessionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a Session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.Session>
        getSession(com.google.cloud.discoveryengine.v1.GetSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all Sessions by their parent
     * [DataStore][google.cloud.discoveryengine.v1.DataStore].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1.ListSessionsResponse>
        listSessions(com.google.cloud.discoveryengine.v1.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERSE_CONVERSATION = 0;
  private static final int METHODID_CREATE_CONVERSATION = 1;
  private static final int METHODID_DELETE_CONVERSATION = 2;
  private static final int METHODID_UPDATE_CONVERSATION = 3;
  private static final int METHODID_GET_CONVERSATION = 4;
  private static final int METHODID_LIST_CONVERSATIONS = 5;
  private static final int METHODID_ANSWER_QUERY = 6;
  private static final int METHODID_STREAM_ANSWER_QUERY = 7;
  private static final int METHODID_GET_ANSWER = 8;
  private static final int METHODID_CREATE_SESSION = 9;
  private static final int METHODID_DELETE_SESSION = 10;
  private static final int METHODID_UPDATE_SESSION = 11;
  private static final int METHODID_GET_SESSION = 12;
  private static final int METHODID_LIST_SESSIONS = 13;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERSE_CONVERSATION:
          serviceImpl.converseConversation(
              (com.google.cloud.discoveryengine.v1.ConverseConversationRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.discoveryengine.v1.ConverseConversationResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_CONVERSATION:
          serviceImpl.createConversation(
              (com.google.cloud.discoveryengine.v1.CreateConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>)
                  responseObserver);
          break;
        case METHODID_DELETE_CONVERSATION:
          serviceImpl.deleteConversation(
              (com.google.cloud.discoveryengine.v1.DeleteConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_CONVERSATION:
          serviceImpl.updateConversation(
              (com.google.cloud.discoveryengine.v1.UpdateConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>)
                  responseObserver);
          break;
        case METHODID_GET_CONVERSATION:
          serviceImpl.getConversation(
              (com.google.cloud.discoveryengine.v1.GetConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Conversation>)
                  responseObserver);
          break;
        case METHODID_LIST_CONVERSATIONS:
          serviceImpl.listConversations(
              (com.google.cloud.discoveryengine.v1.ListConversationsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.discoveryengine.v1.ListConversationsResponse>)
                  responseObserver);
          break;
        case METHODID_ANSWER_QUERY:
          serviceImpl.answerQuery(
              (com.google.cloud.discoveryengine.v1.AnswerQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.AnswerQueryResponse>)
                  responseObserver);
          break;
        case METHODID_STREAM_ANSWER_QUERY:
          serviceImpl.streamAnswerQuery(
              (com.google.cloud.discoveryengine.v1.AnswerQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.AnswerQueryResponse>)
                  responseObserver);
          break;
        case METHODID_GET_ANSWER:
          serviceImpl.getAnswer(
              (com.google.cloud.discoveryengine.v1.GetAnswerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Answer>)
                  responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession(
              (com.google.cloud.discoveryengine.v1.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session>)
                  responseObserver);
          break;
        case METHODID_DELETE_SESSION:
          serviceImpl.deleteSession(
              (com.google.cloud.discoveryengine.v1.DeleteSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION:
          serviceImpl.updateSession(
              (com.google.cloud.discoveryengine.v1.UpdateSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session>)
                  responseObserver);
          break;
        case METHODID_GET_SESSION:
          serviceImpl.getSession(
              (com.google.cloud.discoveryengine.v1.GetSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1.Session>)
                  responseObserver);
          break;
        case METHODID_LIST_SESSIONS:
          serviceImpl.listSessions(
              (com.google.cloud.discoveryengine.v1.ListSessionsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.discoveryengine.v1.ListSessionsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getConverseConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.ConverseConversationRequest,
                    com.google.cloud.discoveryengine.v1.ConverseConversationResponse>(
                    service, METHODID_CONVERSE_CONVERSATION)))
        .addMethod(
            getCreateConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.CreateConversationRequest,
                    com.google.cloud.discoveryengine.v1.Conversation>(
                    service, METHODID_CREATE_CONVERSATION)))
        .addMethod(
            getDeleteConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.DeleteConversationRequest,
                    com.google.protobuf.Empty>(service, METHODID_DELETE_CONVERSATION)))
        .addMethod(
            getUpdateConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.UpdateConversationRequest,
                    com.google.cloud.discoveryengine.v1.Conversation>(
                    service, METHODID_UPDATE_CONVERSATION)))
        .addMethod(
            getGetConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.GetConversationRequest,
                    com.google.cloud.discoveryengine.v1.Conversation>(
                    service, METHODID_GET_CONVERSATION)))
        .addMethod(
            getListConversationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.ListConversationsRequest,
                    com.google.cloud.discoveryengine.v1.ListConversationsResponse>(
                    service, METHODID_LIST_CONVERSATIONS)))
        .addMethod(
            getAnswerQueryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
                    com.google.cloud.discoveryengine.v1.AnswerQueryResponse>(
                    service, METHODID_ANSWER_QUERY)))
        .addMethod(
            getStreamAnswerQueryMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.AnswerQueryRequest,
                    com.google.cloud.discoveryengine.v1.AnswerQueryResponse>(
                    service, METHODID_STREAM_ANSWER_QUERY)))
        .addMethod(
            getGetAnswerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.GetAnswerRequest,
                    com.google.cloud.discoveryengine.v1.Answer>(service, METHODID_GET_ANSWER)))
        .addMethod(
            getCreateSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.CreateSessionRequest,
                    com.google.cloud.discoveryengine.v1.Session>(service, METHODID_CREATE_SESSION)))
        .addMethod(
            getDeleteSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.DeleteSessionRequest,
                    com.google.protobuf.Empty>(service, METHODID_DELETE_SESSION)))
        .addMethod(
            getUpdateSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.UpdateSessionRequest,
                    com.google.cloud.discoveryengine.v1.Session>(service, METHODID_UPDATE_SESSION)))
        .addMethod(
            getGetSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.GetSessionRequest,
                    com.google.cloud.discoveryengine.v1.Session>(service, METHODID_GET_SESSION)))
        .addMethod(
            getListSessionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1.ListSessionsRequest,
                    com.google.cloud.discoveryengine.v1.ListSessionsResponse>(
                    service, METHODID_LIST_SESSIONS)))
        .build();
  }

  private abstract static class ConversationalSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversationalSearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.discoveryengine.v1.ConversationalSearchServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversationalSearchService");
    }
  }

  private static final class ConversationalSearchServiceFileDescriptorSupplier
      extends ConversationalSearchServiceBaseDescriptorSupplier {
    ConversationalSearchServiceFileDescriptorSupplier() {}
  }

  private static final class ConversationalSearchServiceMethodDescriptorSupplier
      extends ConversationalSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConversationalSearchServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConversationalSearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new ConversationalSearchServiceFileDescriptorSupplier())
                      .addMethod(getConverseConversationMethod())
                      .addMethod(getCreateConversationMethod())
                      .addMethod(getDeleteConversationMethod())
                      .addMethod(getUpdateConversationMethod())
                      .addMethod(getGetConversationMethod())
                      .addMethod(getListConversationsMethod())
                      .addMethod(getAnswerQueryMethod())
                      .addMethod(getStreamAnswerQueryMethod())
                      .addMethod(getGetAnswerMethod())
                      .addMethod(getCreateSessionMethod())
                      .addMethod(getDeleteSessionMethod())
                      .addMethod(getUpdateSessionMethod())
                      .addMethod(getGetSessionMethod())
                      .addMethod(getListSessionsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
