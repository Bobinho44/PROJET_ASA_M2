package m1.server.configuration.connector.securitycheck;

import ASA.Message;
import ASA.impl.ConnectorToInterfaceImpl;
import m1.server.configuration.connector.securitycheck.roles.to.SecurityCheckRoleTo;

public class SecurityCheckToInterface extends ConnectorToInterfaceImpl {

	public static final SecurityCheckToInterface INSTANCE = new SecurityCheckToInterface();
	
	private final SecurityCheckRoleTo securityCheckRoleTo = SecurityCheckRoleTo.INSTANCE;
	
	public SecurityCheckToInterface() {
		this.getToRoles().add(this.securityCheckRoleTo);
		
		this.securityCheckRoleTo.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}