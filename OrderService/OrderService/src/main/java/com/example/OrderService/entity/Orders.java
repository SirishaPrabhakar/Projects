package com.example.OrderService.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_Details")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public int productId;
	public int quantity;
	public Instant orderDate;
	public String orderStatus;
	public int amount;
	
	public Orders() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Instant getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Instant orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Orders(int productId, int quantity, Instant orderDate, String orderStatus, int amount) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", productId=" + productId + ", quantity=" + quantity + ", orderDate=" + orderDate
				+ ", orderStatus=" + orderStatus + ", amount=" + amount + "]";
	}
}
