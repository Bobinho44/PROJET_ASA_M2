package m1.rpc;

import ASA.Message;
import ASA.impl.ConnectorToInterfaceImpl;
import m1.rpc.roles.to.RPCRoleTo;

public class RPCToInterface extends ConnectorToInterfaceImpl {

	public static final RPCToInterface INSTANCE = new RPCToInterface();
	
	private final RPCRoleTo rpcRoleTo = RPCRoleTo.INSTANCE;
	
	public RPCToInterface() {
		this.getToRoles().add(this.rpcRoleTo);
		
		this.rpcRoleTo.setOwner(this);
	}

	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}