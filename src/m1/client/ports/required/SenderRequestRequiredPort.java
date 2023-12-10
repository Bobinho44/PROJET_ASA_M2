package m1.client.ports.required;

import ASA.Message;
import ASA.impl.ComponentRequiredPortImpl;
import m1.rpc.roles.to.RPCRoleTo;

public class SenderRequestRequiredPort extends ComponentRequiredPortImpl {

	public static final SenderRequestRequiredPort INSTANCE = new SenderRequestRequiredPort();
	
	private final RPCRoleTo rpcRoleTo = RPCRoleTo.INSTANCE;
	
	public SenderRequestRequiredPort() {
		this.setAttachement(this.rpcRoleTo);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.rpcRoleTo.transfer(message);
	}
	
}