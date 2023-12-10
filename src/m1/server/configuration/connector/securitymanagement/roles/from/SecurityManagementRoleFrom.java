package m1.server.configuration.connector.securitymanagement.roles.from;

import ASA.Message;
import ASA.impl.RoleFromImpl;
import m1.server.configuration.component.database.ports.provided.SecurityManagementProvidedPort;

public class SecurityManagementRoleFrom extends RoleFromImpl {

	public static final SecurityManagementRoleFrom INSTANCE = new SecurityManagementRoleFrom();
	
	private final SecurityManagementProvidedPort securityManagementProvidedPort = SecurityManagementProvidedPort.INSTANCE;
	
	public SecurityManagementRoleFrom() {
		this.setAttachement(this.securityManagementProvidedPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityManagementProvidedPort.transfer(message);
	}
	
}