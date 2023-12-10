package m1.server.configuration.connector.securitycheck.roles.from;

import ASA.Message;
import ASA.impl.RoleFromImpl;
import m1.server.configuration.component.connectionmanager.ports.provided.SecurityCheckProvidedPort;

public class SecurityCheckRoleFrom extends RoleFromImpl {

	public static final SecurityCheckRoleFrom INSTANCE = new SecurityCheckRoleFrom();

	private final SecurityCheckProvidedPort securityCheckProvidedPort = SecurityCheckProvidedPort.INSTANCE;
	
	public SecurityCheckRoleFrom() {
		this.setAttachement(this.securityCheckProvidedPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityCheckProvidedPort.transfer(message);
	}
	
}