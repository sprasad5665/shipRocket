package com.paymentStimulator.model.TransferRefund;

public class ShippingOption {
	private String shippingCarrierName;
	private String shippingMethodName;
	private float shippingRate;
	private String estimatedTransitTime;
	private boolean isPickup;

	// Getter Methods

	public String getShippingCarrierName() {
		return shippingCarrierName;
	}

	public String getShippingMethodName() {
		return shippingMethodName;
	}

	public float getShippingRate() {
		return shippingRate;
	}

	public String getEstimatedTransitTime() {
		return estimatedTransitTime;
	}

	public boolean getIsPickup() {
		return isPickup;
	}

	// Setter Methods

	public void setShippingCarrierName(String shippingCarrierName) {
		this.shippingCarrierName = shippingCarrierName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	public void setShippingRate(float shippingRate) {
		this.shippingRate = shippingRate;
	}

	public void setEstimatedTransitTime(String estimatedTransitTime) {
		this.estimatedTransitTime = estimatedTransitTime;
	}

	public void setIsPickup(boolean isPickup) {
		this.isPickup = isPickup;
	}
}
