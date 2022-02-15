package com.jpa.client;

import java.util.List;

import com.jpa.entities.Product;
import com.jpa.service.ProductServiceImpl;
import com.jpa.service.ProductsService;

public class Client {
	public static void main(String[] args) {
		
		ProductsService service = new ProductServiceImpl();
		
		Product product = new Product(1,4,"Shoes","$30","adidas");
		Product product2 = new Product(2,10,"Shirts","$30","Raymand");
		Product product3 = new Product(1,4,"Laptops","$30","Lenovo");
		service.addProduct(product);
		service.addProduct(product2);
		service.addProduct(product3);
		
	
	List<Product> prod =	service.getAllProducts();
		for(Product p:prod)
		{
			System.out.println(p);
		}
		System.out.println("End of program...");
	}

}
