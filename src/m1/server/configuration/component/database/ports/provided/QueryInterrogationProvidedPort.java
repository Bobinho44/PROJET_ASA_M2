package m1.server.configuration.component.database.ports.provided;

import ASA.Message;
import ASA.impl.ComponentProvidedPortImpl;
import m1.server.configuration.component.database.interfaces.DatabaseProvidedInterface;

public class QueryInterrogationProvidedPort extends ComponentProvidedPortImpl {

	public static final QueryInterrogationProvidedPort INSTANCE = new QueryInterrogationProvidedPort();
	
	@Override
	public Message transfer(Message message) {
		switch (message.getAction()) {
		case "CREATE_ACCOUNT": {
			return ((DatabaseProvidedInterface) this.getOwner()).registerAccount(message);
		}
		case "DEPOSIT_MONEY": {
			return ((DatabaseProvidedInterface) this.getOwner()).addToBalance(message);
		}
		case "WITHDRAW_MONEY": {
			return ((DatabaseProvidedInterface) this.getOwner()).removeFromBalance(message);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + message.getAction());
		}
	}
	
}