package br.com.totvs.POCCamel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.csv.CsvDataFormat;

public class SegregadorCSVRouteBuilder extends RouteBuilder {
	
	private SegregadorCSVRouteBuilder() {
		
	}
	
	public static SegregadorCSVRouteBuilder getInstance() {
		return new SegregadorCSVRouteBuilder();
	}
	
	@Override
	public void configure() throws Exception {
		CsvDataFormat csv = CsvDataFormatFactory.getInstance();
		
		from("file:data/in?noop=true&delay=5000")
		.multicast()
		.to("direct:channel1", "direct:channel2");
		
		;
		from("direct:channel1")
		.unmarshal(csv)
		.bean("csvMapper", "sac")
		.marshal(csv)
		.to("file:data/out/sac");
		
		from("direct:channel2")
		.unmarshal(csv)
		.bean("csvMapper", "amplis")
		.marshal(csv)

		.to("file:data/out/amplis");
		
		
		
	}

}
