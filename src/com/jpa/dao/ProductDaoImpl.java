package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.jpa.entities.Product;

public class ProductDaoImpl implements ProductsDao{
	
	private EntityManager entityManager;

	public ProductDaoImpl() {
		entityManager = JpaUtil.getEntityManager();
		
	}

	@Override
	public void addProduct(Product product) {
		entityManager.persist(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		entityManager.merge(product);
		
	}

	@Override
	public void removeProduct(Product product) {
		entityManager.remove(product);
		
	}

	@Override
	public Product getProductById(int id) {
		Product product = entityManager.find(Product.class, id);//select * from tname where eid=123
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		TypedQuery<Product> product = entityManager.createQuery("select p from Product p", Product.class);
		List<Product> listOfproducts = product.getResultList();
		return listOfproducts;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

}
