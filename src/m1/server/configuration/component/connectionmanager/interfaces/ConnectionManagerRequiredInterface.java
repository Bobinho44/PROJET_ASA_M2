package m1.server.configuration.component.connectionmanager.interfaces;

import java.util.Map;

import ASA.ASAFactory;
import ASA.Message;
import ASA.impl.ComponentRequiredInterfaceImpl;
import m1.server.configuration.component.connectionmanager.ports.required.QueryInterrogationRequiredPort;
import m1.server.configuration.component.connectionmanager.ports.required.SecurityAutentificationRequiredPort;

public class ConnectionManagerRequiredInterface extends ComponentRequiredInterfaceImpl{

	public static final ConnectionManagerRequiredInterface INSTANCE = new ConnectionManagerRequiredInterface();
	
	private final QueryInterrogationRequiredPort queryInterrogationRequiredPort = QueryInterrogationRequiredPort.INSTANCE;
	private final SecurityAutentificationRequiredPort securityAutentificationRequiredPort = SecurityAutentificationRequiredPort.INSTANCE;
	
	public ConnectionManagerRequiredInterface() {
		this.getRequiredPorts().add(this.queryInterrogationRequiredPort);
		this.getRequiredPorts().add(this.securityAutentificationRequiredPort);
		
		this.queryInterrogationRequiredPort.setOwner(this);
		this.securityAutentificationRequiredPort.setOwner(this);
	}
	
	public Message createAccount(Message message) {
		Message securityResponse = this.securityAutentificationRequiredPort.transfer(message);
		
		if (!(boolean) securityResponse.getData().get("SUCCESS")) {
			return securityResponse;
		}
			
		Message databaseResponse = this.queryInterrogationRequiredPort.transfer(message);
			
		if (!(boolean) databaseResponse.getData().get("SUCCESS")) {
			return databaseResponse;
		}
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("CREATE_ACCOUNT");
		response.setData(Map.of("NAME", message.getData().get("NAME"), "SUCCESS", true, "STATUS", "account created!"));
		
		return response;
	}
	
	public Message depositMoney(Message message) {
		Message securityResponse = this.securityAutentificationRequiredPort.transfer(message);
		
		if (!(boolean) securityResponse.getData().get("SUCCESS")) {
			return securityResponse;
		}
			
		Message databaseResponse = this.queryInterrogationRequiredPort.transfer(message);
			
		if (!(boolean) databaseResponse.getData().get("SUCCESS")) {
			return databaseResponse;
		}
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("DEPOSIT_MONEY");
		response.setData(Map.of("NAME", message.getData().get("NAME"), "SUCCESS", true, "STATUS", "money deposit!", "BALANCE", databaseResponse.getData().get("BALANCE")));
		
		return response;
	}
	
	public Message withdrawMoney(Message message) {
		Message securityResponse = this.securityAutentificationRequiredPort.transfer(message);
		
		if (!(boolean) securityResponse.getData().get("SUCCESS")) {
			return securityResponse;
		}
			
		Message databaseResponse = this.queryInterrogationRequiredPort.transfer(message);
			
		if (!(boolean) databaseResponse.getData().get("SUCCESS")) {
			return databaseResponse;
		}
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("WITHDRAW_MONEY");
		response.setData(Map.of("NAME", message.getData().get("NAME"), "SUCCESS", true, "STATUS", "money withdraw!", "BALANCE", databaseResponse.getData().get("BALANCE")));
		
		return response;
	}
	
}