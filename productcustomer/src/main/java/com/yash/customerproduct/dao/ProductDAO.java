package com.yash.customerproduct.dao;

import java.util.List;

import com.yash.customerproduct.model.Product;

public interface ProductDAO {
	
	public void save(Product product);


public List<Product> findAll();

}