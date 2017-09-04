package com.ja.osms.model;

import javax.persistence.*;

@Entity
@Table(name = "product", uniqueConstraints = { @UniqueConstraint(columnNames = "product_id") })
public class Product {

	@Id
	private String productId;
	private String productName;
	private int productPrice;
	private String productDescription;
	
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "category_id")
	private Category category;

	// Constructor
	public Product(String productId, Category category, String productName, String productDescription,
			int productPrice) {
		super();
		this.productId = productId;
		this.category = category;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}

	// Getters
	//@Column(name = "category_id", nullable = false, unique = true)
	public Category getCategory() {
		return category;
	}

	@Column(name = "product_desc")
	public String getProductDescription() {
		return productDescription;
	}

	@Column(name = "product_id", unique = true, nullable = false)
	public String getProductId() {
		return productId;
	}

	@Column(name = "product_name")
	public String getProductName() {
		return productName;
	}

	@Column(name = "product_price")
	public int getProductPrice() {
		return productPrice;
	}

	// Setters
	public void setCategory(Category category) {
		this.category = category;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

}
