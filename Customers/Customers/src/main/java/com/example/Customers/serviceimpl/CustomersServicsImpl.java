package com.example.Customers.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Customers.entity.CustomersEntity;
import com.example.Customers.repository.CustomersRepository;
import com.example.Customers.service.CustomersService;


@Service
public class CustomersServicsImpl implements CustomersService{
	
	private CustomersRepository repo;
	
	public CustomersServicsImpl(CustomersRepository repo) {
		super();
		this.repo=repo;
	}
	
	@Override
	public List<CustomersEntity> getAllCustomer() {
		return repo.findAll();
	}

	@Override
	public CustomersEntity saveCustomers(CustomersEntity cust) {
		return repo.save(cust);
	}

	@Override
	public CustomersEntity getCustomerById(Long id) {
		return repo.findById(id).get();
		
	}

	 @Override
		public CustomersEntity updateCustomer(CustomersEntity cust) {
			return repo.save(cust);
		}

		@Override
		public void deleteCustomerById(Long id) {
			repo.deleteById(id);
			
		}
}
