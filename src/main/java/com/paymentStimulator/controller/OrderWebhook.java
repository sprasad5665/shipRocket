package com.paymentStimulator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentStimulator.model.TransferRefund.OrderDetailsEcwid;
import com.paymentStimulator.model.TransferRefund.OrderItems;
import com.paymentStimulator.model.TransferRefund.RestApiConfig;
import com.paymentStimulator.model.TransferRefund.webHookItems;

@RestController
public class OrderWebhook {

	@PostMapping(path = "/webhokOrderNotification", consumes = "application/json", produces = "application/json")
	public void webhookOrderDetail(@RequestBody webHookItems webHookItemss) {
		System.out.println("received payload from server with details " + webHookItemss.getWebHookData().getOrderId());
		hitApi(webHookItemss.getWebHookData().getOrderId(), webHookItemss.getStoreId());

	}

	private OrderDetailsEcwid hitApi(String orderId, String storeId) {
		RestApiConfig<OrderItems> restApiConfig = new RestApiConfig<OrderItems>();
		OrderDetailsEcwid customerDetailsEnquiryApiResponse = (OrderDetailsEcwid) restApiConfig
				.doGet("https://app.ecwid.com/api/v3/" + storeId + "/orders/" + orderId + "?token=token");
		return customerDetailsEnquiryApiResponse;

	}

}
