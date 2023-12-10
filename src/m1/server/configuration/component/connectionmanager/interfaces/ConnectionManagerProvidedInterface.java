package m1.server.configuration.component.connectionmanager.interfaces;

import ASA.Message;
import ASA.impl.ComponentProvidedInterfaceImpl;
import m1.server.configuration.component.connectionmanager.ports.provided.DatabaseQueryProvidedPort;
import m1.server.configuration.component.connectionmanager.ports.provided.ExternalSocketProvidedPort;
import m1.server.configuration.component.connectionmanager.ports.provided.SecurityCheckProvidedPort;

public class ConnectionManagerProvidedInterface extends ComponentProvidedInterfaceImpl {

	public static final ConnectionManagerProvidedInterface INSTANCE = new ConnectionManagerProvidedInterface();

	private final DatabaseQueryProvidedPort databaseQueryProvidedPort = DatabaseQueryProvidedPort.INSTANCE;
	private final ExternalSocketProvidedPort externalSocketProvidedPort = ExternalSocketProvidedPort.INSTANCE;
	private final SecurityCheckProvidedPort securityCheckProvidedPort = SecurityCheckProvidedPort.INSTANCE;
	
	public ConnectionManagerProvidedInterface() {
		this.getProvidedPorts().add(this.databaseQueryProvidedPort);
		this.getProvidedPorts().add(this.externalSocketProvidedPort);
		this.getProvidedPorts().add(this.securityCheckProvidedPort);

		this.databaseQueryProvidedPort.setOwner(this);
		this.externalSocketProvidedPort.setOwner(this);
		this.securityCheckProvidedPort.setOwner(this);
	}
	
	public Message createAccount(Message message) {
		return ((ConnectionManagerRequiredInterface) this.getOwner().getRequiredInterface()).createAccount(message);
	}
	
	public Message depositMoney(Message message) {
		return ((ConnectionManagerRequiredInterface) this.getOwner().getRequiredInterface()).depositMoney(message);
	}
	
	public Message withdrawMoney(Message message) {
		return ((ConnectionManagerRequiredInterface) this.getOwner().getRequiredInterface()).withdrawMoney(message);
	}
	
}