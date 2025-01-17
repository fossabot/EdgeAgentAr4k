package org.ar4k.agent.bootstrap.recipes;

import java.io.IOException;
import java.util.UUID;

import org.ar4k.agent.bootstrap.BootstrapRecipe;
import org.ar4k.agent.logger.EdgeLogger;
import org.ar4k.agent.logger.EdgeStaticLoggerBinder;

public class BootstrapViaLocalConsole extends BootstrapRecipe {

	private static final EdgeLogger logger = (EdgeLogger) EdgeStaticLoggerBinder.getSingleton().getLoggerFactory()
			.getLogger(BootstrapViaLocalConsole.class.toString());
	private Process process = null;
	private boolean setupOk = false;

	private final String killUuid = UUID.randomUUID().toString();

	@Override
	public void close() throws Exception {
	}

	@Override
	public void setUp(String serverPort, String keystoreFile, String keystoreCa, String keystoreBeacon,
			String adminPassword, String discoveryPort, String beaconserverPort) {
		copyTemplateToLocalStorage();
		copyMasterKeyToLocalStorage();
		generateAgentJar();
		generateBeaconServerConfig(serverPort, keystoreFile, keystoreCa, keystoreBeacon, adminPassword, discoveryPort,
				beaconserverPort);
		setupOk = true;
	}

	@Override
	public void start() {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder(
					shellInterface.getRunningProject().getFileSystemPath().toFile().getAbsolutePath() + "/app.jar",
					"--spring.shell.interactive.enabled=false", killUuid);
			process = processBuilder.start();
		} catch (IOException e) {
			logger.logException(e);
		}
	}

	@Override
	public void stop() {
		if (process != null) {
			process.destroyForcibly();
			process = null;
			final String[] killCommand = { "pkill", "-f", killUuid };
			ProcessBuilder processBuilder = new ProcessBuilder(killCommand);
			try {
				processBuilder.start();
			} catch (IOException e) {
				logger.logException(e);
			}
		}
	}

	@Override
	public void destroy() {
		if (process != null) {
			stop();
		}
	}

	@Override
	public boolean isSetupRequired() {
		return !setupOk;
	}

	@Override
	public boolean isStarted() {
		return process != null;
	}

	@Override
	public boolean isProviderEndpointAndAuthRequired() {
		return false;
	}

	@Override
	public String descriptionProviderEndpointAndAuthRequired() {
		return null;
	}

	@Override
	public void shellProviderEndpointAndAuth() {
		// not used
	}

}
