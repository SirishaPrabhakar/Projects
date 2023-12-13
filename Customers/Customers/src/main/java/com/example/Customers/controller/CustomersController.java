package com.example.Customers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Customers.service.CustomersService;


import com.example.Customers.entity.CustomersEntity;


@Controller
public class CustomersController {
	
	private CustomersService service;
	
	public CustomersController(CustomersService service) {
		super();
		this.service=service;
	}
	
//	 @Override
//	    public List<CustomersEntity> searchCustomers(String Customer customer) {
//	        return service.findByNameContaining(customer);
//	    }
		// handler method to handle list items and return model nd view
		@GetMapping("/customer")
		public String Listcustomer(Model model) {
			model.addAttribute("customer", service.getAllCustomer());
			return "customer";	
		}
		@GetMapping("/customer/new")
		public String CreateCustomerForm(Model model) {
			CustomersEntity cust=new CustomersEntity();
			model.addAttribute("customer",cust);
			return "create_customer";
		}
		
		@PostMapping("/customer")
		public String saveCustomers(@ModelAttribute("cust") CustomersEntity cust) {
			service.saveCustomers(cust);
			return "redirect:/customer";
		}
		
		@GetMapping("/customer/edit/{id}")
		public String editCustomerForm(@PathVariable Long id,Model model) {
			model.addAttribute("customer",service.getCustomerById(id));
			return "edit_customer";
		}

		@PostMapping("/customer/{id}")
		public String updateCustomer(@PathVariable Long id,
				@ModelAttribute("cust") CustomersEntity cust,
				Model model) {
			
			//get student from database by id
			CustomersEntity existingCustomer=service.getCustomerById(id);
			existingCustomer.setId(id);
			existingCustomer.setCustomer(cust.getCustomer());
			existingCustomer.setCountry(cust.getCountry());
			existingCustomer.setRegion(cust.getRegion());
			existingCustomer.setActive(cust.getActive());
			existingCustomer.setCustomerType(cust.getCustomerType());
			existingCustomer.setBusinessUnit(cust.getBusinessUnit());
			existingCustomer.setAccountName(cust.getAccountName());
			
			//save updated student object
			service.updateCustomer(existingCustomer);
			return "redirect:/customer";	
	}
		
		@GetMapping("/customer/{id}")
		public String deleteCustomer(@PathVariable Long id) {
		service.deleteCustomerById(id);
		return "redirect:/customer";
		}	
}
