package m1.rpc;

import ASA.impl.ConnectorImpl;

public class RPCConnector extends ConnectorImpl {

	public static final RPCConnector INSTANCE = new RPCConnector();

	private final RPCGlue rpcGlue = RPCGlue.INSTANCE;
	
	public RPCConnector() {
		this.setGlue(this.rpcGlue);
	}
	
}