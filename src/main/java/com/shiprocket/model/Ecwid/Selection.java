package com.shiprocket.model.Ecwid;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "selectionTitle", "selectionModifier", "selectionModifierType" })
public class Selection {

	@JsonProperty("selectionTitle")
	private String selectionTitle;
	@JsonProperty("selectionModifier")
	private Integer selectionModifier;
	@JsonProperty("selectionModifierType")
	private String selectionModifierType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("selectionTitle")
	public String getSelectionTitle() {
		return selectionTitle;
	}

	@JsonProperty("selectionTitle")
	public void setSelectionTitle(String selectionTitle) {
		this.selectionTitle = selectionTitle;
	}

	public Selection withSelectionTitle(String selectionTitle) {
		this.selectionTitle = selectionTitle;
		return this;
	}

	@JsonProperty("selectionModifier")
	public Integer getSelectionModifier() {
		return selectionModifier;
	}

	@JsonProperty("selectionModifier")
	public void setSelectionModifier(Integer selectionModifier) {
		this.selectionModifier = selectionModifier;
	}

	public Selection withSelectionModifier(Integer selectionModifier) {
		this.selectionModifier = selectionModifier;
		return this;
	}

	@JsonProperty("selectionModifierType")
	public String getSelectionModifierType() {
		return selectionModifierType;
	}

	@JsonProperty("selectionModifierType")
	public void setSelectionModifierType(String selectionModifierType) {
		this.selectionModifierType = selectionModifierType;
	}

	public Selection withSelectionModifierType(String selectionModifierType) {
		this.selectionModifierType = selectionModifierType;
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

	public Selection withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
