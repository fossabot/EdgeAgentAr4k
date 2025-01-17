/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    */
package org.ar4k.agent.spring.autoconfig;

import static org.ar4k.agent.spring.autoconfig.EdgeStarterProperties.AR4K_PREFIX;

import org.ar4k.agent.helper.ConfigHelper;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Proprità per bootstrap agente. Questa classe è utilizzata da
 * EdgeAutoConfiguration.
 *
 * @author Andrea Ambrosini
 *
 *
 */

@ConfigurationProperties(prefix = AR4K_PREFIX)
public class EdgeStarterProperties {

	public static final String AR4K_PREFIX = "ar4k";
	private String uniqueName = null;
	private String uniqueNameFile = null;
	private String confPath = ConfigHelper.USER_HOME + "/.ar4k";
	private String fileConfig = ConfigHelper.USER_HOME + "/.ar4k/default.config.base64.ar4k";
	private String webConfig = "";
	private String dnsConfig = "";
	private String baseConfig = "";
	private String fileKeystore = ConfigHelper.USER_HOME + "/.ar4k/default.keystore";
	private String webKeystore = "";
	private String dnsKeystore = "";
	private String keystoreMainAlias = "cert-agent";
	private String keystoreConfigAlias = "";
	private String keystoreBeaconAlias = "";
	private String keystorePassword = "1234";
	private String beaconCaChainPem = "xxxxx";
	private String beaconClearText = "true";
	private String adminPassword = "admin";
	private String webRegistrationEndpoint = "";
	private String dnsRegistrationEndpoint = "";
	private String beaconDiscoveryFilterString = "AR4K";
	private String beaconDiscoveryPort = "33666";
	private String fileConfigOrder = "0";
	private String webConfigOrder = "2";
	private String dnsConfigOrder = "1";
	private String baseConfigOrder = "3";
	private String threadSleep = "800";
	private String consoleOnly = "false";
	private String animaDatastoreFileName = "data_map";
	private String test = "true";
	private String logoUrl = "/static/img/ar4k.png";
	private String showRegistrationCode = "true";

	public String getConfPath() {
		return confPath;
	}

	public void setConfPath(String confPath) {
		this.confPath = confPath;
	}

	public String getFileConfig() {
		return fileConfig;
	}

	public void setFileConfig(String fileConfig) {
		this.fileConfig = fileConfig;
	}

	public String getWebConfig() {
		return webConfig;
	}

	public void setWebConfig(String webConfig) {
		this.webConfig = webConfig;
	}

	public String getDnsConfig() {
		return dnsConfig;
	}

	public void setDnsConfig(String dnsConfig) {
		this.dnsConfig = dnsConfig;
	}

	public String getBaseConfig() {
		return baseConfig;
	}

	public void setBaseConfig(String baseConfig) {
		this.baseConfig = baseConfig;
	}

	public String getFileKeystore() {
		return fileKeystore;
	}

	public void setFileKeystore(String fileKeystore) {
		this.fileKeystore = fileKeystore;
	}

	public String getWebKeystore() {
		return webKeystore;
	}

	public void setWebKeystore(String webKeystore) {
		this.webKeystore = webKeystore;
	}

	public String getDnsKeystore() {
		return dnsKeystore;
	}

	public void setDnsKeystore(String dnsKeystore) {
		this.dnsKeystore = dnsKeystore;
	}

	public String getKeystoreMainAlias() {
		return keystoreMainAlias;
	}

	public void setKeystoreMainAlias(String keystoreMainAlias) {
		this.keystoreMainAlias = keystoreMainAlias;
	}

	public String getKeystorePassword() {
		return keystorePassword;
	}

	public void setKeystorePassword(String keystorePassword) {
		this.keystorePassword = keystorePassword;
	}

	public String getBeaconCaChainPem() {
		return beaconCaChainPem;
	}

	public void setBeaconCaChainPem(String beaconCaChainPem) {
		this.beaconCaChainPem = beaconCaChainPem;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getWebRegistrationEndpoint() {
		return webRegistrationEndpoint;
	}

	public void setWebRegistrationEndpoint(String webRegistrationEndpoint) {
		this.webRegistrationEndpoint = webRegistrationEndpoint;
	}

	public String getDnsRegistrationEndpoint() {
		return dnsRegistrationEndpoint;
	}

	public void setDnsRegistrationEndpoint(String dnsRegistrationEndpoint) {
		this.dnsRegistrationEndpoint = dnsRegistrationEndpoint;
	}

	public String getFileConfigOrder() {
		return fileConfigOrder;
	}

	public void setFileConfigOrder(String fileConfigOrder) {
		this.fileConfigOrder = fileConfigOrder;
	}

	public String getWebConfigOrder() {
		return webConfigOrder;
	}

	public void setWebConfigOrder(String webConfigOrder) {
		this.webConfigOrder = webConfigOrder;
	}

	public String getDnsConfigOrder() {
		return dnsConfigOrder;
	}

	public void setDnsConfigOrder(String dnsConfigOrder) {
		this.dnsConfigOrder = dnsConfigOrder;
	}

	public String getBaseConfigOrder() {
		return baseConfigOrder;
	}

	public void setBaseConfigOrder(String baseConfigOrder) {
		this.baseConfigOrder = baseConfigOrder;
	}

	public String getThreadSleep() {
		return threadSleep;
	}

	public void setThreadSleep(String threadSleep) {
		this.threadSleep = threadSleep;
	}

	public String isConsoleOnly() {
		return consoleOnly;
	}

	public void setConsoleOnly(String consoleOnly) {
		this.consoleOnly = consoleOnly;
	}

	public String isTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getBeaconDiscoveryFilterString() {
		return beaconDiscoveryFilterString;
	}

	public void setBeaconDiscoveryFilterString(String beaconDiscoveryFilterString) {
		this.beaconDiscoveryFilterString = beaconDiscoveryFilterString;
	}

	public String getBeaconDiscoveryPort() {
		return beaconDiscoveryPort;
	}

	public void setBeaconDiscoveryPort(String beaconDiscoveryPort) {
		this.beaconDiscoveryPort = beaconDiscoveryPort;
	}

	public String getKeystoreConfigAlias() {
		return keystoreConfigAlias;
	}

	public void setKeystoreConfigAlias(String keystoreConfigAlias) {
		this.keystoreConfigAlias = keystoreConfigAlias;
	}

	public String getKeystoreBeaconAlias() {
		return keystoreBeaconAlias;
	}

	public void setKeystoreBeaconAlias(String keystoreBeaconAlias) {
		this.keystoreBeaconAlias = keystoreBeaconAlias;
	}

	public String getBeaconClearText() {
		return beaconClearText;
	}

	public void setBeaconClearText(String beaconClearText) {
		this.beaconClearText = beaconClearText;
	}

	public String getHomunculusDatastoreFileName() {
		return animaDatastoreFileName;
	}

	public void setAnimaDatastoreFileName(String animaDatastore) {
		this.animaDatastoreFileName = animaDatastore;
	}

	public String getUniqueName() {
		return uniqueName;
	}

	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}

	public String getUniqueNameFile() {
		return uniqueNameFile;
	}

	public void setUniqueNameFile(String uniqueNameFile) {
		this.uniqueNameFile = uniqueNameFile;
	}

	public String isShowRegistrationCode() {
		return showRegistrationCode;
	}

	public synchronized void setShowRegistrationCode(String showRegistrationCode) {
		this.showRegistrationCode = showRegistrationCode;
	}

}
