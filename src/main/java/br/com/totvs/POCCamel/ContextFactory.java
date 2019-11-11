package br.com.totvs.POCCamel;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;

public class ContextFactory {
	
	private ContextFactory() {
		
	}
	
	public static CamelContext getInstance () throws Exception {
		SimpleRegistry simpleRegistry = new SimpleRegistry();
		simpleRegistry.put("csvMapper", new CsvMapper());
    	
		CamelContext context = new DefaultCamelContext(simpleRegistry);
		
    	context.addRoutes(
    			SegregadorCSVRouteBuilder.getInstance()
    			);
    	
    	return context;
	}

}
