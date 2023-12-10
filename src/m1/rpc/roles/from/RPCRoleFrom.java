package m1.rpc.roles.from;

import ASA.Message;
import ASA.impl.RoleFromImpl;
import m1.server.ports.provided.ReceiverRequestProvidedPort;

public class RPCRoleFrom extends RoleFromImpl {

	public static final RPCRoleFrom INSTANCE = new RPCRoleFrom();
	
	private final ReceiverRequestProvidedPort receiverRequestProvidedPort = ReceiverRequestProvidedPort.INSTANCE;
	
	public RPCRoleFrom() {
		this.setAttachement(this.receiverRequestProvidedPort);
	}
	
	@Override
	public Message transfer(Message message) {
		return this.receiverRequestProvidedPort.transfer(message);
	}
	
}