package m1.server.configuration.connector.securitymanagement;

import ASA.Message;
import ASA.impl.ConnectorFromInterfaceImpl;
import m1.server.configuration.connector.securitymanagement.roles.from.SecurityManagementRoleFrom;

public class SecurityManagementFromInterface extends ConnectorFromInterfaceImpl {

	public static final SecurityManagementFromInterface INSTANCE = new SecurityManagementFromInterface();

	private final SecurityManagementRoleFrom securityManagementRoleFrom = SecurityManagementRoleFrom.INSTANCE;
	
	public SecurityManagementFromInterface() {
		this.getFromRoles().add(this.securityManagementRoleFrom);
		
		this.securityManagementRoleFrom.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityManagementRoleFrom.transfer(message);
	}
	
}