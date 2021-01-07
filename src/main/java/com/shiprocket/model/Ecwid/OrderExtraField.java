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
@JsonPropertyOrder({ "id", "value", "customerInputType", "title", "orderDetailsDisplaySection", "orderBy" })
public class OrderExtraField {

	@JsonProperty("id")
	private String id;
	@JsonProperty("value")
	private String value;
	@JsonProperty("customerInputType")
	private String customerInputType;
	@JsonProperty("title")
	private String title;
	@JsonProperty("orderDetailsDisplaySection")
	private String orderDetailsDisplaySection;
	@JsonProperty("orderBy")
	private String orderBy;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public OrderExtraField withId(String id) {
		this.id = id;
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

	public OrderExtraField withValue(String value) {
		this.value = value;
		return this;
	}

	@JsonProperty("customerInputType")
	public String getCustomerInputType() {
		return customerInputType;
	}

	@JsonProperty("customerInputType")
	public void setCustomerInputType(String customerInputType) {
		this.customerInputType = customerInputType;
	}

	public OrderExtraField withCustomerInputType(String customerInputType) {
		this.customerInputType = customerInputType;
		return this;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	public OrderExtraField withTitle(String title) {
		this.title = title;
		return this;
	}

	@JsonProperty("orderDetailsDisplaySection")
	public String getOrderDetailsDisplaySection() {
		return orderDetailsDisplaySection;
	}

	@JsonProperty("orderDetailsDisplaySection")
	public void setOrderDetailsDisplaySection(String orderDetailsDisplaySection) {
		this.orderDetailsDisplaySection = orderDetailsDisplaySection;
	}

	public OrderExtraField withOrderDetailsDisplaySection(String orderDetailsDisplaySection) {
		this.orderDetailsDisplaySection = orderDetailsDisplaySection;
		return this;
	}

	@JsonProperty("orderBy")
	public String getOrderBy() {
		return orderBy;
	}

	@JsonProperty("orderBy")
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public OrderExtraField withOrderBy(String orderBy) {
		this.orderBy = orderBy;
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

	public OrderExtraField withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
