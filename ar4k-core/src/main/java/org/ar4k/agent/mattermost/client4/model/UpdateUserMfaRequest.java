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

/**
 * Update user MFA request payload.
 * 
 * @see org.ar4k.agent.mattermost.client4.api.UserApi#updateUserMfa(String, String, boolean)
 * @author Takayuki Maruyama
 */
public final class UpdateUserMfaRequest {
  private final boolean activate;
  private final String code;

  @java.lang.SuppressWarnings("all")
  UpdateUserMfaRequest(final boolean activate, final String code) {
    this.activate = activate;
    this.code = code;
  }


  @java.lang.SuppressWarnings("all")
  public static class UpdateUserMfaRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private boolean activate;
    @java.lang.SuppressWarnings("all")
    private String code;

    @java.lang.SuppressWarnings("all")
    UpdateUserMfaRequestBuilder() {
    }

    /**
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public UpdateUserMfaRequest.UpdateUserMfaRequestBuilder activate(final boolean activate) {
      this.activate = activate;
      return this;
    }

    /**
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public UpdateUserMfaRequest.UpdateUserMfaRequestBuilder code(final String code) {
      this.code = code;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public UpdateUserMfaRequest build() {
      return new UpdateUserMfaRequest(this.activate, this.code);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "UpdateUserMfaRequest.UpdateUserMfaRequestBuilder(activate=" + this.activate + ", code=" + this.code + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static UpdateUserMfaRequest.UpdateUserMfaRequestBuilder builder() {
    return new UpdateUserMfaRequest.UpdateUserMfaRequestBuilder();
  }

  @java.lang.SuppressWarnings("all")
  public boolean isActivate() {
    return this.activate;
  }

  @java.lang.SuppressWarnings("all")
  public String getCode() {
    return this.code;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof UpdateUserMfaRequest)) return false;
    final UpdateUserMfaRequest other = (UpdateUserMfaRequest) o;
    if (this.isActivate() != other.isActivate()) return false;
    final java.lang.Object this$code = this.getCode();
    final java.lang.Object other$code = other.getCode();
    if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
    return true;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isActivate() ? 79 : 97);
    final java.lang.Object $code = this.getCode();
    result = result * PRIME + ($code == null ? 43 : $code.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "UpdateUserMfaRequest(activate=" + this.isActivate() + ", code=" + this.getCode() + ")";
  }
}