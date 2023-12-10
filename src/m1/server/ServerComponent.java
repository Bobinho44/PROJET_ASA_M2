package m1.server;

import ASA.impl.ComponentImpl;
import m1.server.configuration.ServerDetailConfiguration;
import m1.server.interfaces.ServerProvidedInterface;

public class ServerComponent extends ComponentImpl {
	
	public static final ServerComponent INSTANCE = new ServerComponent();

	@SuppressWarnings("unused")
	private final ServerDetailConfiguration serverDetailConfiguration = ServerDetailConfiguration.INSTANCE;
	private final ServerProvidedInterface serverProvidedInterface = ServerProvidedInterface.INSTANCE;
	
	public ServerComponent() {
		this.setProvidedInterface(this.serverProvidedInterface);
	}
	
}