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

package com.google.cloud.resourcemanager.v3.samples;

// [START cloudresourcemanager_v3_generated_TagKeys_DeleteTagKey_sync]
import com.google.cloud.resourcemanager.v3.DeleteTagKeyRequest;
import com.google.cloud.resourcemanager.v3.TagKey;
import com.google.cloud.resourcemanager.v3.TagKeyName;
import com.google.cloud.resourcemanager.v3.TagKeysClient;

public class SyncDeleteTagKey {

  public static void main(String[] args) throws Exception {
    syncDeleteTagKey();
  }

  public static void syncDeleteTagKey() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TagKeysClient tagKeysClient = TagKeysClient.create()) {
      DeleteTagKeyRequest request =
          DeleteTagKeyRequest.newBuilder()
              .setName(TagKeyName.of("[TAG_KEY]").toString())
              .setValidateOnly(true)
              .setEtag("etag3123477")
              .build();
      TagKey response = tagKeysClient.deleteTagKeyAsync(request).get();
    }
  }
}
// [END cloudresourcemanager_v3_generated_TagKeys_DeleteTagKey_sync]
