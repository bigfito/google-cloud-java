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

package com.google.cloud.datacatalog.v1.samples;

// [START datacatalog_v1_generated_datacatalogclient_getentrygroup_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.EntryGroup;
import com.google.cloud.datacatalog.v1.EntryGroupName;
import com.google.cloud.datacatalog.v1.GetEntryGroupRequest;
import com.google.protobuf.FieldMask;

public class AsyncGetEntryGroup {

  public static void main(String[] args) throws Exception {
    asyncGetEntryGroup();
  }

  public static void asyncGetEntryGroup() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
      GetEntryGroupRequest request =
          GetEntryGroupRequest.newBuilder()
              .setName(EntryGroupName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]").toString())
              .setReadMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<EntryGroup> future = dataCatalogClient.getEntryGroupCallable().futureCall(request);
      // Do something.
      EntryGroup response = future.get();
    }
  }
}
// [END datacatalog_v1_generated_datacatalogclient_getentrygroup_async]