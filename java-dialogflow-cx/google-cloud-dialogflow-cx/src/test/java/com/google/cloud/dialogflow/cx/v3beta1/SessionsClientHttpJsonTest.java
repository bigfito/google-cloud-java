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

package com.google.cloud.dialogflow.cx.v3beta1;

import static com.google.cloud.dialogflow.cx.v3beta1.SessionsClient.ListLocationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.dialogflow.cx.v3beta1.stub.HttpJsonSessionsStub;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class SessionsClientHttpJsonTest {
  private static MockHttpService mockService;
  private static SessionsClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonSessionsStub.getMethodDescriptors(), SessionsSettings.getDefaultEndpoint());
    SessionsSettings settings =
        SessionsSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                SessionsSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SessionsClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void detectIntentTest() throws Exception {
    DetectIntentResponse expectedResponse =
        DetectIntentResponse.newBuilder()
            .setResponseId("responseId-633138884")
            .setQueryResult(QueryResult.newBuilder().build())
            .setOutputAudio(ByteString.EMPTY)
            .setOutputAudioConfig(OutputAudioConfig.newBuilder().build())
            .setAllowCancellation(true)
            .build();
    mockService.addResponse(expectedResponse);

    DetectIntentRequest request =
        DetectIntentRequest.newBuilder()
            .setSession(
                SessionName.ofProjectLocationAgentSessionName(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                    .toString())
            .setQueryParams(QueryParameters.newBuilder().build())
            .setQueryInput(QueryInput.newBuilder().build())
            .setOutputAudioConfig(OutputAudioConfig.newBuilder().build())
            .build();

    DetectIntentResponse actualResponse = client.detectIntent(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void detectIntentExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DetectIntentRequest request =
          DetectIntentRequest.newBuilder()
              .setSession(
                  SessionName.ofProjectLocationAgentSessionName(
                          "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                      .toString())
              .setQueryParams(QueryParameters.newBuilder().build())
              .setQueryInput(QueryInput.newBuilder().build())
              .setOutputAudioConfig(OutputAudioConfig.newBuilder().build())
              .build();
      client.detectIntent(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void serverStreamingDetectIntentTest() throws Exception {}

  @Test
  public void serverStreamingDetectIntentExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);
  }

  @Test
  public void streamingDetectIntentUnsupportedMethodTest() throws Exception {
    // The streamingDetectIntent() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }

  @Test
  public void matchIntentTest() throws Exception {
    MatchIntentResponse expectedResponse =
        MatchIntentResponse.newBuilder()
            .addAllMatches(new ArrayList<Match>())
            .setCurrentPage(Page.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    MatchIntentRequest request =
        MatchIntentRequest.newBuilder()
            .setSession(
                SessionName.ofProjectLocationAgentSessionName(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                    .toString())
            .setQueryParams(QueryParameters.newBuilder().build())
            .setQueryInput(QueryInput.newBuilder().build())
            .setPersistParameterChanges(true)
            .build();

    MatchIntentResponse actualResponse = client.matchIntent(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void matchIntentExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      MatchIntentRequest request =
          MatchIntentRequest.newBuilder()
              .setSession(
                  SessionName.ofProjectLocationAgentSessionName(
                          "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                      .toString())
              .setQueryParams(QueryParameters.newBuilder().build())
              .setQueryInput(QueryInput.newBuilder().build())
              .setPersistParameterChanges(true)
              .build();
      client.matchIntent(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void fulfillIntentTest() throws Exception {
    FulfillIntentResponse expectedResponse =
        FulfillIntentResponse.newBuilder()
            .setResponseId("responseId-633138884")
            .setQueryResult(QueryResult.newBuilder().build())
            .setOutputAudio(ByteString.EMPTY)
            .setOutputAudioConfig(OutputAudioConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    FulfillIntentRequest request =
        FulfillIntentRequest.newBuilder()
            .setMatchIntentRequest(
                MatchIntentRequest.newBuilder()
                    .setSession(
                        SessionName.ofProjectLocationAgentSessionName(
                                "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                            .toString())
                    .setQueryParams(QueryParameters.newBuilder().build())
                    .setQueryInput(QueryInput.newBuilder().build())
                    .setPersistParameterChanges(true)
                    .build())
            .setMatch(Match.newBuilder().build())
            .setOutputAudioConfig(OutputAudioConfig.newBuilder().build())
            .build();

    FulfillIntentResponse actualResponse = client.fulfillIntent(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void fulfillIntentExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FulfillIntentRequest request =
          FulfillIntentRequest.newBuilder()
              .setMatchIntentRequest(
                  MatchIntentRequest.newBuilder()
                      .setSession(
                          SessionName.ofProjectLocationAgentSessionName(
                                  "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                              .toString())
                      .setQueryParams(QueryParameters.newBuilder().build())
                      .setQueryInput(QueryInput.newBuilder().build())
                      .setPersistParameterChanges(true)
                      .build())
              .setMatch(Match.newBuilder().build())
              .setOutputAudioConfig(OutputAudioConfig.newBuilder().build())
              .build();
      client.fulfillIntent(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void submitAnswerFeedbackTest() throws Exception {
    AnswerFeedback expectedResponse =
        AnswerFeedback.newBuilder()
            .setRatingReason(AnswerFeedback.RatingReason.newBuilder().build())
            .setCustomRating("customRating341643374")
            .build();
    mockService.addResponse(expectedResponse);

    SubmitAnswerFeedbackRequest request =
        SubmitAnswerFeedbackRequest.newBuilder()
            .setSession(
                SessionName.ofProjectLocationAgentSessionName(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                    .toString())
            .setResponseId("responseId-633138884")
            .setAnswerFeedback(AnswerFeedback.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    AnswerFeedback actualResponse = client.submitAnswerFeedback(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void submitAnswerFeedbackExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SubmitAnswerFeedbackRequest request =
          SubmitAnswerFeedbackRequest.newBuilder()
              .setSession(
                  SessionName.ofProjectLocationAgentSessionName(
                          "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
                      .toString())
              .setResponseId("responseId-633138884")
              .setAnswerFeedback(AnswerFeedback.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.submitAnswerFeedback(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listLocationsTest() throws Exception {
    Location responsesElement = Location.newBuilder().build();
    ListLocationsResponse expectedResponse =
        ListLocationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLocations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("projects/project-3664")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listLocationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("projects/project-3664")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLocationTest() throws Exception {
    Location expectedResponse =
        Location.newBuilder()
            .setName("name3373707")
            .setLocationId("locationId1541836720")
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setMetadata(Any.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    GetLocationRequest request =
        GetLocationRequest.newBuilder()
            .setName("projects/project-9062/locations/location-9062")
            .build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getLocationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetLocationRequest request =
          GetLocationRequest.newBuilder()
              .setName("projects/project-9062/locations/location-9062")
              .build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
