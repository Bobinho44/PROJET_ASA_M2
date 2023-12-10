package m1.server.configuration.component.database.ports.required;

import ASA.Message;
import ASA.impl.ComponentRequiredPortImpl;
import m1.server.configuration.connector.databasequery.roles.to.DatabaseQueryRoleTo;

public class DatabaseQueryRequiredPort extends ComponentRequiredPortImpl {

	public static final DatabaseQueryRequiredPort INSTANCE = new DatabaseQueryRequiredPort();
	
	private final DatabaseQueryRoleTo databaseQueryRoleTo = DatabaseQueryRoleTo.INSTANCE;
			
	public DatabaseQueryRequiredPort() {
		this.setAttachement(this.databaseQueryRoleTo);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.databaseQueryRoleTo.transfer(message);
	}
	
}