package m1.server.configuration.connector.securitycheck;

import ASA.Message;
import ASA.impl.ConnectorFromInterfaceImpl;
import m1.server.configuration.connector.securitycheck.roles.from.SecurityCheckRoleFrom;

public class SecurityCheckFromInterface extends ConnectorFromInterfaceImpl {

	public static final SecurityCheckFromInterface INSTANCE = new SecurityCheckFromInterface();

	private final SecurityCheckRoleFrom securityCheckRoleFrom = SecurityCheckRoleFrom.INSTANCE;
	
	public SecurityCheckFromInterface() {
		this.getFromRoles().add(this.securityCheckRoleFrom);
		
		this.securityCheckRoleFrom.setOwner(this);
	}

	@Override
	public Message transfer(Message message) {
		return this.securityCheckRoleFrom.transfer(message);
	}
	
}