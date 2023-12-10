package m1.server.configuration.component.connectionmanager.ports.required;

import ASA.Message;
import ASA.impl.ComponentRequiredPortImpl;
import m1.server.configuration.connector.securityautentification.roles.to.SecurityAutentificationRoleTo;

public class SecurityAutentificationRequiredPort extends ComponentRequiredPortImpl {

	public static final SecurityAutentificationRequiredPort INSTANCE = new SecurityAutentificationRequiredPort();
	
	private final SecurityAutentificationRoleTo securityAutentificationRoleTo = SecurityAutentificationRoleTo.INSTANCE;
			
	public SecurityAutentificationRequiredPort() {
		this.setAttachement(this.securityAutentificationRoleTo);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityAutentificationRoleTo.transfer(message);
	}
	
}