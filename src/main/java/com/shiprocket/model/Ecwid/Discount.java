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
@JsonPropertyOrder({ "discountInfo", "total" })
public class Discount {

	@JsonProperty("discountInfo")
	private DiscountInfo_ discountInfo;
	@JsonProperty("total")
	private Double total;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("discountInfo")
	public DiscountInfo_ getDiscountInfo() {
		return discountInfo;
	}

	@JsonProperty("discountInfo")
	public void setDiscountInfo(DiscountInfo_ discountInfo) {
		this.discountInfo = discountInfo;
	}

	public Discount withDiscountInfo(DiscountInfo_ discountInfo) {
		this.discountInfo = discountInfo;
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

	public Discount withTotal(Double total) {
		this.total = total;
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

	public Discount withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
