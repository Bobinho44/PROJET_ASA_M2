package m1.server.configuration.component.securitymanager.interfaces;

import java.util.Map;

import ASA.ASAFactory;
import ASA.Message;
import ASA.impl.ComponentRequiredInterfaceImpl;
import m1.server.configuration.component.securitymanager.ports.required.SecurityCheckRequiredPort;
import m1.server.configuration.component.securitymanager.ports.required.SecurityManagementRequiredPort;

public class SecurityManagerRequiredInterface extends ComponentRequiredInterfaceImpl{

	public static final SecurityManagerRequiredInterface INSTANCE = new SecurityManagerRequiredInterface();
	
	private final SecurityCheckRequiredPort securityCheckRequiredPort = SecurityCheckRequiredPort.INSTANCE;
	private final SecurityManagementRequiredPort securityManagementRequiredPort = SecurityManagementRequiredPort.INSTANCE;
	
	public SecurityManagerRequiredInterface() {
		this.getRequiredPorts().add(this.securityCheckRequiredPort);
		this.getRequiredPorts().add(this.securityManagementRequiredPort);
		
		this.securityCheckRequiredPort.setOwner(this);
		this.securityManagementRequiredPort.setOwner(this);
	}

	public Message canCreateAccount(Message message) {
		Message databaseResponse = this.securityManagementRequiredPort.transfer(message);
		
		if (!(boolean) databaseResponse.getData().get("SUCCESS")) {
			return databaseResponse;
		}
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("CREATE_ACCOUNT");
		response.setData(Map.of("SUCCESS", true));
		
		return response;
	}
	
	public Message canDepositMoney(Message message) {
		Message databaseResponse = this.securityManagementRequiredPort.transfer(message);
		
		if (!(boolean) databaseResponse.getData().get("SUCCESS")) {
			return databaseResponse;
		}
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("DEPOSIT_MONEY");
		response.setData(Map.of("SUCCESS", true));
		
		return response;
	}
	
	public Message canWithdrawMoney(Message message) {
		Message databaseResponse = this.securityManagementRequiredPort.transfer(message);
		
		if (!(boolean) databaseResponse.getData().get("SUCCESS")) {
			return databaseResponse;
		}
		
		Message response = ASAFactory.eINSTANCE.createMessage();
		response.setAction("WITHDRAW_MONEY");
		response.setData(Map.of("SUCCESS", true, "BALANCE", databaseResponse.getData().get("BALANCE")));
		
		return response;
	}
	
}