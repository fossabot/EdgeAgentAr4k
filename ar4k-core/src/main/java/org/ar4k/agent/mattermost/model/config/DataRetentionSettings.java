// Generated by delombok at Sun Apr 18 22:20:18 CEST 2021
/*
 * Copyright (c) 2018 Takayuki Maruyama
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
 * Data retention policy settings.
 * 
 * @author Takayuki Maruyama
 * @since Mattermost Server 4.3 (Enterprise Edition)
 */
public class DataRetentionSettings {
  private boolean enableMessageDeletion;
  private boolean enableFileDeletion;
  private int messageRetentionDays;
  private int fileRetentionDays;
  private String deletionJobStartTime = "02:00";

  @java.lang.SuppressWarnings("all")
  public DataRetentionSettings() {
  }

  @java.lang.SuppressWarnings("all")
  public boolean isEnableMessageDeletion() {
    return this.enableMessageDeletion;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isEnableFileDeletion() {
    return this.enableFileDeletion;
  }

  @java.lang.SuppressWarnings("all")
  public int getMessageRetentionDays() {
    return this.messageRetentionDays;
  }

  @java.lang.SuppressWarnings("all")
  public int getFileRetentionDays() {
    return this.fileRetentionDays;
  }

  @java.lang.SuppressWarnings("all")
  public String getDeletionJobStartTime() {
    return this.deletionJobStartTime;
  }

  @java.lang.SuppressWarnings("all")
  public void setEnableMessageDeletion(final boolean enableMessageDeletion) {
    this.enableMessageDeletion = enableMessageDeletion;
  }

  @java.lang.SuppressWarnings("all")
  public void setEnableFileDeletion(final boolean enableFileDeletion) {
    this.enableFileDeletion = enableFileDeletion;
  }

  @java.lang.SuppressWarnings("all")
  public void setMessageRetentionDays(final int messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  @java.lang.SuppressWarnings("all")
  public void setFileRetentionDays(final int fileRetentionDays) {
    this.fileRetentionDays = fileRetentionDays;
  }

  @java.lang.SuppressWarnings("all")
  public void setDeletionJobStartTime(final String deletionJobStartTime) {
    this.deletionJobStartTime = deletionJobStartTime;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof DataRetentionSettings)) return false;
    final DataRetentionSettings other = (DataRetentionSettings) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (this.isEnableMessageDeletion() != other.isEnableMessageDeletion()) return false;
    if (this.isEnableFileDeletion() != other.isEnableFileDeletion()) return false;
    if (this.getMessageRetentionDays() != other.getMessageRetentionDays()) return false;
    if (this.getFileRetentionDays() != other.getFileRetentionDays()) return false;
    final java.lang.Object this$deletionJobStartTime = this.getDeletionJobStartTime();
    final java.lang.Object other$deletionJobStartTime = other.getDeletionJobStartTime();
    if (this$deletionJobStartTime == null ? other$deletionJobStartTime != null : !this$deletionJobStartTime.equals(other$deletionJobStartTime)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof DataRetentionSettings;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isEnableMessageDeletion() ? 79 : 97);
    result = result * PRIME + (this.isEnableFileDeletion() ? 79 : 97);
    result = result * PRIME + this.getMessageRetentionDays();
    result = result * PRIME + this.getFileRetentionDays();
    final java.lang.Object $deletionJobStartTime = this.getDeletionJobStartTime();
    result = result * PRIME + ($deletionJobStartTime == null ? 43 : $deletionJobStartTime.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "DataRetentionSettings(enableMessageDeletion=" + this.isEnableMessageDeletion() + ", enableFileDeletion=" + this.isEnableFileDeletion() + ", messageRetentionDays=" + this.getMessageRetentionDays() + ", fileRetentionDays=" + this.getFileRetentionDays() + ", deletionJobStartTime=" + this.getDeletionJobStartTime() + ")";
  }
}