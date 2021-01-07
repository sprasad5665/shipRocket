package com.shiprocket.model.Ecwid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "subtotal", "total", "usdTotal", "tax", "paymentMethod", "paymentStatus",
		"fulfillmentStatus", "vendorOrderNumber", "orderNumber", "refererUrl", "globalReferer", "createDate",
		"updateDate", "createTimestamp", "updateTimestamp", "hidden", "orderComments", "privateAdminNotes", "email",
		"ipAddress", "customerId", "customerGroupId", "customerGroup", "customerTaxExempt", "customerTaxId",
		"customerTaxIdValid", "reversedTaxApplied", "discount", "couponDiscount", "volumeDiscount",
		"membershipBasedDiscount", "totalAndMembershipBasedDiscount", "customDiscount", "discountCoupon",
		"discountInfo", "items", "refundedAmount", "refunds", "billingPerson", "shippingPerson", "shippingOption",
		"handlingFee", "predictedPackage", "taxesOnShipping", "paymentModule", "additionalInfo", "paymentParams",
		"orderExtraFields", "acceptMarketing", "refererId", "disableAllCustomerNotifications", "externalFulfillment" })
public class OrderDetailsEcwid {

	@JsonProperty("id")
	private String id;
	@JsonProperty("subtotal")
	private Double subtotal;
	@JsonProperty("total")
	private Double total;
	@JsonProperty("usdTotal")
	private Double usdTotal;
	@JsonProperty("tax")
	private Double tax;
	@JsonProperty("paymentMethod")
	private String paymentMethod;
	@JsonProperty("paymentStatus")
	private String paymentStatus;
	@JsonProperty("fulfillmentStatus")
	private String fulfillmentStatus;
	@JsonProperty("vendorOrderNumber")
	private String vendorOrderNumber;
	@JsonProperty("orderNumber")
	private Integer orderNumber;
	@JsonProperty("refererUrl")
	private String refererUrl;
	@JsonProperty("globalReferer")
	private String globalReferer;
	@JsonProperty("createDate")
	private String createDate;
	@JsonProperty("updateDate")
	private String updateDate;
	@JsonProperty("createTimestamp")
	private Integer createTimestamp;
	@JsonProperty("updateTimestamp")
	private Integer updateTimestamp;
	@JsonProperty("hidden")
	private Boolean hidden;
	@JsonProperty("orderComments")
	private String orderComments;
	@JsonProperty("privateAdminNotes")
	private String privateAdminNotes;
	@JsonProperty("email")
	private String email;
	@JsonProperty("ipAddress")
	private String ipAddress;
	@JsonProperty("customerId")
	private Integer customerId;
	@JsonProperty("customerGroupId")
	private Integer customerGroupId;
	@JsonProperty("customerGroup")
	private String customerGroup;
	@JsonProperty("customerTaxExempt")
	private Boolean customerTaxExempt;
	@JsonProperty("customerTaxId")
	private String customerTaxId;
	@JsonProperty("customerTaxIdValid")
	private Boolean customerTaxIdValid;
	@JsonProperty("reversedTaxApplied")
	private Boolean reversedTaxApplied;
	@JsonProperty("discount")
	private Integer discount;
	@JsonProperty("couponDiscount")
	private Integer couponDiscount;
	@JsonProperty("volumeDiscount")
	private Integer volumeDiscount;
	@JsonProperty("membershipBasedDiscount")
	private Integer membershipBasedDiscount;
	@JsonProperty("totalAndMembershipBasedDiscount")
	private Integer totalAndMembershipBasedDiscount;
	@JsonProperty("customDiscount")
	private List<Object> customDiscount = null;
	@JsonProperty("discountCoupon")
	private DiscountCoupon discountCoupon;
	@JsonProperty("discountInfo")
	private List<DiscountInfo> discountInfo = null;
	@JsonProperty("items")
	private List<Item> items = null;
	@JsonProperty("refundedAmount")
	private Double refundedAmount;
	@JsonProperty("refunds")
	private List<Refund> refunds = null;
	@JsonProperty("billingPerson")
	private BillingPerson billingPerson;
	@JsonProperty("shippingPerson")
	private ShippingPerson shippingPerson;
	@JsonProperty("shippingOption")
	private ShippingOption shippingOption;
	@JsonProperty("handlingFee")
	private HandlingFee handlingFee;
	@JsonProperty("predictedPackage")
	private List<PredictedPackage> predictedPackage = null;
	@JsonProperty("taxesOnShipping")
	private List<TaxesOnShipping> taxesOnShipping = null;
	@JsonProperty("paymentModule")
	private String paymentModule;
	@JsonProperty("additionalInfo")
	private AdditionalInfo additionalInfo;
	@JsonProperty("paymentParams")
	private PaymentParams paymentParams;
	@JsonProperty("orderExtraFields")
	private List<OrderExtraField> orderExtraFields = null;
	@JsonProperty("acceptMarketing")
	private Boolean acceptMarketing;
	@JsonProperty("refererId")
	private String refererId;
	@JsonProperty("disableAllCustomerNotifications")
	private Boolean disableAllCustomerNotifications;
	@JsonProperty("externalFulfillment")
	private Boolean externalFulfillment;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public OrderDetailsEcwid withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("subtotal")
	public Double getSubtotal() {
		return subtotal;
	}

	@JsonProperty("subtotal")
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public OrderDetailsEcwid withSubtotal(Double subtotal) {
		this.subtotal = subtotal;
		return this;
	}

	@JsonProperty("total")
	public Double getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Double total) {
		this.total = total;
	}

	public OrderDetailsEcwid withTotal(Double total) {
		this.total = total;
		return this;
	}

	@JsonProperty("usdTotal")
	public Double getUsdTotal() {
		return usdTotal;
	}

	@JsonProperty("usdTotal")
	public void setUsdTotal(Double usdTotal) {
		this.usdTotal = usdTotal;
	}

	public OrderDetailsEcwid withUsdTotal(Double usdTotal) {
		this.usdTotal = usdTotal;
		return this;
	}

	@JsonProperty("tax")
	public Double getTax() {
		return tax;
	}

	@JsonProperty("tax")
	public void setTax(Double tax) {
		this.tax = tax;
	}

	public OrderDetailsEcwid withTax(Double tax) {
		this.tax = tax;
		return this;
	}

	@JsonProperty("paymentMethod")
	public String getPaymentMethod() {
		return paymentMethod;
	}

	@JsonProperty("paymentMethod")
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public OrderDetailsEcwid withPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	@JsonProperty("paymentStatus")
	public String getPaymentStatus() {
		return paymentStatus;
	}

	@JsonProperty("paymentStatus")
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public OrderDetailsEcwid withPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	@JsonProperty("fulfillmentStatus")
	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	@JsonProperty("fulfillmentStatus")
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public OrderDetailsEcwid withFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
		return this;
	}

	@JsonProperty("vendorOrderNumber")
	public String getVendorOrderNumber() {
		return vendorOrderNumber;
	}

	@JsonProperty("vendorOrderNumber")
	public void setVendorOrderNumber(String vendorOrderNumber) {
		this.vendorOrderNumber = vendorOrderNumber;
	}

	public OrderDetailsEcwid withVendorOrderNumber(String vendorOrderNumber) {
		this.vendorOrderNumber = vendorOrderNumber;
		return this;
	}

	@JsonProperty("orderNumber")
	public Integer getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("orderNumber")
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public OrderDetailsEcwid withOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	@JsonProperty("refererUrl")
	public String getRefererUrl() {
		return refererUrl;
	}

	@JsonProperty("refererUrl")
	public void setRefererUrl(String refererUrl) {
		this.refererUrl = refererUrl;
	}

	public OrderDetailsEcwid withRefererUrl(String refererUrl) {
		this.refererUrl = refererUrl;
		return this;
	}

	@JsonProperty("globalReferer")
	public String getGlobalReferer() {
		return globalReferer;
	}

	@JsonProperty("globalReferer")
	public void setGlobalReferer(String globalReferer) {
		this.globalReferer = globalReferer;
	}

	public OrderDetailsEcwid withGlobalReferer(String globalReferer) {
		this.globalReferer = globalReferer;
		return this;
	}

	@JsonProperty("createDate")
	public String getCreateDate() {
		return createDate;
	}

	@JsonProperty("createDate")
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public OrderDetailsEcwid withCreateDate(String createDate) {
		this.createDate = createDate;
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

	public OrderDetailsEcwid withUpdateDate(String updateDate) {
		this.updateDate = updateDate;
		return this;
	}

	@JsonProperty("createTimestamp")
	public Integer getCreateTimestamp() {
		return createTimestamp;
	}

	@JsonProperty("createTimestamp")
	public void setCreateTimestamp(Integer createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public OrderDetailsEcwid withCreateTimestamp(Integer createTimestamp) {
		this.createTimestamp = createTimestamp;
		return this;
	}

	@JsonProperty("updateTimestamp")
	public Integer getUpdateTimestamp() {
		return updateTimestamp;
	}

	@JsonProperty("updateTimestamp")
	public void setUpdateTimestamp(Integer updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public OrderDetailsEcwid withUpdateTimestamp(Integer updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
		return this;
	}

	@JsonProperty("hidden")
	public Boolean getHidden() {
		return hidden;
	}

	@JsonProperty("hidden")
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public OrderDetailsEcwid withHidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	@JsonProperty("orderComments")
	public String getOrderComments() {
		return orderComments;
	}

	@JsonProperty("orderComments")
	public void setOrderComments(String orderComments) {
		this.orderComments = orderComments;
	}

	public OrderDetailsEcwid withOrderComments(String orderComments) {
		this.orderComments = orderComments;
		return this;
	}

	@JsonProperty("privateAdminNotes")
	public String getPrivateAdminNotes() {
		return privateAdminNotes;
	}

	@JsonProperty("privateAdminNotes")
	public void setPrivateAdminNotes(String privateAdminNotes) {
		this.privateAdminNotes = privateAdminNotes;
	}

	public OrderDetailsEcwid withPrivateAdminNotes(String privateAdminNotes) {
		this.privateAdminNotes = privateAdminNotes;
		return this;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	public OrderDetailsEcwid withEmail(String email) {
		this.email = email;
		return this;
	}

	@JsonProperty("ipAddress")
	public String getIpAddress() {
		return ipAddress;
	}

	@JsonProperty("ipAddress")
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public OrderDetailsEcwid withIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		return this;
	}

	@JsonProperty("customerId")
	public Integer getCustomerId() {
		return customerId;
	}

	@JsonProperty("customerId")
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public OrderDetailsEcwid withCustomerId(Integer customerId) {
		this.customerId = customerId;
		return this;
	}

	@JsonProperty("customerGroupId")
	public Integer getCustomerGroupId() {
		return customerGroupId;
	}

	@JsonProperty("customerGroupId")
	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public OrderDetailsEcwid withCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
		return this;
	}

	@JsonProperty("customerGroup")
	public String getCustomerGroup() {
		return customerGroup;
	}

	@JsonProperty("customerGroup")
	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
	}

	public OrderDetailsEcwid withCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
		return this;
	}

	@JsonProperty("customerTaxExempt")
	public Boolean getCustomerTaxExempt() {
		return customerTaxExempt;
	}

	@JsonProperty("customerTaxExempt")
	public void setCustomerTaxExempt(Boolean customerTaxExempt) {
		this.customerTaxExempt = customerTaxExempt;
	}

	public OrderDetailsEcwid withCustomerTaxExempt(Boolean customerTaxExempt) {
		this.customerTaxExempt = customerTaxExempt;
		return this;
	}

	@JsonProperty("customerTaxId")
	public String getCustomerTaxId() {
		return customerTaxId;
	}

	@JsonProperty("customerTaxId")
	public void setCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
	}

	public OrderDetailsEcwid withCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
		return this;
	}

	@JsonProperty("customerTaxIdValid")
	public Boolean getCustomerTaxIdValid() {
		return customerTaxIdValid;
	}

	@JsonProperty("customerTaxIdValid")
	public void setCustomerTaxIdValid(Boolean customerTaxIdValid) {
		this.customerTaxIdValid = customerTaxIdValid;
	}

	public OrderDetailsEcwid withCustomerTaxIdValid(Boolean customerTaxIdValid) {
		this.customerTaxIdValid = customerTaxIdValid;
		return this;
	}

	@JsonProperty("reversedTaxApplied")
	public Boolean getReversedTaxApplied() {
		return reversedTaxApplied;
	}

	@JsonProperty("reversedTaxApplied")
	public void setReversedTaxApplied(Boolean reversedTaxApplied) {
		this.reversedTaxApplied = reversedTaxApplied;
	}

	public OrderDetailsEcwid withReversedTaxApplied(Boolean reversedTaxApplied) {
		this.reversedTaxApplied = reversedTaxApplied;
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

	public OrderDetailsEcwid withDiscount(Integer discount) {
		this.discount = discount;
		return this;
	}

	@JsonProperty("couponDiscount")
	public Integer getCouponDiscount() {
		return couponDiscount;
	}

	@JsonProperty("couponDiscount")
	public void setCouponDiscount(Integer couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	public OrderDetailsEcwid withCouponDiscount(Integer couponDiscount) {
		this.couponDiscount = couponDiscount;
		return this;
	}

	@JsonProperty("volumeDiscount")
	public Integer getVolumeDiscount() {
		return volumeDiscount;
	}

	@JsonProperty("volumeDiscount")
	public void setVolumeDiscount(Integer volumeDiscount) {
		this.volumeDiscount = volumeDiscount;
	}

	public OrderDetailsEcwid withVolumeDiscount(Integer volumeDiscount) {
		this.volumeDiscount = volumeDiscount;
		return this;
	}

	@JsonProperty("membershipBasedDiscount")
	public Integer getMembershipBasedDiscount() {
		return membershipBasedDiscount;
	}

	@JsonProperty("membershipBasedDiscount")
	public void setMembershipBasedDiscount(Integer membershipBasedDiscount) {
		this.membershipBasedDiscount = membershipBasedDiscount;
	}

	public OrderDetailsEcwid withMembershipBasedDiscount(Integer membershipBasedDiscount) {
		this.membershipBasedDiscount = membershipBasedDiscount;
		return this;
	}

	@JsonProperty("totalAndMembershipBasedDiscount")
	public Integer getTotalAndMembershipBasedDiscount() {
		return totalAndMembershipBasedDiscount;
	}

	@JsonProperty("totalAndMembershipBasedDiscount")
	public void setTotalAndMembershipBasedDiscount(Integer totalAndMembershipBasedDiscount) {
		this.totalAndMembershipBasedDiscount = totalAndMembershipBasedDiscount;
	}

	public OrderDetailsEcwid withTotalAndMembershipBasedDiscount(Integer totalAndMembershipBasedDiscount) {
		this.totalAndMembershipBasedDiscount = totalAndMembershipBasedDiscount;
		return this;
	}

	@JsonProperty("customDiscount")
	public List<Object> getCustomDiscount() {
		return customDiscount;
	}

	@JsonProperty("customDiscount")
	public void setCustomDiscount(List<Object> customDiscount) {
		this.customDiscount = customDiscount;
	}

	public OrderDetailsEcwid withCustomDiscount(List<Object> customDiscount) {
		this.customDiscount = customDiscount;
		return this;
	}

	@JsonProperty("discountCoupon")
	public DiscountCoupon getDiscountCoupon() {
		return discountCoupon;
	}

	@JsonProperty("discountCoupon")
	public void setDiscountCoupon(DiscountCoupon discountCoupon) {
		this.discountCoupon = discountCoupon;
	}

	public OrderDetailsEcwid withDiscountCoupon(DiscountCoupon discountCoupon) {
		this.discountCoupon = discountCoupon;
		return this;
	}

	@JsonProperty("discountInfo")
	public List<DiscountInfo> getDiscountInfo() {
		return discountInfo;
	}

	@JsonProperty("discountInfo")
	public void setDiscountInfo(List<DiscountInfo> discountInfo) {
		this.discountInfo = discountInfo;
	}

	public OrderDetailsEcwid withDiscountInfo(List<DiscountInfo> discountInfo) {
		this.discountInfo = discountInfo;
		return this;
	}

	@JsonProperty("items")
	public List<Item> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public OrderDetailsEcwid withItems(List<Item> items) {
		this.items = items;
		return this;
	}

	@JsonProperty("refundedAmount")
	public Double getRefundedAmount() {
		return refundedAmount;
	}

	@JsonProperty("refundedAmount")
	public void setRefundedAmount(Double refundedAmount) {
		this.refundedAmount = refundedAmount;
	}

	public OrderDetailsEcwid withRefundedAmount(Double refundedAmount) {
		this.refundedAmount = refundedAmount;
		return this;
	}

	@JsonProperty("refunds")
	public List<Refund> getRefunds() {
		return refunds;
	}

	@JsonProperty("refunds")
	public void setRefunds(List<Refund> refunds) {
		this.refunds = refunds;
	}

	public OrderDetailsEcwid withRefunds(List<Refund> refunds) {
		this.refunds = refunds;
		return this;
	}

	@JsonProperty("billingPerson")
	public BillingPerson getBillingPerson() {
		return billingPerson;
	}

	@JsonProperty("billingPerson")
	public void setBillingPerson(BillingPerson billingPerson) {
		this.billingPerson = billingPerson;
	}

	public OrderDetailsEcwid withBillingPerson(BillingPerson billingPerson) {
		this.billingPerson = billingPerson;
		return this;
	}

	@JsonProperty("shippingPerson")
	public ShippingPerson getShippingPerson() {
		return shippingPerson;
	}

	@JsonProperty("shippingPerson")
	public void setShippingPerson(ShippingPerson shippingPerson) {
		this.shippingPerson = shippingPerson;
	}

	public OrderDetailsEcwid withShippingPerson(ShippingPerson shippingPerson) {
		this.shippingPerson = shippingPerson;
		return this;
	}

	@JsonProperty("shippingOption")
	public ShippingOption getShippingOption() {
		return shippingOption;
	}

	@JsonProperty("shippingOption")
	public void setShippingOption(ShippingOption shippingOption) {
		this.shippingOption = shippingOption;
	}

	public OrderDetailsEcwid withShippingOption(ShippingOption shippingOption) {
		this.shippingOption = shippingOption;
		return this;
	}

	@JsonProperty("handlingFee")
	public HandlingFee getHandlingFee() {
		return handlingFee;
	}

	@JsonProperty("handlingFee")
	public void setHandlingFee(HandlingFee handlingFee) {
		this.handlingFee = handlingFee;
	}

	public OrderDetailsEcwid withHandlingFee(HandlingFee handlingFee) {
		this.handlingFee = handlingFee;
		return this;
	}

	@JsonProperty("predictedPackage")
	public List<PredictedPackage> getPredictedPackage() {
		return predictedPackage;
	}

	@JsonProperty("predictedPackage")
	public void setPredictedPackage(List<PredictedPackage> predictedPackage) {
		this.predictedPackage = predictedPackage;
	}

	public OrderDetailsEcwid withPredictedPackage(List<PredictedPackage> predictedPackage) {
		this.predictedPackage = predictedPackage;
		return this;
	}

	@JsonProperty("taxesOnShipping")
	public List<TaxesOnShipping> getTaxesOnShipping() {
		return taxesOnShipping;
	}

	@JsonProperty("taxesOnShipping")
	public void setTaxesOnShipping(List<TaxesOnShipping> taxesOnShipping) {
		this.taxesOnShipping = taxesOnShipping;
	}

	public OrderDetailsEcwid withTaxesOnShipping(List<TaxesOnShipping> taxesOnShipping) {
		this.taxesOnShipping = taxesOnShipping;
		return this;
	}

	@JsonProperty("paymentModule")
	public String getPaymentModule() {
		return paymentModule;
	}

	@JsonProperty("paymentModule")
	public void setPaymentModule(String paymentModule) {
		this.paymentModule = paymentModule;
	}

	public OrderDetailsEcwid withPaymentModule(String paymentModule) {
		this.paymentModule = paymentModule;
		return this;
	}

	@JsonProperty("additionalInfo")
	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	@JsonProperty("additionalInfo")
	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public OrderDetailsEcwid withAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	@JsonProperty("paymentParams")
	public PaymentParams getPaymentParams() {
		return paymentParams;
	}

	@JsonProperty("paymentParams")
	public void setPaymentParams(PaymentParams paymentParams) {
		this.paymentParams = paymentParams;
	}

	public OrderDetailsEcwid withPaymentParams(PaymentParams paymentParams) {
		this.paymentParams = paymentParams;
		return this;
	}

	@JsonProperty("orderExtraFields")
	public List<OrderExtraField> getOrderExtraFields() {
		return orderExtraFields;
	}

	@JsonProperty("orderExtraFields")
	public void setOrderExtraFields(List<OrderExtraField> orderExtraFields) {
		this.orderExtraFields = orderExtraFields;
	}

	public OrderDetailsEcwid withOrderExtraFields(List<OrderExtraField> orderExtraFields) {
		this.orderExtraFields = orderExtraFields;
		return this;
	}

	@JsonProperty("acceptMarketing")
	public Boolean getAcceptMarketing() {
		return acceptMarketing;
	}

	@JsonProperty("acceptMarketing")
	public void setAcceptMarketing(Boolean acceptMarketing) {
		this.acceptMarketing = acceptMarketing;
	}

	public OrderDetailsEcwid withAcceptMarketing(Boolean acceptMarketing) {
		this.acceptMarketing = acceptMarketing;
		return this;
	}

	@JsonProperty("refererId")
	public String getRefererId() {
		return refererId;
	}

	@JsonProperty("refererId")
	public void setRefererId(String refererId) {
		this.refererId = refererId;
	}

	public OrderDetailsEcwid withRefererId(String refererId) {
		this.refererId = refererId;
		return this;
	}

	@JsonProperty("disableAllCustomerNotifications")
	public Boolean getDisableAllCustomerNotifications() {
		return disableAllCustomerNotifications;
	}

	@JsonProperty("disableAllCustomerNotifications")
	public void setDisableAllCustomerNotifications(Boolean disableAllCustomerNotifications) {
		this.disableAllCustomerNotifications = disableAllCustomerNotifications;
	}

	public OrderDetailsEcwid withDisableAllCustomerNotifications(Boolean disableAllCustomerNotifications) {
		this.disableAllCustomerNotifications = disableAllCustomerNotifications;
		return this;
	}

	@JsonProperty("externalFulfillment")
	public Boolean getExternalFulfillment() {
		return externalFulfillment;
	}

	@JsonProperty("externalFulfillment")
	public void setExternalFulfillment(Boolean externalFulfillment) {
		this.externalFulfillment = externalFulfillment;
	}

	public OrderDetailsEcwid withExternalFulfillment(Boolean externalFulfillment) {
		this.externalFulfillment = externalFulfillment;
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

	public OrderDetailsEcwid withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
