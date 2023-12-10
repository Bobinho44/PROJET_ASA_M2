package m1.server.configuration.component.connectionmanager.ports.required;

import ASA.Message;
import ASA.impl.ComponentRequiredPortImpl;
import m1.server.configuration.connector.queryinterrogation.roles.to.QueryInterrogationRoleTo;

public class QueryInterrogationRequiredPort extends ComponentRequiredPortImpl {

	public static final QueryInterrogationRequiredPort INSTANCE = new QueryInterrogationRequiredPort();
	
	private final QueryInterrogationRoleTo queryInterrogationRoleTo = QueryInterrogationRoleTo.INSTANCE;
			
	public QueryInterrogationRequiredPort() {
		this.setAttachement(this.queryInterrogationRoleTo);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.queryInterrogationRoleTo.transfer(message);
	}
	
}