package com.paymentStimulator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiprocket.model.Ecwid.OrderDetailsEcwid;
import com.shiprocket.model.Ecwid.OrderItems;
import com.shiprocket.model.Ecwid.RestApiConfig;
import com.shiprocket.model.Ecwid.webHookItems;

@RestController
public class OrderWebhook {

	@PostMapping(path = "/webhokOrderNotification", consumes = "application/json", produces = "application/json")
	public void webhookOrderDetail(@RequestBody webHookItems webHookItemss) {
		System.out.println("received payload from server with details " + webHookItemss.getWebHookData().getOrderId());
		hitApi(webHookItemss.getWebHookData().getOrderId(), webHookItemss.getStoreId());

	}

	private void hitApi(String orderId, String storeId) {
		RestApiConfig<OrderItems> restApiConfig = new RestApiConfig<OrderItems>();
//		OrderDetailsEcwid orderDetailsEcwidApiResponse = (OrderDetailsEcwid) restApiConfig
//				.doGet("https://app.ecwid.com/api/v3/" + storeId + "/orders/" + orderId + "?token=token");
		OrderDetailsEcwid orderDetailsEcwidApiResponse = (OrderDetailsEcwid) restApiConfig
				.doGet("https://6f17ba76175f.ngrok.io/data");
		System.out.println("received payload from server with details " + orderDetailsEcwidApiResponse.getId());
		OrderDetailsController OrderDetailsController = new OrderDetailsController();
		OrderDetailsController.shipRocketOrderDetails(orderDetailsEcwidApiResponse);
		//return orderDetailsEcwidApiResponse;

	}

}
