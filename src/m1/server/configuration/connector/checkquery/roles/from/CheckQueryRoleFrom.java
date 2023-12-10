package m1.server.configuration.connector.checkquery.roles.from;

import ASA.impl.RoleFromImpl;
import m1.server.configuration.component.securitymanager.ports.provided.CheckQueryProvidedPort;

public class CheckQueryRoleFrom extends RoleFromImpl {

	public static final CheckQueryRoleFrom INSTANCE = new CheckQueryRoleFrom();
	
	private final CheckQueryProvidedPort checkQueryProvidedPort = CheckQueryProvidedPort.INSTANCE;
	
	public CheckQueryRoleFrom() {
		this.setAttachement(this.checkQueryProvidedPort);
	}
	
}