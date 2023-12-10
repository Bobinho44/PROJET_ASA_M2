package m1.server.configuration.connector.securityautentification;

import ASA.Message;
import ASA.impl.ConnectorFromInterfaceImpl;
import m1.server.configuration.connector.securityautentification.roles.from.SecurityAutentificationRoleFrom;

public class SecurityAutentificationFromInterface extends ConnectorFromInterfaceImpl {

	public static final SecurityAutentificationFromInterface INSTANCE = new SecurityAutentificationFromInterface();

	private final SecurityAutentificationRoleFrom securityAutentificationRoleFrom = SecurityAutentificationRoleFrom.INSTANCE;
	
	public SecurityAutentificationFromInterface() {
		this.getFromRoles().add(this.securityAutentificationRoleFrom);
		
		this.securityAutentificationRoleFrom.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityAutentificationRoleFrom.transfer(message);
	}
	
}