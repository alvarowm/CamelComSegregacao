package br.com.totvs.POCCamel;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class CsvMapper {

	public List<List> amplis(List<List> csvRows) {
		List<List> retorno = new ArrayList<List>();

		for (List<Object> linha : csvRows) {
			if (((String) linha.get(0)).startsWith("M"))
				retorno.add(linha);
		}

		return retorno;

	}

	public List<List> sac(List<List> csvRows) {
		List<List> retorno = new ArrayList<List>();

		for (List<Object> linha : csvRows) {
			if (!((String) linha.get(0)).startsWith("M"))
				retorno.add(linha);
		}

		return retorno;

	}

}
