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

import java.util.List;

/**
 * Cluster settings.
 * 
 * @author Takayuki Maruyama
 */
public class ClusterSettings {
  private boolean enable;
  /* @deprecated removed in Mattermost Server 4.0 */
  @Deprecated
  private String interNodeListenAddress;
  private List<String> interNodeUrls;
  /* @since Mattermost Server 4.0 */
  private String clusterName;
  /* @since Mattermost Server 4.0 */
  private String overrideHostname;
  /* @since Mattermost Server 4.0 */
  private boolean useIpAddress;
  /* @since Mattermost Server 4.0 */
  private boolean useExperimentalGossip;
  /* @since Mattermost Server 4.0 */
  private boolean readOnlyConfig;
  /* @since Mattermost Server 4.0 */
  private int gossipPort;
  /* @since Mattermost Server 4.0 */
  private int streamingPort;
  /* @since Mattermost Server 5.14.0 */
  private String networkInterface;
  /* @since Mattermost Server 5.14.0 */
  private String bindAddress;
  /* @since Mattermost Server 5.14.0 */
  private String advertiseAddress;
  /* @since Mattermost Server 5.0.0 */
  private int maxIdleConns;
  /* @since Mattermost Server 5.0.0 */
  private int maxIdleConnsPerHost;
  /* @since Mattermost Server 5.0.0 */
  private int idleConnTimeoutMilliseconds;

  @java.lang.SuppressWarnings("all")
  public ClusterSettings() {
  }

  @java.lang.SuppressWarnings("all")
  public boolean isEnable() {
    return this.enable;
  }

  @java.lang.Deprecated
  @java.lang.SuppressWarnings("all")
  public String getInterNodeListenAddress() {
    return this.interNodeListenAddress;
  }

  @java.lang.SuppressWarnings("all")
  public List<String> getInterNodeUrls() {
    return this.interNodeUrls;
  }

  @java.lang.SuppressWarnings("all")
  public String getClusterName() {
    return this.clusterName;
  }

  @java.lang.SuppressWarnings("all")
  public String getOverrideHostname() {
    return this.overrideHostname;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isUseIpAddress() {
    return this.useIpAddress;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isUseExperimentalGossip() {
    return this.useExperimentalGossip;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isReadOnlyConfig() {
    return this.readOnlyConfig;
  }

  @java.lang.SuppressWarnings("all")
  public int getGossipPort() {
    return this.gossipPort;
  }

  @java.lang.SuppressWarnings("all")
  public int getStreamingPort() {
    return this.streamingPort;
  }

  @java.lang.SuppressWarnings("all")
  public String getNetworkInterface() {
    return this.networkInterface;
  }

  @java.lang.SuppressWarnings("all")
  public String getBindAddress() {
    return this.bindAddress;
  }

  @java.lang.SuppressWarnings("all")
  public String getAdvertiseAddress() {
    return this.advertiseAddress;
  }

  @java.lang.SuppressWarnings("all")
  public int getMaxIdleConns() {
    return this.maxIdleConns;
  }

  @java.lang.SuppressWarnings("all")
  public int getMaxIdleConnsPerHost() {
    return this.maxIdleConnsPerHost;
  }

  @java.lang.SuppressWarnings("all")
  public int getIdleConnTimeoutMilliseconds() {
    return this.idleConnTimeoutMilliseconds;
  }

  @java.lang.SuppressWarnings("all")
  public void setEnable(final boolean enable) {
    this.enable = enable;
  }

  @java.lang.Deprecated
  @java.lang.SuppressWarnings("all")
  public void setInterNodeListenAddress(final String interNodeListenAddress) {
    this.interNodeListenAddress = interNodeListenAddress;
  }

  @java.lang.SuppressWarnings("all")
  public void setInterNodeUrls(final List<String> interNodeUrls) {
    this.interNodeUrls = interNodeUrls;
  }

  @java.lang.SuppressWarnings("all")
  public void setClusterName(final String clusterName) {
    this.clusterName = clusterName;
  }

  @java.lang.SuppressWarnings("all")
  public void setOverrideHostname(final String overrideHostname) {
    this.overrideHostname = overrideHostname;
  }

  @java.lang.SuppressWarnings("all")
  public void setUseIpAddress(final boolean useIpAddress) {
    this.useIpAddress = useIpAddress;
  }

  @java.lang.SuppressWarnings("all")
  public void setUseExperimentalGossip(final boolean useExperimentalGossip) {
    this.useExperimentalGossip = useExperimentalGossip;
  }

  @java.lang.SuppressWarnings("all")
  public void setReadOnlyConfig(final boolean readOnlyConfig) {
    this.readOnlyConfig = readOnlyConfig;
  }

  @java.lang.SuppressWarnings("all")
  public void setGossipPort(final int gossipPort) {
    this.gossipPort = gossipPort;
  }

  @java.lang.SuppressWarnings("all")
  public void setStreamingPort(final int streamingPort) {
    this.streamingPort = streamingPort;
  }

  @java.lang.SuppressWarnings("all")
  public void setNetworkInterface(final String networkInterface) {
    this.networkInterface = networkInterface;
  }

  @java.lang.SuppressWarnings("all")
  public void setBindAddress(final String bindAddress) {
    this.bindAddress = bindAddress;
  }

  @java.lang.SuppressWarnings("all")
  public void setAdvertiseAddress(final String advertiseAddress) {
    this.advertiseAddress = advertiseAddress;
  }

  @java.lang.SuppressWarnings("all")
  public void setMaxIdleConns(final int maxIdleConns) {
    this.maxIdleConns = maxIdleConns;
  }

  @java.lang.SuppressWarnings("all")
  public void setMaxIdleConnsPerHost(final int maxIdleConnsPerHost) {
    this.maxIdleConnsPerHost = maxIdleConnsPerHost;
  }

  @java.lang.SuppressWarnings("all")
  public void setIdleConnTimeoutMilliseconds(final int idleConnTimeoutMilliseconds) {
    this.idleConnTimeoutMilliseconds = idleConnTimeoutMilliseconds;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof ClusterSettings)) return false;
    final ClusterSettings other = (ClusterSettings) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (this.isEnable() != other.isEnable()) return false;
    if (this.isUseIpAddress() != other.isUseIpAddress()) return false;
    if (this.isUseExperimentalGossip() != other.isUseExperimentalGossip()) return false;
    if (this.isReadOnlyConfig() != other.isReadOnlyConfig()) return false;
    if (this.getGossipPort() != other.getGossipPort()) return false;
    if (this.getStreamingPort() != other.getStreamingPort()) return false;
    if (this.getMaxIdleConns() != other.getMaxIdleConns()) return false;
    if (this.getMaxIdleConnsPerHost() != other.getMaxIdleConnsPerHost()) return false;
    if (this.getIdleConnTimeoutMilliseconds() != other.getIdleConnTimeoutMilliseconds()) return false;
    final java.lang.Object this$interNodeListenAddress = this.getInterNodeListenAddress();
    final java.lang.Object other$interNodeListenAddress = other.getInterNodeListenAddress();
    if (this$interNodeListenAddress == null ? other$interNodeListenAddress != null : !this$interNodeListenAddress.equals(other$interNodeListenAddress)) return false;
    final java.lang.Object this$interNodeUrls = this.getInterNodeUrls();
    final java.lang.Object other$interNodeUrls = other.getInterNodeUrls();
    if (this$interNodeUrls == null ? other$interNodeUrls != null : !this$interNodeUrls.equals(other$interNodeUrls)) return false;
    final java.lang.Object this$clusterName = this.getClusterName();
    final java.lang.Object other$clusterName = other.getClusterName();
    if (this$clusterName == null ? other$clusterName != null : !this$clusterName.equals(other$clusterName)) return false;
    final java.lang.Object this$overrideHostname = this.getOverrideHostname();
    final java.lang.Object other$overrideHostname = other.getOverrideHostname();
    if (this$overrideHostname == null ? other$overrideHostname != null : !this$overrideHostname.equals(other$overrideHostname)) return false;
    final java.lang.Object this$networkInterface = this.getNetworkInterface();
    final java.lang.Object other$networkInterface = other.getNetworkInterface();
    if (this$networkInterface == null ? other$networkInterface != null : !this$networkInterface.equals(other$networkInterface)) return false;
    final java.lang.Object this$bindAddress = this.getBindAddress();
    final java.lang.Object other$bindAddress = other.getBindAddress();
    if (this$bindAddress == null ? other$bindAddress != null : !this$bindAddress.equals(other$bindAddress)) return false;
    final java.lang.Object this$advertiseAddress = this.getAdvertiseAddress();
    final java.lang.Object other$advertiseAddress = other.getAdvertiseAddress();
    if (this$advertiseAddress == null ? other$advertiseAddress != null : !this$advertiseAddress.equals(other$advertiseAddress)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof ClusterSettings;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isEnable() ? 79 : 97);
    result = result * PRIME + (this.isUseIpAddress() ? 79 : 97);
    result = result * PRIME + (this.isUseExperimentalGossip() ? 79 : 97);
    result = result * PRIME + (this.isReadOnlyConfig() ? 79 : 97);
    result = result * PRIME + this.getGossipPort();
    result = result * PRIME + this.getStreamingPort();
    result = result * PRIME + this.getMaxIdleConns();
    result = result * PRIME + this.getMaxIdleConnsPerHost();
    result = result * PRIME + this.getIdleConnTimeoutMilliseconds();
    final java.lang.Object $interNodeListenAddress = this.getInterNodeListenAddress();
    result = result * PRIME + ($interNodeListenAddress == null ? 43 : $interNodeListenAddress.hashCode());
    final java.lang.Object $interNodeUrls = this.getInterNodeUrls();
    result = result * PRIME + ($interNodeUrls == null ? 43 : $interNodeUrls.hashCode());
    final java.lang.Object $clusterName = this.getClusterName();
    result = result * PRIME + ($clusterName == null ? 43 : $clusterName.hashCode());
    final java.lang.Object $overrideHostname = this.getOverrideHostname();
    result = result * PRIME + ($overrideHostname == null ? 43 : $overrideHostname.hashCode());
    final java.lang.Object $networkInterface = this.getNetworkInterface();
    result = result * PRIME + ($networkInterface == null ? 43 : $networkInterface.hashCode());
    final java.lang.Object $bindAddress = this.getBindAddress();
    result = result * PRIME + ($bindAddress == null ? 43 : $bindAddress.hashCode());
    final java.lang.Object $advertiseAddress = this.getAdvertiseAddress();
    result = result * PRIME + ($advertiseAddress == null ? 43 : $advertiseAddress.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "ClusterSettings(enable=" + this.isEnable() + ", interNodeListenAddress=" + this.getInterNodeListenAddress() + ", interNodeUrls=" + this.getInterNodeUrls() + ", clusterName=" + this.getClusterName() + ", overrideHostname=" + this.getOverrideHostname() + ", useIpAddress=" + this.isUseIpAddress() + ", useExperimentalGossip=" + this.isUseExperimentalGossip() + ", readOnlyConfig=" + this.isReadOnlyConfig() + ", gossipPort=" + this.getGossipPort() + ", streamingPort=" + this.getStreamingPort() + ", networkInterface=" + this.getNetworkInterface() + ", bindAddress=" + this.getBindAddress() + ", advertiseAddress=" + this.getAdvertiseAddress() + ", maxIdleConns=" + this.getMaxIdleConns() + ", maxIdleConnsPerHost=" + this.getMaxIdleConnsPerHost() + ", idleConnTimeoutMilliseconds=" + this.getIdleConnTimeoutMilliseconds() + ")";
  }
}