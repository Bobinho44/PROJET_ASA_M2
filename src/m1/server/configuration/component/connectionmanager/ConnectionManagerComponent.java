package m1.server.configuration.component.connectionmanager;

import ASA.impl.ComponentImpl;
import m1.server.configuration.component.connectionmanager.interfaces.ConnectionManagerProvidedInterface;
import m1.server.configuration.component.connectionmanager.interfaces.ConnectionManagerRequiredInterface;

public class ConnectionManagerComponent extends ComponentImpl {
	
	public static final ConnectionManagerComponent INSTANCE = new ConnectionManagerComponent();
	
	private final ConnectionManagerProvidedInterface connectionManagerProvidedInterface = ConnectionManagerProvidedInterface.INSTANCE;
	private final ConnectionManagerRequiredInterface connectionManagerRequiredInterface = ConnectionManagerRequiredInterface.INSTANCE;
	
	public ConnectionManagerComponent() {
		this.setProvidedInterface(connectionManagerProvidedInterface);
		this.setRequiredInterface(this.connectionManagerRequiredInterface);
		
		this.connectionManagerProvidedInterface.setOwner(this);
		this.connectionManagerRequiredInterface.setOwner(this);
	}
	
}