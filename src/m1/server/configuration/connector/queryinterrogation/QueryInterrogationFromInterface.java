package m1.server.configuration.connector.queryinterrogation;

import ASA.Message;
import ASA.impl.ConnectorFromInterfaceImpl;
import m1.server.configuration.connector.queryinterrogation.roles.from.QueryInterrogationRoleFrom;

public class QueryInterrogationFromInterface extends ConnectorFromInterfaceImpl {

	public static final QueryInterrogationFromInterface INSTANCE = new QueryInterrogationFromInterface();

	private final QueryInterrogationRoleFrom queryInterrogationRoleFrom = QueryInterrogationRoleFrom.INSTANCE;
	
	public QueryInterrogationFromInterface() {
		this.getFromRoles().add(this.queryInterrogationRoleFrom);
		
		this.queryInterrogationRoleFrom.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.queryInterrogationRoleFrom.transfer(message);
	}
	
}