package m1.server.configuration.component.securitymanager.ports.required;

import ASA.Message;
import ASA.impl.ComponentRequiredPortImpl;
import m1.server.configuration.connector.securitycheck.roles.to.SecurityCheckRoleTo;

public class SecurityCheckRequiredPort extends ComponentRequiredPortImpl {

	public static final SecurityCheckRequiredPort INSTANCE = new SecurityCheckRequiredPort();
	
	private final SecurityCheckRoleTo securityCheckRoleTo = SecurityCheckRoleTo.INSTANCE;
			
	public SecurityCheckRequiredPort() {
		this.setAttachement(this.securityCheckRoleTo);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityCheckRoleTo.transfer(message);
	}
	
}