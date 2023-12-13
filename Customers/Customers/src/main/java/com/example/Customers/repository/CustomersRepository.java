package com.example.Customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Customers.entity.CustomersEntity;


@Repository
public interface CustomersRepository extends JpaRepository<CustomersEntity,Long> {

}
