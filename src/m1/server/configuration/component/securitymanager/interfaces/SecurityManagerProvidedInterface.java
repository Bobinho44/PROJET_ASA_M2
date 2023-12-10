package m1.server.configuration.component.securitymanager.interfaces;

import ASA.Message;
import ASA.impl.ComponentProvidedInterfaceImpl;
import m1.server.configuration.component.securitymanager.ports.provided.CheckQueryProvidedPort;
import m1.server.configuration.component.securitymanager.ports.provided.SecurityAutentificationProvidedPort;

public class SecurityManagerProvidedInterface extends ComponentProvidedInterfaceImpl {

	public static final SecurityManagerProvidedInterface INSTANCE = new SecurityManagerProvidedInterface();
	
	private final CheckQueryProvidedPort checkQueryProvidedPort = CheckQueryProvidedPort.INSTANCE;
	private final SecurityAutentificationProvidedPort securityAutentificationProvidedPort = SecurityAutentificationProvidedPort.INSTANCE;
	
	public SecurityManagerProvidedInterface() {
		this.getProvidedPorts().add(this.checkQueryProvidedPort);
		this.getProvidedPorts().add(this.securityAutentificationProvidedPort);
		
		this.checkQueryProvidedPort.setOwner(this);
		this.securityAutentificationProvidedPort.setOwner(this);
	}
	
	public Message canCreateAccount(Message message) {
		return ((SecurityManagerRequiredInterface) this.getOwner().getRequiredInterface()).canCreateAccount(message);
	}
	
	public Message canDepositMoney(Message message) {
		return ((SecurityManagerRequiredInterface) this.getOwner().getRequiredInterface()).canDepositMoney(message);
	}
	
	public Message canWithdrawMoney(Message message) {
		return ((SecurityManagerRequiredInterface) this.getOwner().getRequiredInterface()).canWithdrawMoney(message);
	}
	
}