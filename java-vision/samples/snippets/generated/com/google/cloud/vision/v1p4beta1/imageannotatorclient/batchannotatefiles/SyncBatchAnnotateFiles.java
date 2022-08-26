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

package com.google.cloud.vision.v1p4beta1.samples;

// [START vision_v1p4beta1_generated_imageannotatorclient_batchannotatefiles_sync]
import com.google.cloud.vision.v1p4beta1.AnnotateFileRequest;
import com.google.cloud.vision.v1p4beta1.BatchAnnotateFilesRequest;
import com.google.cloud.vision.v1p4beta1.BatchAnnotateFilesResponse;
import com.google.cloud.vision.v1p4beta1.ImageAnnotatorClient;
import java.util.ArrayList;

public class SyncBatchAnnotateFiles {

  public static void main(String[] args) throws Exception {
    syncBatchAnnotateFiles();
  }

  public static void syncBatchAnnotateFiles() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
      BatchAnnotateFilesRequest request =
          BatchAnnotateFilesRequest.newBuilder()
              .addAllRequests(new ArrayList<AnnotateFileRequest>())
              .build();
      BatchAnnotateFilesResponse response = imageAnnotatorClient.batchAnnotateFiles(request);
    }
  }
}
// [END vision_v1p4beta1_generated_imageannotatorclient_batchannotatefiles_sync]