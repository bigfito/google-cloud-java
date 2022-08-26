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

package com.google.cloud.datacatalog.v1beta1.samples;

// [START datacatalog_v1beta1_generated_datacatalogclient_updatetagtemplatefield_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datacatalog.v1beta1.DataCatalogClient;
import com.google.cloud.datacatalog.v1beta1.TagTemplateField;
import com.google.cloud.datacatalog.v1beta1.TagTemplateFieldName;
import com.google.cloud.datacatalog.v1beta1.UpdateTagTemplateFieldRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateTagTemplateField {

  public static void main(String[] args) throws Exception {
    asyncUpdateTagTemplateField();
  }

  public static void asyncUpdateTagTemplateField() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
      UpdateTagTemplateFieldRequest request =
          UpdateTagTemplateFieldRequest.newBuilder()
              .setName(
                  TagTemplateFieldName.of("[PROJECT]", "[LOCATION]", "[TAG_TEMPLATE]", "[FIELD]")
                      .toString())
              .setTagTemplateField(TagTemplateField.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<TagTemplateField> future =
          dataCatalogClient.updateTagTemplateFieldCallable().futureCall(request);
      // Do something.
      TagTemplateField response = future.get();
    }
  }
}
// [END datacatalog_v1beta1_generated_datacatalogclient_updatetagtemplatefield_async]