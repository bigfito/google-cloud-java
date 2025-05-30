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

package com.google.cloud.dataproc.v1;

import static com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient.ListWorkflowTemplatesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.iam.v1.AuditConfig;
import com.google.iam.v1.Binding;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.GetPolicyOptions;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
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
public class WorkflowTemplateServiceClientTest {
  private static MockIAMPolicy mockIAMPolicy;
  private static MockServiceHelper mockServiceHelper;
  private static MockWorkflowTemplateService mockWorkflowTemplateService;
  private LocalChannelProvider channelProvider;
  private WorkflowTemplateServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockWorkflowTemplateService = new MockWorkflowTemplateService();
    mockIAMPolicy = new MockIAMPolicy();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockWorkflowTemplateService, mockIAMPolicy));
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
    WorkflowTemplateServiceSettings settings =
        WorkflowTemplateServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = WorkflowTemplateServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createWorkflowTemplateTest() throws Exception {
    WorkflowTemplate expectedResponse =
        WorkflowTemplate.newBuilder()
            .setId("id3355")
            .setName(
                WorkflowTemplateName.ofProjectRegionWorkflowTemplateName(
                        "[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]")
                    .toString())
            .setVersion(351608024)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setPlacement(WorkflowTemplatePlacement.newBuilder().build())
            .addAllJobs(new ArrayList<OrderedJob>())
            .addAllParameters(new ArrayList<TemplateParameter>())
            .setDagTimeout(Duration.newBuilder().build())
            .setEncryptionConfig(WorkflowTemplate.EncryptionConfig.newBuilder().build())
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();

    WorkflowTemplate actualResponse = client.createWorkflowTemplate(parent, template);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateWorkflowTemplateRequest actualRequest =
        ((CreateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(template, actualRequest.getTemplate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createWorkflowTemplateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
      client.createWorkflowTemplate(parent, template);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createWorkflowTemplateTest2() throws Exception {
    WorkflowTemplate expectedResponse =
        WorkflowTemplate.newBuilder()
            .setId("id3355")
            .setName(
                WorkflowTemplateName.ofProjectRegionWorkflowTemplateName(
                        "[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]")
                    .toString())
            .setVersion(351608024)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setPlacement(WorkflowTemplatePlacement.newBuilder().build())
            .addAllJobs(new ArrayList<OrderedJob>())
            .addAllParameters(new ArrayList<TemplateParameter>())
            .setDagTimeout(Duration.newBuilder().build())
            .setEncryptionConfig(WorkflowTemplate.EncryptionConfig.newBuilder().build())
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();

    WorkflowTemplate actualResponse = client.createWorkflowTemplate(parent, template);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateWorkflowTemplateRequest actualRequest =
        ((CreateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(template, actualRequest.getTemplate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createWorkflowTemplateExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
      WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
      client.createWorkflowTemplate(parent, template);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createWorkflowTemplateTest3() throws Exception {
    WorkflowTemplate expectedResponse =
        WorkflowTemplate.newBuilder()
            .setId("id3355")
            .setName(
                WorkflowTemplateName.ofProjectRegionWorkflowTemplateName(
                        "[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]")
                    .toString())
            .setVersion(351608024)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setPlacement(WorkflowTemplatePlacement.newBuilder().build())
            .addAllJobs(new ArrayList<OrderedJob>())
            .addAllParameters(new ArrayList<TemplateParameter>())
            .setDagTimeout(Duration.newBuilder().build())
            .setEncryptionConfig(WorkflowTemplate.EncryptionConfig.newBuilder().build())
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();

    WorkflowTemplate actualResponse = client.createWorkflowTemplate(parent, template);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateWorkflowTemplateRequest actualRequest =
        ((CreateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(template, actualRequest.getTemplate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createWorkflowTemplateExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      String parent = "parent-995424086";
      WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
      client.createWorkflowTemplate(parent, template);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getWorkflowTemplateTest() throws Exception {
    WorkflowTemplate expectedResponse =
        WorkflowTemplate.newBuilder()
            .setId("id3355")
            .setName(
                WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
                        "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
                    .toString())
            .setVersion(351608024)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setPlacement(WorkflowTemplatePlacement.newBuilder().build())
            .addAllJobs(new ArrayList<OrderedJob>())
            .addAllParameters(new ArrayList<TemplateParameter>())
            .setDagTimeout(Duration.newBuilder().build())
            .setEncryptionConfig(WorkflowTemplate.EncryptionConfig.newBuilder().build())
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    WorkflowTemplateName name =
        WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
            "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");

    WorkflowTemplate actualResponse = client.getWorkflowTemplate(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetWorkflowTemplateRequest actualRequest = ((GetWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getWorkflowTemplateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      WorkflowTemplateName name =
          WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
              "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
      client.getWorkflowTemplate(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getWorkflowTemplateTest2() throws Exception {
    WorkflowTemplate expectedResponse =
        WorkflowTemplate.newBuilder()
            .setId("id3355")
            .setName(
                WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
                        "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
                    .toString())
            .setVersion(351608024)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setPlacement(WorkflowTemplatePlacement.newBuilder().build())
            .addAllJobs(new ArrayList<OrderedJob>())
            .addAllParameters(new ArrayList<TemplateParameter>())
            .setDagTimeout(Duration.newBuilder().build())
            .setEncryptionConfig(WorkflowTemplate.EncryptionConfig.newBuilder().build())
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    String name = "name3373707";

    WorkflowTemplate actualResponse = client.getWorkflowTemplate(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetWorkflowTemplateRequest actualRequest = ((GetWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getWorkflowTemplateExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      String name = "name3373707";
      client.getWorkflowTemplate(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void instantiateWorkflowTemplateTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("instantiateWorkflowTemplateTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockWorkflowTemplateService.addResponse(resultOperation);

    WorkflowTemplateName name =
        WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
            "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");

    client.instantiateWorkflowTemplateAsync(name).get();

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstantiateWorkflowTemplateRequest actualRequest =
        ((InstantiateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void instantiateWorkflowTemplateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      WorkflowTemplateName name =
          WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
              "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
      client.instantiateWorkflowTemplateAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void instantiateWorkflowTemplateTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("instantiateWorkflowTemplateTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockWorkflowTemplateService.addResponse(resultOperation);

    String name = "name3373707";

    client.instantiateWorkflowTemplateAsync(name).get();

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstantiateWorkflowTemplateRequest actualRequest =
        ((InstantiateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void instantiateWorkflowTemplateExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      String name = "name3373707";
      client.instantiateWorkflowTemplateAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void instantiateWorkflowTemplateTest3() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("instantiateWorkflowTemplateTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockWorkflowTemplateService.addResponse(resultOperation);

    WorkflowTemplateName name =
        WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
            "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
    Map<String, String> parameters = new HashMap<>();

    client.instantiateWorkflowTemplateAsync(name, parameters).get();

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstantiateWorkflowTemplateRequest actualRequest =
        ((InstantiateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(parameters, actualRequest.getParametersMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void instantiateWorkflowTemplateExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      WorkflowTemplateName name =
          WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
              "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
      Map<String, String> parameters = new HashMap<>();
      client.instantiateWorkflowTemplateAsync(name, parameters).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void instantiateWorkflowTemplateTest4() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("instantiateWorkflowTemplateTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockWorkflowTemplateService.addResponse(resultOperation);

    String name = "name3373707";
    Map<String, String> parameters = new HashMap<>();

    client.instantiateWorkflowTemplateAsync(name, parameters).get();

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstantiateWorkflowTemplateRequest actualRequest =
        ((InstantiateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(parameters, actualRequest.getParametersMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void instantiateWorkflowTemplateExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      String name = "name3373707";
      Map<String, String> parameters = new HashMap<>();
      client.instantiateWorkflowTemplateAsync(name, parameters).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void instantiateInlineWorkflowTemplateTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("instantiateInlineWorkflowTemplateTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockWorkflowTemplateService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();

    client.instantiateInlineWorkflowTemplateAsync(parent, template).get();

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstantiateInlineWorkflowTemplateRequest actualRequest =
        ((InstantiateInlineWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(template, actualRequest.getTemplate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void instantiateInlineWorkflowTemplateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
      client.instantiateInlineWorkflowTemplateAsync(parent, template).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void instantiateInlineWorkflowTemplateTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("instantiateInlineWorkflowTemplateTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockWorkflowTemplateService.addResponse(resultOperation);

    RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();

    client.instantiateInlineWorkflowTemplateAsync(parent, template).get();

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstantiateInlineWorkflowTemplateRequest actualRequest =
        ((InstantiateInlineWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(template, actualRequest.getTemplate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void instantiateInlineWorkflowTemplateExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
      WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
      client.instantiateInlineWorkflowTemplateAsync(parent, template).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void instantiateInlineWorkflowTemplateTest3() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("instantiateInlineWorkflowTemplateTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockWorkflowTemplateService.addResponse(resultOperation);

    String parent = "parent-995424086";
    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();

    client.instantiateInlineWorkflowTemplateAsync(parent, template).get();

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstantiateInlineWorkflowTemplateRequest actualRequest =
        ((InstantiateInlineWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(template, actualRequest.getTemplate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void instantiateInlineWorkflowTemplateExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      String parent = "parent-995424086";
      WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
      client.instantiateInlineWorkflowTemplateAsync(parent, template).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void updateWorkflowTemplateTest() throws Exception {
    WorkflowTemplate expectedResponse =
        WorkflowTemplate.newBuilder()
            .setId("id3355")
            .setName(
                WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
                        "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
                    .toString())
            .setVersion(351608024)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setPlacement(WorkflowTemplatePlacement.newBuilder().build())
            .addAllJobs(new ArrayList<OrderedJob>())
            .addAllParameters(new ArrayList<TemplateParameter>())
            .setDagTimeout(Duration.newBuilder().build())
            .setEncryptionConfig(WorkflowTemplate.EncryptionConfig.newBuilder().build())
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();

    WorkflowTemplate actualResponse = client.updateWorkflowTemplate(template);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateWorkflowTemplateRequest actualRequest =
        ((UpdateWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(template, actualRequest.getTemplate());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateWorkflowTemplateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
      client.updateWorkflowTemplate(template);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listWorkflowTemplatesTest() throws Exception {
    WorkflowTemplate responsesElement = WorkflowTemplate.newBuilder().build();
    ListWorkflowTemplatesResponse expectedResponse =
        ListWorkflowTemplatesResponse.newBuilder()
            .setNextPageToken("")
            .addAllTemplates(Arrays.asList(responsesElement))
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListWorkflowTemplatesPagedResponse pagedListResponse = client.listWorkflowTemplates(parent);

    List<WorkflowTemplate> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTemplatesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListWorkflowTemplatesRequest actualRequest =
        ((ListWorkflowTemplatesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listWorkflowTemplatesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listWorkflowTemplates(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listWorkflowTemplatesTest2() throws Exception {
    WorkflowTemplate responsesElement = WorkflowTemplate.newBuilder().build();
    ListWorkflowTemplatesResponse expectedResponse =
        ListWorkflowTemplatesResponse.newBuilder()
            .setNextPageToken("")
            .addAllTemplates(Arrays.asList(responsesElement))
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    RegionName parent = RegionName.of("[PROJECT]", "[REGION]");

    ListWorkflowTemplatesPagedResponse pagedListResponse = client.listWorkflowTemplates(parent);

    List<WorkflowTemplate> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTemplatesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListWorkflowTemplatesRequest actualRequest =
        ((ListWorkflowTemplatesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listWorkflowTemplatesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
      client.listWorkflowTemplates(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listWorkflowTemplatesTest3() throws Exception {
    WorkflowTemplate responsesElement = WorkflowTemplate.newBuilder().build();
    ListWorkflowTemplatesResponse expectedResponse =
        ListWorkflowTemplatesResponse.newBuilder()
            .setNextPageToken("")
            .addAllTemplates(Arrays.asList(responsesElement))
            .build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListWorkflowTemplatesPagedResponse pagedListResponse = client.listWorkflowTemplates(parent);

    List<WorkflowTemplate> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTemplatesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListWorkflowTemplatesRequest actualRequest =
        ((ListWorkflowTemplatesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listWorkflowTemplatesExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listWorkflowTemplates(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteWorkflowTemplateTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    WorkflowTemplateName name =
        WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
            "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");

    client.deleteWorkflowTemplate(name);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteWorkflowTemplateRequest actualRequest =
        ((DeleteWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteWorkflowTemplateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      WorkflowTemplateName name =
          WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
              "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
      client.deleteWorkflowTemplate(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteWorkflowTemplateTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockWorkflowTemplateService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteWorkflowTemplate(name);

    List<AbstractMessage> actualRequests = mockWorkflowTemplateService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteWorkflowTemplateRequest actualRequest =
        ((DeleteWorkflowTemplateRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteWorkflowTemplateExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockWorkflowTemplateService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteWorkflowTemplate(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockIAMPolicy.addResponse(expectedResponse);

    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder()
            .setResource(
                AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                        "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                    .toString())
            .setPolicy(Policy.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    Policy actualResponse = client.setIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetIamPolicyRequest actualRequest = ((SetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getPolicy(), actualRequest.getPolicy());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void setIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      SetIamPolicyRequest request =
          SetIamPolicyRequest.newBuilder()
              .setResource(
                  AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                          "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                      .toString())
              .setPolicy(Policy.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.setIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockIAMPolicy.addResponse(expectedResponse);

    GetIamPolicyRequest request =
        GetIamPolicyRequest.newBuilder()
            .setResource(
                AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                        "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                    .toString())
            .setOptions(GetPolicyOptions.newBuilder().build())
            .build();

    Policy actualResponse = client.getIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIamPolicyRequest actualRequest = ((GetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getOptions(), actualRequest.getOptions());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      GetIamPolicyRequest request =
          GetIamPolicyRequest.newBuilder()
              .setResource(
                  AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                          "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                      .toString())
              .setOptions(GetPolicyOptions.newBuilder().build())
              .build();
      client.getIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void testIamPermissionsTest() throws Exception {
    TestIamPermissionsResponse expectedResponse =
        TestIamPermissionsResponse.newBuilder().addAllPermissions(new ArrayList<String>()).build();
    mockIAMPolicy.addResponse(expectedResponse);

    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(
                AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                        "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                    .toString())
            .addAllPermissions(new ArrayList<String>())
            .build();

    TestIamPermissionsResponse actualResponse = client.testIamPermissions(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TestIamPermissionsRequest actualRequest = ((TestIamPermissionsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getPermissionsList(), actualRequest.getPermissionsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void testIamPermissionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      TestIamPermissionsRequest request =
          TestIamPermissionsRequest.newBuilder()
              .setResource(
                  AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                          "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                      .toString())
              .addAllPermissions(new ArrayList<String>())
              .build();
      client.testIamPermissions(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
