package m1.server.configuration.component.securitymanager;

import ASA.impl.ComponentImpl;
import m1.server.configuration.component.securitymanager.interfaces.SecurityManagerProvidedInterface;
import m1.server.configuration.component.securitymanager.interfaces.SecurityManagerRequiredInterface;

public class SecurityManagerComponent extends ComponentImpl {
	
	public static final SecurityManagerComponent INSTANCE = new SecurityManagerComponent();
	
	private final SecurityManagerProvidedInterface securityManagerProvidedInterface = SecurityManagerProvidedInterface.INSTANCE;
	private final SecurityManagerRequiredInterface securityManagerRequiredInterface = SecurityManagerRequiredInterface.INSTANCE;
	
	public SecurityManagerComponent() {
		this.setProvidedInterface(this.securityManagerProvidedInterface);
		this.setRequiredInterface(this.securityManagerRequiredInterface);
		
		this.securityManagerProvidedInterface.setOwner(this);
		this.securityManagerRequiredInterface.setOwner(this);
	}
	
}