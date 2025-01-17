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
package org.ar4k.agent.opcua.client;

import java.io.Serializable;

import org.ar4k.agent.opcua.DataChangeTriggerValidator;
import org.ar4k.agent.opcua.DeadbandTypeValidator;
import org.ar4k.agent.opcua.Enumerator.DataChangeTrigger;
import org.ar4k.agent.opcua.Enumerator.DeadbandType;

import com.beust.jcommander.Parameter;

/*
 * @author Andrea Ambrosini Rossonet s.c.a r.l. andrea.ambrosini@rossonet.com
 *
 *         sottocrizione a nodo opc ua semplice o multiplo con espressione regolare
 */
public class OpcUaClientNode implements Serializable {

  private static final long serialVersionUID = 970930410169105077L;

  @Parameter(names = "--nodeRegEx", description = "Node ID or a regEx to find a list of nodes")
  public String nodeRegEx = null;

  @Parameter(names = "--polltime", description = "frequency for update")
  public int polltime = 1000;

  @Parameter(names = "--deadbandValue", description = "deadband value")
  public double deadbandValue = 0;

  @Parameter(names = "--queueSize", description = "queue size")
  public int queueSize = 10;

  @Parameter(names = "--discardOldest", description = "discard oldest")
  public boolean discardOldest = true;

  @Parameter(names = "--deadbandType", description = "dead band type for the node", validateWith = DeadbandTypeValidator.class)
  public DeadbandType deadbandType = DeadbandType.none;

  @Parameter(names = "--dataChangeTrigger", description = "data change trigger type for the node", validateWith = DataChangeTriggerValidator.class)
  public DataChangeTrigger dataChangeTrigger = DataChangeTrigger.statusOrValueOrTimestamp;

  @Parameter(names = "--internalTargetChannel", description = "internal channel to send the update from the node")
  public String readChannel = null;

  @Parameter(names = "--internalWriteInputChannel", description = "internal channel to write the data in the node")
  public String writeChannel = null;

  @Parameter(names = "--fatherOfChannels", description = "directory channel for message topics")
  public String fatherOfChannels = null;

  @Parameter(names = "--scopeOfChannels", description = "scope for the parent channel. If null take the default of the address space")
  public String scopeOfChannels = null;

}
