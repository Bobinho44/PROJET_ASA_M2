package m1.server.configuration.connector.securitycheck;

import ASA.Message;
import ASA.impl.GlueImpl;

public class SecurityCheckGlue extends GlueImpl {

	public static final SecurityCheckGlue INSTANCE = new SecurityCheckGlue();
	
	private final SecurityCheckFromInterface securityCheckFromInterface = SecurityCheckFromInterface.INSTANCE;
	private final SecurityCheckToInterface securityCheckToInterface = SecurityCheckToInterface.INSTANCE;
	
	public SecurityCheckGlue() {
		this.setFromInterface(this.securityCheckFromInterface);
		this.setToInterface(this.securityCheckToInterface);
		
		this.securityCheckFromInterface.setOwner(this);
		this.securityCheckToInterface.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityCheckFromInterface.transfer(message);
	}
	
}