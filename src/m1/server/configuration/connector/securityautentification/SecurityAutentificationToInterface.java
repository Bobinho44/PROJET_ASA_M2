package m1.server.configuration.connector.securityautentification;

import ASA.Message;
import ASA.impl.ConnectorToInterfaceImpl;
import m1.server.configuration.connector.securityautentification.roles.to.SecurityAutentificationRoleTo;

public class SecurityAutentificationToInterface extends ConnectorToInterfaceImpl {

	public static final SecurityAutentificationToInterface INSTANCE = new SecurityAutentificationToInterface();
	
	private final SecurityAutentificationRoleTo securityAutentificationRoleTo = SecurityAutentificationRoleTo.INSTANCE;
	
	public SecurityAutentificationToInterface() {
		this.getToRoles().add(this.securityAutentificationRoleTo);
		
		this.securityAutentificationRoleTo.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}