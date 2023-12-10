package m1.server.configuration.connector.securitymanagement.roles.to;

import ASA.Message;
import ASA.impl.RoleToImpl;

public class SecurityManagementRoleTo extends RoleToImpl {

	public static final SecurityManagementRoleTo INSTANCE = new SecurityManagementRoleTo();
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}