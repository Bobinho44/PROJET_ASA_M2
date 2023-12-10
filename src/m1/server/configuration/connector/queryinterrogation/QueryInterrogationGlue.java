package m1.server.configuration.connector.queryinterrogation;

import ASA.Message;
import ASA.impl.GlueImpl;

public class QueryInterrogationGlue extends GlueImpl {

	public static final QueryInterrogationGlue INSTANCE = new QueryInterrogationGlue();
	
	private final QueryInterrogationFromInterface queryInterrogationFromInterface = QueryInterrogationFromInterface.INSTANCE;
	private final QueryInterrogationToInterface queryInterrogationToInterface = QueryInterrogationToInterface.INSTANCE;
	
	public QueryInterrogationGlue() {
		this.setFromInterface(this.queryInterrogationFromInterface);
		this.setToInterface(this.queryInterrogationToInterface);
		
		this.queryInterrogationFromInterface.setOwner(this);
		this.queryInterrogationToInterface.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.queryInterrogationFromInterface.transfer(message);
	}
	
}