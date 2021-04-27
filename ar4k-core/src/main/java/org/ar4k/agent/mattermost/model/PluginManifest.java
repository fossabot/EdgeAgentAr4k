// Generated by delombok at Sun Apr 18 22:20:18 CEST 2021
/*
 * Copyright (c) 2019 Takayuki Maruyama
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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A plugin manifest.
 */
public class PluginManifest {
  private String id;
  private String name;
  private String description;
  private String version;
  private String minServerVersion;
  private PluginServer server;
  private PluginServer backend;
  private PluginWebapp webapp;
  private PluginSettingsSchema settingsSchema;
  /* @since Mattermost Server 5.23 */
  private String homepageUrl;
  /* @since Mattermost Server 5.23 */
  private String supportUrl;
  /* @since Mattermost Server 5.23 */
  private String iconPath;


  /**
   * Server side plugin executables.
   */
  public static class PluginServer {
    private PluginExecutables executables;
    private String executable;

    @java.lang.SuppressWarnings("all")
    public PluginServer() {
    }

    @java.lang.SuppressWarnings("all")
    public PluginExecutables getExecutables() {
      return this.executables;
    }

    @java.lang.SuppressWarnings("all")
    public String getExecutable() {
      return this.executable;
    }

    @java.lang.SuppressWarnings("all")
    public void setExecutables(final PluginExecutables executables) {
      this.executables = executables;
    }

    @java.lang.SuppressWarnings("all")
    public void setExecutable(final String executable) {
      this.executable = executable;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof PluginManifest.PluginServer)) return false;
      final PluginManifest.PluginServer other = (PluginManifest.PluginServer) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$executables = this.getExecutables();
      final java.lang.Object other$executables = other.getExecutables();
      if (this$executables == null ? other$executables != null : !this$executables.equals(other$executables)) return false;
      final java.lang.Object this$executable = this.getExecutable();
      final java.lang.Object other$executable = other.getExecutable();
      if (this$executable == null ? other$executable != null : !this$executable.equals(other$executable)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof PluginManifest.PluginServer;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $executables = this.getExecutables();
      result = result * PRIME + ($executables == null ? 43 : $executables.hashCode());
      final java.lang.Object $executable = this.getExecutable();
      result = result * PRIME + ($executable == null ? 43 : $executable.hashCode());
      return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PluginManifest.PluginServer(executables=" + this.getExecutables() + ", executable=" + this.getExecutable() + ")";
    }
  }


  public static class PluginExecutables {
    @JsonProperty("linux-amd64")
    private String linuxAmd64;
    @JsonProperty("darwin-amd64")
    private String darwinAmd64;
    @JsonProperty("windows-amd64")
    private String windowsAmd64;

    @java.lang.SuppressWarnings("all")
    public PluginExecutables() {
    }

    @java.lang.SuppressWarnings("all")
    public String getLinuxAmd64() {
      return this.linuxAmd64;
    }

    @java.lang.SuppressWarnings("all")
    public String getDarwinAmd64() {
      return this.darwinAmd64;
    }

    @java.lang.SuppressWarnings("all")
    public String getWindowsAmd64() {
      return this.windowsAmd64;
    }

    @JsonProperty("linux-amd64")
    @java.lang.SuppressWarnings("all")
    public void setLinuxAmd64(final String linuxAmd64) {
      this.linuxAmd64 = linuxAmd64;
    }

    @JsonProperty("darwin-amd64")
    @java.lang.SuppressWarnings("all")
    public void setDarwinAmd64(final String darwinAmd64) {
      this.darwinAmd64 = darwinAmd64;
    }

    @JsonProperty("windows-amd64")
    @java.lang.SuppressWarnings("all")
    public void setWindowsAmd64(final String windowsAmd64) {
      this.windowsAmd64 = windowsAmd64;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof PluginManifest.PluginExecutables)) return false;
      final PluginManifest.PluginExecutables other = (PluginManifest.PluginExecutables) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$linuxAmd64 = this.getLinuxAmd64();
      final java.lang.Object other$linuxAmd64 = other.getLinuxAmd64();
      if (this$linuxAmd64 == null ? other$linuxAmd64 != null : !this$linuxAmd64.equals(other$linuxAmd64)) return false;
      final java.lang.Object this$darwinAmd64 = this.getDarwinAmd64();
      final java.lang.Object other$darwinAmd64 = other.getDarwinAmd64();
      if (this$darwinAmd64 == null ? other$darwinAmd64 != null : !this$darwinAmd64.equals(other$darwinAmd64)) return false;
      final java.lang.Object this$windowsAmd64 = this.getWindowsAmd64();
      final java.lang.Object other$windowsAmd64 = other.getWindowsAmd64();
      if (this$windowsAmd64 == null ? other$windowsAmd64 != null : !this$windowsAmd64.equals(other$windowsAmd64)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof PluginManifest.PluginExecutables;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $linuxAmd64 = this.getLinuxAmd64();
      result = result * PRIME + ($linuxAmd64 == null ? 43 : $linuxAmd64.hashCode());
      final java.lang.Object $darwinAmd64 = this.getDarwinAmd64();
      result = result * PRIME + ($darwinAmd64 == null ? 43 : $darwinAmd64.hashCode());
      final java.lang.Object $windowsAmd64 = this.getWindowsAmd64();
      result = result * PRIME + ($windowsAmd64 == null ? 43 : $windowsAmd64.hashCode());
      return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PluginManifest.PluginExecutables(linuxAmd64=" + this.getLinuxAmd64() + ", darwinAmd64=" + this.getDarwinAmd64() + ", windowsAmd64=" + this.getWindowsAmd64() + ")";
    }
  }


  public static class PluginSettingsSchema {
    private String header;
    private String footer;
    private PluginSetting[] settings;

    @java.lang.SuppressWarnings("all")
    public PluginSettingsSchema() {
    }

    @java.lang.SuppressWarnings("all")
    public String getHeader() {
      return this.header;
    }

    @java.lang.SuppressWarnings("all")
    public String getFooter() {
      return this.footer;
    }

    @java.lang.SuppressWarnings("all")
    public PluginSetting[] getSettings() {
      return this.settings;
    }

    @java.lang.SuppressWarnings("all")
    public void setHeader(final String header) {
      this.header = header;
    }

    @java.lang.SuppressWarnings("all")
    public void setFooter(final String footer) {
      this.footer = footer;
    }

    @java.lang.SuppressWarnings("all")
    public void setSettings(final PluginSetting[] settings) {
      this.settings = settings;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof PluginManifest.PluginSettingsSchema)) return false;
      final PluginManifest.PluginSettingsSchema other = (PluginManifest.PluginSettingsSchema) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$header = this.getHeader();
      final java.lang.Object other$header = other.getHeader();
      if (this$header == null ? other$header != null : !this$header.equals(other$header)) return false;
      final java.lang.Object this$footer = this.getFooter();
      final java.lang.Object other$footer = other.getFooter();
      if (this$footer == null ? other$footer != null : !this$footer.equals(other$footer)) return false;
      if (!java.util.Arrays.deepEquals(this.getSettings(), other.getSettings())) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof PluginManifest.PluginSettingsSchema;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $header = this.getHeader();
      result = result * PRIME + ($header == null ? 43 : $header.hashCode());
      final java.lang.Object $footer = this.getFooter();
      result = result * PRIME + ($footer == null ? 43 : $footer.hashCode());
      result = result * PRIME + java.util.Arrays.deepHashCode(this.getSettings());
      return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PluginManifest.PluginSettingsSchema(header=" + this.getHeader() + ", footer=" + this.getFooter() + ", settings=" + java.util.Arrays.deepToString(this.getSettings()) + ")";
    }
  }


  public static class PluginSetting {
    private String key;
    private String displayName;
    private String type; // enum?
    private String helpText;
    private String regenerateHelpText;
    private String placeholder;
    @JsonProperty("default")
    private String defaultValue;
    /* @since Mattermost Server 5.14 */
    private List<PluginOption> options;

    @java.lang.SuppressWarnings("all")
    public PluginSetting() {
    }

    @java.lang.SuppressWarnings("all")
    public String getKey() {
      return this.key;
    }

    @java.lang.SuppressWarnings("all")
    public String getDisplayName() {
      return this.displayName;
    }

    @java.lang.SuppressWarnings("all")
    public String getType() {
      return this.type;
    }

    @java.lang.SuppressWarnings("all")
    public String getHelpText() {
      return this.helpText;
    }

    @java.lang.SuppressWarnings("all")
    public String getRegenerateHelpText() {
      return this.regenerateHelpText;
    }

    @java.lang.SuppressWarnings("all")
    public String getPlaceholder() {
      return this.placeholder;
    }

    @java.lang.SuppressWarnings("all")
    public String getDefaultValue() {
      return this.defaultValue;
    }

    @java.lang.SuppressWarnings("all")
    public List<PluginOption> getOptions() {
      return this.options;
    }

    @java.lang.SuppressWarnings("all")
    public void setKey(final String key) {
      this.key = key;
    }

    @java.lang.SuppressWarnings("all")
    public void setDisplayName(final String displayName) {
      this.displayName = displayName;
    }

    @java.lang.SuppressWarnings("all")
    public void setType(final String type) {
      this.type = type;
    }

    @java.lang.SuppressWarnings("all")
    public void setHelpText(final String helpText) {
      this.helpText = helpText;
    }

    @java.lang.SuppressWarnings("all")
    public void setRegenerateHelpText(final String regenerateHelpText) {
      this.regenerateHelpText = regenerateHelpText;
    }

    @java.lang.SuppressWarnings("all")
    public void setPlaceholder(final String placeholder) {
      this.placeholder = placeholder;
    }

    @JsonProperty("default")
    @java.lang.SuppressWarnings("all")
    public void setDefaultValue(final String defaultValue) {
      this.defaultValue = defaultValue;
    }

    @java.lang.SuppressWarnings("all")
    public void setOptions(final List<PluginOption> options) {
      this.options = options;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof PluginManifest.PluginSetting)) return false;
      final PluginManifest.PluginSetting other = (PluginManifest.PluginSetting) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$key = this.getKey();
      final java.lang.Object other$key = other.getKey();
      if (this$key == null ? other$key != null : !this$key.equals(other$key)) return false;
      final java.lang.Object this$displayName = this.getDisplayName();
      final java.lang.Object other$displayName = other.getDisplayName();
      if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) return false;
      final java.lang.Object this$type = this.getType();
      final java.lang.Object other$type = other.getType();
      if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
      final java.lang.Object this$helpText = this.getHelpText();
      final java.lang.Object other$helpText = other.getHelpText();
      if (this$helpText == null ? other$helpText != null : !this$helpText.equals(other$helpText)) return false;
      final java.lang.Object this$regenerateHelpText = this.getRegenerateHelpText();
      final java.lang.Object other$regenerateHelpText = other.getRegenerateHelpText();
      if (this$regenerateHelpText == null ? other$regenerateHelpText != null : !this$regenerateHelpText.equals(other$regenerateHelpText)) return false;
      final java.lang.Object this$placeholder = this.getPlaceholder();
      final java.lang.Object other$placeholder = other.getPlaceholder();
      if (this$placeholder == null ? other$placeholder != null : !this$placeholder.equals(other$placeholder)) return false;
      final java.lang.Object this$defaultValue = this.getDefaultValue();
      final java.lang.Object other$defaultValue = other.getDefaultValue();
      if (this$defaultValue == null ? other$defaultValue != null : !this$defaultValue.equals(other$defaultValue)) return false;
      final java.lang.Object this$options = this.getOptions();
      final java.lang.Object other$options = other.getOptions();
      if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof PluginManifest.PluginSetting;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $key = this.getKey();
      result = result * PRIME + ($key == null ? 43 : $key.hashCode());
      final java.lang.Object $displayName = this.getDisplayName();
      result = result * PRIME + ($displayName == null ? 43 : $displayName.hashCode());
      final java.lang.Object $type = this.getType();
      result = result * PRIME + ($type == null ? 43 : $type.hashCode());
      final java.lang.Object $helpText = this.getHelpText();
      result = result * PRIME + ($helpText == null ? 43 : $helpText.hashCode());
      final java.lang.Object $regenerateHelpText = this.getRegenerateHelpText();
      result = result * PRIME + ($regenerateHelpText == null ? 43 : $regenerateHelpText.hashCode());
      final java.lang.Object $placeholder = this.getPlaceholder();
      result = result * PRIME + ($placeholder == null ? 43 : $placeholder.hashCode());
      final java.lang.Object $defaultValue = this.getDefaultValue();
      result = result * PRIME + ($defaultValue == null ? 43 : $defaultValue.hashCode());
      final java.lang.Object $options = this.getOptions();
      result = result * PRIME + ($options == null ? 43 : $options.hashCode());
      return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PluginManifest.PluginSetting(key=" + this.getKey() + ", displayName=" + this.getDisplayName() + ", type=" + this.getType() + ", helpText=" + this.getHelpText() + ", regenerateHelpText=" + this.getRegenerateHelpText() + ", placeholder=" + this.getPlaceholder() + ", defaultValue=" + this.getDefaultValue() + ", options=" + this.getOptions() + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public PluginManifest() {
  }

  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  @java.lang.SuppressWarnings("all")
  public String getName() {
    return this.name;
  }

  @java.lang.SuppressWarnings("all")
  public String getDescription() {
    return this.description;
  }

  @java.lang.SuppressWarnings("all")
  public String getVersion() {
    return this.version;
  }

  @java.lang.SuppressWarnings("all")
  public String getMinServerVersion() {
    return this.minServerVersion;
  }

  @java.lang.SuppressWarnings("all")
  public PluginServer getServer() {
    return this.server;
  }

  @java.lang.SuppressWarnings("all")
  public PluginServer getBackend() {
    return this.backend;
  }

  @java.lang.SuppressWarnings("all")
  public PluginWebapp getWebapp() {
    return this.webapp;
  }

  @java.lang.SuppressWarnings("all")
  public PluginSettingsSchema getSettingsSchema() {
    return this.settingsSchema;
  }

  @java.lang.SuppressWarnings("all")
  public String getHomepageUrl() {
    return this.homepageUrl;
  }

  @java.lang.SuppressWarnings("all")
  public String getSupportUrl() {
    return this.supportUrl;
  }

  @java.lang.SuppressWarnings("all")
  public String getIconPath() {
    return this.iconPath;
  }

  @java.lang.SuppressWarnings("all")
  public void setId(final String id) {
    this.id = id;
  }

  @java.lang.SuppressWarnings("all")
  public void setName(final String name) {
    this.name = name;
  }

  @java.lang.SuppressWarnings("all")
  public void setDescription(final String description) {
    this.description = description;
  }

  @java.lang.SuppressWarnings("all")
  public void setVersion(final String version) {
    this.version = version;
  }

  @java.lang.SuppressWarnings("all")
  public void setMinServerVersion(final String minServerVersion) {
    this.minServerVersion = minServerVersion;
  }

  @java.lang.SuppressWarnings("all")
  public void setServer(final PluginServer server) {
    this.server = server;
  }

  @java.lang.SuppressWarnings("all")
  public void setBackend(final PluginServer backend) {
    this.backend = backend;
  }

  @java.lang.SuppressWarnings("all")
  public void setWebapp(final PluginWebapp webapp) {
    this.webapp = webapp;
  }

  @java.lang.SuppressWarnings("all")
  public void setSettingsSchema(final PluginSettingsSchema settingsSchema) {
    this.settingsSchema = settingsSchema;
  }

  @java.lang.SuppressWarnings("all")
  public void setHomepageUrl(final String homepageUrl) {
    this.homepageUrl = homepageUrl;
  }

  @java.lang.SuppressWarnings("all")
  public void setSupportUrl(final String supportUrl) {
    this.supportUrl = supportUrl;
  }

  @java.lang.SuppressWarnings("all")
  public void setIconPath(final String iconPath) {
    this.iconPath = iconPath;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof PluginManifest)) return false;
    final PluginManifest other = (PluginManifest) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$version = this.getVersion();
    final java.lang.Object other$version = other.getVersion();
    if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
    final java.lang.Object this$minServerVersion = this.getMinServerVersion();
    final java.lang.Object other$minServerVersion = other.getMinServerVersion();
    if (this$minServerVersion == null ? other$minServerVersion != null : !this$minServerVersion.equals(other$minServerVersion)) return false;
    final java.lang.Object this$server = this.getServer();
    final java.lang.Object other$server = other.getServer();
    if (this$server == null ? other$server != null : !this$server.equals(other$server)) return false;
    final java.lang.Object this$backend = this.getBackend();
    final java.lang.Object other$backend = other.getBackend();
    if (this$backend == null ? other$backend != null : !this$backend.equals(other$backend)) return false;
    final java.lang.Object this$webapp = this.getWebapp();
    final java.lang.Object other$webapp = other.getWebapp();
    if (this$webapp == null ? other$webapp != null : !this$webapp.equals(other$webapp)) return false;
    final java.lang.Object this$settingsSchema = this.getSettingsSchema();
    final java.lang.Object other$settingsSchema = other.getSettingsSchema();
    if (this$settingsSchema == null ? other$settingsSchema != null : !this$settingsSchema.equals(other$settingsSchema)) return false;
    final java.lang.Object this$homepageUrl = this.getHomepageUrl();
    final java.lang.Object other$homepageUrl = other.getHomepageUrl();
    if (this$homepageUrl == null ? other$homepageUrl != null : !this$homepageUrl.equals(other$homepageUrl)) return false;
    final java.lang.Object this$supportUrl = this.getSupportUrl();
    final java.lang.Object other$supportUrl = other.getSupportUrl();
    if (this$supportUrl == null ? other$supportUrl != null : !this$supportUrl.equals(other$supportUrl)) return false;
    final java.lang.Object this$iconPath = this.getIconPath();
    final java.lang.Object other$iconPath = other.getIconPath();
    if (this$iconPath == null ? other$iconPath != null : !this$iconPath.equals(other$iconPath)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof PluginManifest;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $version = this.getVersion();
    result = result * PRIME + ($version == null ? 43 : $version.hashCode());
    final java.lang.Object $minServerVersion = this.getMinServerVersion();
    result = result * PRIME + ($minServerVersion == null ? 43 : $minServerVersion.hashCode());
    final java.lang.Object $server = this.getServer();
    result = result * PRIME + ($server == null ? 43 : $server.hashCode());
    final java.lang.Object $backend = this.getBackend();
    result = result * PRIME + ($backend == null ? 43 : $backend.hashCode());
    final java.lang.Object $webapp = this.getWebapp();
    result = result * PRIME + ($webapp == null ? 43 : $webapp.hashCode());
    final java.lang.Object $settingsSchema = this.getSettingsSchema();
    result = result * PRIME + ($settingsSchema == null ? 43 : $settingsSchema.hashCode());
    final java.lang.Object $homepageUrl = this.getHomepageUrl();
    result = result * PRIME + ($homepageUrl == null ? 43 : $homepageUrl.hashCode());
    final java.lang.Object $supportUrl = this.getSupportUrl();
    result = result * PRIME + ($supportUrl == null ? 43 : $supportUrl.hashCode());
    final java.lang.Object $iconPath = this.getIconPath();
    result = result * PRIME + ($iconPath == null ? 43 : $iconPath.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "PluginManifest(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", version=" + this.getVersion() + ", minServerVersion=" + this.getMinServerVersion() + ", server=" + this.getServer() + ", backend=" + this.getBackend() + ", webapp=" + this.getWebapp() + ", settingsSchema=" + this.getSettingsSchema() + ", homepageUrl=" + this.getHomepageUrl() + ", supportUrl=" + this.getSupportUrl() + ", iconPath=" + this.getIconPath() + ")";
  }
}