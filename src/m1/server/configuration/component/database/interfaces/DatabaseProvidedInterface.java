package m1.server.configuration.component.database.interfaces;

import ASA.Message;
import ASA.impl.ComponentProvidedInterfaceImpl;
import m1.server.configuration.component.database.ports.provided.QueryInterrogationProvidedPort;
import m1.server.configuration.component.database.ports.provided.SecurityManagementProvidedPort;

public class DatabaseProvidedInterface extends ComponentProvidedInterfaceImpl {

	public static final DatabaseProvidedInterface INSTANCE = new DatabaseProvidedInterface();
	
	private final QueryInterrogationProvidedPort queryInterrogationProvidedPort = QueryInterrogationProvidedPort.INSTANCE;
	private final SecurityManagementProvidedPort securityManagementProvidedPort = SecurityManagementProvidedPort.INSTANCE;
	
	public DatabaseProvidedInterface() {
		this.getProvidedPorts().add(this.queryInterrogationProvidedPort);
		this.getProvidedPorts().add(this.securityManagementProvidedPort);
		
		this.queryInterrogationProvidedPort.setOwner(this);
		this.securityManagementProvidedPort.setOwner(this);
	}
	
	public Message isFreeAccount(Message message) {
		return ((DatabaseRequiredInterface) this.getOwner().getRequiredInterface()).isFreeAccount(message);
	}
	
	public Message hasAccount(Message message) {
		return ((DatabaseRequiredInterface) this.getOwner().getRequiredInterface()).hasAccount(message);
	}
	
	public Message hasMoney(Message message) {
		return ((DatabaseRequiredInterface) this.getOwner().getRequiredInterface()).hasMoney(message);
	}
	
	public Message registerAccount(Message message) {
		return ((DatabaseRequiredInterface) this.getOwner().getRequiredInterface()).registerAccount(message);
	}
	
	public Message addToBalance(Message message) {
		return ((DatabaseRequiredInterface) this.getOwner().getRequiredInterface()).addToBalance(message);
	}
	
	public Message removeFromBalance(Message message) {
		return ((DatabaseRequiredInterface) this.getOwner().getRequiredInterface()).removeFromBalance(message);
	}
	
}