package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.AddItemStock;
import com.app.model.IssueItem;
import com.app.model.Item;
import com.app.model.ItemCategory;
import com.app.model.ItemStore;
import com.app.model.ItemSupplier;
import com.app.service.IInventoryService;

@Controller
public class InventoryController 
{
	@Autowired
	private IInventoryService service;


	@RequestMapping("/showInventory")
	public String showRegPage(){
		return "Inventory";
	}


	//Add Item Stock


	@RequestMapping("/showAddItemStock")
	public String showAddItemStock(ModelMap map){
		/*List<AddItemStock> addItemStocks=service.getAllItemStocks();
		map.addAttribute("addItemStocks", addItemStocks);*/
		
		List<ItemCategory> categories=service.getAllCategories();
		map.addAttribute("categories", categories);

		List<Item> items=service.getAllItems();
		map.addAttribute("items",items );

		List<ItemStore> stores=service.getAllStores();
		map.addAttribute("stores", stores);

		List<ItemSupplier> suppliers=service.getAllSuppliers();
		map.addAttribute("suppliers",suppliers );
		return "Additemstock";
	}

	@RequestMapping(value="/insertAddItemStock",method=RequestMethod.POST)
	public String saveAddItemStock(
			@RequestParam("itemCategory")String itemCategory ,
			@RequestParam("item")String item ,
			@RequestParam("supplier")String supplier ,
			@RequestParam("store")String store ,
			@RequestParam("quantity")int quantity ,
			@RequestParam("date")String date ,
			@RequestParam("attachDocument")CommonsMultipartFile cmf ,
			ModelMap map
			)
	{
		if(cmf!=null){
			
			AddItemStock addItemStock=new AddItemStock();
			addItemStock.setItemCategory(itemCategory);
			addItemStock.setItem(item);
			addItemStock.setSupplier(supplier);
			addItemStock.setStore(store);
			addItemStock.setQuantity(quantity);
			addItemStock.setDate(date);
			addItemStock.setAttachedDocumentName(cmf.getOriginalFilename());
			addItemStock.setAttachDocument(cmf.getBytes());
			service.addItemStock(addItemStock);
			String message="ItemStock saved with ItemStockCategory    :   "+addItemStock.getItemCategory()+"item name  : "+addItemStock.getItem();
			map.addAttribute("msg",message);
			
		}
		
		return "Additemstock";
	}
	
	
	
	/*@RequestMapping("/deleteItemStock")
	public String deleteItemStock(@RequestParam("itemStockId")int itemStockId){
		service.deleteItemStock(itemStockId);
		return "redirect:showAddItemStock";
	}

	@RequestMapping("/showEditItemSupplier")
	public String showItemStockEdit(@RequestParam("itemStockId")int itemStockId,ModelMap map){
		AddItemStock addItemStock=service.getItemStockById(itemStockId);
		map.addAttribute("addItemStock",addItemStock);
		return "ItemStockDataEdit";
	}

	@RequestMapping(value="/editItemSupplier",method=RequestMethod.POST)
	public String itemStockEdit(@ModelAttribute("addItemStock")AddItemStock addItemStock){
		service.updateItemStock(addItemStock);
		return "redirect:showAddItemStock";
	}*/
	
	
	
	// ITEM SUPPLIER


	@RequestMapping("/showitemsupplier")
	public String showitemsupplier(ModelMap map){
		List<ItemSupplier> itemsuppliers=service.getAllSuppliers();
		map.addAttribute("itemsuppliers",itemsuppliers );
		return "Itemsupplier";
	}

	@RequestMapping(value="/insertItemSupplier",method=RequestMethod.POST)
	public String saveItemSupplier(@ModelAttribute("itemsupplier")ItemSupplier supplier,ModelMap map){
		int supplierId=service.saveItemSupplier(supplier);
		ItemSupplier supplier1=service.getItemSupplierById(supplierId);
		String message="Item Supplier saved with name:"+supplier1.getName()+" and Email :"+supplier1.getEmail() ;
		map.addAttribute("msg",message);
		return "Itemsupplier";
	}

	@RequestMapping("/deleteItemSupplier")
	public String deleteItemSupplier(@RequestParam("supplierId")int supplierId){
		service.deleteItemSupplier(supplierId);
		return "redirect:showitemsupplier";
	}


	@RequestMapping("/showEditItemSupplier")
	public String showItemSupplierEdit(@RequestParam("supplierId")int supplierId,ModelMap map){
		ItemSupplier itemSupplier=service.getItemSupplierById(supplierId);
		map.addAttribute("itemSupplier",itemSupplier);
		return "ItemsupplierDataEdit";
	}

	@RequestMapping(value="/editItemSupplier",method=RequestMethod.POST)
	public String itemSupplierEdit(@ModelAttribute("itemSupplier")ItemSupplier itemSupplier){
		service.updateItemSupplier(itemSupplier);
		return "redirect:showitemsupplier";
	}


	//  ADD ITEM


	@RequestMapping("/showadditem")
	public String showAddItem(ModelMap map){

		List<ItemCategory> categories=service.getAllCategories();
		map.addAttribute("categories", categories);
		List<Item> additems=service.getAllItems();
		map.addAttribute("additems",additems );
		return "Additem";
	}




	@RequestMapping(value="/insertItem",method=RequestMethod.POST)
	public String saveItem(@ModelAttribute("item")Item item,ModelMap map){
		int itemId=service.addItem(item);
		Item item1=service.getItemById(itemId);
		String message="Item  saved with name:"+item1.getItemName();
		map.addAttribute("msg",message);
		return "Additem";
	}

	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam("itemId")int itemId){
		service.deleteItem(itemId);
		return "redirect:showadditem";
	}


	@RequestMapping("/showEditItem")
	public String showItemEdit(@RequestParam("itemId")int itemId,ModelMap map){
		Item item=service.getItemById(itemId);
		//List<Item> items=service.getAllItems();
		List<ItemCategory> categories=service.getAllCategories();
		map.addAttribute("categories", categories);
		map.addAttribute("item",item);
		return "ItemDataEdit";
	}

	@RequestMapping(value="/editItem",method=RequestMethod.POST)
	public String itemEdit(@ModelAttribute("item")Item item){
		service.updateItem(item);
		return "redirect:showadditem";
	}




	// ISSUE ITEM


	@RequestMapping("/showIssueItem")
	public String showIssueItem(ModelMap map){
		List<ItemCategory> categories=service.getAllCategories();
		map.addAttribute("categories", categories);

		List<Item> items=service.getAllItems();
		map.addAttribute("items",items );

		List<IssueItem> issueitems=service.getAllIssueItems();
		map.addAttribute("issueitems",issueitems );

		return "Issueitem";

	}

	@RequestMapping(value="/insertissueitem",method=RequestMethod.POST)
	public String saveIssueItem(@ModelAttribute("issueitem")IssueItem issueitem,ModelMap map){

		//int itemIssueId=
		service.addIssueItem(issueitem);
		//IssueItem issueitem1=service.getIssueItemById(itemIssueId);
		String message="IssueItem  saved ";
		map.addAttribute("msg",message);
		return "Issueitem";
	}

	@RequestMapping("/deleteissueItem")
	public String deleteIssueItem(@RequestParam("itemIssueId")int itemIssueId)
	{
		service.deleteIssueItem(itemIssueId);;
		return "redirect:showIssueItem";
	}


	@RequestMapping("/showeditissueItem")
	public String showIssueItemEdit(@RequestParam("itemIssueId")int itemIssueId,ModelMap map){
		IssueItem issueitem=service.getIssueItemById(itemIssueId);
		List<ItemCategory> categories=service.getAllCategories();
		map.addAttribute("categories", categories);
		map.addAttribute("issueitem",issueitem);
		return "IssueItemDataEdit";
	}
	@RequestMapping(value="/editissueItem",method=RequestMethod.POST)
	public String IssueItemEdit(@ModelAttribute("issueitem")IssueItem issueItem){
		service.updateIssueItem(issueItem);
		return "redirect:showIssueItem";
	}





	//ITEM STORE
	@RequestMapping("/showitemstore")
	public String showItemStorePage(ModelMap map){
		List<ItemStore> itemStores=service.getAllStores();
		map.addAttribute("itemStores", itemStores);

		return "Itemstore";
	}

	@RequestMapping(value="/insertItemStore",method=RequestMethod.POST)
	public String saveItemStore(@ModelAttribute("itemstore")ItemStore store,ModelMap map){
		int storeId=service.addItemStore(store);
		ItemStore store1=service.getItemStoreyById(storeId);
		String message="Item Store saved with name:"+store1.getItemstockname();
		map.addAttribute("msg",message);
		return "Itemstore";
	}

	@RequestMapping("/deleteStore")
	public String deleteItemStore(@RequestParam("storeId")int storeId)
	{
		service.deleteItemStore(storeId);
		return "redirect:showitemstore";
	}
	@RequestMapping("/showEditItemStore")
	public String showItemStoreEdit(@RequestParam("storeId")int storeId,ModelMap map){
		ItemStore itemStores=service.getItemStoreyById(storeId);
		map.addAttribute("itemStores",itemStores);
		return "ItemstoreDataEdit";
	}


	@RequestMapping(value="/editItemStore",method=RequestMethod.POST)
	public String itemStoreEdit(@ModelAttribute("itemstore")ItemStore itemstore){
		service.updateItemStore(itemstore);
		return "redirect:showitemstore";
	}




	//ITEM CATEGORY


	@RequestMapping("/showitemcategory")
	public String showItemCategoryPage(ModelMap map){
		List<ItemCategory> categories=service.getAllCategories();
		map.addAttribute("categories", categories);
		return "Itemcategory";
	}

	@RequestMapping(value="/insertItemCategory",method=RequestMethod.POST)
	public String saveItemCategory(@ModelAttribute("itemcategory")ItemCategory category,ModelMap map){
		int categoryId=service.addItemCategory(category);
		ItemCategory category1=service.getItemCategoryById(categoryId);
		String message="Item category saved with name:"+category1.getItemcategory() ;
		map.addAttribute("msg",message);
		return "Itemcategory";
	}
	@RequestMapping("/showEditItemCategory")
	public String showItemCategoryEdit(@RequestParam("categoryId")int categoryId,ModelMap map){
		ItemCategory itemcategory=service.getItemCategoryById(categoryId);
		map.addAttribute("itemcategory",itemcategory);
		return "ItemCategoryDataEdit";
	}

	@RequestMapping("/deleteItemCategory")
	public String deleteItemCategory(@RequestParam("categoryId")int categoryId)
	{
		service.deleteItemCategory(categoryId);
		return "redirect:showitemcategory";
	}

	@RequestMapping(value="/editItemCategory",method=RequestMethod.POST)
	public String itemCategoryEdit(@ModelAttribute("itemCategory")ItemCategory itemCategory)
	{
		service.updateItemCategory(itemCategory);
		return "redirect:showitemcategory";
	}



}
