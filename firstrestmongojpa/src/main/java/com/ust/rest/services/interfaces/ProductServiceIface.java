package com.ust.rest.services.interfaces;

import java.util.List;

import com.ust.rest.resource.Product;

public interface ProductServiceIface {
	public Product add(Product product);
	public Product getProduct(String _id);
	List<Product>getProducts();
	
}