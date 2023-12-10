package m1;

import ASA.impl.ConfigurationImpl;
import m1.client.ClientComponent;
import m1.rpc.RPCConnector;
import m1.server.ServerComponent;

public class ClientServerConfiguration extends ConfigurationImpl {
	
	private final ServerComponent serverComponent = ServerComponent.INSTANCE;
	private final ClientComponent clientComponent = ClientComponent.INSTANCE;
	
	private final RPCConnector rpcConnector = RPCConnector.INSTANCE;
	
	public ClientServerConfiguration() {
		this.getComponents().add(this.clientComponent);
		this.getComponents().add(this.serverComponent);
		
		this.getConnectors().add(this.rpcConnector);
	}
	
}