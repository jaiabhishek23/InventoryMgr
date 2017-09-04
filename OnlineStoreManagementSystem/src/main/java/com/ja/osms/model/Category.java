package com.ja.osms.model;

import javax.persistence.*;

@Entity
@Table(name = "category", uniqueConstraints = { @UniqueConstraint(columnNames = "category_id") })
public class Category {

	@Id
	private String categoryID;
	private String categoryName;

	// Constructor
	public Category(String categoryID, String categoryName) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}

	// Getters

	@Column(name = "category_id", unique = true, nullable = false)
	public String getCategoryID() {
		return categoryID;
	}

	@Column(name = "category_name", unique = true, nullable = false)
	public String getCategoryName() {
		return categoryName;
	}

	// Setters
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
