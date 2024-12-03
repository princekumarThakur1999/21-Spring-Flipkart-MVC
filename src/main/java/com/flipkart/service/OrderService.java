package com.flipkart.service;

import org.springframework.stereotype.Service;

import com.flipkart.request.OrderItemReq;

@Service  //if we want to make a clas as a service annotate with @Service
public class OrderService {

	public String addOrderItems(OrderItemReq odritemreq) {
		
		//Recieve data from Controller
		//Transferring data to Repository
		
		System.out.println(odritemreq.getOrderId());
		System.out.println(odritemreq.getOrderName());
		System.out.println(odritemreq.getOrderValue());
		
		return "Successfully Ordered Item added.";
	}
}
