package m1.server.configuration.connector.securityautentification.roles.from;

import ASA.Message;
import ASA.impl.RoleFromImpl;
import m1.server.configuration.component.securitymanager.ports.provided.SecurityAutentificationProvidedPort;

public class SecurityAutentificationRoleFrom extends RoleFromImpl {
	
	public static final SecurityAutentificationRoleFrom INSTANCE = new SecurityAutentificationRoleFrom();
	
	private final SecurityAutentificationProvidedPort securityAutentificationProvidedPort = SecurityAutentificationProvidedPort.INSTANCE;
	
	public SecurityAutentificationRoleFrom() {
		this.setAttachement(this.securityAutentificationProvidedPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityAutentificationProvidedPort.transfer(message);
	}
	
}