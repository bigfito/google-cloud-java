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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_sessionsclient_detectintent_sessionnamequeryinput_sync]
import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.cloud.dialogflow.v2.QueryInput;
import com.google.cloud.dialogflow.v2.SessionName;
import com.google.cloud.dialogflow.v2.SessionsClient;

public class SyncDetectIntentSessionnameQueryinput {

  public static void main(String[] args) throws Exception {
    syncDetectIntentSessionnameQueryinput();
  }

  public static void syncDetectIntentSessionnameQueryinput() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SessionsClient sessionsClient = SessionsClient.create()) {
      SessionName session = SessionName.ofProjectSessionName("[PROJECT]", "[SESSION]");
      QueryInput queryInput = QueryInput.newBuilder().build();
      DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);
    }
  }
}
// [END dialogflow_v2_generated_sessionsclient_detectintent_sessionnamequeryinput_sync]