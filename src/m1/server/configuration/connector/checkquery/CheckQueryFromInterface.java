package m1.server.configuration.connector.checkquery;

import ASA.Message;
import ASA.impl.ConnectorFromInterfaceImpl;
import m1.server.configuration.connector.checkquery.roles.from.CheckQueryRoleFrom;

public class CheckQueryFromInterface extends ConnectorFromInterfaceImpl {

	public static final CheckQueryFromInterface INSTANCE = new CheckQueryFromInterface();

	private final CheckQueryRoleFrom checkQueryRoleFrom = CheckQueryRoleFrom.INSTANCE;
	
	public CheckQueryFromInterface() {
		this.getFromRoles().add(this.checkQueryRoleFrom);
		
		this.checkQueryRoleFrom.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.checkQueryRoleFrom.transfer(message);
	}
	
}