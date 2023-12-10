package m1.server.configuration.component.database.ports.provided;

import ASA.Message;
import ASA.impl.ComponentProvidedPortImpl;
import m1.server.configuration.component.database.interfaces.DatabaseProvidedInterface;

public class SecurityManagementProvidedPort extends ComponentProvidedPortImpl {

	public static final SecurityManagementProvidedPort INSTANCE = new SecurityManagementProvidedPort();
	
	@Override
	public Message transfer(Message message) {
		switch (message.getAction()) {
		case "CREATE_ACCOUNT": {
			return ((DatabaseProvidedInterface) this.getOwner()).isFreeAccount(message);
		}
		case "DEPOSIT_MONEY": {
			return ((DatabaseProvidedInterface) this.getOwner()).hasAccount(message);
		}
		case "WITHDRAW_MONEY": {
			return ((DatabaseProvidedInterface) this.getOwner()).hasMoney(message);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + message.getAction());
		}
	}
}