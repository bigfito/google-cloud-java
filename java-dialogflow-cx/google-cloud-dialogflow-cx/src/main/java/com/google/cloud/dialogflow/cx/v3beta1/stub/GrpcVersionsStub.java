/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.cx.v3beta1.stub;

import static com.google.cloud.dialogflow.cx.v3beta1.VersionsClient.ListLocationsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3beta1.VersionsClient.ListVersionsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsResponse;
import com.google.cloud.dialogflow.cx.v3beta1.CreateVersionOperationMetadata;
import com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DeleteVersionRequest;
import com.google.cloud.dialogflow.cx.v3beta1.GetVersionRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListVersionsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListVersionsResponse;
import com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest;
import com.google.cloud.dialogflow.cx.v3beta1.UpdateVersionRequest;
import com.google.cloud.dialogflow.cx.v3beta1.Version;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the Versions service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcVersionsStub extends VersionsStub {
  private static final MethodDescriptor<ListVersionsRequest, ListVersionsResponse>
      listVersionsMethodDescriptor =
          MethodDescriptor.<ListVersionsRequest, ListVersionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Versions/ListVersions")
              .setRequestMarshaller(ProtoUtils.marshaller(ListVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListVersionsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetVersionRequest, Version> getVersionMethodDescriptor =
      MethodDescriptor.<GetVersionRequest, Version>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Versions/GetVersion")
          .setRequestMarshaller(ProtoUtils.marshaller(GetVersionRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Version.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateVersionRequest, Operation>
      createVersionMethodDescriptor =
          MethodDescriptor.<CreateVersionRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Versions/CreateVersion")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateVersionRequest, Version>
      updateVersionMethodDescriptor =
          MethodDescriptor.<UpdateVersionRequest, Version>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Versions/UpdateVersion")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Version.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteVersionRequest, Empty> deleteVersionMethodDescriptor =
      MethodDescriptor.<DeleteVersionRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Versions/DeleteVersion")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteVersionRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<LoadVersionRequest, Operation> loadVersionMethodDescriptor =
      MethodDescriptor.<LoadVersionRequest, Operation>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Versions/LoadVersion")
          .setRequestMarshaller(ProtoUtils.marshaller(LoadVersionRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CompareVersionsRequest, CompareVersionsResponse>
      compareVersionsMethodDescriptor =
          MethodDescriptor.<CompareVersionsRequest, CompareVersionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Versions/CompareVersions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CompareVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CompareVersionsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          MethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLocationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetLocationRequest, Location> getLocationMethodDescriptor =
      MethodDescriptor.<GetLocationRequest, Location>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.location.Locations/GetLocation")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLocationRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Location.getDefaultInstance()))
          .build();

  private final UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable;
  private final UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse>
      listVersionsPagedCallable;
  private final UnaryCallable<GetVersionRequest, Version> getVersionCallable;
  private final UnaryCallable<CreateVersionRequest, Operation> createVersionCallable;
  private final OperationCallable<CreateVersionRequest, Version, CreateVersionOperationMetadata>
      createVersionOperationCallable;
  private final UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable;
  private final UnaryCallable<DeleteVersionRequest, Empty> deleteVersionCallable;
  private final UnaryCallable<LoadVersionRequest, Operation> loadVersionCallable;
  private final OperationCallable<LoadVersionRequest, Empty, Struct> loadVersionOperationCallable;
  private final UnaryCallable<CompareVersionsRequest, CompareVersionsResponse>
      compareVersionsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcVersionsStub create(VersionsStubSettings settings) throws IOException {
    return new GrpcVersionsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcVersionsStub create(ClientContext clientContext) throws IOException {
    return new GrpcVersionsStub(VersionsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcVersionsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcVersionsStub(
        VersionsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcVersionsStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcVersionsStub(VersionsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcVersionsCallableFactory());
  }

  /**
   * Constructs an instance of GrpcVersionsStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcVersionsStub(
      VersionsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListVersionsRequest, ListVersionsResponse> listVersionsTransportSettings =
        GrpcCallSettings.<ListVersionsRequest, ListVersionsResponse>newBuilder()
            .setMethodDescriptor(listVersionsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetVersionRequest, Version> getVersionTransportSettings =
        GrpcCallSettings.<GetVersionRequest, Version>newBuilder()
            .setMethodDescriptor(getVersionMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CreateVersionRequest, Operation> createVersionTransportSettings =
        GrpcCallSettings.<CreateVersionRequest, Operation>newBuilder()
            .setMethodDescriptor(createVersionMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<UpdateVersionRequest, Version> updateVersionTransportSettings =
        GrpcCallSettings.<UpdateVersionRequest, Version>newBuilder()
            .setMethodDescriptor(updateVersionMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("version.name", String.valueOf(request.getVersion().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteVersionRequest, Empty> deleteVersionTransportSettings =
        GrpcCallSettings.<DeleteVersionRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteVersionMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<LoadVersionRequest, Operation> loadVersionTransportSettings =
        GrpcCallSettings.<LoadVersionRequest, Operation>newBuilder()
            .setMethodDescriptor(loadVersionMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CompareVersionsRequest, CompareVersionsResponse>
        compareVersionsTransportSettings =
            GrpcCallSettings.<CompareVersionsRequest, CompareVersionsResponse>newBuilder()
                .setMethodDescriptor(compareVersionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("base_version", String.valueOf(request.getBaseVersion()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListLocationsRequest, ListLocationsResponse> listLocationsTransportSettings =
        GrpcCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
            .setMethodDescriptor(listLocationsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        GrpcCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.listVersionsCallable =
        callableFactory.createUnaryCallable(
            listVersionsTransportSettings, settings.listVersionsSettings(), clientContext);
    this.listVersionsPagedCallable =
        callableFactory.createPagedCallable(
            listVersionsTransportSettings, settings.listVersionsSettings(), clientContext);
    this.getVersionCallable =
        callableFactory.createUnaryCallable(
            getVersionTransportSettings, settings.getVersionSettings(), clientContext);
    this.createVersionCallable =
        callableFactory.createUnaryCallable(
            createVersionTransportSettings, settings.createVersionSettings(), clientContext);
    this.createVersionOperationCallable =
        callableFactory.createOperationCallable(
            createVersionTransportSettings,
            settings.createVersionOperationSettings(),
            clientContext,
            operationsStub);
    this.updateVersionCallable =
        callableFactory.createUnaryCallable(
            updateVersionTransportSettings, settings.updateVersionSettings(), clientContext);
    this.deleteVersionCallable =
        callableFactory.createUnaryCallable(
            deleteVersionTransportSettings, settings.deleteVersionSettings(), clientContext);
    this.loadVersionCallable =
        callableFactory.createUnaryCallable(
            loadVersionTransportSettings, settings.loadVersionSettings(), clientContext);
    this.loadVersionOperationCallable =
        callableFactory.createOperationCallable(
            loadVersionTransportSettings,
            settings.loadVersionOperationSettings(),
            clientContext,
            operationsStub);
    this.compareVersionsCallable =
        callableFactory.createUnaryCallable(
            compareVersionsTransportSettings, settings.compareVersionsSettings(), clientContext);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable() {
    return listVersionsCallable;
  }

  @Override
  public UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse> listVersionsPagedCallable() {
    return listVersionsPagedCallable;
  }

  @Override
  public UnaryCallable<GetVersionRequest, Version> getVersionCallable() {
    return getVersionCallable;
  }

  @Override
  public UnaryCallable<CreateVersionRequest, Operation> createVersionCallable() {
    return createVersionCallable;
  }

  @Override
  public OperationCallable<CreateVersionRequest, Version, CreateVersionOperationMetadata>
      createVersionOperationCallable() {
    return createVersionOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable() {
    return updateVersionCallable;
  }

  @Override
  public UnaryCallable<DeleteVersionRequest, Empty> deleteVersionCallable() {
    return deleteVersionCallable;
  }

  @Override
  public UnaryCallable<LoadVersionRequest, Operation> loadVersionCallable() {
    return loadVersionCallable;
  }

  @Override
  public OperationCallable<LoadVersionRequest, Empty, Struct> loadVersionOperationCallable() {
    return loadVersionOperationCallable;
  }

  @Override
  public UnaryCallable<CompareVersionsRequest, CompareVersionsResponse> compareVersionsCallable() {
    return compareVersionsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
