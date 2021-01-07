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
@JsonPropertyOrder({ "shippingCarrierName", "shippingMethodName", "shippingRate", "estimatedTransitTime", "isPickup" })
public class ShippingOption {

	@JsonProperty("shippingCarrierName")
	private String shippingCarrierName;
	@JsonProperty("shippingMethodName")
	private String shippingMethodName;
	@JsonProperty("shippingRate")
	private Double shippingRate;
	@JsonProperty("estimatedTransitTime")
	private String estimatedTransitTime;
	@JsonProperty("isPickup")
	private Boolean isPickup;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("shippingCarrierName")
	public String getShippingCarrierName() {
		return shippingCarrierName;
	}

	@JsonProperty("shippingCarrierName")
	public void setShippingCarrierName(String shippingCarrierName) {
		this.shippingCarrierName = shippingCarrierName;
	}

	public ShippingOption withShippingCarrierName(String shippingCarrierName) {
		this.shippingCarrierName = shippingCarrierName;
		return this;
	}

	@JsonProperty("shippingMethodName")
	public String getShippingMethodName() {
		return shippingMethodName;
	}

	@JsonProperty("shippingMethodName")
	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	public ShippingOption withShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
		return this;
	}

	@JsonProperty("shippingRate")
	public Double getShippingRate() {
		return shippingRate;
	}

	@JsonProperty("shippingRate")
	public void setShippingRate(Double shippingRate) {
		this.shippingRate = shippingRate;
	}

	public ShippingOption withShippingRate(Double shippingRate) {
		this.shippingRate = shippingRate;
		return this;
	}

	@JsonProperty("estimatedTransitTime")
	public String getEstimatedTransitTime() {
		return estimatedTransitTime;
	}

	@JsonProperty("estimatedTransitTime")
	public void setEstimatedTransitTime(String estimatedTransitTime) {
		this.estimatedTransitTime = estimatedTransitTime;
	}

	public ShippingOption withEstimatedTransitTime(String estimatedTransitTime) {
		this.estimatedTransitTime = estimatedTransitTime;
		return this;
	}

	@JsonProperty("isPickup")
	public Boolean getIsPickup() {
		return isPickup;
	}

	@JsonProperty("isPickup")
	public void setIsPickup(Boolean isPickup) {
		this.isPickup = isPickup;
	}

	public ShippingOption withIsPickup(Boolean isPickup) {
		this.isPickup = isPickup;
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

	public ShippingOption withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
