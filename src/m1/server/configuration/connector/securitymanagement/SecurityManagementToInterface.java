package m1.server.configuration.connector.securitymanagement;

import ASA.Message;
import ASA.impl.ConnectorToInterfaceImpl;
import m1.server.configuration.connector.securitymanagement.roles.to.SecurityManagementRoleTo;

public class SecurityManagementToInterface extends ConnectorToInterfaceImpl {

	public static final SecurityManagementToInterface INSTANCE = new SecurityManagementToInterface();
	
	private final SecurityManagementRoleTo securityManagementRoleTo = SecurityManagementRoleTo.INSTANCE;
	
	public SecurityManagementToInterface() {
		this.getToRoles().add(this.securityManagementRoleTo);
		
		this.securityManagementRoleTo.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}