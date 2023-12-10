package m1.server.configuration;

import ASA.impl.ConfigurationImpl;
import m1.server.configuration.component.connectionmanager.ConnectionManagerComponent;
import m1.server.configuration.component.database.DatabaseComponent;
import m1.server.configuration.component.securitymanager.SecurityManagerComponent;
import m1.server.configuration.connector.checkquery.CheckQueryConnector;
import m1.server.configuration.connector.databasequery.DatabaseQueryConnector;
import m1.server.configuration.connector.queryinterrogation.QueryInterrogationConnector;
import m1.server.configuration.connector.securityautentification.SecurityAutentificationConnector;
import m1.server.configuration.connector.securitycheck.SecurityCheckConnector;
import m1.server.configuration.connector.securitymanagement.SecurityManagementConnector;
import m1.server.configuration.interfaces.ServerDetailInterface;

public class ServerDetailConfiguration extends ConfigurationImpl {

	public static final ServerDetailConfiguration INSTANCE = new ServerDetailConfiguration();
	
	private final ConnectionManagerComponent connectionManagerComponent = ConnectionManagerComponent.INSTANCE;
	private final DatabaseComponent databaseComponent = DatabaseComponent.INSTANCE;
	private final SecurityManagerComponent securityManagerComponent = SecurityManagerComponent.INSTANCE;
	
	private final CheckQueryConnector checkQueryConnector = CheckQueryConnector.INSTANCE;
	private final DatabaseQueryConnector databaseQueryConnector = DatabaseQueryConnector.INSTANCE;
	private final QueryInterrogationConnector queryInterrogationConnector = QueryInterrogationConnector.INSTANCE;
	private final SecurityAutentificationConnector securityAutentificationConnector = SecurityAutentificationConnector.INSTANCE;
	private final SecurityCheckConnector securityCheckConnector = SecurityCheckConnector.INSTANCE;
	private final SecurityManagementConnector securityManagementConnector = SecurityManagementConnector.INSTANCE;
	
	private final ServerDetailInterface serverDetailInterface = ServerDetailInterface.INSTANCE;
	
	public ServerDetailConfiguration() {
		this.getComponents().add(this.connectionManagerComponent);
		this.getComponents().add(this.databaseComponent);
		this.getComponents().add(this.securityManagerComponent);
		
		this.getConnectors().add(this.checkQueryConnector);
		this.getConnectors().add(this.databaseQueryConnector);
		this.getConnectors().add(this.queryInterrogationConnector);
		this.getConnectors().add(this.securityAutentificationConnector);
		this.getConnectors().add(this.securityCheckConnector);
		this.getConnectors().add(this.securityManagementConnector);
		
		this.setInterface(this.serverDetailInterface);
	}
	
}