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
import java.util.List;

/**
 * User autocomplete items in channel.
 * 
 * @author Takayuki Maruyama
 */
public class UserAutocompleteInChannel {
  @JsonProperty("in_channel")
  private List<User> inChannel;
  @JsonProperty("out_of_channel")
  private List<User> outOfChannel;

  @java.lang.SuppressWarnings("all")
  public UserAutocompleteInChannel() {
  }

  @java.lang.SuppressWarnings("all")
  public List<User> getInChannel() {
    return this.inChannel;
  }

  @java.lang.SuppressWarnings("all")
  public List<User> getOutOfChannel() {
    return this.outOfChannel;
  }

  @JsonProperty("in_channel")
  @java.lang.SuppressWarnings("all")
  public void setInChannel(final List<User> inChannel) {
    this.inChannel = inChannel;
  }

  @JsonProperty("out_of_channel")
  @java.lang.SuppressWarnings("all")
  public void setOutOfChannel(final List<User> outOfChannel) {
    this.outOfChannel = outOfChannel;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof UserAutocompleteInChannel)) return false;
    final UserAutocompleteInChannel other = (UserAutocompleteInChannel) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$inChannel = this.getInChannel();
    final java.lang.Object other$inChannel = other.getInChannel();
    if (this$inChannel == null ? other$inChannel != null : !this$inChannel.equals(other$inChannel)) return false;
    final java.lang.Object this$outOfChannel = this.getOutOfChannel();
    final java.lang.Object other$outOfChannel = other.getOutOfChannel();
    if (this$outOfChannel == null ? other$outOfChannel != null : !this$outOfChannel.equals(other$outOfChannel)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof UserAutocompleteInChannel;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $inChannel = this.getInChannel();
    result = result * PRIME + ($inChannel == null ? 43 : $inChannel.hashCode());
    final java.lang.Object $outOfChannel = this.getOutOfChannel();
    result = result * PRIME + ($outOfChannel == null ? 43 : $outOfChannel.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "UserAutocompleteInChannel(inChannel=" + this.getInChannel() + ", outOfChannel=" + this.getOutOfChannel() + ")";
  }
}