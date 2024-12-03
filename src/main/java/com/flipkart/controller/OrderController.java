package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flipkart.request.OrderItemReq;
import com.flipkart.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/add/items")
	public String addOrderItems(@RequestBody OrderItemReq orderitem) {
		
		//Controller --> Service data is transmitted
		//getting response from Service layer
		
		String response =  orderService.addOrderItems(orderitem);
		
		return response;
	}
}
