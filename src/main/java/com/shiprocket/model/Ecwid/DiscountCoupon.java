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
@JsonPropertyOrder({ "id", "name", "code", "discountType", "status", "discount", "launchDate", "usesLimit",
		"applicationLimit", "creationDate", "updateDate", "orderCount" })
public class DiscountCoupon {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("code")
	private String code;
	@JsonProperty("discountType")
	private String discountType;
	@JsonProperty("status")
	private String status;
	@JsonProperty("discount")
	private Integer discount;
	@JsonProperty("launchDate")
	private String launchDate;
	@JsonProperty("usesLimit")
	private String usesLimit;
	@JsonProperty("applicationLimit")
	private String applicationLimit;
	@JsonProperty("creationDate")
	private String creationDate;
	@JsonProperty("updateDate")
	private String updateDate;
	@JsonProperty("orderCount")
	private Integer orderCount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	public DiscountCoupon withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public DiscountCoupon withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	public DiscountCoupon withCode(String code) {
		this.code = code;
		return this;
	}

	@JsonProperty("discountType")
	public String getDiscountType() {
		return discountType;
	}

	@JsonProperty("discountType")
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public DiscountCoupon withDiscountType(String discountType) {
		this.discountType = discountType;
		return this;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	public DiscountCoupon withStatus(String status) {
		this.status = status;
		return this;
	}

	@JsonProperty("discount")
	public Integer getDiscount() {
		return discount;
	}

	@JsonProperty("discount")
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public DiscountCoupon withDiscount(Integer discount) {
		this.discount = discount;
		return this;
	}

	@JsonProperty("launchDate")
	public String getLaunchDate() {
		return launchDate;
	}

	@JsonProperty("launchDate")
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public DiscountCoupon withLaunchDate(String launchDate) {
		this.launchDate = launchDate;
		return this;
	}

	@JsonProperty("usesLimit")
	public String getUsesLimit() {
		return usesLimit;
	}

	@JsonProperty("usesLimit")
	public void setUsesLimit(String usesLimit) {
		this.usesLimit = usesLimit;
	}

	public DiscountCoupon withUsesLimit(String usesLimit) {
		this.usesLimit = usesLimit;
		return this;
	}

	@JsonProperty("applicationLimit")
	public String getApplicationLimit() {
		return applicationLimit;
	}

	@JsonProperty("applicationLimit")
	public void setApplicationLimit(String applicationLimit) {
		this.applicationLimit = applicationLimit;
	}

	public DiscountCoupon withApplicationLimit(String applicationLimit) {
		this.applicationLimit = applicationLimit;
		return this;
	}

	@JsonProperty("creationDate")
	public String getCreationDate() {
		return creationDate;
	}

	@JsonProperty("creationDate")
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public DiscountCoupon withCreationDate(String creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	@JsonProperty("updateDate")
	public String getUpdateDate() {
		return updateDate;
	}

	@JsonProperty("updateDate")
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public DiscountCoupon withUpdateDate(String updateDate) {
		this.updateDate = updateDate;
		return this;
	}

	@JsonProperty("orderCount")
	public Integer getOrderCount() {
		return orderCount;
	}

	@JsonProperty("orderCount")
	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public DiscountCoupon withOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
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

	public DiscountCoupon withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
