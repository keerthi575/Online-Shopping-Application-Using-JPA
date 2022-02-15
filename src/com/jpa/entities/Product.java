package com.jpa.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@Column(name="ProductId",length=12)
	private int ProductId;
	@Column(name="AvailableQuantity",length=12)
	private int AvailableQuantity;
	@Column(name="ProductName",length=12)
	private String ProductName;
	@Column(name="ProductCost",length=12)
	private String ProductCost;
	@Column(name="ProductSeller",length=12)
	private String ProductSeller;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", AvailableQuantity=" + AvailableQuantity + ", ProductName="
				+ ProductName + ", ProductCost=" + ProductCost + ", ProductSeller=" + ProductSeller + "]";
	}
	
	public Product(int productId, int availableQuantity, String productName, String productCost, String productSeller) {
		super();
		ProductId = productId;
		AvailableQuantity = availableQuantity;
		ProductName = productName;
		ProductCost = productCost;
		ProductSeller = productSeller;
	}

	
	public int getProductId() {
		return ProductId;
	}
	
	public void setProductId(int productId) {
		ProductId = productId;
	}
	
	public int getAvailableQuantity() {
		return AvailableQuantity;
	}
	
	public void setAvailableQuantity(int availableQuantity) {
		AvailableQuantity = availableQuantity;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	public String getProductCost() {
		return ProductCost;
	}
	
	public void setProductCost(String productCost) {
		ProductCost = productCost;
	}
	
	public String getProductSeller() {
		return ProductSeller;
	}
	
	public void setProductSeller(String productSeller) {
		ProductSeller = productSeller;
	}

}
