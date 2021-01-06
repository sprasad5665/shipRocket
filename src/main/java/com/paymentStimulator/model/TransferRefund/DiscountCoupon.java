package com.paymentStimulator.model.TransferRefund;

public class DiscountCoupon {
	private float id;
	private String name;
	private String code;
	private String discountType;
	private String status;
	private float discount;
	private String launchDate;
	private String usesLimit;
	private String applicationLimit;
	private String creationDate;
	private String updateDate;
	private float orderCount;

	// Getter Methods

	public float getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getDiscountType() {
		return discountType;
	}

	public String getStatus() {
		return status;
	}

	public float getDiscount() {
		return discount;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public String getUsesLimit() {
		return usesLimit;
	}

	public String getApplicationLimit() {
		return applicationLimit;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public float getOrderCount() {
		return orderCount;
	}

	// Setter Methods

	public void setId(float id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public void setUsesLimit(String usesLimit) {
		this.usesLimit = usesLimit;
	}

	public void setApplicationLimit(String applicationLimit) {
		this.applicationLimit = applicationLimit;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public void setOrderCount(float orderCount) {
		this.orderCount = orderCount;
	}

}

