package m1.server.interfaces;

import ASA.impl.ComponentProvidedInterfaceImpl;
import m1.server.ports.provided.ReceiverRequestProvidedPort;

public class ServerProvidedInterface extends ComponentProvidedInterfaceImpl {

	public static final ServerProvidedInterface INSTANCE = new ServerProvidedInterface();
	
	private final ReceiverRequestProvidedPort receiverRequestProvidedPort = ReceiverRequestProvidedPort.INSTANCE;
	
	public ServerProvidedInterface() {
		this.getProvidedPorts().add(this.receiverRequestProvidedPort);
		
		this.receiverRequestProvidedPort.setOwner(this);
	}
	
}