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
package org.ar4k.agent.mattermost.model;

/**
 * SAML auth request.
 * 
 * @author Takayuki Maruyama
 */
public class SamlAuthRequest {
  private String base64AuthRequest;
  private String url;
  private String relayState;

  @java.lang.SuppressWarnings("all")
  public SamlAuthRequest() {
  }

  @java.lang.SuppressWarnings("all")
  public String getBase64AuthRequest() {
    return this.base64AuthRequest;
  }

  @java.lang.SuppressWarnings("all")
  public String getUrl() {
    return this.url;
  }

  @java.lang.SuppressWarnings("all")
  public String getRelayState() {
    return this.relayState;
  }

  @java.lang.SuppressWarnings("all")
  public void setBase64AuthRequest(final String base64AuthRequest) {
    this.base64AuthRequest = base64AuthRequest;
  }

  @java.lang.SuppressWarnings("all")
  public void setUrl(final String url) {
    this.url = url;
  }

  @java.lang.SuppressWarnings("all")
  public void setRelayState(final String relayState) {
    this.relayState = relayState;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof SamlAuthRequest)) return false;
    final SamlAuthRequest other = (SamlAuthRequest) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$base64AuthRequest = this.getBase64AuthRequest();
    final java.lang.Object other$base64AuthRequest = other.getBase64AuthRequest();
    if (this$base64AuthRequest == null ? other$base64AuthRequest != null : !this$base64AuthRequest.equals(other$base64AuthRequest)) return false;
    final java.lang.Object this$url = this.getUrl();
    final java.lang.Object other$url = other.getUrl();
    if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
    final java.lang.Object this$relayState = this.getRelayState();
    final java.lang.Object other$relayState = other.getRelayState();
    if (this$relayState == null ? other$relayState != null : !this$relayState.equals(other$relayState)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof SamlAuthRequest;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $base64AuthRequest = this.getBase64AuthRequest();
    result = result * PRIME + ($base64AuthRequest == null ? 43 : $base64AuthRequest.hashCode());
    final java.lang.Object $url = this.getUrl();
    result = result * PRIME + ($url == null ? 43 : $url.hashCode());
    final java.lang.Object $relayState = this.getRelayState();
    result = result * PRIME + ($relayState == null ? 43 : $relayState.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "SamlAuthRequest(base64AuthRequest=" + this.getBase64AuthRequest() + ", url=" + this.getUrl() + ", relayState=" + this.getRelayState() + ")";
  }
}