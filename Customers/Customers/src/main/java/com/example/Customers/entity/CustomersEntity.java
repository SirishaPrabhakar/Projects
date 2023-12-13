package com.example.Customers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class CustomersEntity {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column
		private String customer;
		@Column
		private String country;
		@Column
		private String Region;
		private String Active;
		private String customerType;
		private String businessUnit;
		private String accountName;
		
		public CustomersEntity() {
		
		}
		
		public CustomersEntity(String customer, String country, String region, String active, String customerType,
				String businessUnit, String accountName) {
			super();
			this.customer = customer;
			this.country = country;
			Region = region;
			Active = active;
			this.customerType = customerType;
			this.businessUnit = businessUnit;
			this.accountName = accountName;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCustomer() {
			return customer;
		}
		public void setCustomer(String customer) {
			this.customer = customer;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getRegion() {
			return Region;
		}
		public void setRegion(String region) {
			Region = region;
		}
		public String getActive() {
			return Active;
		}
		public void setActive(String active) {
			Active = active;
		}
		public String getCustomerType() {
			return customerType;
		}
		public void setCustomerType(String customerType) {
			this.customerType = customerType;
		}
		public String getBusinessUnit() {
			return businessUnit;
		}
		public void setBusinessUnit(String businessUnit) {
			this.businessUnit = businessUnit;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}	
}
		
		
		