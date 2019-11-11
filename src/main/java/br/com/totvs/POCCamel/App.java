package br.com.totvs.POCCamel;

import org.apache.camel.CamelContext;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	CamelContext context =  ContextFactory.getInstance();
    	
    	context.start();
    	while (true);
    	
    }
}


