package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IInventoryDao;
import com.app.model.AddItemStock;
import com.app.model.IssueItem;
import com.app.model.Item;
import com.app.model.ItemCategory;
import com.app.model.ItemStore;
import com.app.model.ItemSupplier;
import com.app.service.IInventoryService;
@Service
public class InventoryServiceImpl implements IInventoryService 
{

	@Autowired
	private IInventoryDao dao;



	//ITEM SUPPLIER

	public int saveItemSupplier(ItemSupplier supplier) {

		return dao.saveItemSupplier(supplier);
	}
	public ItemSupplier getItemSupplierById(int supplierId) {

		return dao.getItemSupplierById(supplierId);
	}

	public List<ItemSupplier> getAllSuppliers() {

		return dao.getAllSuppliers();
	}

	public void updateItemSupplier(ItemSupplier itemSupplier) {
		dao.updateItemSupplier(itemSupplier);

	}
	public void deleteItemSupplier(int supplierId) {
		dao.deleteItemSupplier(supplierId);

	}



	//ITEM CATEGORY

	public int addItemCategory(ItemCategory category) {

		return dao.addItemCategory(category);
	}
	public ItemCategory getItemCategoryById(int categoryId) {

		return dao.getItemCategoryById(categoryId);
	}
	public void updateItemCategory(ItemCategory category) {
		dao.updateItemCategory(category);

	}
	public void deleteItemCategory(int categoryId) {
		dao.deleteItemCategory(categoryId);	
	}

	public List<ItemCategory> getAllCategories() {

		return dao.getAllCategories();
	}


	//ITEM STORE
	
	
	public int addItemStore(ItemStore store) {

		return dao.addItemStore(store);
	}
	public ItemStore getItemStoreyById(int storeId) {

		return dao.getItemStoreyById(storeId);
	}

	public List<ItemStore> getAllStores() {

		return dao.getAllStores();
	}


	public void updateItemStore(ItemStore itemstore) {
		dao.updateItemStore(itemstore);	

	}
	public void deleteItemStore(int storeId) {

		dao.deleteItemStore(storeId);
	}



	//ITEM

	public int addItem(Item item) {

		return dao.addItem(item);
	}
	public Item getItemById(int itemId) {

		return dao.getItemById(itemId);
	}
	public List<Item> getAllItems() {

		return dao.getAllItems();
	}
	public void updateItem(Item item) {
		dao.updateItem(item);

	}
	public void deleteItem(int itemId) {
		dao.deleteItem(itemId);

	}


	
	
	//ISSUE ITEM
	public int addIssueItem(IssueItem issueItem) {

		return dao.addIssueItem(issueItem);
	}
	public IssueItem getIssueItemById(int itemIssueId) {

		return dao.getIssueItemById(itemIssueId);
	}
	public List<IssueItem> getAllIssueItems() {

		return dao.getAllIssueItems();
	}
	public void updateIssueItem(IssueItem issueItem) {
		dao.updateIssueItem(issueItem);

	}
	public void deleteIssueItem(int itemIssueId) {
		dao.deleteIssueItem(itemIssueId);	
	}



	//ITEM STOCK
	
	public int addItemStock(AddItemStock addItemStock) {

		return dao.addItemStock(addItemStock);
	}
	public AddItemStock getItemStockById(int addItemStockId) {

		return dao.getItemStockById(addItemStockId);
	}
	public List<AddItemStock> getAllItemStocks() {

		return dao.getAllItemStocks();
	}
	public void updateItemStock(AddItemStock addItemStock) {

		dao.updateItemStock(addItemStock);
	}
	public void deleteItemStock(int addItemStockId) {


		dao.deleteItemStock(addItemStockId);
	}


}
