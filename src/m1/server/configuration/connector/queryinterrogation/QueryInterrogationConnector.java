package m1.server.configuration.connector.queryinterrogation;

import ASA.impl.ConnectorImpl;

public class QueryInterrogationConnector extends ConnectorImpl {

	public static final QueryInterrogationConnector INSTANCE = new QueryInterrogationConnector();

	private final QueryInterrogationGlue queryInterrogationGlue = QueryInterrogationGlue.INSTANCE;
	
	public QueryInterrogationConnector() {
		this.setGlue(this.queryInterrogationGlue);
	}
	
}