package com.suspendRestore;

public class SuspendBean {
	private int customerID;
	private int orderID;
	private String status;
	private String service;
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
