package m1.server.configuration.connector.checkquery.roles.to;

import ASA.Message;
import ASA.impl.RoleToImpl;

public class CheckQueryRoleTo extends RoleToImpl {

	public static final CheckQueryRoleTo INSTANCE = new CheckQueryRoleTo();
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}