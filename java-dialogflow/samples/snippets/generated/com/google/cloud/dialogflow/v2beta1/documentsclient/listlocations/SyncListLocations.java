/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_documentsclient_listlocations_sync]
import com.google.cloud.dialogflow.v2beta1.DocumentsClient;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.Location;

public class SyncListLocations {

  public static void main(String[] args) throws Exception {
    syncListLocations();
  }

  public static void syncListLocations() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentsClient documentsClient = DocumentsClient.create()) {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("name3373707")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (Location element : documentsClient.listLocations(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dialogflow_v2beta1_generated_documentsclient_listlocations_sync]