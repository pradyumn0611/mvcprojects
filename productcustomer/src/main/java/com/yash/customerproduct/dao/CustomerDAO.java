package com.yash.customerproduct.dao;

import java.util.List;

import com.yash.customerproduct.model.Customer;

public interface CustomerDAO {

	 public void save(Customer customer);
	 
	 public List<Customer> findAll();
	
}
