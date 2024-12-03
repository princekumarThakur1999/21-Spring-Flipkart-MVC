package com.flipkart.request;

import org.springframework.stereotype.Component;

@Component
public class OrderItemReq {
	
	private String orderId;
	private String orderName;
	private String orderValue;
	public OrderItemReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItemReq(String orderId, String orderName, String orderValue) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderValue = orderValue;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}	
}
