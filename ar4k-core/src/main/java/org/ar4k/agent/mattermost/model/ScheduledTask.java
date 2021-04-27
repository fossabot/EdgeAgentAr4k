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

/**
 * Scheduled task.
 * 
 * @author Takayuki Maruyama
 */
public class ScheduledTask {
  @JsonProperty("name")
  private String name;
  @JsonProperty("interval")
  private String interval; // XXX time.Duration
  @JsonProperty("recurring")
  private boolean recurring;

  @java.lang.SuppressWarnings("all")
  public ScheduledTask() {
  }

  @java.lang.SuppressWarnings("all")
  public String getName() {
    return this.name;
  }

  @java.lang.SuppressWarnings("all")
  public String getInterval() {
    return this.interval;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isRecurring() {
    return this.recurring;
  }

  @JsonProperty("name")
  @java.lang.SuppressWarnings("all")
  public void setName(final String name) {
    this.name = name;
  }

  @JsonProperty("interval")
  @java.lang.SuppressWarnings("all")
  public void setInterval(final String interval) {
    this.interval = interval;
  }

  @JsonProperty("recurring")
  @java.lang.SuppressWarnings("all")
  public void setRecurring(final boolean recurring) {
    this.recurring = recurring;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof ScheduledTask)) return false;
    final ScheduledTask other = (ScheduledTask) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (this.isRecurring() != other.isRecurring()) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$interval = this.getInterval();
    final java.lang.Object other$interval = other.getInterval();
    if (this$interval == null ? other$interval != null : !this$interval.equals(other$interval)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof ScheduledTask;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isRecurring() ? 79 : 97);
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $interval = this.getInterval();
    result = result * PRIME + ($interval == null ? 43 : $interval.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "ScheduledTask(name=" + this.getName() + ", interval=" + this.getInterval() + ", recurring=" + this.isRecurring() + ")";
  }
}