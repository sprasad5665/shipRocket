
package com.shiprocket.model.ship;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "name", "sku", "units", "selling_price", "discount", "tax", "hsn" })
public class OrderItem {

	@JsonProperty("name")
	private String name;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("units")
	private String units;
	@JsonProperty("selling_price")
	private String sellingPrice;
	@JsonProperty("discount")
	private String discount;
	@JsonProperty("tax")
	private String tax;
	@JsonProperty("hsn")
	private String hsn;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public OrderItem withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}

	@JsonProperty("sku")
	public void setSku(String sku) {
		this.sku = sku;
	}

	public OrderItem withSku(String sku) {
		this.sku = sku;
		return this;
	}

	@JsonProperty("units")
	public String getUnits() {
		return units;
	}

	@JsonProperty("units")
	public void setUnits(String units) {
		this.units = units;
	}

	public OrderItem withUnits(String units) {
		this.units = units;
		return this;
	}

	@JsonProperty("selling_price")
	public String getSellingPrice() {
		return sellingPrice;
	}

	@JsonProperty("selling_price")
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public OrderItem withSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
		return this;
	}

	@JsonProperty("discount")
	public String getDiscount() {
		return discount;
	}

	@JsonProperty("discount")
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public OrderItem withDiscount(String discount) {
		this.discount = discount;
		return this;
	}

	@JsonProperty("tax")
	public String getTax() {
		return tax;
	}

	@JsonProperty("tax")
	public void setTax(String tax) {
		this.tax = tax;
	}

	public OrderItem withTax(String tax) {
		this.tax = tax;
		return this;
	}

	@JsonProperty("hsn")
	public String getHsn() {
		return hsn;
	}

	@JsonProperty("hsn")
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}

	public OrderItem withHsn(String hsn) {
		this.hsn = hsn;
		return this;
	}

}
