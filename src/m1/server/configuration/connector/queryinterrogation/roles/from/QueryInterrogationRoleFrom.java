package m1.server.configuration.connector.queryinterrogation.roles.from;

import ASA.Message;
import ASA.impl.RoleFromImpl;
import m1.server.configuration.component.database.ports.provided.QueryInterrogationProvidedPort;

public class QueryInterrogationRoleFrom extends RoleFromImpl {

	public static final QueryInterrogationRoleFrom INSTANCE = new QueryInterrogationRoleFrom();
	
	private final QueryInterrogationProvidedPort queryInterrogationProvidedPort = QueryInterrogationProvidedPort.INSTANCE;
	
	public QueryInterrogationRoleFrom() {
		this.setAttachement(this.queryInterrogationProvidedPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.queryInterrogationProvidedPort.transfer(message);
	}
	
}
