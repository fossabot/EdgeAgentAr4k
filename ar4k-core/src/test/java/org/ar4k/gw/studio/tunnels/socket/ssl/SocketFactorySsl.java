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
package org.ar4k.gw.studio.tunnels.socket.ssl;

import org.ar4k.agent.core.Homunculus;
import org.ar4k.agent.core.data.DataAddress;
import org.ar4k.agent.core.interfaces.ServiceConfig;
import org.ar4k.agent.exception.ServiceWatchDogException;
import org.ar4k.gw.studio.tunnels.socket.AbstractSocketFactoryComponent;
import org.ar4k.gw.studio.tunnels.socket.AbstractSocketFactoryConfig;
import org.json.JSONObject;

/*
 * @author Andrea Ambrosini Rossonet s.c.a r.l. andrea.ambrosini@rossonet.com
 *
 *         Servizio tunnel SSL.
 */

// TODO TEST scrivere SocketFactorySsl
public class SocketFactorySsl extends AbstractSocketFactoryComponent {

  // iniettata vedi set/get
  private SocketFactorySslConfig configuration = null;

  @Override
  public void init() {
    socketFactory = new SslSocketFactory(configuration);
  }

  @Override
  public void kill() {
    socketFactory = null;
  }

  @Override
  public AbstractSocketFactoryConfig getConfiguration() {
    return configuration;
  }

  public void setConfiguration(SocketFactorySslConfig configuration) {
    this.configuration = configuration;
  }

  @Override
  public ServiceStatus updateAndGetStatus() throws ServiceWatchDogException {
    // Auto-generated method stub
    return null;
  }

  @Override
  public Homunculus getHomunculus() {
    // Auto-generated method stub
    return null;
  }

  @Override
  public DataAddress getDataAddress() {
    // Auto-generated method stub
    return null;
  }

  @Override
  public void setDataAddress(DataAddress dataAddress) {
    // Auto-generated method stub

  }

  @Override
  public void setHomunculus(Homunculus homunculus) {
    // Auto-generated method stub

  }

  @Override
  public void setConfiguration(ServiceConfig configuration) {
    // Auto-generated method stub

  }

  @Override
  public JSONObject getDescriptionJson() {
    // Auto-generated method stub
    return null;
  }
}
