package org.ar4k.agent.core.interfaces;

import org.ar4k.agent.core.Homunculus;
import org.ar4k.agent.core.data.DataAddress;
import org.ar4k.agent.exception.ServiceInitException;
import org.ar4k.agent.exception.ServiceWatchDogException;
import org.json.JSONObject;

/**
 * interfaccia da implementare per un servizio gestito
 * 
 * @author andrea
 *
 */
public interface EdgeComponent extends AutoCloseable {

  public static enum ServiceStatus {
    INIT, STARTING, STAMINAL, RUNNING, STOPPED, KILLED, FAULT
  }

  ServiceStatus updateAndGetStatus() throws ServiceWatchDogException;

  void init() throws ServiceInitException;

  void kill();

  Homunculus getHomunculus();

  DataAddress getDataAddress();

  void setDataAddress(DataAddress dataAddress);

  void setHomunculus(Homunculus homunculus);

  ServiceConfig getConfiguration();

  void setConfiguration(ServiceConfig configuration);

  JSONObject getDescriptionJson();

}
