package com.example.Customers.service;

import java.util.List;

import com.example.Customers.entity.CustomersEntity;

public interface CustomersService {
	

	List<CustomersEntity> getAllCustomer();
	
	CustomersEntity saveCustomers(CustomersEntity cust);
	
	CustomersEntity getCustomerById(Long id);
	
	CustomersEntity updateCustomer(CustomersEntity cust);
	
    void deleteCustomerById(Long id);

}
