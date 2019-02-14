package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class AddItemStock {

	@Id
	@GeneratedValue
	int addItemStockId;
	String itemCategory; 
	String item ;
	String supplier ;
	String store ;
	int quantity;
	String date ;
	String attachedDocumentName;
	@Lob
	byte[] attachDocument;
	String description ;
	public AddItemStock() {
		super();
	}
	public AddItemStock(int addItemStockId) {
		super();
		this.addItemStockId = addItemStockId;
	}
	public AddItemStock(int addItemStockId, String itemCategory, String item,
			String supplier, String store, int quantity, String date,
			String attachedDocumentName, byte[] attachDocument,
			String description) {
		super();
		this.addItemStockId = addItemStockId;
		this.itemCategory = itemCategory;
		this.item = item;
		this.supplier = supplier;
		this.store = store;
		this.quantity = quantity;
		this.date = date;
		this.attachedDocumentName = attachedDocumentName;
		this.attachDocument = attachDocument;
		this.description = description;
	}
	public int getAddItemStockId() {
		return addItemStockId;
	}
	public void setAddItemStockId(int addItemStockId) {
		this.addItemStockId = addItemStockId;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAttachedDocumentName() {
		return attachedDocumentName;
	}
	public void setAttachedDocumentName(String attachedDocumentName) {
		this.attachedDocumentName = attachedDocumentName;
	}
	public byte[] getAttachDocument() {
		return attachDocument;
	}
	public void setAttachDocument(byte[] attachDocument) {
		this.attachDocument = attachDocument;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "AddItemStock [addItemStockId=" + addItemStockId
				+ ", itemCategory=" + itemCategory + ", item=" + item
				+ ", supplier=" + supplier + ", store=" + store + ", quantity="
				+ quantity + ", date=" + date + ", attachedDocumentName="
				+ attachedDocumentName + ", attachDocument="
				+ Arrays.toString(attachDocument) + ", description="
				+ description + "]";
	}
	
	
}
