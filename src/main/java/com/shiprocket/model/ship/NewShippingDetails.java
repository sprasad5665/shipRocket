package com.shiprocket.model.ship;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shiprocket.model.Ecwid.Item;
import com.shiprocket.model.Ecwid.OrderDetailsEcwid;

public class NewShippingDetails {

	private static Logger LOGGER = LoggerFactory.getLogger(NewShippingDetails.class);

	public ShipRocket build(OrderDetailsEcwid orderDetailsEcwidApiResponse) {
		ShipRocket shipRocket = new ShipRocket();
		shipRocket.setOrderId(orderDetailsEcwidApiResponse.getId());
		shipRocket.setOrderDate(orderDetailsEcwidApiResponse.getCreateDate());
		shipRocket.setPickupLocation(orderDetailsEcwidApiResponse.getShippingPerson().getCity());
		shipRocket.setComment("");
		shipRocket.setBillingCustomerName(orderDetailsEcwidApiResponse.getBillingPerson().getName());
		shipRocket.setBillingLastName("");
		shipRocket.setBillingAddress(orderDetailsEcwidApiResponse.getBillingPerson().getStreet());
		shipRocket.setBillingAddress2(orderDetailsEcwidApiResponse.getBillingPerson().getStateOrProvinceCode());
		shipRocket.setBillingCity(orderDetailsEcwidApiResponse.getBillingPerson().getCity());
		shipRocket.setBillingPincode(orderDetailsEcwidApiResponse.getBillingPerson().getPostalCode());
		shipRocket.setBillingState(orderDetailsEcwidApiResponse.getBillingPerson().getStateOrProvinceName());
		shipRocket.setBillingCountry(orderDetailsEcwidApiResponse.getBillingPerson().getCountryName());
		shipRocket.setBillingEmail(orderDetailsEcwidApiResponse.getEmail());
		shipRocket.setBillingPhone(orderDetailsEcwidApiResponse.getBillingPerson().getPhone());
		shipRocket.setShippingIsBilling(1);
		shipRocket.setShippingCustomerName("");
		shipRocket.setShippingLastName("");
		shipRocket.setShippingAddress("");
		shipRocket.setShippingAddress2("");
		shipRocket.setShippingCity("");
		shipRocket.setShippingPincode("");
		shipRocket.setShippingCountry("");
		shipRocket.setShippingState("");
		shipRocket.setShippingEmail("");
		shipRocket.setShippingPhone("");

		List<Item> orderItemsdetails = orderDetailsEcwidApiResponse.getItems();
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		Double height = 0.0, length = 0.0, bredth = 0.0, weight = 0.0;
		for (Item orderItem : orderItemsdetails) {
			OrderItem newOrderItem = new OrderItem();
			newOrderItem.setName(orderItem.getName());
			newOrderItem.setSku(orderItem.getSku());
			newOrderItem.setUnits(orderItem.getQuantity().toString());
			newOrderItem.setSellingPrice(orderItem.getPrice().toString());
			newOrderItem.setDiscount(orderItem.getCouponAmount().toString());
			newOrderItem.setTax(orderItem.getTax().toString());
			newOrderItem.setHsn("");
			orderItems.add(newOrderItem);

			height += orderItem.getDimensions().getHeight();
			length += orderItem.getDimensions().getLength();
			bredth += orderItem.getDimensions().getWidth();
			weight += orderItem.getWeight();
		}

		shipRocket.setOrderItems(orderItems);
		shipRocket.setPaymentMethod(orderDetailsEcwidApiResponse.getPaymentMethod());
		shipRocket.setShippingCharges("");
		shipRocket.setGiftwrapCharges("");
		shipRocket.setTransactionCharges("");
		shipRocket.setTotalDiscount("");
		shipRocket.setSubTotal(orderDetailsEcwidApiResponse.getSubtotal().toString());
		if (length != 0.0)
			shipRocket.setLength(length.toString());
		else
			shipRocket.setLength("0.6");
		if (bredth != 0.0)
			shipRocket.setBreadth(bredth.toString());
		else
			shipRocket.setBreadth("0.6");
		if (height != 0.0)
			shipRocket.setHeight(height.toString());
		else
			shipRocket.setHeight("0.6");
		shipRocket.setWeight(weight.toString());
		return shipRocket;

	}

}
