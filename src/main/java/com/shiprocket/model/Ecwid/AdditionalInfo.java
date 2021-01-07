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
@JsonPropertyOrder({ "google_customer_id" })
public class AdditionalInfo {

	@JsonProperty("google_customer_id")
	private String googleCustomerId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("google_customer_id")
	public String getGoogleCustomerId() {
		return googleCustomerId;
	}

	@JsonProperty("google_customer_id")
	public void setGoogleCustomerId(String googleCustomerId) {
		this.googleCustomerId = googleCustomerId;
	}

	public AdditionalInfo withGoogleCustomerId(String googleCustomerId) {
		this.googleCustomerId = googleCustomerId;
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

	public AdditionalInfo withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
