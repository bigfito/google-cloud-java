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

package com.google.cloud.monitoring.dashboard.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.monitoring.dashboard.v1.stub.DashboardsServiceStub;
import com.google.cloud.monitoring.dashboard.v1.stub.DashboardsServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.monitoring.dashboard.v1.CreateDashboardRequest;
import com.google.monitoring.dashboard.v1.Dashboard;
import com.google.monitoring.dashboard.v1.DashboardName;
import com.google.monitoring.dashboard.v1.DeleteDashboardRequest;
import com.google.monitoring.dashboard.v1.GetDashboardRequest;
import com.google.monitoring.dashboard.v1.ListDashboardsRequest;
import com.google.monitoring.dashboard.v1.ListDashboardsResponse;
import com.google.monitoring.dashboard.v1.ProjectName;
import com.google.monitoring.dashboard.v1.UpdateDashboardRequest;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Manages Stackdriver dashboards. A dashboard is an arrangement of data
 * display widgets in a specific layout.
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
 * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   Dashboard dashboard = Dashboard.newBuilder().build();
 *   Dashboard response = dashboardsServiceClient.createDashboard(parent, dashboard);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the DashboardsServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateDashboard</td>
 *      <td><p> Creates a new custom dashboard. For examples on how you can use this API to create dashboards, see [Managing dashboards by API](https://cloud.google.com/monitoring/dashboards/api-dashboard). This method requires the `monitoring.dashboards.create` permission on the specified project. For more information about permissions, see [Cloud Identity and Access Management](https://cloud.google.com/iam).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createDashboard(CreateDashboardRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createDashboard(ProjectName parent, Dashboard dashboard)
 *           <li><p> createDashboard(String parent, Dashboard dashboard)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createDashboardCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListDashboards</td>
 *      <td><p> Lists the existing dashboards.
 * <p>  This method requires the `monitoring.dashboards.list` permission on the specified project. For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listDashboards(ListDashboardsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listDashboards(ProjectName parent)
 *           <li><p> listDashboards(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listDashboardsPagedCallable()
 *           <li><p> listDashboardsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetDashboard</td>
 *      <td><p> Fetches a specific dashboard.
 * <p>  This method requires the `monitoring.dashboards.get` permission on the specified dashboard. For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getDashboard(GetDashboardRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getDashboard(DashboardName name)
 *           <li><p> getDashboard(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getDashboardCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteDashboard</td>
 *      <td><p> Deletes an existing custom dashboard.
 * <p>  This method requires the `monitoring.dashboards.delete` permission on the specified dashboard. For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteDashboard(DeleteDashboardRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteDashboard(DashboardName name)
 *           <li><p> deleteDashboard(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteDashboardCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateDashboard</td>
 *      <td><p> Replaces an existing custom dashboard with a new definition.
 * <p>  This method requires the `monitoring.dashboards.update` permission on the specified dashboard. For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateDashboard(UpdateDashboardRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateDashboardCallable()
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
 * <p>This class can be customized by passing in a custom instance of DashboardsServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DashboardsServiceSettings dashboardsServiceSettings =
 *     DashboardsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DashboardsServiceClient dashboardsServiceClient =
 *     DashboardsServiceClient.create(dashboardsServiceSettings);
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
 * DashboardsServiceSettings dashboardsServiceSettings =
 *     DashboardsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DashboardsServiceClient dashboardsServiceClient =
 *     DashboardsServiceClient.create(dashboardsServiceSettings);
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
 * DashboardsServiceSettings dashboardsServiceSettings =
 *     DashboardsServiceSettings.newHttpJsonBuilder().build();
 * DashboardsServiceClient dashboardsServiceClient =
 *     DashboardsServiceClient.create(dashboardsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class DashboardsServiceClient implements BackgroundResource {
  private final DashboardsServiceSettings settings;
  private final DashboardsServiceStub stub;

  /** Constructs an instance of DashboardsServiceClient with default settings. */
  public static final DashboardsServiceClient create() throws IOException {
    return create(DashboardsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DashboardsServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DashboardsServiceClient create(DashboardsServiceSettings settings)
      throws IOException {
    return new DashboardsServiceClient(settings);
  }

  /**
   * Constructs an instance of DashboardsServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(DashboardsServiceSettings).
   */
  public static final DashboardsServiceClient create(DashboardsServiceStub stub) {
    return new DashboardsServiceClient(stub);
  }

  /**
   * Constructs an instance of DashboardsServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected DashboardsServiceClient(DashboardsServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DashboardsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected DashboardsServiceClient(DashboardsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DashboardsServiceSettings getSettings() {
    return settings;
  }

  public DashboardsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new custom dashboard. For examples on how you can use this API to create dashboards,
   * see [Managing dashboards by API](https://cloud.google.com/monitoring/dashboards/api-dashboard).
   * This method requires the `monitoring.dashboards.create` permission on the specified project.
   * For more information about permissions, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Dashboard dashboard = Dashboard.newBuilder().build();
   *   Dashboard response = dashboardsServiceClient.createDashboard(parent, dashboard);
   * }
   * }</pre>
   *
   * @param parent Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   *     <p>The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
   * @param dashboard Required. The initial dashboard specification.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dashboard createDashboard(ProjectName parent, Dashboard dashboard) {
    CreateDashboardRequest request =
        CreateDashboardRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setDashboard(dashboard)
            .build();
    return createDashboard(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new custom dashboard. For examples on how you can use this API to create dashboards,
   * see [Managing dashboards by API](https://cloud.google.com/monitoring/dashboards/api-dashboard).
   * This method requires the `monitoring.dashboards.create` permission on the specified project.
   * For more information about permissions, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   Dashboard dashboard = Dashboard.newBuilder().build();
   *   Dashboard response = dashboardsServiceClient.createDashboard(parent, dashboard);
   * }
   * }</pre>
   *
   * @param parent Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   *     <p>The `[PROJECT_ID_OR_NUMBER]` must match the dashboard resource name.
   * @param dashboard Required. The initial dashboard specification.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dashboard createDashboard(String parent, Dashboard dashboard) {
    CreateDashboardRequest request =
        CreateDashboardRequest.newBuilder().setParent(parent).setDashboard(dashboard).build();
    return createDashboard(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new custom dashboard. For examples on how you can use this API to create dashboards,
   * see [Managing dashboards by API](https://cloud.google.com/monitoring/dashboards/api-dashboard).
   * This method requires the `monitoring.dashboards.create` permission on the specified project.
   * For more information about permissions, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   CreateDashboardRequest request =
   *       CreateDashboardRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setDashboard(Dashboard.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   Dashboard response = dashboardsServiceClient.createDashboard(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dashboard createDashboard(CreateDashboardRequest request) {
    return createDashboardCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new custom dashboard. For examples on how you can use this API to create dashboards,
   * see [Managing dashboards by API](https://cloud.google.com/monitoring/dashboards/api-dashboard).
   * This method requires the `monitoring.dashboards.create` permission on the specified project.
   * For more information about permissions, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   CreateDashboardRequest request =
   *       CreateDashboardRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setDashboard(Dashboard.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Dashboard> future =
   *       dashboardsServiceClient.createDashboardCallable().futureCall(request);
   *   // Do something.
   *   Dashboard response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateDashboardRequest, Dashboard> createDashboardCallable() {
    return stub.createDashboardCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the existing dashboards.
   *
   * <p>This method requires the `monitoring.dashboards.list` permission on the specified project.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (Dashboard element : dashboardsServiceClient.listDashboards(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The scope of the dashboards to list. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDashboardsPagedResponse listDashboards(ProjectName parent) {
    ListDashboardsRequest request =
        ListDashboardsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listDashboards(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the existing dashboards.
   *
   * <p>This method requires the `monitoring.dashboards.list` permission on the specified project.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   for (Dashboard element : dashboardsServiceClient.listDashboards(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The scope of the dashboards to list. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDashboardsPagedResponse listDashboards(String parent) {
    ListDashboardsRequest request = ListDashboardsRequest.newBuilder().setParent(parent).build();
    return listDashboards(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the existing dashboards.
   *
   * <p>This method requires the `monitoring.dashboards.list` permission on the specified project.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   ListDashboardsRequest request =
   *       ListDashboardsRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Dashboard element : dashboardsServiceClient.listDashboards(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDashboardsPagedResponse listDashboards(ListDashboardsRequest request) {
    return listDashboardsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the existing dashboards.
   *
   * <p>This method requires the `monitoring.dashboards.list` permission on the specified project.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   ListDashboardsRequest request =
   *       ListDashboardsRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Dashboard> future =
   *       dashboardsServiceClient.listDashboardsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Dashboard element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListDashboardsRequest, ListDashboardsPagedResponse>
      listDashboardsPagedCallable() {
    return stub.listDashboardsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the existing dashboards.
   *
   * <p>This method requires the `monitoring.dashboards.list` permission on the specified project.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   ListDashboardsRequest request =
   *       ListDashboardsRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListDashboardsResponse response =
   *         dashboardsServiceClient.listDashboardsCallable().call(request);
   *     for (Dashboard element : response.getDashboardsList()) {
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
  public final UnaryCallable<ListDashboardsRequest, ListDashboardsResponse>
      listDashboardsCallable() {
    return stub.listDashboardsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a specific dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.get` permission on the specified dashboard.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   DashboardName name = DashboardName.of("[PROJECT]", "[DASHBOARD]");
   *   Dashboard response = dashboardsServiceClient.getDashboard(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the Dashboard. The format is one of:
   *     <p>- `dashboards/[DASHBOARD_ID]` (for system dashboards) -
   *     `projects/[PROJECT_ID_OR_NUMBER]/dashboards/[DASHBOARD_ID]` (for custom dashboards).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dashboard getDashboard(DashboardName name) {
    GetDashboardRequest request =
        GetDashboardRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getDashboard(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a specific dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.get` permission on the specified dashboard.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   String name = DashboardName.of("[PROJECT]", "[DASHBOARD]").toString();
   *   Dashboard response = dashboardsServiceClient.getDashboard(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the Dashboard. The format is one of:
   *     <p>- `dashboards/[DASHBOARD_ID]` (for system dashboards) -
   *     `projects/[PROJECT_ID_OR_NUMBER]/dashboards/[DASHBOARD_ID]` (for custom dashboards).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dashboard getDashboard(String name) {
    GetDashboardRequest request = GetDashboardRequest.newBuilder().setName(name).build();
    return getDashboard(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a specific dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.get` permission on the specified dashboard.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   GetDashboardRequest request =
   *       GetDashboardRequest.newBuilder()
   *           .setName(DashboardName.of("[PROJECT]", "[DASHBOARD]").toString())
   *           .build();
   *   Dashboard response = dashboardsServiceClient.getDashboard(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dashboard getDashboard(GetDashboardRequest request) {
    return getDashboardCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a specific dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.get` permission on the specified dashboard.
   * For more information, see [Cloud Identity and Access Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   GetDashboardRequest request =
   *       GetDashboardRequest.newBuilder()
   *           .setName(DashboardName.of("[PROJECT]", "[DASHBOARD]").toString())
   *           .build();
   *   ApiFuture<Dashboard> future =
   *       dashboardsServiceClient.getDashboardCallable().futureCall(request);
   *   // Do something.
   *   Dashboard response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetDashboardRequest, Dashboard> getDashboardCallable() {
    return stub.getDashboardCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an existing custom dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.delete` permission on the specified
   * dashboard. For more information, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   DashboardName name = DashboardName.of("[PROJECT]", "[DASHBOARD]");
   *   dashboardsServiceClient.deleteDashboard(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the Dashboard. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/dashboards/[DASHBOARD_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteDashboard(DashboardName name) {
    DeleteDashboardRequest request =
        DeleteDashboardRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteDashboard(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an existing custom dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.delete` permission on the specified
   * dashboard. For more information, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   String name = DashboardName.of("[PROJECT]", "[DASHBOARD]").toString();
   *   dashboardsServiceClient.deleteDashboard(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the Dashboard. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/dashboards/[DASHBOARD_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteDashboard(String name) {
    DeleteDashboardRequest request = DeleteDashboardRequest.newBuilder().setName(name).build();
    deleteDashboard(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an existing custom dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.delete` permission on the specified
   * dashboard. For more information, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   DeleteDashboardRequest request =
   *       DeleteDashboardRequest.newBuilder()
   *           .setName(DashboardName.of("[PROJECT]", "[DASHBOARD]").toString())
   *           .build();
   *   dashboardsServiceClient.deleteDashboard(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteDashboard(DeleteDashboardRequest request) {
    deleteDashboardCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an existing custom dashboard.
   *
   * <p>This method requires the `monitoring.dashboards.delete` permission on the specified
   * dashboard. For more information, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   DeleteDashboardRequest request =
   *       DeleteDashboardRequest.newBuilder()
   *           .setName(DashboardName.of("[PROJECT]", "[DASHBOARD]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       dashboardsServiceClient.deleteDashboardCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteDashboardRequest, Empty> deleteDashboardCallable() {
    return stub.deleteDashboardCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replaces an existing custom dashboard with a new definition.
   *
   * <p>This method requires the `monitoring.dashboards.update` permission on the specified
   * dashboard. For more information, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   UpdateDashboardRequest request =
   *       UpdateDashboardRequest.newBuilder()
   *           .setDashboard(Dashboard.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   Dashboard response = dashboardsServiceClient.updateDashboard(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dashboard updateDashboard(UpdateDashboardRequest request) {
    return updateDashboardCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replaces an existing custom dashboard with a new definition.
   *
   * <p>This method requires the `monitoring.dashboards.update` permission on the specified
   * dashboard. For more information, see [Cloud Identity and Access
   * Management](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DashboardsServiceClient dashboardsServiceClient = DashboardsServiceClient.create()) {
   *   UpdateDashboardRequest request =
   *       UpdateDashboardRequest.newBuilder()
   *           .setDashboard(Dashboard.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Dashboard> future =
   *       dashboardsServiceClient.updateDashboardCallable().futureCall(request);
   *   // Do something.
   *   Dashboard response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateDashboardRequest, Dashboard> updateDashboardCallable() {
    return stub.updateDashboardCallable();
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

  public static class ListDashboardsPagedResponse
      extends AbstractPagedListResponse<
          ListDashboardsRequest,
          ListDashboardsResponse,
          Dashboard,
          ListDashboardsPage,
          ListDashboardsFixedSizeCollection> {

    public static ApiFuture<ListDashboardsPagedResponse> createAsync(
        PageContext<ListDashboardsRequest, ListDashboardsResponse, Dashboard> context,
        ApiFuture<ListDashboardsResponse> futureResponse) {
      ApiFuture<ListDashboardsPage> futurePage =
          ListDashboardsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListDashboardsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListDashboardsPagedResponse(ListDashboardsPage page) {
      super(page, ListDashboardsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListDashboardsPage
      extends AbstractPage<
          ListDashboardsRequest, ListDashboardsResponse, Dashboard, ListDashboardsPage> {

    private ListDashboardsPage(
        PageContext<ListDashboardsRequest, ListDashboardsResponse, Dashboard> context,
        ListDashboardsResponse response) {
      super(context, response);
    }

    private static ListDashboardsPage createEmptyPage() {
      return new ListDashboardsPage(null, null);
    }

    @Override
    protected ListDashboardsPage createPage(
        PageContext<ListDashboardsRequest, ListDashboardsResponse, Dashboard> context,
        ListDashboardsResponse response) {
      return new ListDashboardsPage(context, response);
    }

    @Override
    public ApiFuture<ListDashboardsPage> createPageAsync(
        PageContext<ListDashboardsRequest, ListDashboardsResponse, Dashboard> context,
        ApiFuture<ListDashboardsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListDashboardsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListDashboardsRequest,
          ListDashboardsResponse,
          Dashboard,
          ListDashboardsPage,
          ListDashboardsFixedSizeCollection> {

    private ListDashboardsFixedSizeCollection(List<ListDashboardsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDashboardsFixedSizeCollection createEmptyCollection() {
      return new ListDashboardsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDashboardsFixedSizeCollection createCollection(
        List<ListDashboardsPage> pages, int collectionSize) {
      return new ListDashboardsFixedSizeCollection(pages, collectionSize);
    }
  }
}
