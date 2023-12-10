package m1.server.configuration.component.securitymanager.ports.required;

import ASA.Message;
import ASA.impl.ComponentRequiredPortImpl;
import m1.server.configuration.connector.securitymanagement.roles.to.SecurityManagementRoleTo;

public class SecurityManagementRequiredPort extends ComponentRequiredPortImpl {

	public static final SecurityManagementRequiredPort INSTANCE = new SecurityManagementRequiredPort();
	
	private final SecurityManagementRoleTo securityManagementRoleTo = SecurityManagementRoleTo.INSTANCE;
			
	public SecurityManagementRequiredPort() {
		this.setAttachement(this.securityManagementRoleTo);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityManagementRoleTo.transfer(message);
	}
	
}