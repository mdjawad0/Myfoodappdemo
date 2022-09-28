package com.clarivate.FoodsApp.dto;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String status;
	private double totalPrice;
	private Date orderCreatedTime;
	private Date orderDeliveryTime;
	private String customerName;
	private long contactNumber;

	@ManyToOne
	@JoinColumn
	User user;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderCreatedTime() {
		return orderCreatedTime;
	}

	public void setOrderCreatedTime(Date orderCreatedTime) {
		this.orderCreatedTime = orderCreatedTime;
	}

	public Date getOrderDeliveryTime() {
		return orderDeliveryTime;
	}

	public void setOrderDeliveryTime(Date orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public FoodOrder(int id, String status, double totalPrice, Date orderCreatedTime, Date orderDeliveryTime,
			String customerName, long contactNumber) {

		this.status = status;
		this.totalPrice = totalPrice;
		this.orderCreatedTime = orderCreatedTime;
		this.orderDeliveryTime = orderDeliveryTime;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
	}

	public FoodOrder() {

	}

}
