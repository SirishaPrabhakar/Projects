package com.example.Customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Customers.repository.CustomersRepository;


@SpringBootApplication
public class CustomersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
		
	}
	
	@Autowired
	private CustomersRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
	}

}
