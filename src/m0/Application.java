package m0;

import ASA.Component;
import m1.ClientServerConfiguration;
import m1.client.interfaces.ClientProvidedInterface;

public class Application {

	public static void main(String[] args) {

		ClientServerConfiguration clientServerConfiguration = new ClientServerConfiguration();
		Component client = clientServerConfiguration.getComponents().get(0);
		ClientProvidedInterface clientProvidedInterface = (ClientProvidedInterface) client.getProvidedInterface();
		
		//Creates an account for Tom (success)
		clientProvidedInterface.createAccount("Tom");
		
		//Recreates an account for Tom (fail - already created)
		clientProvidedInterface.createAccount("Tom");
		
		//Withdraws money from the Tom account (fail - not enough money)
		clientProvidedInterface.withdrawMoney("Tom", 10.1D);
		
		//Deposits money to the Tom account (success - account exist)
		clientProvidedInterface.depositMoney("Tom", 10.5D);
		
		//Withdraws money from the Tom account (success - enough money)
		clientProvidedInterface.withdrawMoney("Tom", 9.2D);

		//Deposits money to the Pascal account (fail - account not exist)
		clientProvidedInterface.depositMoney("Pascal", 15.6D);
	}
	
}