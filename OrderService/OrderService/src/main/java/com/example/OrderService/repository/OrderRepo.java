package com.example.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OrderService.entity.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Integer> {

}
