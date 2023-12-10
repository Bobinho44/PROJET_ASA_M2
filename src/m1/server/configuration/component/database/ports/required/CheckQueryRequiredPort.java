package m1.server.configuration.component.database.ports.required;

import ASA.Message;
import ASA.impl.ComponentRequiredPortImpl;
import m1.server.configuration.connector.checkquery.roles.to.CheckQueryRoleTo;

public class CheckQueryRequiredPort extends ComponentRequiredPortImpl {

	public static final CheckQueryRequiredPort INSTANCE = new CheckQueryRequiredPort();
	
	private final CheckQueryRoleTo checkQueryRoleTo = CheckQueryRoleTo.INSTANCE;
			
	public CheckQueryRequiredPort() {
		this.setAttachement(this.checkQueryRoleTo);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.checkQueryRoleTo.transfer(message);
	}
	
}