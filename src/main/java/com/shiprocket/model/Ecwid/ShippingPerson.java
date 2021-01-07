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
@JsonPropertyOrder({ "name", "companyName", "street", "city", "countryCode", "countryName", "postalCode",
		"stateOrProvinceCode", "stateOrProvinceName", "phone" })
public class ShippingPerson {

	@JsonProperty("name")
	private String name;
	@JsonProperty("companyName")
	private String companyName;
	@JsonProperty("street")
	private String street;
	@JsonProperty("city")
	private String city;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("countryName")
	private String countryName;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("stateOrProvinceCode")
	private String stateOrProvinceCode;
	@JsonProperty("stateOrProvinceName")
	private String stateOrProvinceName;
	@JsonProperty("phone")
	private String phone;
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

	public ShippingPerson withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonProperty("companyName")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ShippingPerson withCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	@JsonProperty("street")
	public String getStreet() {
		return street;
	}

	@JsonProperty("street")
	public void setStreet(String street) {
		this.street = street;
	}

	public ShippingPerson withStreet(String street) {
		this.street = street;
		return this;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	public ShippingPerson withCity(String city) {
		this.city = city;
		return this;
	}

	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public ShippingPerson withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	@JsonProperty("countryName")
	public String getCountryName() {
		return countryName;
	}

	@JsonProperty("countryName")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public ShippingPerson withCountryName(String countryName) {
		this.countryName = countryName;
		return this;
	}

	@JsonProperty("postalCode")
	public String getPostalCode() {
		return postalCode;
	}

	@JsonProperty("postalCode")
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public ShippingPerson withPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	@JsonProperty("stateOrProvinceCode")
	public String getStateOrProvinceCode() {
		return stateOrProvinceCode;
	}

	@JsonProperty("stateOrProvinceCode")
	public void setStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
	}

	public ShippingPerson withStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
		return this;
	}

	@JsonProperty("stateOrProvinceName")
	public String getStateOrProvinceName() {
		return stateOrProvinceName;
	}

	@JsonProperty("stateOrProvinceName")
	public void setStateOrProvinceName(String stateOrProvinceName) {
		this.stateOrProvinceName = stateOrProvinceName;
	}

	public ShippingPerson withStateOrProvinceName(String stateOrProvinceName) {
		this.stateOrProvinceName = stateOrProvinceName;
		return this;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ShippingPerson withPhone(String phone) {
		this.phone = phone;
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

	public ShippingPerson withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
