package m1.server.configuration.connector.checkquery;

import ASA.Message;
import ASA.impl.ConnectorToInterfaceImpl;
import m1.server.configuration.connector.checkquery.roles.to.CheckQueryRoleTo;

public class CheckQueryToInterface extends ConnectorToInterfaceImpl {

	public static final CheckQueryToInterface INSTANCE = new CheckQueryToInterface();
	
	private final CheckQueryRoleTo checkQueryRoleTo = CheckQueryRoleTo.INSTANCE;
	
	public CheckQueryToInterface() {
		this.getToRoles().add(this.checkQueryRoleTo);
		
		this.checkQueryRoleTo.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}