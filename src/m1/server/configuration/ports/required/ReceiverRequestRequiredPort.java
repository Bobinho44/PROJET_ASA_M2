package m1.server.configuration.ports.required;

import ASA.Message;
import ASA.impl.ConfigurationRequiredPortImpl;
import m1.server.configuration.component.connectionmanager.ports.provided.ExternalSocketProvidedPort;

public class ReceiverRequestRequiredPort extends ConfigurationRequiredPortImpl {

	public static final ReceiverRequestRequiredPort INSTANCE = new ReceiverRequestRequiredPort();
	
	private final ExternalSocketProvidedPort externalSocketProvidedPort = ExternalSocketProvidedPort.INSTANCE;
	
	public ReceiverRequestRequiredPort() {
		this.setBinding(this.externalSocketProvidedPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.externalSocketProvidedPort.transfer(message);
	}
	
}