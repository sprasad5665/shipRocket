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
@JsonPropertyOrder({ "value", "type", "base", "orderTotal" })
public class DiscountInfo {

	@JsonProperty("value")
	private Integer value;
	@JsonProperty("type")
	private String type;
	@JsonProperty("base")
	private String base;
	@JsonProperty("orderTotal")
	private Integer orderTotal;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("value")
	public Integer getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(Integer value) {
		this.value = value;
	}

	public DiscountInfo withValue(Integer value) {
		this.value = value;
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

	public DiscountInfo withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("base")
	public String getBase() {
		return base;
	}

	@JsonProperty("base")
	public void setBase(String base) {
		this.base = base;
	}

	public DiscountInfo withBase(String base) {
		this.base = base;
		return this;
	}

	@JsonProperty("orderTotal")
	public Integer getOrderTotal() {
		return orderTotal;
	}

	@JsonProperty("orderTotal")
	public void setOrderTotal(Integer orderTotal) {
		this.orderTotal = orderTotal;
	}

	public DiscountInfo withOrderTotal(Integer orderTotal) {
		this.orderTotal = orderTotal;
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

	public DiscountInfo withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
