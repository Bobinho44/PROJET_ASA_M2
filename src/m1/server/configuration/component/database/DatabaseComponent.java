package m1.server.configuration.component.database;

import ASA.impl.ComponentImpl;
import m1.server.configuration.component.database.interfaces.DatabaseProvidedInterface;
import m1.server.configuration.component.database.interfaces.DatabaseRequiredInterface;

public class DatabaseComponent extends ComponentImpl {
	
	public static final DatabaseComponent INSTANCE = new DatabaseComponent();
	
	private final DatabaseProvidedInterface databaseProvidedInterface = DatabaseProvidedInterface.INSTANCE;
	private final DatabaseRequiredInterface databaseRequiredInterface = DatabaseRequiredInterface.INSTANCE;
	
	public DatabaseComponent() {
		this.setProvidedInterface(this.databaseProvidedInterface);
		this.setRequiredInterface(this.databaseRequiredInterface);
		
		this.databaseProvidedInterface.setOwner(this);
		this.databaseRequiredInterface.setOwner(this);
	}
	
}