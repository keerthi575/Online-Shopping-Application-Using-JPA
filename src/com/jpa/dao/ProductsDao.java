package com.jpa.dao;

import java.util.List;

import com.jpa.entities.Product;

public interface ProductsDao {
	
	public abstract Product getProductById(int id);

	public abstract void addProduct(Product product);

	public abstract void updateProduct(Product product);

	public abstract void removeProduct(Product product);
	
	public abstract List<Product> getAllProducts();
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
