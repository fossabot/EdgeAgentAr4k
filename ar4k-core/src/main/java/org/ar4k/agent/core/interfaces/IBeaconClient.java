package org.ar4k.agent.core.interfaces;

import java.util.List;

import org.ar4k.agent.config.EdgeConfig;
import org.ar4k.agent.config.network.NetworkConfig;
import org.ar4k.agent.config.network.NetworkTunnel;
import org.ar4k.agent.core.RpcConversation;
import org.ar4k.agent.rpc.process.xpra.XpraSessionProcess;
import org.ar4k.agent.tunnels.http2.beacon.client.RemoteBeaconRpcExecutor;
import org.ar4k.agent.tunnels.http2.grpc.beacon.Agent;
import org.ar4k.agent.tunnels.http2.grpc.beacon.AgentRequest;
import org.ar4k.agent.tunnels.http2.grpc.beacon.CompleteCommandReply;
import org.ar4k.agent.tunnels.http2.grpc.beacon.ConfigReply;
import org.ar4k.agent.tunnels.http2.grpc.beacon.ElaborateMessageReply;
import org.ar4k.agent.tunnels.http2.grpc.beacon.ListCommandsReply;
import org.ar4k.agent.tunnels.http2.grpc.beacon.ListStringReply;
import org.ar4k.agent.tunnels.http2.grpc.beacon.RpcServiceV1Grpc.RpcServiceV1BlockingStub;
import org.ar4k.agent.tunnels.http2.grpc.beacon.RpcServiceV1Grpc.RpcServiceV1Stub;
import org.ar4k.agent.tunnels.http2.grpc.beacon.StatusValue;

import io.grpc.ConnectivityState;

public interface IBeaconClient {

	void closeNetworkTunnel(long targetId);

	String getAgentUniqueName();

	RpcServiceV1Stub getAsyncStub();

	RpcServiceV1BlockingStub getBlockingStub();

	ConfigReply getConfigFromAgent(String agentId);

	String getDiscoveryFilter();

	int getDiscoveryPort();

	RpcConversation getLocalExecutor();

	NetworkTunnel getNewNetworkTunnel(String agentId, NetworkConfig config);

	int getPollingFreq();

	StatusValue getRegistrationStatus();

	RemoteBeaconRpcExecutor getRemoteExecutor(Agent agent);

	List<RemoteBeaconRpcExecutor> getRemoteExecutors();

	String getReservedUniqueName();

	ListStringReply getRuntimeProvides(String agentId);

	ListStringReply getRuntimeRequired(String agentId);

	ConnectivityState getStateConnection();

	List<NetworkTunnel> getTunnels();

	List<Agent> listAgentsConnectedToBeacon();

	ListCommandsReply listCommadsOnAgent(String agentId);

	List<AgentRequest> listProvisioningRequests();

	void removeTunnel(NetworkTunnel toRemove);

	ElaborateMessageReply runCommadsOnAgent(String agentId, String command);

	CompleteCommandReply runCompletitionOnAgent(String agentUniqueName, String command);

	ConfigReply sendConfigToAgent(String agentId, EdgeConfig newConfig);

	void sendException(Exception message);

	void sendLoggerLine(String message, String level);

	void setDiscoveryFilter(String discoveryFilter);

	void setDiscoveryPort(int discoveryPort);

	void setRemoteExecutors(List<RemoteBeaconRpcExecutor> remoteExecutors);

	void setReservedUniqueName(String reservedUniqueName);

	void shutdown() throws InterruptedException;

	XpraSessionProcess startXpraService(String executorLabel, int port, String cmd);

}