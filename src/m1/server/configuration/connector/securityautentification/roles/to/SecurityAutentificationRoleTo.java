package m1.server.configuration.connector.securityautentification.roles.to;

import ASA.Message;
import ASA.impl.RoleToImpl;

public class SecurityAutentificationRoleTo extends RoleToImpl {

	public static final SecurityAutentificationRoleTo INSTANCE = new SecurityAutentificationRoleTo();
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}