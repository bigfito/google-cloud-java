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

package com.google.cloud.automl.v1beta1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class PredictionServiceClientTest {
  private static MockPredictionService mockPredictionService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private PredictionServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockPredictionService = new MockPredictionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockPredictionService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    PredictionServiceSettings settings =
        PredictionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = PredictionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void predictTest() throws Exception {
    PredictResponse expectedResponse =
        PredictResponse.newBuilder()
            .addAllPayload(new ArrayList<AnnotationPayload>())
            .setPreprocessedInput(ExamplePayload.newBuilder().build())
            .putAllMetadata(new HashMap<String, String>())
            .build();
    mockPredictionService.addResponse(expectedResponse);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
    ExamplePayload payload = ExamplePayload.newBuilder().build();
    Map<String, String> params = new HashMap<>();

    PredictResponse actualResponse = client.predict(name, payload, params);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PredictRequest actualRequest = ((PredictRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(payload, actualRequest.getPayload());
    Assert.assertEquals(params, actualRequest.getParamsMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void predictExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      ExamplePayload payload = ExamplePayload.newBuilder().build();
      Map<String, String> params = new HashMap<>();
      client.predict(name, payload, params);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void predictTest2() throws Exception {
    PredictResponse expectedResponse =
        PredictResponse.newBuilder()
            .addAllPayload(new ArrayList<AnnotationPayload>())
            .setPreprocessedInput(ExamplePayload.newBuilder().build())
            .putAllMetadata(new HashMap<String, String>())
            .build();
    mockPredictionService.addResponse(expectedResponse);

    String name = "name3373707";
    ExamplePayload payload = ExamplePayload.newBuilder().build();
    Map<String, String> params = new HashMap<>();

    PredictResponse actualResponse = client.predict(name, payload, params);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PredictRequest actualRequest = ((PredictRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(payload, actualRequest.getPayload());
    Assert.assertEquals(params, actualRequest.getParamsMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void predictExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      String name = "name3373707";
      ExamplePayload payload = ExamplePayload.newBuilder().build();
      Map<String, String> params = new HashMap<>();
      client.predict(name, payload, params);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchPredictTest() throws Exception {
    BatchPredictResult expectedResponse =
        BatchPredictResult.newBuilder().putAllMetadata(new HashMap<String, String>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchPredictTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockPredictionService.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
    BatchPredictInputConfig inputConfig = BatchPredictInputConfig.newBuilder().build();
    BatchPredictOutputConfig outputConfig = BatchPredictOutputConfig.newBuilder().build();
    Map<String, String> params = new HashMap<>();

    BatchPredictResult actualResponse =
        client.batchPredictAsync(name, inputConfig, outputConfig, params).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchPredictRequest actualRequest = ((BatchPredictRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(inputConfig, actualRequest.getInputConfig());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertEquals(params, actualRequest.getParamsMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchPredictExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      BatchPredictInputConfig inputConfig = BatchPredictInputConfig.newBuilder().build();
      BatchPredictOutputConfig outputConfig = BatchPredictOutputConfig.newBuilder().build();
      Map<String, String> params = new HashMap<>();
      client.batchPredictAsync(name, inputConfig, outputConfig, params).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchPredictTest2() throws Exception {
    BatchPredictResult expectedResponse =
        BatchPredictResult.newBuilder().putAllMetadata(new HashMap<String, String>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchPredictTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockPredictionService.addResponse(resultOperation);

    String name = "name3373707";
    BatchPredictInputConfig inputConfig = BatchPredictInputConfig.newBuilder().build();
    BatchPredictOutputConfig outputConfig = BatchPredictOutputConfig.newBuilder().build();
    Map<String, String> params = new HashMap<>();

    BatchPredictResult actualResponse =
        client.batchPredictAsync(name, inputConfig, outputConfig, params).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchPredictRequest actualRequest = ((BatchPredictRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(inputConfig, actualRequest.getInputConfig());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertEquals(params, actualRequest.getParamsMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchPredictExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      String name = "name3373707";
      BatchPredictInputConfig inputConfig = BatchPredictInputConfig.newBuilder().build();
      BatchPredictOutputConfig outputConfig = BatchPredictOutputConfig.newBuilder().build();
      Map<String, String> params = new HashMap<>();
      client.batchPredictAsync(name, inputConfig, outputConfig, params).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
