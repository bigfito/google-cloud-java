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

/**
 * A client to Dialogflow API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= AgentsClient =======================
 *
 * <p>Service Description: Service for managing [Agents][google.cloud.dialogflow.v2.Agent].
 *
 * <p>Sample for AgentsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AgentsClient agentsClient = AgentsClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Agent response = agentsClient.getAgent(parent);
 * }
 * }</pre>
 *
 * <p>======================= AnswerRecordsClient =======================
 *
 * <p>Service Description: Service for managing
 * [AnswerRecords][google.cloud.dialogflow.v2.AnswerRecord].
 *
 * <p>Sample for AnswerRecordsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AnswerRecordsClient answerRecordsClient = AnswerRecordsClient.create()) {
 *   AnswerRecord answerRecord = AnswerRecord.newBuilder().build();
 *   FieldMask updateMask = FieldMask.newBuilder().build();
 *   AnswerRecord response = answerRecordsClient.updateAnswerRecord(answerRecord, updateMask);
 * }
 * }</pre>
 *
 * <p>======================= ContextsClient =======================
 *
 * <p>Service Description: Service for managing [Contexts][google.cloud.dialogflow.v2.Context].
 *
 * <p>Sample for ContextsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ContextsClient contextsClient = ContextsClient.create()) {
 *   ContextName name =
 *       ContextName.ofProjectSessionContextName("[PROJECT]", "[SESSION]", "[CONTEXT]");
 *   Context response = contextsClient.getContext(name);
 * }
 * }</pre>
 *
 * <p>======================= ConversationsClient =======================
 *
 * <p>Service Description: Service for managing
 * [Conversations][google.cloud.dialogflow.v2.Conversation].
 *
 * <p>Sample for ConversationsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ConversationsClient conversationsClient = ConversationsClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Conversation conversation = Conversation.newBuilder().build();
 *   Conversation response = conversationsClient.createConversation(parent, conversation);
 * }
 * }</pre>
 *
 * <p>======================= ConversationDatasetsClient =======================
 *
 * <p>Service Description: Conversation datasets.
 *
 * <p>Conversation datasets contain raw conversation files and their customizable metadata that can
 * be used for model training.
 *
 * <p>Sample for ConversationDatasetsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ConversationDatasetsClient conversationDatasetsClient =
 *     ConversationDatasetsClient.create()) {
 *   ConversationDatasetName name =
 *       ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]");
 *   ConversationDataset response = conversationDatasetsClient.getConversationDataset(name);
 * }
 * }</pre>
 *
 * <p>======================= ConversationModelsClient =======================
 *
 * <p>Service Description: Manages a collection of models for human agent assistant.
 *
 * <p>Sample for ConversationModelsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ConversationModelsClient conversationModelsClient = ConversationModelsClient.create()) {
 *   String name = "name3373707";
 *   ConversationModel response = conversationModelsClient.getConversationModel(name);
 * }
 * }</pre>
 *
 * <p>======================= ConversationProfilesClient =======================
 *
 * <p>Service Description: Service for managing
 * [ConversationProfiles][google.cloud.dialogflow.v2.ConversationProfile].
 *
 * <p>Sample for ConversationProfilesClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ConversationProfilesClient conversationProfilesClient =
 *     ConversationProfilesClient.create()) {
 *   ConversationProfileName name =
 *       ConversationProfileName.ofProjectConversationProfileName(
 *           "[PROJECT]", "[CONVERSATION_PROFILE]");
 *   ConversationProfile response = conversationProfilesClient.getConversationProfile(name);
 * }
 * }</pre>
 *
 * <p>======================= DocumentsClient =======================
 *
 * <p>Service Description: Service for managing knowledge
 * [Documents][google.cloud.dialogflow.v2.Document].
 *
 * <p>Sample for DocumentsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (DocumentsClient documentsClient = DocumentsClient.create()) {
 *   DocumentName name =
 *       DocumentName.ofProjectKnowledgeBaseDocumentName(
 *           "[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");
 *   Document response = documentsClient.getDocument(name);
 * }
 * }</pre>
 *
 * <p>======================= EncryptionSpecServiceClient =======================
 *
 * <p>Service Description: Manages encryption spec settings for Dialogflow and Agent Assist.
 *
 * <p>Sample for EncryptionSpecServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (EncryptionSpecServiceClient encryptionSpecServiceClient =
 *     EncryptionSpecServiceClient.create()) {
 *   EncryptionSpecName name = EncryptionSpecName.of("[PROJECT]", "[LOCATION]");
 *   EncryptionSpec response = encryptionSpecServiceClient.getEncryptionSpec(name);
 * }
 * }</pre>
 *
 * <p>======================= EntityTypesClient =======================
 *
 * <p>Service Description: Service for managing
 * [EntityTypes][google.cloud.dialogflow.v2.EntityType].
 *
 * <p>Sample for EntityTypesClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
 *   EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
 *   EntityType response = entityTypesClient.getEntityType(name);
 * }
 * }</pre>
 *
 * <p>======================= EnvironmentsClient =======================
 *
 * <p>Service Description: Service for managing
 * [Environments][google.cloud.dialogflow.v2.Environment].
 *
 * <p>Sample for EnvironmentsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
 *   GetEnvironmentRequest request =
 *       GetEnvironmentRequest.newBuilder()
 *           .setName(
 *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
 *           .build();
 *   Environment response = environmentsClient.getEnvironment(request);
 * }
 * }</pre>
 *
 * <p>======================= FulfillmentsClient =======================
 *
 * <p>Service Description: Service for managing
 * [Fulfillments][google.cloud.dialogflow.v2.Fulfillment].
 *
 * <p>Sample for FulfillmentsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (FulfillmentsClient fulfillmentsClient = FulfillmentsClient.create()) {
 *   FulfillmentName name = FulfillmentName.ofProjectName("[PROJECT]");
 *   Fulfillment response = fulfillmentsClient.getFulfillment(name);
 * }
 * }</pre>
 *
 * <p>======================= GeneratorsClient =======================
 *
 * <p>Service Description: Generator Service for LLM powered Agent Assist. This service manages the
 * configurations of user owned Generators, such as description, context and instruction,
 * input/output format, etc. The generator resources will be used inside a conversation and will be
 * triggered by TriggerEvent to query LLM for answers.
 *
 * <p>Sample for GeneratorsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (GeneratorsClient generatorsClient = GeneratorsClient.create()) {
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   Generator generator = Generator.newBuilder().build();
 *   String generatorId = "generatorId887044942";
 *   Generator response = generatorsClient.createGenerator(parent, generator, generatorId);
 * }
 * }</pre>
 *
 * <p>======================= IntentsClient =======================
 *
 * <p>Service Description: Service for managing [Intents][google.cloud.dialogflow.v2.Intent].
 *
 * <p>Sample for IntentsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (IntentsClient intentsClient = IntentsClient.create()) {
 *   IntentName name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]");
 *   Intent response = intentsClient.getIntent(name);
 * }
 * }</pre>
 *
 * <p>======================= KnowledgeBasesClient =======================
 *
 * <p>Service Description: Service for managing
 * [KnowledgeBases][google.cloud.dialogflow.v2.KnowledgeBase].
 *
 * <p>Sample for KnowledgeBasesClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
 *   KnowledgeBaseName name =
 *       KnowledgeBaseName.ofProjectKnowledgeBaseName("[PROJECT]", "[KNOWLEDGE_BASE]");
 *   KnowledgeBase response = knowledgeBasesClient.getKnowledgeBase(name);
 * }
 * }</pre>
 *
 * <p>======================= ParticipantsClient =======================
 *
 * <p>Service Description: Service for managing
 * [Participants][google.cloud.dialogflow.v2.Participant].
 *
 * <p>Sample for ParticipantsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
 *   ConversationName parent =
 *       ConversationName.ofProjectConversationName("[PROJECT]", "[CONVERSATION]");
 *   Participant participant = Participant.newBuilder().build();
 *   Participant response = participantsClient.createParticipant(parent, participant);
 * }
 * }</pre>
 *
 * <p>======================= SessionsClient =======================
 *
 * <p>Service Description: A service used for session interactions.
 *
 * <p>For more information, see the [API interactions
 * guide](https://cloud.google.com/dialogflow/docs/api-overview).
 *
 * <p>Sample for SessionsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (SessionsClient sessionsClient = SessionsClient.create()) {
 *   SessionName session = SessionName.ofProjectSessionName("[PROJECT]", "[SESSION]");
 *   QueryInput queryInput = QueryInput.newBuilder().build();
 *   DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);
 * }
 * }</pre>
 *
 * <p>======================= SessionEntityTypesClient =======================
 *
 * <p>Service Description: Service for managing
 * [SessionEntityTypes][google.cloud.dialogflow.v2.SessionEntityType].
 *
 * <p>Sample for SessionEntityTypesClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
 *   SessionEntityTypeName name =
 *       SessionEntityTypeName.ofProjectSessionEntityTypeName(
 *           "[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
 *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
 * }
 * }</pre>
 *
 * <p>======================= VersionsClient =======================
 *
 * <p>Service Description: Service for managing [Versions][google.cloud.dialogflow.v2.Version].
 *
 * <p>Sample for VersionsClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (VersionsClient versionsClient = VersionsClient.create()) {
 *   VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");
 *   Version response = versionsClient.getVersion(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.dialogflow.v2;

import javax.annotation.Generated;
