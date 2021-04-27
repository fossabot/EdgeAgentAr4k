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
package org.ar4k.agent.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Channel.
 * 
 * @author Takayuki Maruyama
 */
public class Channel {
  public static final String DEFAULT_CHANNEL_NAME = "town-square";

  /**
   * The convenience constructor to create new channel.
   */
  public Channel(String displayName, String name, ChannelType type, String teamId) {
    this.displayName = displayName;
    this.name = name;
    this.type = type;
    this.teamId = teamId;
  }

  @JsonProperty("id")
  private String id;
  @JsonProperty("create_at")
  private long createAt;
  @JsonProperty("update_at")
  private long updateAt;
  @JsonProperty("delete_at")
  private long deleteAt;
  @JsonProperty("team_id")
  private String teamId;
  @JsonProperty("type")
  private ChannelType type;
  @JsonProperty("display_name")
  private String displayName;
  @JsonProperty("name")
  private String name;
  @JsonProperty("header")
  private String header;
  @JsonProperty("purpose")
  private String purpose;
  @JsonProperty("last_post_at")
  private long lastPostat;
  @JsonProperty("total_msg_count")
  private long totalMsgCount;
  @JsonProperty("extra_update_at")
  private long extraUpdateAt;
  @JsonProperty("creator_id")
  private String creatorId;
  /* @since Mattermost Server XXX what ver? */
  private String schemeId;
  /* @since Mattermost Server XXX what ver? */
  private Map<String, Object> props;
  /* @since Mattermost Server 5.10 */
  private boolean groupConstrained;

  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  @java.lang.SuppressWarnings("all")
  public long getCreateAt() {
    return this.createAt;
  }

  @java.lang.SuppressWarnings("all")
  public long getUpdateAt() {
    return this.updateAt;
  }

  @java.lang.SuppressWarnings("all")
  public long getDeleteAt() {
    return this.deleteAt;
  }

  @java.lang.SuppressWarnings("all")
  public String getTeamId() {
    return this.teamId;
  }

  @java.lang.SuppressWarnings("all")
  public ChannelType getType() {
    return this.type;
  }

  @java.lang.SuppressWarnings("all")
  public String getDisplayName() {
    return this.displayName;
  }

  @java.lang.SuppressWarnings("all")
  public String getName() {
    return this.name;
  }

  @java.lang.SuppressWarnings("all")
  public String getHeader() {
    return this.header;
  }

  @java.lang.SuppressWarnings("all")
  public String getPurpose() {
    return this.purpose;
  }

  @java.lang.SuppressWarnings("all")
  public long getLastPostat() {
    return this.lastPostat;
  }

  @java.lang.SuppressWarnings("all")
  public long getTotalMsgCount() {
    return this.totalMsgCount;
  }

  @java.lang.SuppressWarnings("all")
  public long getExtraUpdateAt() {
    return this.extraUpdateAt;
  }

  @java.lang.SuppressWarnings("all")
  public String getCreatorId() {
    return this.creatorId;
  }

  @java.lang.SuppressWarnings("all")
  public String getSchemeId() {
    return this.schemeId;
  }

  @java.lang.SuppressWarnings("all")
  public Map<String, Object> getProps() {
    return this.props;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isGroupConstrained() {
    return this.groupConstrained;
  }

  @JsonProperty("id")
  @java.lang.SuppressWarnings("all")
  public void setId(final String id) {
    this.id = id;
  }

  @JsonProperty("create_at")
  @java.lang.SuppressWarnings("all")
  public void setCreateAt(final long createAt) {
    this.createAt = createAt;
  }

  @JsonProperty("update_at")
  @java.lang.SuppressWarnings("all")
  public void setUpdateAt(final long updateAt) {
    this.updateAt = updateAt;
  }

  @JsonProperty("delete_at")
  @java.lang.SuppressWarnings("all")
  public void setDeleteAt(final long deleteAt) {
    this.deleteAt = deleteAt;
  }

  @JsonProperty("team_id")
  @java.lang.SuppressWarnings("all")
  public void setTeamId(final String teamId) {
    this.teamId = teamId;
  }

  @JsonProperty("type")
  @java.lang.SuppressWarnings("all")
  public void setType(final ChannelType type) {
    this.type = type;
  }

  @JsonProperty("display_name")
  @java.lang.SuppressWarnings("all")
  public void setDisplayName(final String displayName) {
    this.displayName = displayName;
  }

  @JsonProperty("name")
  @java.lang.SuppressWarnings("all")
  public void setName(final String name) {
    this.name = name;
  }

  @JsonProperty("header")
  @java.lang.SuppressWarnings("all")
  public void setHeader(final String header) {
    this.header = header;
  }

  @JsonProperty("purpose")
  @java.lang.SuppressWarnings("all")
  public void setPurpose(final String purpose) {
    this.purpose = purpose;
  }

  @JsonProperty("last_post_at")
  @java.lang.SuppressWarnings("all")
  public void setLastPostat(final long lastPostat) {
    this.lastPostat = lastPostat;
  }

  @JsonProperty("total_msg_count")
  @java.lang.SuppressWarnings("all")
  public void setTotalMsgCount(final long totalMsgCount) {
    this.totalMsgCount = totalMsgCount;
  }

  @JsonProperty("extra_update_at")
  @java.lang.SuppressWarnings("all")
  public void setExtraUpdateAt(final long extraUpdateAt) {
    this.extraUpdateAt = extraUpdateAt;
  }

  @JsonProperty("creator_id")
  @java.lang.SuppressWarnings("all")
  public void setCreatorId(final String creatorId) {
    this.creatorId = creatorId;
  }

  @java.lang.SuppressWarnings("all")
  public void setSchemeId(final String schemeId) {
    this.schemeId = schemeId;
  }

  @java.lang.SuppressWarnings("all")
  public void setProps(final Map<String, Object> props) {
    this.props = props;
  }

  @java.lang.SuppressWarnings("all")
  public void setGroupConstrained(final boolean groupConstrained) {
    this.groupConstrained = groupConstrained;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Channel)) return false;
    final Channel other = (Channel) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (this.getCreateAt() != other.getCreateAt()) return false;
    if (this.getUpdateAt() != other.getUpdateAt()) return false;
    if (this.getDeleteAt() != other.getDeleteAt()) return false;
    if (this.getLastPostat() != other.getLastPostat()) return false;
    if (this.getTotalMsgCount() != other.getTotalMsgCount()) return false;
    if (this.getExtraUpdateAt() != other.getExtraUpdateAt()) return false;
    if (this.isGroupConstrained() != other.isGroupConstrained()) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$teamId = this.getTeamId();
    final java.lang.Object other$teamId = other.getTeamId();
    if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
    final java.lang.Object this$type = this.getType();
    final java.lang.Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    final java.lang.Object this$displayName = this.getDisplayName();
    final java.lang.Object other$displayName = other.getDisplayName();
    if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$header = this.getHeader();
    final java.lang.Object other$header = other.getHeader();
    if (this$header == null ? other$header != null : !this$header.equals(other$header)) return false;
    final java.lang.Object this$purpose = this.getPurpose();
    final java.lang.Object other$purpose = other.getPurpose();
    if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
    final java.lang.Object this$creatorId = this.getCreatorId();
    final java.lang.Object other$creatorId = other.getCreatorId();
    if (this$creatorId == null ? other$creatorId != null : !this$creatorId.equals(other$creatorId)) return false;
    final java.lang.Object this$schemeId = this.getSchemeId();
    final java.lang.Object other$schemeId = other.getSchemeId();
    if (this$schemeId == null ? other$schemeId != null : !this$schemeId.equals(other$schemeId)) return false;
    final java.lang.Object this$props = this.getProps();
    final java.lang.Object other$props = other.getProps();
    if (this$props == null ? other$props != null : !this$props.equals(other$props)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Channel;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final long $createAt = this.getCreateAt();
    result = result * PRIME + (int) ($createAt >>> 32 ^ $createAt);
    final long $updateAt = this.getUpdateAt();
    result = result * PRIME + (int) ($updateAt >>> 32 ^ $updateAt);
    final long $deleteAt = this.getDeleteAt();
    result = result * PRIME + (int) ($deleteAt >>> 32 ^ $deleteAt);
    final long $lastPostat = this.getLastPostat();
    result = result * PRIME + (int) ($lastPostat >>> 32 ^ $lastPostat);
    final long $totalMsgCount = this.getTotalMsgCount();
    result = result * PRIME + (int) ($totalMsgCount >>> 32 ^ $totalMsgCount);
    final long $extraUpdateAt = this.getExtraUpdateAt();
    result = result * PRIME + (int) ($extraUpdateAt >>> 32 ^ $extraUpdateAt);
    result = result * PRIME + (this.isGroupConstrained() ? 79 : 97);
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $teamId = this.getTeamId();
    result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
    final java.lang.Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
    final java.lang.Object $displayName = this.getDisplayName();
    result = result * PRIME + ($displayName == null ? 43 : $displayName.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $header = this.getHeader();
    result = result * PRIME + ($header == null ? 43 : $header.hashCode());
    final java.lang.Object $purpose = this.getPurpose();
    result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
    final java.lang.Object $creatorId = this.getCreatorId();
    result = result * PRIME + ($creatorId == null ? 43 : $creatorId.hashCode());
    final java.lang.Object $schemeId = this.getSchemeId();
    result = result * PRIME + ($schemeId == null ? 43 : $schemeId.hashCode());
    final java.lang.Object $props = this.getProps();
    result = result * PRIME + ($props == null ? 43 : $props.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "Channel(id=" + this.getId() + ", createAt=" + this.getCreateAt() + ", updateAt=" + this.getUpdateAt() + ", deleteAt=" + this.getDeleteAt() + ", teamId=" + this.getTeamId() + ", type=" + this.getType() + ", displayName=" + this.getDisplayName() + ", name=" + this.getName() + ", header=" + this.getHeader() + ", purpose=" + this.getPurpose() + ", lastPostat=" + this.getLastPostat() + ", totalMsgCount=" + this.getTotalMsgCount() + ", extraUpdateAt=" + this.getExtraUpdateAt() + ", creatorId=" + this.getCreatorId() + ", schemeId=" + this.getSchemeId() + ", props=" + this.getProps() + ", groupConstrained=" + this.isGroupConstrained() + ")";
  }

  @java.lang.SuppressWarnings("all")
  public Channel() {
  }
}