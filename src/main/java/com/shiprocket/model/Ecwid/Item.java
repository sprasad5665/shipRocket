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
@JsonPropertyOrder({ "id", "productId", "categoryId", "price", "productPrice", "sku", "quantity", "shortDescription",
		"tax", "shipping", "quantityInStock", "name", "isShippingRequired", "weight", "trackQuantity",
		"fixedShippingRateOnly", "imageUrl", "smallThumbnailUrl", "hdThumbnailUrl", "fixedShippingRate", "digital",
		"couponApplied", "selectedOptions", "taxes", "dimensions", "couponAmount", "discounts" })
public class Item {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("productId")
	private Integer productId;
	@JsonProperty("categoryId")
	private Integer categoryId;
	@JsonProperty("price")
	private Double price;
	@JsonProperty("productPrice")
	private Integer productPrice;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("quantity")
	private Integer quantity;
	@JsonProperty("shortDescription")
	private String shortDescription;
	@JsonProperty("tax")
	private Double tax;
	@JsonProperty("shipping")
	private Double shipping;
	@JsonProperty("quantityInStock")
	private Integer quantityInStock;
	@JsonProperty("name")
	private String name;
	@JsonProperty("isShippingRequired")
	private Boolean isShippingRequired;
	@JsonProperty("weight")
	private Double weight;
	@JsonProperty("trackQuantity")
	private Boolean trackQuantity;
	@JsonProperty("fixedShippingRateOnly")
	private Boolean fixedShippingRateOnly;
	@JsonProperty("imageUrl")
	private String imageUrl;
	@JsonProperty("smallThumbnailUrl")
	private String smallThumbnailUrl;
	@JsonProperty("hdThumbnailUrl")
	private String hdThumbnailUrl;
	@JsonProperty("fixedShippingRate")
	private Integer fixedShippingRate;
	@JsonProperty("digital")
	private Boolean digital;
	@JsonProperty("couponApplied")
	private Boolean couponApplied;
	@JsonProperty("selectedOptions")
	private List<SelectedOption> selectedOptions = null;
	@JsonProperty("taxes")

	private List<Tax> taxes = null;
	@JsonProperty("dimensions")
	private Dimensions dimensions;
	@JsonProperty("couponAmount")
	private Double couponAmount;
	@JsonProperty("discounts")
	private List<Discount> discounts = null;
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

	public Item withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("productId")
	public Integer getProductId() {
		return productId;
	}

	@JsonProperty("productId")
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Item withProductId(Integer productId) {
		this.productId = productId;
		return this;
	}

	@JsonProperty("categoryId")
	public Integer getCategoryId() {
		return categoryId;
	}

	@JsonProperty("categoryId")
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Item withCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	@JsonProperty("price")
	public Double getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Double price) {
		this.price = price;
	}

	public Item withPrice(Double price) {
		this.price = price;
		return this;
	}

	@JsonProperty("productPrice")
	public Integer getProductPrice() {
		return productPrice;
	}

	@JsonProperty("productPrice")
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Item withProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
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

	public Item withSku(String sku) {
		this.sku = sku;
		return this;
	}

	@JsonProperty("quantity")
	public Integer getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item withQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

	@JsonProperty("shortDescription")
	public String getShortDescription() {
		return shortDescription;
	}

	@JsonProperty("shortDescription")
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Item withShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
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

	public Item withTax(Double tax) {
		this.tax = tax;
		return this;
	}

	@JsonProperty("shipping")
	public Double getShipping() {
		return shipping;
	}

	@JsonProperty("shipping")
	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	public Item withShipping(Double shipping) {
		this.shipping = shipping;
		return this;
	}

	@JsonProperty("quantityInStock")
	public Integer getQuantityInStock() {
		return quantityInStock;
	}

	@JsonProperty("quantityInStock")
	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public Item withQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
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

	public Item withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("isShippingRequired")
	public Boolean getIsShippingRequired() {
		return isShippingRequired;
	}

	@JsonProperty("isShippingRequired")
	public void setIsShippingRequired(Boolean isShippingRequired) {
		this.isShippingRequired = isShippingRequired;
	}

	public Item withIsShippingRequired(Boolean isShippingRequired) {
		this.isShippingRequired = isShippingRequired;
		return this;
	}

	@JsonProperty("weight")
	public Double getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Item withWeight(Double weight) {
		this.weight = weight;
		return this;
	}

	@JsonProperty("trackQuantity")
	public Boolean getTrackQuantity() {
		return trackQuantity;
	}

	@JsonProperty("trackQuantity")
	public void setTrackQuantity(Boolean trackQuantity) {
		this.trackQuantity = trackQuantity;
	}

	public Item withTrackQuantity(Boolean trackQuantity) {
		this.trackQuantity = trackQuantity;
		return this;
	}

	@JsonProperty("fixedShippingRateOnly")
	public Boolean getFixedShippingRateOnly() {
		return fixedShippingRateOnly;
	}

	@JsonProperty("fixedShippingRateOnly")
	public void setFixedShippingRateOnly(Boolean fixedShippingRateOnly) {
		this.fixedShippingRateOnly = fixedShippingRateOnly;
	}

	public Item withFixedShippingRateOnly(Boolean fixedShippingRateOnly) {
		this.fixedShippingRateOnly = fixedShippingRateOnly;
		return this;
	}

	@JsonProperty("imageUrl")
	public String getImageUrl() {
		return imageUrl;
	}

	@JsonProperty("imageUrl")
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Item withImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}

	@JsonProperty("smallThumbnailUrl")
	public String getSmallThumbnailUrl() {
		return smallThumbnailUrl;
	}

	@JsonProperty("smallThumbnailUrl")
	public void setSmallThumbnailUrl(String smallThumbnailUrl) {
		this.smallThumbnailUrl = smallThumbnailUrl;
	}

	public Item withSmallThumbnailUrl(String smallThumbnailUrl) {
		this.smallThumbnailUrl = smallThumbnailUrl;
		return this;
	}

	@JsonProperty("hdThumbnailUrl")
	public String getHdThumbnailUrl() {
		return hdThumbnailUrl;
	}

	@JsonProperty("hdThumbnailUrl")
	public void setHdThumbnailUrl(String hdThumbnailUrl) {
		this.hdThumbnailUrl = hdThumbnailUrl;
	}

	public Item withHdThumbnailUrl(String hdThumbnailUrl) {
		this.hdThumbnailUrl = hdThumbnailUrl;
		return this;
	}

	@JsonProperty("fixedShippingRate")
	public Integer getFixedShippingRate() {
		return fixedShippingRate;
	}

	@JsonProperty("fixedShippingRate")
	public void setFixedShippingRate(Integer fixedShippingRate) {
		this.fixedShippingRate = fixedShippingRate;
	}

	public Item withFixedShippingRate(Integer fixedShippingRate) {
		this.fixedShippingRate = fixedShippingRate;
		return this;
	}

	@JsonProperty("digital")
	public Boolean getDigital() {
		return digital;
	}

	@JsonProperty("digital")
	public void setDigital(Boolean digital) {
		this.digital = digital;
	}

	public Item withDigital(Boolean digital) {
		this.digital = digital;
		return this;
	}

	@JsonProperty("couponApplied")
	public Boolean getCouponApplied() {
		return couponApplied;
	}

	@JsonProperty("couponApplied")
	public void setCouponApplied(Boolean couponApplied) {
		this.couponApplied = couponApplied;
	}

	public Item withCouponApplied(Boolean couponApplied) {
		this.couponApplied = couponApplied;
		return this;
	}

	@JsonProperty("selectedOptions")
	public List<SelectedOption> getSelectedOptions() {
		return selectedOptions;
	}

	@JsonProperty("selectedOptions")
	public void setSelectedOptions(List<SelectedOption> selectedOptions) {
		this.selectedOptions = selectedOptions;
	}

	public Item withSelectedOptions(List<SelectedOption> selectedOptions) {
		this.selectedOptions = selectedOptions;
		return this;
	}

	@JsonProperty("taxes")
	public List<Tax> getTaxes() {
		return taxes;
	}

	@JsonProperty("taxes")
	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}

	public Item withTaxes(List<Tax> taxes) {
		this.taxes = taxes;
		return this;
	}

	@JsonProperty("dimensions")
	public Dimensions getDimensions() {
		return dimensions;
	}

	@JsonProperty("dimensions")
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public Item withDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
		return this;
	}

	@JsonProperty("couponAmount")
	public Double getCouponAmount() {
		return couponAmount;
	}

	@JsonProperty("couponAmount")
	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
	}

	public Item withCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
		return this;
	}

	@JsonProperty("discounts")
	public List<Discount> getDiscounts() {
		return discounts;
	}

	@JsonProperty("discounts")
	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public Item withDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
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

	public Item withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
