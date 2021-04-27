// Generated by delombok at Sun Apr 18 22:20:18 CEST 2021
/*
 * Copyright (c) 2017-present, Takayuki Maruyama
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.ar4k.agent.mattermost.client4.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API error response.
 * 
 * @author Takayuki Maruyama
 */
public class ApiError {
  @JsonProperty("id")
  private String id;
  @JsonProperty("message")
  private String message;
  @JsonProperty("detailed_error")
  private String detailedError; // XXX UNDOCUMENTED IN api.mattermost.com/v4
  @JsonProperty("request_id")
  private String requestId;
  @JsonProperty("status_code")
  private int statusCode;
  @JsonProperty("is_oauth")
  private boolean isOAuth;

  @java.lang.SuppressWarnings("all")
  public ApiError() {
  }

  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  @java.lang.SuppressWarnings("all")
  public String getMessage() {
    return this.message;
  }

  @java.lang.SuppressWarnings("all")
  public String getDetailedError() {
    return this.detailedError;
  }

  @java.lang.SuppressWarnings("all")
  public String getRequestId() {
    return this.requestId;
  }

  @java.lang.SuppressWarnings("all")
  public int getStatusCode() {
    return this.statusCode;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isOAuth() {
    return this.isOAuth;
  }

  @JsonProperty("id")
  @java.lang.SuppressWarnings("all")
  public void setId(final String id) {
    this.id = id;
  }

  @JsonProperty("message")
  @java.lang.SuppressWarnings("all")
  public void setMessage(final String message) {
    this.message = message;
  }

  @JsonProperty("detailed_error")
  @java.lang.SuppressWarnings("all")
  public void setDetailedError(final String detailedError) {
    this.detailedError = detailedError;
  }

  @JsonProperty("request_id")
  @java.lang.SuppressWarnings("all")
  public void setRequestId(final String requestId) {
    this.requestId = requestId;
  }

  @JsonProperty("status_code")
  @java.lang.SuppressWarnings("all")
  public void setStatusCode(final int statusCode) {
    this.statusCode = statusCode;
  }

  @JsonProperty("is_oauth")
  @java.lang.SuppressWarnings("all")
  public void setOAuth(final boolean isOAuth) {
    this.isOAuth = isOAuth;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof ApiError)) return false;
    final ApiError other = (ApiError) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (this.getStatusCode() != other.getStatusCode()) return false;
    if (this.isOAuth() != other.isOAuth()) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$message = this.getMessage();
    final java.lang.Object other$message = other.getMessage();
    if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
    final java.lang.Object this$detailedError = this.getDetailedError();
    final java.lang.Object other$detailedError = other.getDetailedError();
    if (this$detailedError == null ? other$detailedError != null : !this$detailedError.equals(other$detailedError)) return false;
    final java.lang.Object this$requestId = this.getRequestId();
    final java.lang.Object other$requestId = other.getRequestId();
    if (this$requestId == null ? other$requestId != null : !this$requestId.equals(other$requestId)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof ApiError;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getStatusCode();
    result = result * PRIME + (this.isOAuth() ? 79 : 97);
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $message = this.getMessage();
    result = result * PRIME + ($message == null ? 43 : $message.hashCode());
    final java.lang.Object $detailedError = this.getDetailedError();
    result = result * PRIME + ($detailedError == null ? 43 : $detailedError.hashCode());
    final java.lang.Object $requestId = this.getRequestId();
    result = result * PRIME + ($requestId == null ? 43 : $requestId.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "ApiError(id=" + this.getId() + ", message=" + this.getMessage() + ", detailedError=" + this.getDetailedError() + ", requestId=" + this.getRequestId() + ", statusCode=" + this.getStatusCode() + ", isOAuth=" + this.isOAuth() + ")";
  }
}