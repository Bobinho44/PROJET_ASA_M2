package m1.client.interfaces;

import ASA.impl.ComponentProvidedInterfaceImpl;
import m1.client.ports.provided.SenderRequestProvidedPort;

public class ClientProvidedInterface extends ComponentProvidedInterfaceImpl {

	public static final ClientProvidedInterface INSTANCE = new ClientProvidedInterface();
	
	private final SenderRequestProvidedPort senderRequestProvidedPort = SenderRequestProvidedPort.INSTANCE;
	
	public ClientProvidedInterface() {
		this.getProvidedPorts().add(this.senderRequestProvidedPort);
		
		this.senderRequestProvidedPort.setOwner(this);
	}
	
	public void createAccount(String name) {
		System.out.println(((ClientRequiredInterface) this.getOwner().getRequiredInterface()).createAccount(name));
	}
	
	public void depositMoney(String name, double amount) {		
		System.out.println(((ClientRequiredInterface) this.getOwner().getRequiredInterface()).depositMoney(name, amount));
	}
	
	public void withdrawMoney(String name, double amount) {
		System.out.println(((ClientRequiredInterface) this.getOwner().getRequiredInterface()).withdrawMoney(name, amount));
	}
	
}