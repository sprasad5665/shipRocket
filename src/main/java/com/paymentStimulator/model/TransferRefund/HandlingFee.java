package com.paymentStimulator.model.TransferRefund;

public class HandlingFee {
	private String name;
	private float value;
	private String description;

	// Getter Methods

	public String getName() {
		return name;
	}

	public float getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	// Setter Methods

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
