package com.paymentStimulator.model.TransferRefund;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "orderId", "newPaymentStatus", "newFulfillmentStatus" })
public class webHookData {
	@JsonProperty("orderId")
	private String orderId;
	@JsonProperty("newPaymentStatus")
	private String newPaymentStatus;
	@JsonProperty("newFulfillmentStatus")
	private String newFulfillmentStatus;

	// Getter Methods

	public String getOrderId() {
		return orderId;
	}

	public String getNewPaymentStatus() {
		return newPaymentStatus;
	}

	public String getNewFulfillmentStatus() {
		return newFulfillmentStatus;
	}

	// Setter Methods

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setNewPaymentStatus(String newPaymentStatus) {
		this.newPaymentStatus = newPaymentStatus;
	}

	public void setNewFulfillmentStatus(String newFulfillmentStatus) {
		this.newFulfillmentStatus = newFulfillmentStatus;
	}
}
