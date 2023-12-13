package com.example.OrderService.model;

import org.springframework.stereotype.Component;

@Component
public class OrderRequestModel {
	
	private int productId;
	private int totalAmount;
	private int quantity;
	
	private PaymentMode paymentMode;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public OrderRequestModel(int totalAmount, int quantity, PaymentMode paymentMode) {
		super();
		this.totalAmount = totalAmount;
		this.quantity = quantity;
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "OrderRequestModel [productId=" + productId + ", totalAmount=" + totalAmount + ", quantity=" + quantity
				+ ", paymentMode=" + paymentMode + "]";
	}
	
	public OrderRequestModel() {
		
	}

}
