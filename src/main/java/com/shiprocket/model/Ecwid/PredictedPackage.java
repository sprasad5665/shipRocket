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
@JsonPropertyOrder({ "length", "width", "height", "weight", "declaredValue" })
public class PredictedPackage {

	@JsonProperty("length")
	private Integer length;
	@JsonProperty("width")
	private Integer width;
	@JsonProperty("height")
	private Integer height;
	@JsonProperty("weight")
	private Double weight;
	@JsonProperty("declaredValue")
	private Double declaredValue;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("length")
	public Integer getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(Integer length) {
		this.length = length;
	}

	public PredictedPackage withLength(Integer length) {
		this.length = length;
		return this;
	}

	@JsonProperty("width")
	public Integer getWidth() {
		return width;
	}

	@JsonProperty("width")
	public void setWidth(Integer width) {
		this.width = width;
	}

	public PredictedPackage withWidth(Integer width) {
		this.width = width;
		return this;
	}

	@JsonProperty("height")
	public Integer getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(Integer height) {
		this.height = height;
	}

	public PredictedPackage withHeight(Integer height) {
		this.height = height;
		return this;
	}

	@JsonProperty("weight")
	public Double getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public PredictedPackage withWeight(Double weight) {
		this.weight = weight;
		return this;
	}

	@JsonProperty("declaredValue")
	public Double getDeclaredValue() {
		return declaredValue;
	}

	@JsonProperty("declaredValue")
	public void setDeclaredValue(Double declaredValue) {
		this.declaredValue = declaredValue;
	}

	public PredictedPackage withDeclaredValue(Double declaredValue) {
		this.declaredValue = declaredValue;
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

	public PredictedPackage withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
