package com.annotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class PopulateBean {

	// spEL

	@Value("${listOfValues}")
	private String[] valuesArray;

	@Value("#{'${listOfValues}'.split(',')}")
	private List<String> valuesList;

	@Value("#{${valuesMap}}")
	private Map<String, Integer> valuesMap;

	@Value("#{${valuesMap}.key1}")
	private Integer valuesMapKey1;

	@Value("#{${valuesMap}.?[value>'1']}")
	private Map<String, Integer> valuesMapFiltered;

	public Map<String, Integer> getValuesMapFiltered() {
		return valuesMapFiltered;
	}

	public void setValuesMapFiltered(Map<String, Integer> valuesMapFiltered) {
		this.valuesMapFiltered = valuesMapFiltered;
	}

	public String[] getValuesArray() {
		return valuesArray;

	}

	public Map<String, Integer> getValuesMap() {
		return valuesMap;
	}

	public List<String> getValuesList() {
		return valuesList;
	}

	public void setValuesList(List<String> valuesList) {
		this.valuesList = valuesList;
	}

}
