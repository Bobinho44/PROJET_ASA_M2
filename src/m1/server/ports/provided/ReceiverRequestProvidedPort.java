package m1.server.ports.provided;

import ASA.Message;
import ASA.impl.ComponentProvidedPortImpl;
import m1.server.configuration.ports.required.ReceiverRequestRequiredPort;

public class ReceiverRequestProvidedPort extends ComponentProvidedPortImpl {

	public static final ReceiverRequestProvidedPort INSTANCE = new ReceiverRequestProvidedPort();
	
	private final ReceiverRequestRequiredPort receiverRequestRequiredPort = ReceiverRequestRequiredPort.INSTANCE;
	
	public ReceiverRequestProvidedPort() {
		this.setBinding(this.receiverRequestRequiredPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.receiverRequestRequiredPort.transfer(message);
	}
	
}