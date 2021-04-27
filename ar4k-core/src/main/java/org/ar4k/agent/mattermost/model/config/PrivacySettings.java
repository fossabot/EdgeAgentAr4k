// Generated by delombok at Sun Apr 18 22:20:18 CEST 2021
/*
 * Copyright (c) 2016-present, Takayuki Maruyama
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
package org.ar4k.agent.mattermost.model.config;

/**
 * Privacy settings.
 * 
 * @author Takayuki Maruyama
 */
public class PrivacySettings {
  private boolean showEmailAddress;
  private boolean showFullName;

  @java.lang.SuppressWarnings("all")
  public PrivacySettings() {
  }

  @java.lang.SuppressWarnings("all")
  public boolean isShowEmailAddress() {
    return this.showEmailAddress;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isShowFullName() {
    return this.showFullName;
  }

  @java.lang.SuppressWarnings("all")
  public void setShowEmailAddress(final boolean showEmailAddress) {
    this.showEmailAddress = showEmailAddress;
  }

  @java.lang.SuppressWarnings("all")
  public void setShowFullName(final boolean showFullName) {
    this.showFullName = showFullName;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof PrivacySettings)) return false;
    final PrivacySettings other = (PrivacySettings) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (this.isShowEmailAddress() != other.isShowEmailAddress()) return false;
    if (this.isShowFullName() != other.isShowFullName()) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof PrivacySettings;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isShowEmailAddress() ? 79 : 97);
    result = result * PRIME + (this.isShowFullName() ? 79 : 97);
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "PrivacySettings(showEmailAddress=" + this.isShowEmailAddress() + ", showFullName=" + this.isShowFullName() + ")";
  }
}