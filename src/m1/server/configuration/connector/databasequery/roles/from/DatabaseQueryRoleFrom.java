package m1.server.configuration.connector.databasequery.roles.from;

import ASA.Message;
import ASA.impl.RoleFromImpl;
import m1.server.configuration.component.connectionmanager.ports.provided.DatabaseQueryProvidedPort;

public class DatabaseQueryRoleFrom extends RoleFromImpl {

	public static final DatabaseQueryRoleFrom INSTANCE = new DatabaseQueryRoleFrom();
	
	private final DatabaseQueryProvidedPort databaseQueryProvidedPort = DatabaseQueryProvidedPort.INSTANCE;
	
	public DatabaseQueryRoleFrom() {
		this.setAttachement(this.databaseQueryProvidedPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.databaseQueryProvidedPort.transfer(message);
	}
	
}