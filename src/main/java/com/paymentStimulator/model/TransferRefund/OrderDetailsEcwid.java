package com.paymentStimulator.model.TransferRefund;

import java.util.ArrayList;

public class OrderDetailsEcwid {

	private String id;
	private float subtotal;
	private float total;
	private float usdTotal;
	private float tax;
	private String paymentMethod;
	private String paymentStatus;
	private String fulfillmentStatus;
	private String vendorOrderNumber;
	private float orderNumber;
	private String refererUrl;
	private String globalReferer;
	private String createDate;
	private String updateDate;
	private float createTimestamp;
	private float updateTimestamp;
	private boolean hidden;
	private String orderComments;
	private String privateAdminNotes;
	private String email;
	private String ipAddress;
	private float customerId;
	private float customerGroupId;
	private String customerGroup;
	private boolean customerTaxExempt;
	private String customerTaxId;
	private boolean customerTaxIdValid;
	private boolean reversedTaxApplied;
	private float discount;
	private float couponDiscount;
	private float volumeDiscount;
	private float membershipBasedDiscount;
	private float totalAndMembershipBasedDiscount;
	ArrayList<Object> customDiscount = new ArrayList<Object>();
	DiscountCoupon DiscountCouponObject;
	ArrayList<Object> discountInfo = new ArrayList<Object>();
	ArrayList<Object> items = new ArrayList<Object>();
	private float refundedAmount;
	ArrayList<Object> refunds = new ArrayList<Object>();
	BillingPerson BillingPersonObject;
	ShippingPerson ShippingPersonObject;
	ShippingOption ShippingOptionObject;
	HandlingFee HandlingFeeObject;
	ArrayList<Object> predictedPackage = new ArrayList<Object>();
	ArrayList<Object> taxesOnShipping = new ArrayList<Object>();
	private String paymentModule;
	AdditionalInfo AdditionalInfoObject;
	ArrayList<Object> orderExtraFields = new ArrayList<Object>();
	private boolean acceptMarketing;
	private String refererId;
	private boolean disableAllCustomerNotifications;
	private boolean externalFulfillment;

	// Getter Methods

	public String getId() {
		return id;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public float getTotal() {
		return total;
	}

	public float getUsdTotal() {
		return usdTotal;
	}

	public float getTax() {
		return tax;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	public String getVendorOrderNumber() {
		return vendorOrderNumber;
	}

	public float getOrderNumber() {
		return orderNumber;
	}

	public String getRefererUrl() {
		return refererUrl;
	}

	public String getGlobalReferer() {
		return globalReferer;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public float getCreateTimestamp() {
		return createTimestamp;
	}

	public float getUpdateTimestamp() {
		return updateTimestamp;
	}

	public boolean getHidden() {
		return hidden;
	}

	public String getOrderComments() {
		return orderComments;
	}

	public String getPrivateAdminNotes() {
		return privateAdminNotes;
	}

	public String getEmail() {
		return email;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public float getCustomerId() {
		return customerId;
	}

	public float getCustomerGroupId() {
		return customerGroupId;
	}

	public String getCustomerGroup() {
		return customerGroup;
	}

	public boolean getCustomerTaxExempt() {
		return customerTaxExempt;
	}

	public String getCustomerTaxId() {
		return customerTaxId;
	}

	public boolean getCustomerTaxIdValid() {
		return customerTaxIdValid;
	}

	public boolean getReversedTaxApplied() {
		return reversedTaxApplied;
	}

	public float getDiscount() {
		return discount;
	}

	public float getCouponDiscount() {
		return couponDiscount;
	}

	public float getVolumeDiscount() {
		return volumeDiscount;
	}

	public float getMembershipBasedDiscount() {
		return membershipBasedDiscount;
	}

	public float getTotalAndMembershipBasedDiscount() {
		return totalAndMembershipBasedDiscount;
	}

	public DiscountCoupon getDiscountCoupon() {
		return DiscountCouponObject;
	}

	public float getRefundedAmount() {
		return refundedAmount;
	}

	public BillingPerson getBillingPerson() {
		return BillingPersonObject;
	}

	public ShippingPerson getShippingPerson() {
		return ShippingPersonObject;
	}

	public ShippingOption getShippingOption() {
		return ShippingOptionObject;
	}

	public HandlingFee getHandlingFee() {
		return HandlingFeeObject;
	}

	public String getPaymentModule() {
		return paymentModule;
	}

	public AdditionalInfo getAdditionalInfo() {
		return AdditionalInfoObject;
	}

	public boolean getAcceptMarketing() {
		return acceptMarketing;
	}

	public String getRefererId() {
		return refererId;
	}

	public boolean getDisableAllCustomerNotifications() {
		return disableAllCustomerNotifications;
	}

	public boolean getExternalFulfillment() {
		return externalFulfillment;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public void setUsdTotal(float usdTotal) {
		this.usdTotal = usdTotal;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public void setVendorOrderNumber(String vendorOrderNumber) {
		this.vendorOrderNumber = vendorOrderNumber;
	}

	public void setOrderNumber(float orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setRefererUrl(String refererUrl) {
		this.refererUrl = refererUrl;
	}

	public void setGlobalReferer(String globalReferer) {
		this.globalReferer = globalReferer;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public void setCreateTimestamp(float createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public void setUpdateTimestamp(float updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public void setOrderComments(String orderComments) {
		this.orderComments = orderComments;
	}

	public void setPrivateAdminNotes(String privateAdminNotes) {
		this.privateAdminNotes = privateAdminNotes;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void setCustomerId(float customerId) {
		this.customerId = customerId;
	}

	public void setCustomerGroupId(float customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
	}

	public void setCustomerTaxExempt(boolean customerTaxExempt) {
		this.customerTaxExempt = customerTaxExempt;
	}

	public void setCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
	}

	public void setCustomerTaxIdValid(boolean customerTaxIdValid) {
		this.customerTaxIdValid = customerTaxIdValid;
	}

	public void setReversedTaxApplied(boolean reversedTaxApplied) {
		this.reversedTaxApplied = reversedTaxApplied;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public void setCouponDiscount(float couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	public void setVolumeDiscount(float volumeDiscount) {
		this.volumeDiscount = volumeDiscount;
	}

	public void setMembershipBasedDiscount(float membershipBasedDiscount) {
		this.membershipBasedDiscount = membershipBasedDiscount;
	}

	public void setTotalAndMembershipBasedDiscount(float totalAndMembershipBasedDiscount) {
		this.totalAndMembershipBasedDiscount = totalAndMembershipBasedDiscount;
	}

	public void setDiscountCoupon(DiscountCoupon discountCouponObject) {
		this.DiscountCouponObject = discountCouponObject;
	}

	public void setRefundedAmount(float refundedAmount) {
		this.refundedAmount = refundedAmount;
	}

	public void setBillingPerson(BillingPerson billingPersonObject) {
		this.BillingPersonObject = billingPersonObject;
	}

	public void setShippingPerson(ShippingPerson shippingPersonObject) {
		this.ShippingPersonObject = shippingPersonObject;
	}

	public void setShippingOption(ShippingOption shippingOptionObject) {
		this.ShippingOptionObject = shippingOptionObject;
	}

	public void setHandlingFee(HandlingFee handlingFeeObject) {
		this.HandlingFeeObject = handlingFeeObject;
	}

	public void setPaymentModule(String paymentModule) {
		this.paymentModule = paymentModule;
	}

	public void setAdditionalInfo(AdditionalInfo additionalInfoObject) {
		this.AdditionalInfoObject = additionalInfoObject;
	}

	public void setAcceptMarketing(boolean acceptMarketing) {
		this.acceptMarketing = acceptMarketing;
	}

	public void setRefererId(String refererId) {
		this.refererId = refererId;
	}

	public void setDisableAllCustomerNotifications(boolean disableAllCustomerNotifications) {
		this.disableAllCustomerNotifications = disableAllCustomerNotifications;
	}

	public void setExternalFulfillment(boolean externalFulfillment) {
		this.externalFulfillment = externalFulfillment;
	}
}
