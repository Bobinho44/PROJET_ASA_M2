package m1.server.configuration.component.database.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import ASA.ASAFactory;
import ASA.Message;
import ASA.impl.ComponentRequiredInterfaceImpl;
import m1.server.configuration.component.database.ports.required.CheckQueryRequiredPort;
import m1.server.configuration.component.database.ports.required.DatabaseQueryRequiredPort;

public class DatabaseRequiredInterface extends ComponentRequiredInterfaceImpl{

	public static final DatabaseRequiredInterface INSTANCE = new DatabaseRequiredInterface();
	
	private final CheckQueryRequiredPort checkQueryRequiredPort = CheckQueryRequiredPort.INSTANCE;
	private final DatabaseQueryRequiredPort databaseQueryRequiredPort = DatabaseQueryRequiredPort.INSTANCE;
	
	//Database stub
	private final Map<String, Double> accounts = new HashMap<>();
	
	public DatabaseRequiredInterface() {
		this.getRequiredPorts().add(this.checkQueryRequiredPort);
		this.getRequiredPorts().add(this.databaseQueryRequiredPort);
		
		this.checkQueryRequiredPort.setOwner(this);
		this.databaseQueryRequiredPort.setOwner(this);
	}
	
	public Message isFreeAccount(Message message) {
		boolean isSuccess = !this.accounts.containsKey(message.getData().get("NAME"));
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("CREATE_ACCOUNT");
		response.setData(Map.of("SUCCESS", isSuccess, "STATUS", isSuccess ? "account is free!" : "account already exist!"));
		
		return response;
	}
	
	public Message hasAccount(Message message) {
		boolean isSuccess = this.accounts.containsKey(message.getData().get("NAME"));
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("DEPOSIT_MONEY");
		response.setData(Map.of("SUCCESS", isSuccess));
		response.setData(Map.of("SUCCESS", isSuccess, "STATUS", isSuccess ? "account is free!" : "account already exist!"));
		
		return response;
	}
	
	public Message hasMoney(Message message) {
		double money = Optional.ofNullable(this.accounts.get(message.getData().get("NAME"))).orElse(0.0D);
		boolean isSuccess = (Double) message.getData().get("AMOUNT") <= money;
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("WITHDRAW_MONEY");
		response.setData(Map.of("SUCCESS", isSuccess, "STATUS", isSuccess ? "has enough money!" : "not enough money!", "BALANCE", money));
		
		return response;
	}
	
	public Message registerAccount(Message message) {
		this.accounts.put((String) message.getData().get("NAME"), 0.0D);
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("CREATE_ACCOUNT");
		response.setData(Map.of("SUCCESS", true));
		
		return response;
	}
	
	public Message addToBalance(Message message) {
		this.accounts.compute((String) message.getData().get("NAME"), (name, balance) -> balance + (Double) message.getData().get("AMOUNT"));
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("DEPOSIT_MONEY");
		response.setData(Map.of("SUCCESS", true, "BALANCE", this.accounts.get((String) message.getData().get("NAME"))));
		
		return response;
	}
	
	public Message removeFromBalance(Message message) {
		this.accounts.compute((String) message.getData().get("NAME"), (name, balance) -> balance - (Double) message.getData().get("AMOUNT"));

		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("WITHDRAW_MONEY");
		response.setData(Map.of("SUCCESS", true, "BALANCE", this.accounts.get((String) message.getData().get("NAME"))));

		return response;
	}

}