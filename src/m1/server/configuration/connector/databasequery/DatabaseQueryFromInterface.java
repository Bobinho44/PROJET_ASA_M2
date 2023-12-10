package m1.server.configuration.connector.databasequery;

import ASA.Message;
import ASA.impl.ConnectorFromInterfaceImpl;
import m1.server.configuration.connector.databasequery.roles.from.DatabaseQueryRoleFrom;

public class DatabaseQueryFromInterface extends ConnectorFromInterfaceImpl {

	public static final DatabaseQueryFromInterface INSTANCE = new DatabaseQueryFromInterface();

	private final DatabaseQueryRoleFrom databaseQueryRoleFrom = DatabaseQueryRoleFrom.INSTANCE;
	
	public DatabaseQueryFromInterface() {
		this.getFromRoles().add(this.databaseQueryRoleFrom);

		this.databaseQueryRoleFrom.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.databaseQueryRoleFrom.transfer(message);
	}
	
}