package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Itemtable")
public class Item {
	@Id
	@GeneratedValue
	@Column(name="itemid")
	int itemId;
	@Column(name="itemname")
	String itemName;
	@Column(name="itemcategory")
	String itemcategory;
	@Column(name="itemdescription")
	String itemdescription;
	public Item() {
		super();
	}
	public Item(int itemId) {
		super();
		this.itemId = itemId;
	}
	public Item(int itemId, String itemName, String itemcategory,
			String itemdescription) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemcategory = itemcategory;
		this.itemdescription = itemdescription;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemcategory() {
		return itemcategory;
	}
	public void setItemcategory(String itemcategory) {
		this.itemcategory = itemcategory;
	}
	public String getItemdescription() {
		return itemdescription;
	}
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemcategory=" + itemcategory + ", itemdescription="
				+ itemdescription + "]";
	}
	
	
	
}
