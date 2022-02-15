package com.jpa.service;

import java.util.List;

import com.jpa.entities.Product;



public interface ProductsService {
	
	public abstract void addProduct(Product product);

	public abstract void updateProduct(Product product);

	public abstract void removeProduct(Product product);

	public abstract Product findProductById(int id);
	
	public abstract List<Product> getAllProducts();

}
 