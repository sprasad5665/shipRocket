
package com.shiprocket.model.ship;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "order_id", "order_date", "pickup_location", "comment", "billing_customer_name",
		"billing_last_name", "billing_address", "billing_address_2", "billing_city", "billing_pincode", "billing_state",
		"billing_country", "billing_email", "billing_phone", "shipping_is_billing", "shipping_customer_name",
		"shipping_last_name", "shipping_address", "shipping_address_2", "shipping_city", "shipping_pincode",
		"shipping_country", "shipping_state", "shipping_email", "shipping_phone", "order_items", "payment_method",
		"shipping_charges", "giftwrap_charges", "transaction_charges", "total_discount", "sub_total", "length",
		"breadth", "height", "weight" })
public class ShipRocket {

	@JsonProperty("order_id")
	private String orderId;
	@JsonProperty("order_date")
	private String orderDate;
	@JsonProperty("pickup_location")
	private String pickupLocation;
	@JsonProperty("comment")
	private String comment;
	@JsonProperty("billing_customer_name")
	private String billingCustomerName;
	@JsonProperty("billing_last_name")
	private String billingLastName;
	@JsonProperty("billing_address")
	private String billingAddress;
	@JsonProperty("billing_address_2")
	private String billingAddress2;
	@JsonProperty("billing_city")
	private String billingCity;
	@JsonProperty("billing_pincode")
	private String billingPincode;
	@JsonProperty("billing_state")
	private String billingState;
	@JsonProperty("billing_country")
	private String billingCountry;
	@JsonProperty("billing_email")
	private String billingEmail;
	@JsonProperty("billing_phone")
	private String billingPhone;
	@JsonProperty("shipping_is_billing")
	private Integer shippingIsBilling;
	@JsonProperty("shipping_customer_name")
	private String shippingCustomerName;
	@JsonProperty("shipping_last_name")
	private String shippingLastName;
	@JsonProperty("shipping_address")
	private String shippingAddress;
	@JsonProperty("shipping_address_2")
	private String shippingAddress2;
	@JsonProperty("shipping_city")
	private String shippingCity;
	@JsonProperty("shipping_pincode")
	private String shippingPincode;
	@JsonProperty("shipping_country")
	private String shippingCountry;
	@JsonProperty("shipping_state")
	private String shippingState;
	@JsonProperty("shipping_email")
	private String shippingEmail;
	@JsonProperty("shipping_phone")
	private String shippingPhone;
	@JsonProperty("order_items")
	private List<OrderItem> orderItems = null;
	@JsonProperty("payment_method")
	private String paymentMethod;
	@JsonProperty("shipping_charges")
	private String shippingCharges;
	@JsonProperty("giftwrap_charges")
	private String giftwrapCharges;
	@JsonProperty("transaction_charges")
	private String transactionCharges;
	@JsonProperty("total_discount")
	private String totalDiscount;
	@JsonProperty("sub_total")
	private String subTotal;
	@JsonProperty("length")
	private String length;
	@JsonProperty("breadth")
	private String breadth;
	@JsonProperty("height")
	private String height;
	@JsonProperty("weight")
	private String weight;

	@JsonProperty("order_id")
	public String getOrderId() {
		return orderId;
	}

	@JsonProperty("order_id")
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public ShipRocket withOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	@JsonProperty("order_date")
	public String getOrderDate() {
		return orderDate;
	}

	@JsonProperty("order_date")
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public ShipRocket withOrderDate(String orderDate) {
		this.orderDate = orderDate;
		return this;
	}

	@JsonProperty("pickup_location")
	public String getPickupLocation() {
		return pickupLocation;
	}

	@JsonProperty("pickup_location")
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public ShipRocket withPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
		return this;
	}

	@JsonProperty("comment")
	public String getComment() {
		return comment;
	}

	@JsonProperty("comment")
	public void setComment(String comment) {
		this.comment = comment;
	}

	public ShipRocket withComment(String comment) {
		this.comment = comment;
		return this;
	}

	@JsonProperty("billing_customer_name")
	public String getBillingCustomerName() {
		return billingCustomerName;
	}

	@JsonProperty("billing_customer_name")
	public void setBillingCustomerName(String billingCustomerName) {
		this.billingCustomerName = billingCustomerName;
	}

	public ShipRocket withBillingCustomerName(String billingCustomerName) {
		this.billingCustomerName = billingCustomerName;
		return this;
	}

	@JsonProperty("billing_last_name")
	public String getBillingLastName() {
		return billingLastName;
	}

	@JsonProperty("billing_last_name")
	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}

	public ShipRocket withBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
		return this;
	}

	@JsonProperty("billing_address")
	public String getBillingAddress() {
		return billingAddress;
	}

	@JsonProperty("billing_address")
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShipRocket withBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	@JsonProperty("billing_address_2")
	public String getBillingAddress2() {
		return billingAddress2;
	}

	@JsonProperty("billing_address_2")
	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}

	public ShipRocket withBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
		return this;
	}

	@JsonProperty("billing_city")
	public String getBillingCity() {
		return billingCity;
	}

	@JsonProperty("billing_city")
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public ShipRocket withBillingCity(String billingCity) {
		this.billingCity = billingCity;
		return this;
	}

	@JsonProperty("billing_pincode")
	public String getBillingPincode() {
		return billingPincode;
	}

	@JsonProperty("billing_pincode")
	public void setBillingPincode(String billingPincode) {
		this.billingPincode = billingPincode;
	}

	public ShipRocket withBillingPincode(String billingPincode) {
		this.billingPincode = billingPincode;
		return this;
	}

	@JsonProperty("billing_state")
	public String getBillingState() {
		return billingState;
	}

	@JsonProperty("billing_state")
	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public ShipRocket withBillingState(String billingState) {
		this.billingState = billingState;
		return this;
	}

	@JsonProperty("billing_country")
	public String getBillingCountry() {
		return billingCountry;
	}

	@JsonProperty("billing_country")
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public ShipRocket withBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
		return this;
	}

	@JsonProperty("billing_email")
	public String getBillingEmail() {
		return billingEmail;
	}

	@JsonProperty("billing_email")
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}

	public ShipRocket withBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
		return this;
	}

	@JsonProperty("billing_phone")
	public String getBillingPhone() {
		return billingPhone;
	}

	@JsonProperty("billing_phone")
	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}

	public ShipRocket withBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
		return this;
	}

	@JsonProperty("shipping_is_billing")
	public Integer getShippingIsBilling() {
		return shippingIsBilling;
	}

	@JsonProperty("shipping_is_billing")
	public void setShippingIsBilling(Integer shippingIsBilling) {
		this.shippingIsBilling = shippingIsBilling;
	}

	public ShipRocket withShippingIsBilling(Integer shippingIsBilling) {
		this.shippingIsBilling = shippingIsBilling;
		return this;
	}

	@JsonProperty("shipping_customer_name")
	public String getShippingCustomerName() {
		return shippingCustomerName;
	}

	@JsonProperty("shipping_customer_name")
	public void setShippingCustomerName(String shippingCustomerName) {
		this.shippingCustomerName = shippingCustomerName;
	}

	public ShipRocket withShippingCustomerName(String shippingCustomerName) {
		this.shippingCustomerName = shippingCustomerName;
		return this;
	}

	@JsonProperty("shipping_last_name")
	public String getShippingLastName() {
		return shippingLastName;
	}

	@JsonProperty("shipping_last_name")
	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	public ShipRocket withShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
		return this;
	}

	@JsonProperty("shipping_address")
	public String getShippingAddress() {
		return shippingAddress;
	}

	@JsonProperty("shipping_address")
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public ShipRocket withShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	@JsonProperty("shipping_address_2")
	public String getShippingAddress2() {
		return shippingAddress2;
	}

	@JsonProperty("shipping_address_2")
	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public ShipRocket withShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
		return this;
	}

	@JsonProperty("shipping_city")
	public String getShippingCity() {
		return shippingCity;
	}

	@JsonProperty("shipping_city")
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public ShipRocket withShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
		return this;
	}

	@JsonProperty("shipping_pincode")
	public String getShippingPincode() {
		return shippingPincode;
	}

	@JsonProperty("shipping_pincode")
	public void setShippingPincode(String shippingPincode) {
		this.shippingPincode = shippingPincode;
	}

	public ShipRocket withShippingPincode(String shippingPincode) {
		this.shippingPincode = shippingPincode;
		return this;
	}

	@JsonProperty("shipping_country")
	public String getShippingCountry() {
		return shippingCountry;
	}

	@JsonProperty("shipping_country")
	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public ShipRocket withShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
		return this;
	}

	@JsonProperty("shipping_state")
	public String getShippingState() {
		return shippingState;
	}

	@JsonProperty("shipping_state")
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public ShipRocket withShippingState(String shippingState) {
		this.shippingState = shippingState;
		return this;
	}

	@JsonProperty("shipping_email")
	public String getShippingEmail() {
		return shippingEmail;
	}

	@JsonProperty("shipping_email")
	public void setShippingEmail(String shippingEmail) {
		this.shippingEmail = shippingEmail;
	}

	public ShipRocket withShippingEmail(String shippingEmail) {
		this.shippingEmail = shippingEmail;
		return this;
	}

	@JsonProperty("shipping_phone")
	public String getShippingPhone() {
		return shippingPhone;
	}

	@JsonProperty("shipping_phone")
	public void setShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
	}

	public ShipRocket withShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
		return this;
	}

	@JsonProperty("order_items")
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	@JsonProperty("order_items")
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public ShipRocket withOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
		return this;
	}

	@JsonProperty("payment_method")
	public String getPaymentMethod() {
		return paymentMethod;
	}

	@JsonProperty("payment_method")
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public ShipRocket withPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	@JsonProperty("shipping_charges")
	public String getShippingCharges() {
		return shippingCharges;
	}

	@JsonProperty("shipping_charges")
	public void setShippingCharges(String shippingCharges) {
		this.shippingCharges = shippingCharges;
	}

	public ShipRocket withShippingCharges(String shippingCharges) {
		this.shippingCharges = shippingCharges;
		return this;
	}

	@JsonProperty("giftwrap_charges")
	public String getGiftwrapCharges() {
		return giftwrapCharges;
	}

	@JsonProperty("giftwrap_charges")
	public void setGiftwrapCharges(String giftwrapCharges) {
		this.giftwrapCharges = giftwrapCharges;
	}

	public ShipRocket withGiftwrapCharges(String giftwrapCharges) {
		this.giftwrapCharges = giftwrapCharges;
		return this;
	}

	@JsonProperty("transaction_charges")
	public String getTransactionCharges() {
		return transactionCharges;
	}

	@JsonProperty("transaction_charges")
	public void setTransactionCharges(String transactionCharges) {
		this.transactionCharges = transactionCharges;
	}

	public ShipRocket withTransactionCharges(String transactionCharges) {
		this.transactionCharges = transactionCharges;
		return this;
	}

	@JsonProperty("total_discount")
	public String getTotalDiscount() {
		return totalDiscount;
	}

	@JsonProperty("total_discount")
	public void setTotalDiscount(String totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public ShipRocket withTotalDiscount(String totalDiscount) {
		this.totalDiscount = totalDiscount;
		return this;
	}

	@JsonProperty("sub_total")
	public String getSubTotal() {
		return subTotal;
	}

	@JsonProperty("sub_total")
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public ShipRocket withSubTotal(String subTotal) {
		this.subTotal = subTotal;
		return this;
	}

	@JsonProperty("length")
	public String getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(String length) {
		this.length = length;
	}

	public ShipRocket withLength(String length) {
		this.length = length;
		return this;
	}

	@JsonProperty("breadth")
	public String getBreadth() {
		return breadth;
	}

	@JsonProperty("breadth")
	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

	public ShipRocket withBreadth(String breadth) {
		this.breadth = breadth;
		return this;
	}

	@JsonProperty("height")
	public String getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(String height) {
		this.height = height;
	}

	public ShipRocket withHeight(String height) {
		this.height = height;
		return this;
	}

	@JsonProperty("weight")
	public String getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(String weight) {
		this.weight = weight;
	}

	public ShipRocket withWeight(String weight) {
		this.weight = weight;
		return this;
	}

}
