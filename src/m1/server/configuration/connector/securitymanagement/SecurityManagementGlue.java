package m1.server.configuration.connector.securitymanagement;

import ASA.Message;
import ASA.impl.GlueImpl;

public class SecurityManagementGlue extends GlueImpl {

	public static final SecurityManagementGlue INSTANCE = new SecurityManagementGlue();
	
	private final SecurityManagementFromInterface securityManagementFromInterface = SecurityManagementFromInterface.INSTANCE;
	private final SecurityManagementToInterface securityManagementToInterface = SecurityManagementToInterface.INSTANCE;
	
	public SecurityManagementGlue() {
		this.setFromInterface(this.securityManagementFromInterface);
		this.setToInterface(this.securityManagementToInterface);

		this.securityManagementFromInterface.setOwner(this);
		this.securityManagementToInterface.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.securityManagementFromInterface.transfer(message);
	}
	
}