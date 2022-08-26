/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Description of an a image to use during Skaffold rendering.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.BuildArtifact}
 */
public final class BuildArtifact extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.BuildArtifact)
    BuildArtifactOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BuildArtifact.newBuilder() to construct.
  private BuildArtifact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BuildArtifact() {
    image_ = "";
    tag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BuildArtifact();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BuildArtifact(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              tag_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              image_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_BuildArtifact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_BuildArtifact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.BuildArtifact.class,
            com.google.cloud.deploy.v1.BuildArtifact.Builder.class);
  }

  public static final int IMAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object image_;
  /**
   *
   *
   * <pre>
   * Image name in Skaffold configuration.
   * </pre>
   *
   * <code>string image = 3;</code>
   *
   * @return The image.
   */
  @java.lang.Override
  public java.lang.String getImage() {
    java.lang.Object ref = image_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      image_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Image name in Skaffold configuration.
   * </pre>
   *
   * <code>string image = 3;</code>
   *
   * @return The bytes for image.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImageBytes() {
    java.lang.Object ref = image_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      image_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object tag_;
  /**
   *
   *
   * <pre>
   * Image tag to use. This will generally be the full path to an image, such
   * as "gcr.io/my-project/busybox:1.2.3" or
   * "gcr.io/my-project/busybox&#64;sha256:abc123".
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Image tag to use. This will generally be the full path to an image, such
   * as "gcr.io/my-project/busybox:1.2.3" or
   * "gcr.io/my-project/busybox&#64;sha256:abc123".
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(image_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, image_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(image_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, image_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.deploy.v1.BuildArtifact)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.BuildArtifact other = (com.google.cloud.deploy.v1.BuildArtifact) obj;

    if (!getImage().equals(other.getImage())) return false;
    if (!getTag().equals(other.getTag())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getImage().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.BuildArtifact parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.deploy.v1.BuildArtifact prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Description of an a image to use during Skaffold rendering.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.BuildArtifact}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.BuildArtifact)
      com.google.cloud.deploy.v1.BuildArtifactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_BuildArtifact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_BuildArtifact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.BuildArtifact.class,
              com.google.cloud.deploy.v1.BuildArtifact.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.BuildArtifact.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      image_ = "";

      tag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_BuildArtifact_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.BuildArtifact getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.BuildArtifact.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.BuildArtifact build() {
      com.google.cloud.deploy.v1.BuildArtifact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.BuildArtifact buildPartial() {
      com.google.cloud.deploy.v1.BuildArtifact result =
          new com.google.cloud.deploy.v1.BuildArtifact(this);
      result.image_ = image_;
      result.tag_ = tag_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.deploy.v1.BuildArtifact) {
        return mergeFrom((com.google.cloud.deploy.v1.BuildArtifact) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.BuildArtifact other) {
      if (other == com.google.cloud.deploy.v1.BuildArtifact.getDefaultInstance()) return this;
      if (!other.getImage().isEmpty()) {
        image_ = other.image_;
        onChanged();
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.deploy.v1.BuildArtifact parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.deploy.v1.BuildArtifact) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object image_ = "";
    /**
     *
     *
     * <pre>
     * Image name in Skaffold configuration.
     * </pre>
     *
     * <code>string image = 3;</code>
     *
     * @return The image.
     */
    public java.lang.String getImage() {
      java.lang.Object ref = image_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        image_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image name in Skaffold configuration.
     * </pre>
     *
     * <code>string image = 3;</code>
     *
     * @return The bytes for image.
     */
    public com.google.protobuf.ByteString getImageBytes() {
      java.lang.Object ref = image_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        image_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image name in Skaffold configuration.
     * </pre>
     *
     * <code>string image = 3;</code>
     *
     * @param value The image to set.
     * @return This builder for chaining.
     */
    public Builder setImage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      image_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image name in Skaffold configuration.
     * </pre>
     *
     * <code>string image = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImage() {

      image_ = getDefaultInstance().getImage();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image name in Skaffold configuration.
     * </pre>
     *
     * <code>string image = 3;</code>
     *
     * @param value The bytes for image to set.
     * @return This builder for chaining.
     */
    public Builder setImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      image_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     *
     *
     * <pre>
     * Image tag to use. This will generally be the full path to an image, such
     * as "gcr.io/my-project/busybox:1.2.3" or
     * "gcr.io/my-project/busybox&#64;sha256:abc123".
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image tag to use. This will generally be the full path to an image, such
     * as "gcr.io/my-project/busybox:1.2.3" or
     * "gcr.io/my-project/busybox&#64;sha256:abc123".
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image tag to use. This will generally be the full path to an image, such
     * as "gcr.io/my-project/busybox:1.2.3" or
     * "gcr.io/my-project/busybox&#64;sha256:abc123".
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tag_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image tag to use. This will generally be the full path to an image, such
     * as "gcr.io/my-project/busybox:1.2.3" or
     * "gcr.io/my-project/busybox&#64;sha256:abc123".
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTag() {

      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image tag to use. This will generally be the full path to an image, such
     * as "gcr.io/my-project/busybox:1.2.3" or
     * "gcr.io/my-project/busybox&#64;sha256:abc123".
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      tag_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.BuildArtifact)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.BuildArtifact)
  private static final com.google.cloud.deploy.v1.BuildArtifact DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.BuildArtifact();
  }

  public static com.google.cloud.deploy.v1.BuildArtifact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildArtifact> PARSER =
      new com.google.protobuf.AbstractParser<BuildArtifact>() {
        @java.lang.Override
        public BuildArtifact parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BuildArtifact(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BuildArtifact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildArtifact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.BuildArtifact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}