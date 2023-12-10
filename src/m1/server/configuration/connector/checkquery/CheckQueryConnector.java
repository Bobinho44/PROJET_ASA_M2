package m1.server.configuration.connector.checkquery;

import ASA.impl.ConnectorImpl;

public class CheckQueryConnector extends ConnectorImpl {

	public static final CheckQueryConnector INSTANCE = new CheckQueryConnector();

	private final CheckQueryGlue checkQueryGlue = CheckQueryGlue.INSTANCE;
	
	public CheckQueryConnector() {
		this.setGlue(this.checkQueryGlue);
	}
	
}