package m1.server.configuration.connector.securitycheck.roles.to;

import ASA.Message;
import ASA.impl.RoleToImpl;

public class SecurityCheckRoleTo extends RoleToImpl {

	public static final SecurityCheckRoleTo INSTANCE = new SecurityCheckRoleTo();
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}