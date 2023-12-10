package m1.server.configuration.component.connectionmanager.ports.provided;

import ASA.Message;
import ASA.impl.ComponentProvidedPortImpl;
import m1.server.configuration.component.connectionmanager.interfaces.ConnectionManagerProvidedInterface;

public class ExternalSocketProvidedPort extends ComponentProvidedPortImpl {

	public static final ExternalSocketProvidedPort INSTANCE = new ExternalSocketProvidedPort();

	@Override
	public Message transfer(Message message) {
		switch (message.getAction()) {
			case "CREATE_ACCOUNT": {
				return ((ConnectionManagerProvidedInterface) this.getOwner()).createAccount(message);
			}
			case "DEPOSIT_MONEY": {
				return ((ConnectionManagerProvidedInterface) this.getOwner()).depositMoney(message);
			}
			case "WITHDRAW_MONEY": {
				return ((ConnectionManagerProvidedInterface) this.getOwner()).withdrawMoney(message);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + message.getAction());
		}
	}
	
}