package com.app.service;

import java.util.List;

import com.app.model.AddItemStock;
import com.app.model.IssueItem;
import com.app.model.Item;
import com.app.model.ItemCategory;
import com.app.model.ItemStore;
import com.app.model.ItemSupplier;

public interface IInventoryService {
	public int  addIssueItem(IssueItem issueItem);
	public IssueItem  getIssueItemById(int itemIssueId);
	public List<IssueItem> getAllIssueItems();
	public void updateIssueItem(IssueItem issueItem);
	public void deleteIssueItem(int itemIssueId);
	
	public int  addItemStore(ItemStore store);
	public ItemStore  getItemStoreyById(int storeId);
	public List<ItemStore> getAllStores();
	public void updateItemStore(ItemStore itemstore);
	public void deleteItemStore(int storeId);
	
	public int addItemCategory(ItemCategory category);
	public ItemCategory  getItemCategoryById(int categoryId);
	public List<ItemCategory> getAllCategories();
	public void updateItemCategory(ItemCategory category);
	public void deleteItemCategory(int categoryId);
	
	public int  addItem(Item item);
	public Item  getItemById(int itemId);
	public List<Item> getAllItems();
	public void updateItem(Item item);
	public void deleteItem(int itemId);
	
	public int saveItemSupplier(ItemSupplier supplier);
	public ItemSupplier  getItemSupplierById(int supplierId);
	public List<ItemSupplier> getAllSuppliers();
	public void updateItemSupplier(ItemSupplier itemSupplier);
	public void deleteItemSupplier(int supplierId);
	
	
	public int  addItemStock(AddItemStock addItemStock);
	public AddItemStock  getItemStockById(int addItemStockId);
	public List<AddItemStock> getAllItemStocks();
	public void updateItemStock(AddItemStock addItemStock);
	public void deleteItemStock(int addItemStockId);
}
