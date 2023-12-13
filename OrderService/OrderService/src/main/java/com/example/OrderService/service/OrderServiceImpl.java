package com.example.OrderService.service;

import java.time.Instant;
import  com.example.OrderService.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrderService.model.OrderRequestModel;
import com.example.OrderService.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRequestModel orm;
	
	@Autowired
	private OrderRepo repo;
	
	@Override
	public int placeOrder(OrderRequestModel orm) {
		Orders order=new Orders();
		order.amount=orm.getTotalAmount();
		order.orderStatus="CREATED";
		order.orderDate=Instant.now();
		order.quantity=orm.getQuantity();
		order= repo.save(order);
		
		return order.getId();
	}

}
