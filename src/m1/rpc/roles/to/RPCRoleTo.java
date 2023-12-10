package m1.rpc.roles.to;

import ASA.Message;
import ASA.impl.RoleToImpl;

public class RPCRoleTo extends RoleToImpl {

	public static final RPCRoleTo INSTANCE = new RPCRoleTo();
	
	@Override
	public Message transfer(Message message) {
		return this.getOwner().transfer(message);
	}
	
}