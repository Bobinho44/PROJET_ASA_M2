package m1.server.configuration.connector.securityautentification;

import ASA.impl.ConnectorImpl;

public class SecurityAutentificationConnector extends ConnectorImpl {

	public static final SecurityAutentificationConnector INSTANCE = new SecurityAutentificationConnector();

	private final SecurityAutentificationGlue securityAutentificationGlue = SecurityAutentificationGlue.INSTANCE;
	
	public SecurityAutentificationConnector() {
		this.setGlue(this.securityAutentificationGlue);
	}
	
}