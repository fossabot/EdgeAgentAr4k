package org.ar4k.agent.core.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import org.ar4k.agent.core.Homunculus;
import org.ar4k.agent.core.data.channels.INoDataChannel;
import org.ar4k.agent.core.data.channels.IPublishSubscribeChannel;
import org.ar4k.agent.core.data.channels.IQueueChannel;
import org.ar4k.agent.core.data.messages.HealthMessage;
import org.ar4k.agent.core.interfaces.EdgeChannel;
import org.ar4k.agent.helper.HardwareHelper;
import org.ar4k.agent.logger.EdgeLogger;
import org.ar4k.agent.logger.EdgeStaticLoggerBinder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataAddressHomunculus extends DataAddress {

	private static final String TIMER_HEALTH_DATA_ADDRESS = "TimerHealthDataAddress";

	private static final EdgeLogger logger = (EdgeLogger) EdgeStaticLoggerBinder.getSingleton().getLoggerFactory()
			.getLogger(DataAddressHomunculus.class.toString());

	private static final String SYSTEM_TAG = "system";

	private static final String DIRECTORY_TAG = "directory";

	private static final String LOGGER_TAG = "logger";

	private static final String HEALTH_TAG = "health";

	private static final String COMMAND_TAG = "command-rpc";

	public DataAddressHomunculus(Homunculus homunculus) {
		super(homunculus);
	}

	// task per health
	private HealthTimer repeatedTask = new HealthTimer();

	private long delay = 35000L;
	private long period = 15000L;

	private Timer timer = new Timer(TIMER_HEALTH_DATA_ADDRESS);

	private boolean active = true;

	private Set<DataAddress> slaves = new HashSet<>();

	@Override
	public Collection<EdgeChannel> getDataChannels() {
		final Collection<EdgeChannel> myData = super.getDataChannels();
		for (final DataAddress slave : slaves) {
			myData.addAll(slave.getDataChannels());
		}
		return myData;
	}

	@Override
	public void callAddressSpaceRefresh(EdgeChannel nodeUpdated) {
		super.callAddressSpaceRefresh(nodeUpdated);
		for (final DataAddress slave : slaves) {
			slave.callAddressSpaceRefresh(nodeUpdated);
		}
	}

	@Override
	public void clearDataChannels() {
		for (final DataAddress slave : slaves) {
			slave.clearDataChannels();
		}
		super.clearDataChannels();
	}

	@Override
	public Collection<String> listChannels() {
		final Collection<String> myData = super.listChannels();
		for (final DataAddress slave : slaves) {
			myData.addAll(slave.listChannels());
		}
		return myData;
	}

	@Override
	public void close() throws Exception {
		active = false;
		timer.cancel();
		for (final DataAddress slave : slaves) {
			slave.close();
		}
		super.close();
	}

	public void firstStart(Homunculus homunculus) {
		final List<String> tagList = new ArrayList<String>();
		tagList.add(SYSTEM_TAG);
		tagList.add(DIRECTORY_TAG);
		tagList.addAll(homunculus.getTags());
		final EdgeChannel systemChannel = createOrGetDataChannel("system", INoDataChannel.class, "local JVM system",
				(String) null, null, tagList);
		tagList.add(LOGGER_TAG);
		createOrGetDataChannel("logger", IPublishSubscribeChannel.class, "logger queue", systemChannel,
				getDefaultScope(), tagList);
		tagList.remove(LOGGER_TAG);
		tagList.add(HEALTH_TAG);
		createOrGetDataChannel("health", IPublishSubscribeChannel.class, "local machine hardware and software stats",
				systemChannel, getDefaultScope(), tagList);
		tagList.remove(HEALTH_TAG);
		tagList.add(COMMAND_TAG);
		createOrGetDataChannel("command", IQueueChannel.class, "RPC interface", systemChannel, getDefaultScope(),
				tagList);
		// start health regular messages
		repeatedTask.setHomunculus(homunculus);
		timer.scheduleAtFixedRate(repeatedTask, delay, period);
	}

	public void registerSlave(DataAddress a) {
		slaves.add(a);
	}

	public void removeSlave(DataAddress a) {
		slaves.remove(a);
	}

	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	private class HealthTimer extends TimerTask {

		private transient Homunculus homunculus = null;

		public void setHomunculus(Homunculus homunculus) {
			this.homunculus = homunculus;
		}

		@Override
		public void run() {
			if (active)
				try {
					sendEvent(HardwareHelper.getSystemInfo().getHealthIndicator());
				} catch (final Exception e) {
					logger.logException(e);
				}
		}

		private void sendEvent(Map<String, Object> healthMessage) {
			try {
				if (homunculus == null && Homunculus.getApplicationContext() != null
						&& Homunculus.getApplicationContext().getBean(Homunculus.class) != null
						&& Homunculus.getApplicationContext().getBean(Homunculus.class).getDataAddress() != null) {
					homunculus = Homunculus.getApplicationContext().getBean(Homunculus.class);
				}
			} catch (final Exception ee) {
				logger.debug(EdgeLogger.stackTraceToString(ee));
			}
			if (homunculus != null && homunculus.getDataAddress() != null
					&& homunculus.getDataAddress().getChannel("health") != null) {
				final HealthMessage<String> messageObject = new HealthMessage<>();
				messageObject.setPayload(gson.toJson(healthMessage));
				((IPublishSubscribeChannel) homunculus.getDataAddress().getChannel("health")).send(messageObject);
			}
		}
	};

	public Set<DataAddress> getSlaves() {
		return slaves;
	}
}
