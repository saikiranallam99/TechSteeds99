package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentCategory")
public class Category {
	@Id
	@GeneratedValue
	@Column(name="categoryid")
	int categoryid;

	@Column(name="categoryname")
	 String category;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int categoryid) {
		super();
		this.categoryid = categoryid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Category(int categoryid, String category) {
		super();
		this.categoryid = categoryid;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", category=" + category
				+ "]";
	}
}
