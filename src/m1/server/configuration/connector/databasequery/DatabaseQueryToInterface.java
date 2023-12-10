package m1.server.configuration.connector.databasequery;

import ASA.Message;
import ASA.impl.ConnectorToInterfaceImpl;
import m1.server.configuration.connector.databasequery.roles.to.DatabaseQueryRoleTo;

public class DatabaseQueryToInterface extends ConnectorToInterfaceImpl {

	public static final DatabaseQueryToInterface INSTANCE = new DatabaseQueryToInterface();
	
	private final DatabaseQueryRoleTo databaseQueryRoleTo = DatabaseQueryRoleTo.INSTANCE;
	
	public DatabaseQueryToInterface() {
		this.getToRoles().add(this.databaseQueryRoleTo);
		
		this.databaseQueryRoleTo.setOwner(this);
	}

	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}