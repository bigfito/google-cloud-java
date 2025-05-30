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

package com.google.cloud.vision.v1.samples;

// [START vision_v1_generated_ImageAnnotator_AsyncBatchAnnotateFiles_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vision.v1.AsyncAnnotateFileRequest;
import com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.longrunning.Operation;
import java.util.ArrayList;
import java.util.HashMap;

public class AsyncAsyncBatchAnnotateFiles {

  public static void main(String[] args) throws Exception {
    asyncAsyncBatchAnnotateFiles();
  }

  public static void asyncAsyncBatchAnnotateFiles() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
      AsyncBatchAnnotateFilesRequest request =
          AsyncBatchAnnotateFilesRequest.newBuilder()
              .addAllRequests(new ArrayList<AsyncAnnotateFileRequest>())
              .setParent("parent-995424086")
              .putAllLabels(new HashMap<String, String>())
              .build();
      ApiFuture<Operation> future =
          imageAnnotatorClient.asyncBatchAnnotateFilesCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END vision_v1_generated_ImageAnnotator_AsyncBatchAnnotateFiles_async]
