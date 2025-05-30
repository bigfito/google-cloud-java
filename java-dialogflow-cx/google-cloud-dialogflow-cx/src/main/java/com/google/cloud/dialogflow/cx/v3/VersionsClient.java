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

package com.google.cloud.dialogflow.cx.v3;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3.stub.VersionsStub;
import com.google.cloud.dialogflow.cx.v3.stub.VersionsStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing [Versions][google.cloud.dialogflow.cx.v3.Version].
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (VersionsClient versionsClient = VersionsClient.create()) {
 *   VersionName name =
 *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]");
 *   Version response = versionsClient.getVersion(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the VersionsClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListVersions</td>
 *      <td><p> Returns the list of all versions in the specified [Flow][google.cloud.dialogflow.cx.v3.Flow].</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listVersions(ListVersionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listVersions(FlowName parent)
 *           <li><p> listVersions(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listVersionsPagedCallable()
 *           <li><p> listVersionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetVersion</td>
 *      <td><p> Retrieves the specified [Version][google.cloud.dialogflow.cx.v3.Version].</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getVersion(GetVersionRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getVersion(VersionName name)
 *           <li><p> getVersion(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getVersionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateVersion</td>
 *      <td><p> Creates a [Version][google.cloud.dialogflow.cx.v3.Version] in the specified [Flow][google.cloud.dialogflow.cx.v3.Flow].
 * <p>  This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields:
 * <p>  - `metadata`: [CreateVersionOperationMetadata][google.cloud.dialogflow.cx.v3.CreateVersionOperationMetadata] - `response`: [Version][google.cloud.dialogflow.cx.v3.Version]</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createVersionAsync(CreateVersionRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createVersionAsync(FlowName parent, Version version)
 *           <li><p> createVersionAsync(String parent, Version version)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createVersionOperationCallable()
 *           <li><p> createVersionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateVersion</td>
 *      <td><p> Updates the specified [Version][google.cloud.dialogflow.cx.v3.Version].</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateVersion(UpdateVersionRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateVersion(Version version, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateVersionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteVersion</td>
 *      <td><p> Deletes the specified [Version][google.cloud.dialogflow.cx.v3.Version].</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteVersion(DeleteVersionRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteVersion(VersionName name)
 *           <li><p> deleteVersion(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteVersionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> LoadVersion</td>
 *      <td><p> Loads resources in the specified version to the draft flow.
 * <p>  This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields:
 * <p>  - `metadata`: An empty [Struct   message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty   message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> loadVersionAsync(LoadVersionRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> loadVersionAsync(VersionName name)
 *           <li><p> loadVersionAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> loadVersionOperationCallable()
 *           <li><p> loadVersionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CompareVersions</td>
 *      <td><p> Compares the specified base version with target version.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> compareVersions(CompareVersionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> compareVersions(VersionName baseVersion)
 *           <li><p> compareVersions(String baseVersion)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> compareVersionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of VersionsSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * VersionsSettings versionsSettings =
 *     VersionsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * VersionsClient versionsClient = VersionsClient.create(versionsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * VersionsSettings versionsSettings =
 *     VersionsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * VersionsClient versionsClient = VersionsClient.create(versionsSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * VersionsSettings versionsSettings = VersionsSettings.newHttpJsonBuilder().build();
 * VersionsClient versionsClient = VersionsClient.create(versionsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class VersionsClient implements BackgroundResource {
  private final VersionsSettings settings;
  private final VersionsStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of VersionsClient with default settings. */
  public static final VersionsClient create() throws IOException {
    return create(VersionsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of VersionsClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final VersionsClient create(VersionsSettings settings) throws IOException {
    return new VersionsClient(settings);
  }

  /**
   * Constructs an instance of VersionsClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(VersionsSettings).
   */
  public static final VersionsClient create(VersionsStub stub) {
    return new VersionsClient(stub);
  }

  /**
   * Constructs an instance of VersionsClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected VersionsClient(VersionsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((VersionsStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected VersionsClient(VersionsStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final VersionsSettings getSettings() {
    return settings;
  }

  public VersionsStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions in the specified [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   FlowName parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");
   *   for (Version element : versionsClient.listVersions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The [Flow][google.cloud.dialogflow.cx.v3.Flow] to list all versions
   *     for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVersionsPagedResponse listVersions(FlowName parent) {
    ListVersionsRequest request =
        ListVersionsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions in the specified [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString();
   *   for (Version element : versionsClient.listVersions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The [Flow][google.cloud.dialogflow.cx.v3.Flow] to list all versions
   *     for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVersionsPagedResponse listVersions(String parent) {
    ListVersionsRequest request = ListVersionsRequest.newBuilder().setParent(parent).build();
    return listVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions in the specified [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListVersionsRequest request =
   *       ListVersionsRequest.newBuilder()
   *           .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Version element : versionsClient.listVersions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVersionsPagedResponse listVersions(ListVersionsRequest request) {
    return listVersionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions in the specified [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListVersionsRequest request =
   *       ListVersionsRequest.newBuilder()
   *           .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Version> future = versionsClient.listVersionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Version element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse>
      listVersionsPagedCallable() {
    return stub.listVersionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions in the specified [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListVersionsRequest request =
   *       ListVersionsRequest.newBuilder()
   *           .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListVersionsResponse response = versionsClient.listVersionsCallable().call(request);
   *     for (Version element : response.getVersionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable() {
    return stub.listVersionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   VersionName name =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]");
   *   Version response = versionsClient.getVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the [Version][google.cloud.dialogflow.cx.v3.Version]. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version getVersion(VersionName name) {
    GetVersionRequest request =
        GetVersionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String name =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]").toString();
   *   Version response = versionsClient.getVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the [Version][google.cloud.dialogflow.cx.v3.Version]. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version getVersion(String name) {
    GetVersionRequest request = GetVersionRequest.newBuilder().setName(name).build();
    return getVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   GetVersionRequest request =
   *       GetVersionRequest.newBuilder()
   *           .setName(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .build();
   *   Version response = versionsClient.getVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version getVersion(GetVersionRequest request) {
    return getVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   GetVersionRequest request =
   *       GetVersionRequest.newBuilder()
   *           .setName(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Version> future = versionsClient.getVersionCallable().futureCall(request);
   *   // Do something.
   *   Version response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetVersionRequest, Version> getVersionCallable() {
    return stub.getVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [Version][google.cloud.dialogflow.cx.v3.Version] in the specified
   * [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`:
   * [CreateVersionOperationMetadata][google.cloud.dialogflow.cx.v3.CreateVersionOperationMetadata]
   * - `response`: [Version][google.cloud.dialogflow.cx.v3.Version]
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   FlowName parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");
   *   Version version = Version.newBuilder().build();
   *   Version response = versionsClient.createVersionAsync(parent, version).get();
   * }
   * }</pre>
   *
   * @param parent Required. The [Flow][google.cloud.dialogflow.cx.v3.Flow] to create an
   *     [Version][google.cloud.dialogflow.cx.v3.Version] for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * @param version Required. The version to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Version, CreateVersionOperationMetadata> createVersionAsync(
      FlowName parent, Version version) {
    CreateVersionRequest request =
        CreateVersionRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setVersion(version)
            .build();
    return createVersionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [Version][google.cloud.dialogflow.cx.v3.Version] in the specified
   * [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`:
   * [CreateVersionOperationMetadata][google.cloud.dialogflow.cx.v3.CreateVersionOperationMetadata]
   * - `response`: [Version][google.cloud.dialogflow.cx.v3.Version]
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString();
   *   Version version = Version.newBuilder().build();
   *   Version response = versionsClient.createVersionAsync(parent, version).get();
   * }
   * }</pre>
   *
   * @param parent Required. The [Flow][google.cloud.dialogflow.cx.v3.Flow] to create an
   *     [Version][google.cloud.dialogflow.cx.v3.Version] for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * @param version Required. The version to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Version, CreateVersionOperationMetadata> createVersionAsync(
      String parent, Version version) {
    CreateVersionRequest request =
        CreateVersionRequest.newBuilder().setParent(parent).setVersion(version).build();
    return createVersionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [Version][google.cloud.dialogflow.cx.v3.Version] in the specified
   * [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`:
   * [CreateVersionOperationMetadata][google.cloud.dialogflow.cx.v3.CreateVersionOperationMetadata]
   * - `response`: [Version][google.cloud.dialogflow.cx.v3.Version]
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   CreateVersionRequest request =
   *       CreateVersionRequest.newBuilder()
   *           .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
   *           .setVersion(Version.newBuilder().build())
   *           .build();
   *   Version response = versionsClient.createVersionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Version, CreateVersionOperationMetadata> createVersionAsync(
      CreateVersionRequest request) {
    return createVersionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [Version][google.cloud.dialogflow.cx.v3.Version] in the specified
   * [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`:
   * [CreateVersionOperationMetadata][google.cloud.dialogflow.cx.v3.CreateVersionOperationMetadata]
   * - `response`: [Version][google.cloud.dialogflow.cx.v3.Version]
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   CreateVersionRequest request =
   *       CreateVersionRequest.newBuilder()
   *           .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
   *           .setVersion(Version.newBuilder().build())
   *           .build();
   *   OperationFuture<Version, CreateVersionOperationMetadata> future =
   *       versionsClient.createVersionOperationCallable().futureCall(request);
   *   // Do something.
   *   Version response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateVersionRequest, Version, CreateVersionOperationMetadata>
      createVersionOperationCallable() {
    return stub.createVersionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [Version][google.cloud.dialogflow.cx.v3.Version] in the specified
   * [Flow][google.cloud.dialogflow.cx.v3.Flow].
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`:
   * [CreateVersionOperationMetadata][google.cloud.dialogflow.cx.v3.CreateVersionOperationMetadata]
   * - `response`: [Version][google.cloud.dialogflow.cx.v3.Version]
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   CreateVersionRequest request =
   *       CreateVersionRequest.newBuilder()
   *           .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
   *           .setVersion(Version.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future = versionsClient.createVersionCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateVersionRequest, Operation> createVersionCallable() {
    return stub.createVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   Version version = Version.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Version response = versionsClient.updateVersion(version, updateMask);
   * }
   * }</pre>
   *
   * @param version Required. The version to update.
   * @param updateMask Required. The mask to control which fields get updated. Currently only
   *     `description` and `display_name` can be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version updateVersion(Version version, FieldMask updateMask) {
    UpdateVersionRequest request =
        UpdateVersionRequest.newBuilder().setVersion(version).setUpdateMask(updateMask).build();
    return updateVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   UpdateVersionRequest request =
   *       UpdateVersionRequest.newBuilder()
   *           .setVersion(Version.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Version response = versionsClient.updateVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version updateVersion(UpdateVersionRequest request) {
    return updateVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   UpdateVersionRequest request =
   *       UpdateVersionRequest.newBuilder()
   *           .setVersion(Version.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Version> future = versionsClient.updateVersionCallable().futureCall(request);
   *   // Do something.
   *   Version response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable() {
    return stub.updateVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   VersionName name =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]");
   *   versionsClient.deleteVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the [Version][google.cloud.dialogflow.cx.v3.Version] to
   *     delete. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteVersion(VersionName name) {
    DeleteVersionRequest request =
        DeleteVersionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String name =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]").toString();
   *   versionsClient.deleteVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the [Version][google.cloud.dialogflow.cx.v3.Version] to
   *     delete. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteVersion(String name) {
    DeleteVersionRequest request = DeleteVersionRequest.newBuilder().setName(name).build();
    deleteVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   DeleteVersionRequest request =
   *       DeleteVersionRequest.newBuilder()
   *           .setName(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .build();
   *   versionsClient.deleteVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteVersion(DeleteVersionRequest request) {
    deleteVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified [Version][google.cloud.dialogflow.cx.v3.Version].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   DeleteVersionRequest request =
   *       DeleteVersionRequest.newBuilder()
   *           .setName(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future = versionsClient.deleteVersionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteVersionRequest, Empty> deleteVersionCallable() {
    return stub.deleteVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Loads resources in the specified version to the draft flow.
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`: An empty [Struct
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct)
   * - `response`: An [Empty
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   VersionName name =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]");
   *   versionsClient.loadVersionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The [Version][google.cloud.dialogflow.cx.v3.Version] to be loaded to
   *     draft flow. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> loadVersionAsync(VersionName name) {
    LoadVersionRequest request =
        LoadVersionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return loadVersionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Loads resources in the specified version to the draft flow.
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`: An empty [Struct
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct)
   * - `response`: An [Empty
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String name =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]").toString();
   *   versionsClient.loadVersionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The [Version][google.cloud.dialogflow.cx.v3.Version] to be loaded to
   *     draft flow. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> loadVersionAsync(String name) {
    LoadVersionRequest request = LoadVersionRequest.newBuilder().setName(name).build();
    return loadVersionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Loads resources in the specified version to the draft flow.
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`: An empty [Struct
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct)
   * - `response`: An [Empty
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   LoadVersionRequest request =
   *       LoadVersionRequest.newBuilder()
   *           .setName(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .setAllowOverrideAgentResources(true)
   *           .build();
   *   versionsClient.loadVersionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> loadVersionAsync(LoadVersionRequest request) {
    return loadVersionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Loads resources in the specified version to the draft flow.
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`: An empty [Struct
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct)
   * - `response`: An [Empty
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   LoadVersionRequest request =
   *       LoadVersionRequest.newBuilder()
   *           .setName(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .setAllowOverrideAgentResources(true)
   *           .build();
   *   OperationFuture<Empty, Struct> future =
   *       versionsClient.loadVersionOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<LoadVersionRequest, Empty, Struct> loadVersionOperationCallable() {
    return stub.loadVersionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Loads resources in the specified version to the draft flow.
   *
   * <p>This method is a [long-running
   * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
   * returned `Operation` type has the following method-specific fields:
   *
   * <p>- `metadata`: An empty [Struct
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct)
   * - `response`: An [Empty
   * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   LoadVersionRequest request =
   *       LoadVersionRequest.newBuilder()
   *           .setName(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .setAllowOverrideAgentResources(true)
   *           .build();
   *   ApiFuture<Operation> future = versionsClient.loadVersionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<LoadVersionRequest, Operation> loadVersionCallable() {
    return stub.loadVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Compares the specified base version with target version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   VersionName baseVersion =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]");
   *   CompareVersionsResponse response = versionsClient.compareVersions(baseVersion);
   * }
   * }</pre>
   *
   * @param baseVersion Required. Name of the base flow version to compare with the target version.
   *     Use version ID `0` to indicate the draft version of the specified flow.
   *     <p>Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CompareVersionsResponse compareVersions(VersionName baseVersion) {
    CompareVersionsRequest request =
        CompareVersionsRequest.newBuilder()
            .setBaseVersion(baseVersion == null ? null : baseVersion.toString())
            .build();
    return compareVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Compares the specified base version with target version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String baseVersion =
   *       VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]").toString();
   *   CompareVersionsResponse response = versionsClient.compareVersions(baseVersion);
   * }
   * }</pre>
   *
   * @param baseVersion Required. Name of the base flow version to compare with the target version.
   *     Use version ID `0` to indicate the draft version of the specified flow.
   *     <p>Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/versions/&lt;VersionID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CompareVersionsResponse compareVersions(String baseVersion) {
    CompareVersionsRequest request =
        CompareVersionsRequest.newBuilder().setBaseVersion(baseVersion).build();
    return compareVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Compares the specified base version with target version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   CompareVersionsRequest request =
   *       CompareVersionsRequest.newBuilder()
   *           .setBaseVersion(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .setTargetVersion(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   CompareVersionsResponse response = versionsClient.compareVersions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CompareVersionsResponse compareVersions(CompareVersionsRequest request) {
    return compareVersionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Compares the specified base version with target version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   CompareVersionsRequest request =
   *       CompareVersionsRequest.newBuilder()
   *           .setBaseVersion(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .setTargetVersion(
   *               VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
   *                   .toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ApiFuture<CompareVersionsResponse> future =
   *       versionsClient.compareVersionsCallable().futureCall(request);
   *   // Do something.
   *   CompareVersionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CompareVersionsRequest, CompareVersionsResponse>
      compareVersionsCallable() {
    return stub.compareVersionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : versionsClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future = versionsClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response = versionsClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = versionsClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future = versionsClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListVersionsPagedResponse
      extends AbstractPagedListResponse<
          ListVersionsRequest,
          ListVersionsResponse,
          Version,
          ListVersionsPage,
          ListVersionsFixedSizeCollection> {

    public static ApiFuture<ListVersionsPagedResponse> createAsync(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ApiFuture<ListVersionsResponse> futureResponse) {
      ApiFuture<ListVersionsPage> futurePage =
          ListVersionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListVersionsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListVersionsPagedResponse(ListVersionsPage page) {
      super(page, ListVersionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListVersionsPage
      extends AbstractPage<ListVersionsRequest, ListVersionsResponse, Version, ListVersionsPage> {

    private ListVersionsPage(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ListVersionsResponse response) {
      super(context, response);
    }

    private static ListVersionsPage createEmptyPage() {
      return new ListVersionsPage(null, null);
    }

    @Override
    protected ListVersionsPage createPage(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ListVersionsResponse response) {
      return new ListVersionsPage(context, response);
    }

    @Override
    public ApiFuture<ListVersionsPage> createPageAsync(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ApiFuture<ListVersionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListVersionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListVersionsRequest,
          ListVersionsResponse,
          Version,
          ListVersionsPage,
          ListVersionsFixedSizeCollection> {

    private ListVersionsFixedSizeCollection(List<ListVersionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListVersionsFixedSizeCollection createEmptyCollection() {
      return new ListVersionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListVersionsFixedSizeCollection createCollection(
        List<ListVersionsPage> pages, int collectionSize) {
      return new ListVersionsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
