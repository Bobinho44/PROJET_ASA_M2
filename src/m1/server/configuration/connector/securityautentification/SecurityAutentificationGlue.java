package m1.server.configuration.connector.securityautentification;

import ASA.Message;
import ASA.impl.GlueImpl;

public class SecurityAutentificationGlue extends GlueImpl {

	public static final SecurityAutentificationGlue INSTANCE = new SecurityAutentificationGlue();
	
	private final SecurityAutentificationFromInterface securityAutentificationFromInterface = SecurityAutentificationFromInterface.INSTANCE;
	private final SecurityAutentificationToInterface securityAutentificationToInterface = SecurityAutentificationToInterface.INSTANCE;
	
	public SecurityAutentificationGlue() {
		this.setFromInterface(this.securityAutentificationFromInterface);
		this.setToInterface(this.securityAutentificationToInterface);
		
		this.securityAutentificationFromInterface.setOwner(this);
		this.securityAutentificationToInterface.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityAutentificationFromInterface.transfer(message);
	}
	
}