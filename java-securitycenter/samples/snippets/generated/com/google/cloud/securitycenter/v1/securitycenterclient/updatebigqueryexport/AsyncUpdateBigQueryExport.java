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

package com.google.cloud.securitycenter.v1.samples;

// [START securitycenter_v1_generated_securitycenterclient_updatebigqueryexport_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securitycenter.v1.BigQueryExport;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1.UpdateBigQueryExportRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateBigQueryExport {

  public static void main(String[] args) throws Exception {
    asyncUpdateBigQueryExport();
  }

  public static void asyncUpdateBigQueryExport() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      UpdateBigQueryExportRequest request =
          UpdateBigQueryExportRequest.newBuilder()
              .setBigQueryExport(BigQueryExport.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<BigQueryExport> future =
          securityCenterClient.updateBigQueryExportCallable().futureCall(request);
      // Do something.
      BigQueryExport response = future.get();
    }
  }
}
// [END securitycenter_v1_generated_securitycenterclient_updatebigqueryexport_async]