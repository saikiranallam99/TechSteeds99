package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Itemcategorytable")
public class ItemCategory {
	@Id
	@GeneratedValue
	@Column(name="categoryid")
	int categoryId;
	@Column(name="itemcategory")
	String itemcategory;
	@Column(name="categorydescription")
	String categorydescription;
	public ItemCategory() {
		super();
	}
	public ItemCategory(int categoryId) {
		super();
		this.categoryId = categoryId;
	}
	public ItemCategory(int categoryId, String itemcategory,
			String categorydescription) {
		super();
		this.categoryId = categoryId;
		this.itemcategory = itemcategory;
		this.categorydescription = categorydescription;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getItemcategory() {
		return itemcategory;
	}
	public void setItemcategory(String itemcategory) {
		this.itemcategory = itemcategory;
	}
	public String getCategorydescription() {
		return categorydescription;
	}
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}
	@Override
	public String toString() {
		return "ItemCategory [categoryId=" + categoryId + ", itemcategory="
				+ itemcategory + ", categorydescription=" + categorydescription
				+ "]";
	}
	
}
