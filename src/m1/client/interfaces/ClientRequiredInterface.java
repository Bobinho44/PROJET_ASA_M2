package m1.client.interfaces;

import java.util.Map;

import ASA.ASAFactory;
import ASA.Message;
import ASA.impl.ComponentRequiredInterfaceImpl;
import m1.client.ports.required.SenderRequestRequiredPort;

public class ClientRequiredInterface extends ComponentRequiredInterfaceImpl {

	public static final ClientRequiredInterface INSTANCE = new ClientRequiredInterface();
	
	private final SenderRequestRequiredPort senderRequestRequiredPort = SenderRequestRequiredPort.INSTANCE;
	
	public ClientRequiredInterface() {
		this.getRequiredPorts().add(this.senderRequestRequiredPort);
		
		this.senderRequestRequiredPort.setOwner(this);
	}
	
	public Message createAccount(String name) {
		Message message = ASAFactory.eINSTANCE.createMessage();
		message.setAction("CREATE_ACCOUNT");
		message.setData(Map.of("NAME", name));
		
		return this.senderRequestRequiredPort.transfer(message);
	}
	
	public Message depositMoney(String name, double amount) {
		Message message = ASAFactory.eINSTANCE.createMessage();
		message.setAction("DEPOSIT_MONEY");
		message.setData(Map.of("NAME", name, "AMOUNT", amount));
		
		return this.senderRequestRequiredPort.transfer(message);
	}
	
	public Message withdrawMoney(String name, double amount) {
		Message message = ASAFactory.eINSTANCE.createMessage();
		message.setAction("WITHDRAW_MONEY");
		message.setData(Map.of("NAME", name, "AMOUNT", amount));
		
		return this.senderRequestRequiredPort.transfer(message);
	}
	
}