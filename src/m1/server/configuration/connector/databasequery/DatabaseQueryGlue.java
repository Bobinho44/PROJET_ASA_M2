package m1.server.configuration.connector.databasequery;

import ASA.Message;
import ASA.impl.GlueImpl;

public class DatabaseQueryGlue extends GlueImpl {

	public static final DatabaseQueryGlue INSTANCE = new DatabaseQueryGlue();
	
	private final DatabaseQueryFromInterface databaseQueryFromInterface = DatabaseQueryFromInterface.INSTANCE;
	private final DatabaseQueryToInterface databaseQueryToInterface = DatabaseQueryToInterface.INSTANCE;
	
	public DatabaseQueryGlue() {
		this.setFromInterface(this.databaseQueryFromInterface);
		this.setToInterface(this.databaseQueryToInterface);

		this.databaseQueryFromInterface.setOwner(this);
		this.databaseQueryToInterface.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.databaseQueryFromInterface.transfer(message);
	}
	
}