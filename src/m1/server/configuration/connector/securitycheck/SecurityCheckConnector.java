package m1.server.configuration.connector.securitycheck;

import ASA.impl.ConnectorImpl;

public class SecurityCheckConnector extends ConnectorImpl {

	public static final SecurityCheckConnector INSTANCE = new SecurityCheckConnector();

	private final SecurityCheckGlue securityCheckGlue = SecurityCheckGlue.INSTANCE;
	
	public SecurityCheckConnector() {
		this.setGlue(this.securityCheckGlue);
	}
	
}