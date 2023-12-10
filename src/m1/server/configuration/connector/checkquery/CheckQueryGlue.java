package m1.server.configuration.connector.checkquery;

import ASA.Message;
import ASA.impl.GlueImpl;

public class CheckQueryGlue extends GlueImpl {

	public static final CheckQueryGlue INSTANCE = new CheckQueryGlue();
	
	private final CheckQueryFromInterface checkQueryFromInterface = CheckQueryFromInterface.INSTANCE;
	private final CheckQueryToInterface checkQueryToInterface = CheckQueryToInterface.INSTANCE;
	
	public CheckQueryGlue() {
		this.setFromInterface(this.checkQueryFromInterface);
		this.setToInterface(this.checkQueryToInterface);

		this.checkQueryFromInterface.setOwner(this);
		this.checkQueryToInterface.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.checkQueryFromInterface.transfer(message);
	}
	
}