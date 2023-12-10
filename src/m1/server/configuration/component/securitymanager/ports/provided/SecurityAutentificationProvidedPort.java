package m1.server.configuration.component.securitymanager.ports.provided;

import ASA.Message;
import ASA.impl.ComponentProvidedPortImpl;
import m1.server.configuration.component.securitymanager.interfaces.SecurityManagerProvidedInterface;

public class SecurityAutentificationProvidedPort extends ComponentProvidedPortImpl {

	public static final SecurityAutentificationProvidedPort INSTANCE = new SecurityAutentificationProvidedPort();
	
	@Override
	public Message transfer(Message message) {
		switch (message.getAction()) {
		case "CREATE_ACCOUNT": {
			return ((SecurityManagerProvidedInterface) this.getOwner()).canCreateAccount(message);
		}
		case "DEPOSIT_MONEY": {
			return ((SecurityManagerProvidedInterface) this.getOwner()).canDepositMoney(message);
		}
		case "WITHDRAW_MONEY": {
			return ((SecurityManagerProvidedInterface) this.getOwner()).canWithdrawMoney(message);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + message.getAction());
		}
	}
	
}