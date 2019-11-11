package br.com.totvs.POCCamel;

import org.apache.camel.dataformat.csv.CsvDataFormat;
import org.apache.commons.csv.QuoteMode;

public class CsvDataFormatFactory {
	
	private CsvDataFormatFactory() {
		
	}

	public static CsvDataFormat getInstance () {
		CsvDataFormat csv = new CsvDataFormat();
		csv.setLazyLoad(Boolean.FALSE);
		csv.setDelimiter(Character.valueOf(','));
		csv.setRecordSeparator("\r");
		csv.setIgnoreSurroundingSpaces(Boolean.FALSE);
		csv.setQuoteDisabled(Boolean.TRUE);
		csv.setQuoteMode(QuoteMode.MINIMAL);
		
		return csv;
	}
}
