package m1.server.configuration.connector.queryinterrogation;

import ASA.Message;
import ASA.impl.ConnectorToInterfaceImpl;
import m1.server.configuration.connector.queryinterrogation.roles.to.QueryInterrogationRoleTo;

public class QueryInterrogationToInterface extends ConnectorToInterfaceImpl {

	public static final QueryInterrogationToInterface INSTANCE = new QueryInterrogationToInterface();
	
	private final QueryInterrogationRoleTo queryInterrogationRoleTo = QueryInterrogationRoleTo.INSTANCE;
	
	public QueryInterrogationToInterface() {
		this.getToRoles().add(this.queryInterrogationRoleTo);
		
		this.queryInterrogationRoleTo.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}