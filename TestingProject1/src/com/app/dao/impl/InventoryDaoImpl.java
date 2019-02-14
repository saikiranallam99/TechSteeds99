package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IInventoryDao;
import com.app.model.AddItemStock;
import com.app.model.IssueItem;
import com.app.model.Item;
import com.app.model.ItemCategory;
import com.app.model.ItemStore;
import com.app.model.ItemSupplier;
@Repository
public class InventoryDaoImpl implements IInventoryDao 
{
	@Autowired
	private HibernateTemplate ht;

	//ITEM SUPPLIER
	public int saveItemSupplier(ItemSupplier supplier) {
		int supplierId=(Integer) ht.save(supplier);
		return supplierId;
	}
	public ItemSupplier getItemSupplierById(int supplierId) {
		ItemSupplier supplier=ht.get(ItemSupplier.class, supplierId);
		return supplier;
	}
	public List<ItemSupplier> getAllSuppliers() {

		return ht.loadAll(ItemSupplier.class);
	}
	public void updateItemSupplier(ItemSupplier itemSupplier) {

		ht.update(itemSupplier);
	}
	public void deleteItemSupplier(int supplierId) {
		ht.delete(new ItemSupplier(supplierId));

	}


	//ITEM CATEGORY
	public int addItemCategory(ItemCategory category) {
		int categoryId=(Integer) ht.save(category);
		return categoryId;
	}
	public ItemCategory getItemCategoryById(int categoryId) {
		ItemCategory category=ht.get(ItemCategory.class, categoryId);
		return category;
	}
	public List<ItemCategory> getAllCategories() {
		return ht.loadAll(ItemCategory.class);

	}
	public void updateItemCategory(ItemCategory category) {
		ht.update(category);

	}
	public void deleteItemCategory(int categoryId) {
		ht.delete(new ItemCategory(categoryId));
	}


	//ITEM STORE
	public int addItemStore(ItemStore store) {
		int storeId=(Integer) ht.save(store);
		return storeId;
	}
	public ItemStore getItemStoreyById(int storeId) {
		ItemStore store=ht.get(ItemStore.class, storeId);
		return store;
	}
	public List<ItemStore> getAllStores() {

		return ht.loadAll(ItemStore.class);
	}
	public void updateItemStore(ItemStore itemstore) {

		ht.update(itemstore);
	}
	public void deleteItemStore(int storeId) {
		ht.delete(new ItemStore(storeId));

	}

	//ITEM
	public int addItem(Item item) {

		int itemId=(Integer) ht.save(item);
		return itemId;
	}
	public Item getItemById(int itemId) {
		Item item=ht.get(Item.class, itemId);
		return item;
	}
	public List<Item> getAllItems() {

		return ht.loadAll(Item.class);
	}
	public void updateItem(Item item) {
		ht.update(item);

	}
	public void deleteItem(int itemId) {
		ht.delete(new Item(itemId));

	}


	//ISSUEITEM 
	public int addIssueItem(IssueItem issueItem) {

		int itemIssueId=(Integer) ht.save(issueItem);
		return itemIssueId;
	}
	public IssueItem getIssueItemById(int itemIssueId) {

		IssueItem issueitem=ht.get(IssueItem.class, itemIssueId);
		return issueitem;
	}
	public List<IssueItem> getAllIssueItems() {

		return ht.loadAll(IssueItem.class);
	}
	public void updateIssueItem(IssueItem issueItem) {

		ht.update(issueItem);	
	}
	public void deleteIssueItem(int itemIssueId) {

		ht.delete(new IssueItem(itemIssueId));
	}




	//ITEMSTOCK

	public int addItemStock(AddItemStock addItemStock) {
		int addItemStockId= (Integer) ht.save(addItemStock);
		return addItemStockId;
	}
	public AddItemStock getItemStockById(int addItemStockId) {
		AddItemStock itemStock=ht.get(AddItemStock.class, addItemStockId);
		return itemStock;
	}
	public List<AddItemStock> getAllItemStocks() {
		return ht.loadAll(AddItemStock.class);
	}
	public void updateItemStock(AddItemStock addItemStock) {
		ht.update(addItemStock);

	}
	public void deleteItemStock(int addItemStockId) {
		ht.delete(new AddItemStock(addItemStockId));

	}

}
