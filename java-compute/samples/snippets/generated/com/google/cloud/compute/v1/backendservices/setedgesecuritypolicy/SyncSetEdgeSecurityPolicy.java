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

package com.google.cloud.compute.v1.samples;

// [START compute_v1_generated_BackendServices_SetEdgeSecurityPolicy_sync]
import com.google.cloud.compute.v1.BackendServicesClient;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SecurityPolicyReference;
import com.google.cloud.compute.v1.SetEdgeSecurityPolicyBackendServiceRequest;

public class SyncSetEdgeSecurityPolicy {

  public static void main(String[] args) throws Exception {
    syncSetEdgeSecurityPolicy();
  }

  public static void syncSetEdgeSecurityPolicy() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BackendServicesClient backendServicesClient = BackendServicesClient.create()) {
      SetEdgeSecurityPolicyBackendServiceRequest request =
          SetEdgeSecurityPolicyBackendServiceRequest.newBuilder()
              .setBackendService("backendService-1884714623")
              .setProject("project-309310695")
              .setRequestId("requestId693933066")
              .setSecurityPolicyReferenceResource(SecurityPolicyReference.newBuilder().build())
              .build();
      Operation response = backendServicesClient.setEdgeSecurityPolicyAsync(request).get();
    }
  }
}
// [END compute_v1_generated_BackendServices_SetEdgeSecurityPolicy_sync]
