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

import java.util.Arrays;
import java.util.stream.Collectors;

import org.ar4k.agent.mattermost.model.Role;

/**
 * Update user roles request payload.
 * 
 * @see org.ar4k.agent.mattermost.client4.api.UserApi#updateUserRoles(String, Role...)
 * @author Takayuki Maruyama
 */
public final class UpdateRolesRequest {
  private final String roles;

  public UpdateRolesRequest(Role... role) {
    this.roles = Arrays.stream(role).map(Role::getRoleName).collect(Collectors.joining(" "));
  }

  @java.lang.SuppressWarnings("all")
  public String getRoles() {
    return this.roles;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof UpdateRolesRequest)) return false;
    final UpdateRolesRequest other = (UpdateRolesRequest) o;
    final java.lang.Object this$roles = this.getRoles();
    final java.lang.Object other$roles = other.getRoles();
    if (this$roles == null ? other$roles != null : !this$roles.equals(other$roles)) return false;
    return true;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $roles = this.getRoles();
    result = result * PRIME + ($roles == null ? 43 : $roles.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "UpdateRolesRequest(roles=" + this.getRoles() + ")";
  }
}