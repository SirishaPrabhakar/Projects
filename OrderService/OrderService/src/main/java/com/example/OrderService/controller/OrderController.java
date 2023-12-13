package com.example.OrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrderService.model.OrderRequestModel;
import com.example.OrderService.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService os;
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Integer> placeOrder(@RequestBody OrderRequestModel orm) {
		int orderId=os.placeOrder(orm);
		return new ResponseEntity<> (orderId, HttpStatus.OK);
	}
}
