package m1.server.configuration.connector.databasequery.roles.to;

import ASA.Message;
import ASA.impl.RoleToImpl;

public class DatabaseQueryRoleTo extends RoleToImpl {
	
	public static final DatabaseQueryRoleTo INSTANCE = new DatabaseQueryRoleTo();
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}