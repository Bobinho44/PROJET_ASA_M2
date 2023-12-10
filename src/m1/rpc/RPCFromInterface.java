package m1.rpc;

import ASA.Message;
import ASA.impl.ConnectorFromInterfaceImpl;
import m1.rpc.roles.from.RPCRoleFrom;

public class RPCFromInterface extends ConnectorFromInterfaceImpl {

	public static final RPCFromInterface INSTANCE = new RPCFromInterface();

	private final RPCRoleFrom rpcRoleFrom = RPCRoleFrom.INSTANCE;
	
	public RPCFromInterface() {
		this.getFromRoles().add(this.rpcRoleFrom);
		
		this.rpcRoleFrom.setOwner(this);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.rpcRoleFrom.transfer(message);
	}
	
}