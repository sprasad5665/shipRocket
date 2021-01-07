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
@JsonPropertyOrder({ "name", "value", "total", "taxOnDiscountedSubtotal", "taxOnShipping", "includeInPrice" })
public class Tax {

	@JsonProperty("name")
	private String name;
	@JsonProperty("value")
	private Integer value;
	@JsonProperty("total")
	private Double total;
	@JsonProperty("taxOnDiscountedSubtotal")
	private Double taxOnDiscountedSubtotal;
	@JsonProperty("taxOnShipping")
	private Double taxOnShipping;
	@JsonProperty("includeInPrice")
	private Boolean includeInPrice;
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

	public Tax withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("value")
	public Integer getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(Integer value) {
		this.value = value;
	}

	public Tax withValue(Integer value) {
		this.value = value;
		return this;
	}

	@JsonProperty("total")
	public Double getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Double total) {
		this.total = total;
	}

	public Tax withTotal(Double total) {
		this.total = total;
		return this;
	}

	@JsonProperty("taxOnDiscountedSubtotal")
	public Double getTaxOnDiscountedSubtotal() {
		return taxOnDiscountedSubtotal;
	}

	@JsonProperty("taxOnDiscountedSubtotal")
	public void setTaxOnDiscountedSubtotal(Double taxOnDiscountedSubtotal) {
		this.taxOnDiscountedSubtotal = taxOnDiscountedSubtotal;
	}

	public Tax withTaxOnDiscountedSubtotal(Double taxOnDiscountedSubtotal) {
		this.taxOnDiscountedSubtotal = taxOnDiscountedSubtotal;
		return this;
	}

	@JsonProperty("taxOnShipping")
	public Double getTaxOnShipping() {
		return taxOnShipping;
	}

	@JsonProperty("taxOnShipping")
	public void setTaxOnShipping(Double taxOnShipping) {
		this.taxOnShipping = taxOnShipping;
	}

	public Tax withTaxOnShipping(Double taxOnShipping) {
		this.taxOnShipping = taxOnShipping;
		return this;
	}

	@JsonProperty("includeInPrice")
	public Boolean getIncludeInPrice() {
		return includeInPrice;
	}

	@JsonProperty("includeInPrice")
	public void setIncludeInPrice(Boolean includeInPrice) {
		this.includeInPrice = includeInPrice;
	}

	public Tax withIncludeInPrice(Boolean includeInPrice) {
		this.includeInPrice = includeInPrice;
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

	public Tax withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
