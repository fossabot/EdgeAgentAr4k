/**
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
package org.ar4k.agent.console;

import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.ar4k.agent.core.data.DataAddress;
import org.ar4k.agent.core.data.channels.IDirectChannel;
import org.ar4k.agent.core.data.channels.IExecutorChannel;
import org.ar4k.agent.core.data.channels.IPriorityChannel;
import org.ar4k.agent.core.data.channels.IPublishSubscribeChannel;
import org.ar4k.agent.core.data.channels.IQueueChannel;
import org.ar4k.agent.core.data.channels.IRendezvousChannel;
import org.ar4k.agent.core.data.generator.DataGeneratorConfig;
import org.ar4k.agent.core.data.generator.SingleDataGeneratorPointConfig;
import org.ar4k.agent.core.data.messages.StringMessage;
import org.ar4k.agent.helper.AbstractShellHelper;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;
import org.springframework.shell.standard.ShellOption;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author Andrea Ambrosini Rossonet s.c.a r.l. andrea.ambrosini@rossonet.com
 *
 *         Interfaccia gestione servizi dati.
 */

@ShellCommandGroup("Data Manager Commands")
@ShellComponent
//@EnableMBeanExport
//@ManagedResource(objectName = "bean:name=dataInterface", description = "Ar4k Agent Data Interface", log = true, logFile = "ar4k.log", currencyTimeLimit = 15, persistPolicy = "OnUpdate", persistPeriod = 200, persistLocation = "ar4k", persistName = "dataInterface")
@RestController
@RequestMapping("/dataInterface")
public class DataShellInterface extends AbstractShellHelper implements MessageHandler {

	private DataGeneratorConfig simulatedConfig = new DataGeneratorConfig();

	@ShellMethod(value = "Add actual simulator to the config", group = "Data Manager Commands")
	@ManagedOperation
	@ShellMethodAvailability("testSelectedConfigOk")
	public void addSimulatedConfig() {
		getWorkingConfig().pots.add(simulatedConfig);
	}

	@ShellMethod(value = "Clean simulated config", group = "Data Manager Commands")
	@ManagedOperation
	@ShellMethodAvailability("testSelectedConfigOk")
	public void cleanSimulatedConfig() {
		simulatedConfig.datas.clear();
	}

	@ShellMethod(value = "Add new nodeId to the simulated config", group = "Data Manager Commands")
	@ManagedOperation
	@ShellMethodAvailability("testSelectedConfigOk")
	public void addNewNodeIdToSimulatedConfig(
			@ShellOption(optOut = true) @Valid SingleDataGeneratorPointConfig newNodeId) {
		simulatedConfig.datas.add(newNodeId);
	}

	@ShellMethod(value = "List all data channels in Spring Integration enviroments", group = "Data Manager Commands")
	@ManagedOperation
	public Collection<String> listSpringDataChannels() {
		final Collection<String> result = homunculus.getDataAddress().listSpringIntegrationChannels();
		return result;
	}

	@ShellMethod(value = "List all managed data channels", group = "Data Manager Commands")
	@ManagedOperation
	public Collection<String> listDataChannels() {
		return homunculus.getDataAddress().listChannels();
	}

	@ShellMethod(value = "List all managed slaves", group = "Data Manager Commands")
	@ManagedOperation
	public Collection<DataAddress> listSlaveDataAddress() {
		return homunculus.getDataAddress().getSlaves();
	}

	@ShellMethod(value = "get details of a single channel", group = "Data Manager Commands")
	@ManagedOperation
	public String getDataChannelDetails(@ShellOption(help = "channel id (nodeId)") String channelId) {
		return homunculus.getDataAddress().getChannel(channelId).toString();
	}

	@ShellMethod(value = "Send a message to a channel", group = "Data Manager Commands")
	@ManagedOperation
	public void sendToDataChannel(@ShellOption(help = "channel id (nodeId)") String channelId,
			@ShellOption(help = "message to send") String message,
			@ShellOption(help = "timeout for blocking call") int timeout) {
		final StringMessage messageObject = new StringMessage();
		messageObject.setPayload(message);
		if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IPriorityChannel.class))
			((IPriorityChannel) homunculus.getDataAddress().getChannel(channelId)).send(messageObject, timeout);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IQueueChannel.class))
			((IQueueChannel) homunculus.getDataAddress().getChannel(channelId)).send(messageObject, timeout);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IRendezvousChannel.class))
			((IRendezvousChannel) homunculus.getDataAddress().getChannel(channelId)).send(messageObject, timeout);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IDirectChannel.class))
			((IDirectChannel) homunculus.getDataAddress().getChannel(channelId)).send(messageObject, timeout);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IExecutorChannel.class))
			((IExecutorChannel) homunculus.getDataAddress().getChannel(channelId)).send(messageObject, timeout);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IPublishSubscribeChannel.class))
			((IPublishSubscribeChannel) homunculus.getDataAddress().getChannel(channelId)).send(messageObject, timeout);
		else
			logger.error("can't send message to " + channelId);
	}

	@ShellMethod(value = "Register data from a channel to databag file", group = "Data Manager Commands")
	@ManagedOperation
	public void registerDataChannel(@ShellOption(help = "channel id (nodeId)") String channelId,
			@ShellOption(help = "path for file") String file,
			@ShellOption(help = "message limit for databag's file. 0 = unlimited", defaultValue = "0") long maxValues) {
		// TODO salvare databag

	}

	@ShellMethod(value = "Subscribe channel and view the output in console", group = "Data Manager Commands")
	@ManagedOperation
	public void subscribeDataChannel(@ShellOption(help = "channel id (nodeId)") String channelId) {
		if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IDirectChannel.class))
			((IDirectChannel) homunculus.getDataAddress().getChannel(channelId)).subscribe(this);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IExecutorChannel.class))
			((IExecutorChannel) homunculus.getDataAddress().getChannel(channelId)).subscribe(this);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IPublishSubscribeChannel.class))
			((IPublishSubscribeChannel) homunculus.getDataAddress().getChannel(channelId)).subscribe(this);
		else
			logger.error(channelId + " is not subscribable");
	}

	@ShellMethod(value = "Poll a message from a channel and print it", group = "Data Manager Commands")
	@ManagedOperation
	public void pollDataChannel(@ShellOption(help = "channel id (nodeId)") String channelId,
			@ShellOption(help = "timeout for blocking call") int timeout) {
		if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IPriorityChannel.class))
			System.out.println(((IPriorityChannel) homunculus.getDataAddress().getChannel(channelId)).receive(timeout)
					.getPayload().toString());
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IQueueChannel.class))
			System.out.println(((IQueueChannel) homunculus.getDataAddress().getChannel(channelId)).receive(timeout)
					.getPayload().toString());
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IRendezvousChannel.class))
			System.out.println(((IRendezvousChannel) homunculus.getDataAddress().getChannel(channelId)).receive(timeout)
					.getPayload().toString());
		else
			logger.error(channelId + " is not pollable");
	}

	@ShellMethod(value = "Unsubscribe channel", group = "Data Manager Commands")
	@ManagedOperation
	public void unsubscribeDataChannel(@ShellOption(help = "channel id (nodeId)") String channelId) {
		if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IDirectChannel.class))
			((IDirectChannel) homunculus.getDataAddress().getChannel(channelId)).unsubscribe(this);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IExecutorChannel.class))
			((IExecutorChannel) homunculus.getDataAddress().getChannel(channelId)).unsubscribe(this);
		else if (homunculus.getDataAddress().getChannel(channelId).getChannelClass().equals(IPublishSubscribeChannel.class))
			((IPublishSubscribeChannel) homunculus.getDataAddress().getChannel(channelId)).unsubscribe(this);
		else
			logger.error(channelId + " is not subscribable");
	}

	@ShellMethod(value = "Add a direct data channel to the address space", group = "Data Manager Commands")
	@ManagedOperation
	public void addDataDirectChannel(@ShellOption(help = "node name") String dataChannel,
			@ShellOption(help = "description") String description, @ShellOption(help = "tags") List<String> tags) {
		homunculus.getDataAddress().createOrGetDataChannel(dataChannel, IDirectChannel.class, description, (String) null,
				null, tags);
	}

	@ShellMethod(value = "Add a executor data channel to the address space", group = "Data Manager Commands")
	@ManagedOperation
	public void addDataExecutorChannel(@ShellOption(help = "node name") String dataChannel,
			@ShellOption(help = "description") String description, @ShellOption(help = "tags") List<String> tags) {
		homunculus.getDataAddress().createOrGetDataChannel(dataChannel, IExecutorChannel.class, description, (String) null,
				null, tags);
	}

	@ShellMethod(value = "Add a priority data channel to the address space", group = "Data Manager Commands")
	@ManagedOperation
	public void addDataPriorityChannel(@ShellOption(help = "node name") String dataChannel,
			@ShellOption(help = "description") String description, @ShellOption(help = "tags") List<String> tags) {
		homunculus.getDataAddress().createOrGetDataChannel(dataChannel, IPriorityChannel.class, description, (String) null,
				null, tags);
	}

	@ShellMethod(value = "Add a publish/subscribe  data channel to the address space", group = "Data Manager Commands")
	@ManagedOperation
	public void addDataPubSubChannel(@ShellOption(help = "node name") String dataChannel,
			@ShellOption(help = "description") String description, @ShellOption(help = "tags") List<String> tags) {
		homunculus.getDataAddress().createOrGetDataChannel(dataChannel, IPublishSubscribeChannel.class, description,
				(String) null, null, tags);
	}

	@ShellMethod(value = "Add a queue data channel to the address space", group = "Data Manager Commands")
	@ManagedOperation
	public void addDataQueueChannel(@ShellOption(help = "node name") String dataChannel,
			@ShellOption(help = "description") String description, @ShellOption(help = "tags") List<String> tags) {
		homunculus.getDataAddress().createOrGetDataChannel(dataChannel, IQueueChannel.class, description, (String) null,
				null, tags);
	}

	@ShellMethod(value = "Add a rendezvous data channel to the address space", group = "Data Manager Commands")
	@ManagedOperation
	public void addDataRendezvousChannel(@ShellOption(help = "node name") String dataChannel,
			@ShellOption(help = "description") String description, @ShellOption(help = "tags") List<String> tags) {
		homunculus.getDataAddress().createOrGetDataChannel(dataChannel, IRendezvousChannel.class, description, (String) null,
				null, tags);
	}

	@ShellMethod(value = "Remove data channel from the address space", group = "Data Manager Commands")
	@ManagedOperation
	public void removeDataChannel(@ShellOption(help = "target channel id to remove") String idChannel) {
		homunculus.getDataAddress().removeDataChannel(idChannel, true);
	}

	@ShellMethod(value = "Clear address space", group = "Data Manager Commands")
	@ManagedOperation
	public void clearDataChannelsInAddressSpace() {
		homunculus.getDataAddress().clearDataChannels();
	}

	@Override
	public void handleMessage(Message<?> message) throws MessagingException {
		System.out.println(message.getPayload().toString());
	}

}
