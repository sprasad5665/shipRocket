package com.shiprocket.model.Ecwid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "value", "valuesArray", "selections", "type" })
public class SelectedOption {

	@JsonProperty("name")
	private String name;
	@JsonProperty("value")
	private String value;
	@JsonProperty("valuesArray")
	private List<String> valuesArray = null;
	@JsonProperty("selections")
	private List<Selection> selections = null;
	@JsonProperty("type")
	private String type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public SelectedOption withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	public SelectedOption withValue(String value) {
		this.value = value;
		return this;
	}

	@JsonProperty("valuesArray")
	public List<String> getValuesArray() {
		return valuesArray;
	}

	@JsonProperty("valuesArray")
	public void setValuesArray(List<String> valuesArray) {
		this.valuesArray = valuesArray;
	}

	public SelectedOption withValuesArray(List<String> valuesArray) {
		this.valuesArray = valuesArray;
		return this;
	}

	@JsonProperty("selections")
	public List<Selection> getSelections() {
		return selections;
	}

	@JsonProperty("selections")
	public void setSelections(List<Selection> selections) {
		this.selections = selections;
	}

	public SelectedOption withSelections(List<Selection> selections) {
		this.selections = selections;
		return this;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	public SelectedOption withType(String type) {
		this.type = type;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public SelectedOption withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
