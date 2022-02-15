package com.jpa.service;

import java.util.List;

import com.jpa.dao.ProductDaoImpl;
import com.jpa.dao.ProductsDao;
import com.jpa.entities.Product;

public class ProductServiceImpl implements ProductsService{
	
	private ProductsDao dao;
	
	public ProductServiceImpl() {
		dao = new ProductDaoImpl();
	}

	@Override
	public void addProduct(Product product) {
		dao.beginTransaction();
		dao.addProduct(product);
		dao.commitTransaction();
		
	}

	@Override
	public void updateProduct(Product product) {
		dao.beginTransaction();
		dao.updateProduct(product);
		dao.commitTransaction();
		
	}

	@Override
	public void removeProduct(Product product) {
		dao.beginTransaction();
		dao.removeProduct(product);
		dao.commitTransaction();
		
	}

	@Override
	public Product findProductById(int id) {

		Product product = dao.getProductById(id);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}
	

}
