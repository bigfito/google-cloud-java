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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_PersistentResourceService_RebootPersistentResource_String_sync]
import com.google.cloud.aiplatform.v1beta1.PersistentResource;
import com.google.cloud.aiplatform.v1beta1.PersistentResourceName;
import com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceClient;

public class SyncRebootPersistentResourceString {

  public static void main(String[] args) throws Exception {
    syncRebootPersistentResourceString();
  }

  public static void syncRebootPersistentResourceString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PersistentResourceServiceClient persistentResourceServiceClient =
        PersistentResourceServiceClient.create()) {
      String name =
          PersistentResourceName.of("[PROJECT]", "[LOCATION]", "[PERSISTENT_RESOURCE]").toString();
      PersistentResource response =
          persistentResourceServiceClient.rebootPersistentResourceAsync(name).get();
    }
  }
}
// [END aiplatform_v1beta1_generated_PersistentResourceService_RebootPersistentResource_String_sync]
