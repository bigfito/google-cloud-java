/*
 * Copyright 2024 Google LLC
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
// source: google/ads/admanager/v1/computed_status_enum.proto

// Protobuf Java Version: 3.25.4
package com.google.ads.admanager.v1;

/**
 *
 *
 * <pre>
 * Wrapper message for
 * [ComputedStatus][google.ads.admanager.v1.ComputedStatusEnum.ComputedStatus].
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.ComputedStatusEnum}
 */
public final class ComputedStatusEnum extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.ComputedStatusEnum)
    ComputedStatusEnumOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ComputedStatusEnum.newBuilder() to construct.
  private ComputedStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComputedStatusEnum() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComputedStatusEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.ads.admanager.v1.ComputedStatusEnumProto
        .internal_static_google_ads_admanager_v1_ComputedStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.ComputedStatusEnumProto
        .internal_static_google_ads_admanager_v1_ComputedStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.ComputedStatusEnum.class,
            com.google.ads.admanager.v1.ComputedStatusEnum.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Describes the computed LineItem status that is derived from the
   * current state of the LineItem.
   * </pre>
   *
   * Protobuf enum {@code google.ads.admanager.v1.ComputedStatusEnum.ComputedStatus}
   */
  public enum ComputedStatus implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * No value specified.
     * </pre>
     *
     * <code>COMPUTED_STATUS_UNSPECIFIED = 0;</code>
     */
    COMPUTED_STATUS_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The LineItem has past its link LineItem#endDateTime with an auto
     * extension, but hasn't met its goal.
     * </pre>
     *
     * <code>DELIVERY_EXTENDED = 1;</code>
     */
    DELIVERY_EXTENDED(1),
    /**
     *
     *
     * <pre>
     * The LineItem has begun serving.
     * </pre>
     *
     * <code>DELIVERING = 2;</code>
     */
    DELIVERING(2),
    /**
     *
     *
     * <pre>
     * The LineItem has been activated and is ready to serve.
     * </pre>
     *
     * <code>READY = 3;</code>
     */
    READY(3),
    /**
     *
     *
     * <pre>
     * The LineItem has been paused from serving.
     * </pre>
     *
     * <code>PAUSED = 4;</code>
     */
    PAUSED(4),
    /**
     *
     *
     * <pre>
     * The LineItem is inactive. It is either caused by missing creatives or
     * the network disabling auto-activation.
     * </pre>
     *
     * <code>INACTIVE = 5;</code>
     */
    INACTIVE(5),
    /**
     *
     *
     * <pre>
     * The LineItem has been paused and its reserved inventory has been
     * released. The LineItem will not serve.
     * </pre>
     *
     * <code>PAUSED_INVENTORY_RELEASED = 6;</code>
     */
    PAUSED_INVENTORY_RELEASED(6),
    /**
     *
     *
     * <pre>
     * The LineItem has been submitted for approval.
     * </pre>
     *
     * <code>PENDING_APPROVAL = 7;</code>
     */
    PENDING_APPROVAL(7),
    /**
     *
     *
     * <pre>
     * The LineItem has completed its run.
     * </pre>
     *
     * <code>COMPLETED = 8;</code>
     */
    COMPLETED(8),
    /**
     *
     *
     * <pre>
     * The LineItem has been disapproved and is not eligible to serve.
     * </pre>
     *
     * <code>DISAPPROVED = 9;</code>
     */
    DISAPPROVED(9),
    /**
     *
     *
     * <pre>
     * The LineItem is still being drafted.
     * </pre>
     *
     * <code>DRAFT = 10;</code>
     */
    DRAFT(10),
    /**
     *
     *
     * <pre>
     * The LineItem has been canceled and is no longer eligible to serve.
     * This is a legacy status imported from Google Ad Manager orders.
     * </pre>
     *
     * <code>CANCELED = 11;</code>
     */
    CANCELED(11),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * No value specified.
     * </pre>
     *
     * <code>COMPUTED_STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int COMPUTED_STATUS_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The LineItem has past its link LineItem#endDateTime with an auto
     * extension, but hasn't met its goal.
     * </pre>
     *
     * <code>DELIVERY_EXTENDED = 1;</code>
     */
    public static final int DELIVERY_EXTENDED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The LineItem has begun serving.
     * </pre>
     *
     * <code>DELIVERING = 2;</code>
     */
    public static final int DELIVERING_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The LineItem has been activated and is ready to serve.
     * </pre>
     *
     * <code>READY = 3;</code>
     */
    public static final int READY_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The LineItem has been paused from serving.
     * </pre>
     *
     * <code>PAUSED = 4;</code>
     */
    public static final int PAUSED_VALUE = 4;
    /**
     *
     *
     * <pre>
     * The LineItem is inactive. It is either caused by missing creatives or
     * the network disabling auto-activation.
     * </pre>
     *
     * <code>INACTIVE = 5;</code>
     */
    public static final int INACTIVE_VALUE = 5;
    /**
     *
     *
     * <pre>
     * The LineItem has been paused and its reserved inventory has been
     * released. The LineItem will not serve.
     * </pre>
     *
     * <code>PAUSED_INVENTORY_RELEASED = 6;</code>
     */
    public static final int PAUSED_INVENTORY_RELEASED_VALUE = 6;
    /**
     *
     *
     * <pre>
     * The LineItem has been submitted for approval.
     * </pre>
     *
     * <code>PENDING_APPROVAL = 7;</code>
     */
    public static final int PENDING_APPROVAL_VALUE = 7;
    /**
     *
     *
     * <pre>
     * The LineItem has completed its run.
     * </pre>
     *
     * <code>COMPLETED = 8;</code>
     */
    public static final int COMPLETED_VALUE = 8;
    /**
     *
     *
     * <pre>
     * The LineItem has been disapproved and is not eligible to serve.
     * </pre>
     *
     * <code>DISAPPROVED = 9;</code>
     */
    public static final int DISAPPROVED_VALUE = 9;
    /**
     *
     *
     * <pre>
     * The LineItem is still being drafted.
     * </pre>
     *
     * <code>DRAFT = 10;</code>
     */
    public static final int DRAFT_VALUE = 10;
    /**
     *
     *
     * <pre>
     * The LineItem has been canceled and is no longer eligible to serve.
     * This is a legacy status imported from Google Ad Manager orders.
     * </pre>
     *
     * <code>CANCELED = 11;</code>
     */
    public static final int CANCELED_VALUE = 11;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ComputedStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ComputedStatus forNumber(int value) {
      switch (value) {
        case 0:
          return COMPUTED_STATUS_UNSPECIFIED;
        case 1:
          return DELIVERY_EXTENDED;
        case 2:
          return DELIVERING;
        case 3:
          return READY;
        case 4:
          return PAUSED;
        case 5:
          return INACTIVE;
        case 6:
          return PAUSED_INVENTORY_RELEASED;
        case 7:
          return PENDING_APPROVAL;
        case 8:
          return COMPLETED;
        case 9:
          return DISAPPROVED;
        case 10:
          return DRAFT;
        case 11:
          return CANCELED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ComputedStatus> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ComputedStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ComputedStatus>() {
          public ComputedStatus findValueByNumber(int number) {
            return ComputedStatus.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.ads.admanager.v1.ComputedStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ComputedStatus[] VALUES = values();

    public static ComputedStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ComputedStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.admanager.v1.ComputedStatusEnum.ComputedStatus)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.ads.admanager.v1.ComputedStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.ComputedStatusEnum other =
        (com.google.ads.admanager.v1.ComputedStatusEnum) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum parseFrom(
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

  public static Builder newBuilder(com.google.ads.admanager.v1.ComputedStatusEnum prototype) {
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
   * Wrapper message for
   * [ComputedStatus][google.ads.admanager.v1.ComputedStatusEnum.ComputedStatus].
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.ComputedStatusEnum}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.ComputedStatusEnum)
      com.google.ads.admanager.v1.ComputedStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.ads.admanager.v1.ComputedStatusEnumProto
          .internal_static_google_ads_admanager_v1_ComputedStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.ComputedStatusEnumProto
          .internal_static_google_ads_admanager_v1_ComputedStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.ComputedStatusEnum.class,
              com.google.ads.admanager.v1.ComputedStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.ComputedStatusEnum.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.ads.admanager.v1.ComputedStatusEnumProto
          .internal_static_google_ads_admanager_v1_ComputedStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.ComputedStatusEnum getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.ComputedStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.ComputedStatusEnum build() {
      com.google.ads.admanager.v1.ComputedStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.ComputedStatusEnum buildPartial() {
      com.google.ads.admanager.v1.ComputedStatusEnum result =
          new com.google.ads.admanager.v1.ComputedStatusEnum(this);
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
      if (other instanceof com.google.ads.admanager.v1.ComputedStatusEnum) {
        return mergeFrom((com.google.ads.admanager.v1.ComputedStatusEnum) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.ComputedStatusEnum other) {
      if (other == com.google.ads.admanager.v1.ComputedStatusEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
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

    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.ComputedStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.ComputedStatusEnum)
  private static final com.google.ads.admanager.v1.ComputedStatusEnum DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.ComputedStatusEnum();
  }

  public static com.google.ads.admanager.v1.ComputedStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputedStatusEnum> PARSER =
      new com.google.protobuf.AbstractParser<ComputedStatusEnum>() {
        @java.lang.Override
        public ComputedStatusEnum parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ComputedStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputedStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.ComputedStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
