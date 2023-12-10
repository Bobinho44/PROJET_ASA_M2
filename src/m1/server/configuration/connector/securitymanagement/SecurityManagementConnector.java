package m1.server.configuration.connector.securitymanagement;

import ASA.impl.ConnectorImpl;

public class SecurityManagementConnector extends ConnectorImpl {

	public static final SecurityManagementConnector INSTANCE = new SecurityManagementConnector();

	private final SecurityManagementGlue securityManagementGlue = SecurityManagementGlue.INSTANCE;
	
	public SecurityManagementConnector() {
		this.setGlue(this.securityManagementGlue);
	}
	
}