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

package com.google.cloud.run.v2;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class ExecutionName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_JOB_EXECUTION =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/jobs/{job}/executions/{execution}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String job;
  private final String execution;

  @Deprecated
  protected ExecutionName() {
    project = null;
    location = null;
    job = null;
    execution = null;
  }

  private ExecutionName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    job = Preconditions.checkNotNull(builder.getJob());
    execution = Preconditions.checkNotNull(builder.getExecution());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getJob() {
    return job;
  }

  public String getExecution() {
    return execution;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ExecutionName of(String project, String location, String job, String execution) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setJob(job)
        .setExecution(execution)
        .build();
  }

  public static String format(String project, String location, String job, String execution) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setJob(job)
        .setExecution(execution)
        .build()
        .toString();
  }

  public static ExecutionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_JOB_EXECUTION.validatedMatch(
            formattedString, "ExecutionName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("job"),
        matchMap.get("execution"));
  }

  public static List<ExecutionName> parseList(List<String> formattedStrings) {
    List<ExecutionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ExecutionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ExecutionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_JOB_EXECUTION.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (job != null) {
            fieldMapBuilder.put("job", job);
          }
          if (execution != null) {
            fieldMapBuilder.put("execution", execution);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_JOB_EXECUTION.instantiate(
        "project", project, "location", location, "job", job, "execution", execution);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ExecutionName that = ((ExecutionName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.job, that.job)
          && Objects.equals(this.execution, that.execution);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(job);
    h *= 1000003;
    h ^= Objects.hashCode(execution);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/jobs/{job}/executions/{execution}. */
  public static class Builder {
    private String project;
    private String location;
    private String job;
    private String execution;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getJob() {
      return job;
    }

    public String getExecution() {
      return execution;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setJob(String job) {
      this.job = job;
      return this;
    }

    public Builder setExecution(String execution) {
      this.execution = execution;
      return this;
    }

    private Builder(ExecutionName executionName) {
      this.project = executionName.project;
      this.location = executionName.location;
      this.job = executionName.job;
      this.execution = executionName.execution;
    }

    public ExecutionName build() {
      return new ExecutionName(this);
    }
  }
}
