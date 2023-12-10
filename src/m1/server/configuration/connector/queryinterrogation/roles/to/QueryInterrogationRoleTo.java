package m1.server.configuration.connector.queryinterrogation.roles.to;

import ASA.Message;
import ASA.impl.RoleToImpl;

public class QueryInterrogationRoleTo extends RoleToImpl {

	public static final QueryInterrogationRoleTo INSTANCE = new QueryInterrogationRoleTo();
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}