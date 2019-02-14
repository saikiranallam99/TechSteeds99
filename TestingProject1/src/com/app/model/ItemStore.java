package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Itemstorertable")
public class ItemStore {
	@Id
	@GeneratedValue
	@Column(name="storeid")
	int storeId;
	@Column(name="itemstockname")
    String itemstockname;
	@Column(name="itemstockcode")
	String itemstockcode;
	@Column(name="storedescription")
	String storedescription;
	public ItemStore() {
		super();
	}
	public ItemStore(int storeId) {
		super();
		this.storeId = storeId;
	}
	public ItemStore(int storeId, String itemstockname, String itemstockcode,
			String storedescription) {
		super();
		this.storeId = storeId;
		this.itemstockname = itemstockname;
		this.itemstockcode = itemstockcode;
		this.storedescription = storedescription;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getItemstockname() {
		return itemstockname;
	}
	public void setItemstockname(String itemstockname) {
		this.itemstockname = itemstockname;
	}
	public String getItemstockcode() {
		return itemstockcode;
	}
	public void setItemstockcode(String itemstockcode) {
		this.itemstockcode = itemstockcode;
	}
	public String getStoredescription() {
		return storedescription;
	}
	public void setStoredescription(String storedescription) {
		this.storedescription = storedescription;
	}
	@Override
	public String toString() {
		return "ItemStore [storeId=" + storeId + ", itemstockname="
				+ itemstockname + ", itemstockcode=" + itemstockcode
				+ ", storedescription=" + storedescription + "]";
	}
	
	
}
