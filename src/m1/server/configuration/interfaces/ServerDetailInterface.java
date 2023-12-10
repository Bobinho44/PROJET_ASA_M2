package m1.server.configuration.interfaces;

import ASA.impl.ConfigurationInterfaceImpl;
import m1.server.configuration.ports.required.ReceiverRequestRequiredPort;

public class ServerDetailInterface extends ConfigurationInterfaceImpl {

	public static final ServerDetailInterface INSTANCE = new ServerDetailInterface();
	
	private final ReceiverRequestRequiredPort receiverRequestRequiredPort = ReceiverRequestRequiredPort.INSTANCE;
	
	public ServerDetailInterface() {
		this.getRequiredPorts().add(this.receiverRequestRequiredPort);
		
		this.receiverRequestRequiredPort.setOwner(this);
	}
	
}