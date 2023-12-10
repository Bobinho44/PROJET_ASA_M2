package m1.client;

import ASA.impl.ComponentImpl;
import m1.client.interfaces.ClientProvidedInterface;
import m1.client.interfaces.ClientRequiredInterface;

public class ClientComponent extends ComponentImpl {
	
	public static final ClientComponent INSTANCE = new ClientComponent();
	
	private final ClientRequiredInterface clientRequiredInterface = ClientRequiredInterface.INSTANCE;
	private final ClientProvidedInterface clientProvidedInterface = ClientProvidedInterface.INSTANCE;
	
	public ClientComponent() {
		this.setRequiredInterface(this.clientRequiredInterface);
		this.setProvidedInterface(this.clientProvidedInterface);
		
		this.clientRequiredInterface.setOwner(this);
		this.clientProvidedInterface.setOwner(this);
	}
	
}