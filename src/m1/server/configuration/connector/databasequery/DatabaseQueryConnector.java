package m1.server.configuration.connector.databasequery;

import ASA.impl.ConnectorImpl;

public class DatabaseQueryConnector extends ConnectorImpl {

	public static final DatabaseQueryConnector INSTANCE = new DatabaseQueryConnector();

	private final DatabaseQueryGlue databaseQueryGlue = DatabaseQueryGlue.INSTANCE;
	
	public DatabaseQueryConnector() {
		this.setGlue(this.databaseQueryGlue);
	}
	
}