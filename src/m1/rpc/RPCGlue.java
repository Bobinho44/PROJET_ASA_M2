package m1.rpc;

import ASA.Message;
import ASA.impl.GlueImpl;

public class RPCGlue extends GlueImpl {

	public static final RPCGlue INSTANCE = new RPCGlue();
	
	private final RPCFromInterface rpcFromInterface = RPCFromInterface.INSTANCE;
	private final RPCToInterface rpcToInterface = RPCToInterface.INSTANCE;
	
	public RPCGlue() {
		this.setFromInterface(this.rpcFromInterface);
		this.setToInterface(this.rpcToInterface);
		
		this.rpcFromInterface.setOwner(this);
		this.rpcToInterface.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.rpcFromInterface.transfer(message);
	}
	
}