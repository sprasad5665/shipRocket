package com.paymentStimulator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.shiprocket.model.Ecwid.OrderDetailsEcwid;
import com.shiprocket.model.Ecwid.OrderResponse;
import com.shiprocket.model.Ecwid.RestApiConfig;
import com.shiprocket.model.ship.NewShippingDetails;
import com.shiprocket.model.ship.ShipRocket;

@RestController
public class OrderDetailsController {

//	@PostMapping(path = "/createOrder", consumes = "application/json", produces = "application/json")
//	public OrderResponse accountDetail(@RequestBody OrderItems orderRequest) {
//		OrderResponse details = hitApi(orderRequest);
//
//		return details;
//
//	}

	public OrderResponse shipRocketOrderDetails(OrderDetailsEcwid orderDetailsEcwidApiResponse) {
		NewShippingDetails newShippingDetails = new NewShippingDetails();
		ShipRocket newShipping = newShippingDetails.build(orderDetailsEcwidApiResponse);

		OrderResponse details = hitApi(newShipping);

		System.out.println("Staus of request " + details.getStatus());

		return details;

	}

	private OrderResponse hitApi(ShipRocket newShipping) {
		RestApiConfig<ShipRocket> restApiConfig = new RestApiConfig<ShipRocket>();
		OrderResponse customerDetailsEnquiryApiResponse = (OrderResponse) restApiConfig
				.doPost("https://apiv2.shiprocket.in/v1/external/orders/create/adhoc", newShipping);
		return customerDetailsEnquiryApiResponse;

	}

}
