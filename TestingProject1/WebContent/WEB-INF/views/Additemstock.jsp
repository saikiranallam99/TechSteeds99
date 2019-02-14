<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Item Stock</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1> Inventory </h1>
<br>
<h2>Add Item Stock</h2>
<form action="insertAddItemStock" class="col-md-3"  method="post" enctype="multipart/form-data">
<pre>
Item Category
<select name="itemCategory">
                          <c:forEach items="${categories}" var="category">
                               <option value="${category.itemcategory}">${category.itemcategory}</option>
                          </c:forEach>
                       </select>
Item
<select name="item">
                          <c:forEach items="${items}" var="items">
                               <option value="${items.itemName}">${items.itemName}</option>
                          </c:forEach>
                       </select>
Supplier
<select name="supplier">
                           <c:forEach items="${suppliers}" var="suppliers">
                              <option value="${suppliers.name}">${suppliers.name}</option>
                           </c:forEach>
                       </select>
Store
<select name="store">
                           <c:forEach items="${stores}" var="stores">
                              <option value="${stores.itemstockname}">${stores.itemstockname}</option>
                           </c:forEach>
                       </select>
Quantity
<input type="text" name="quantity"/>
Date
<input type="text" name="date" placeholder="dd/mm/yyyy" required/>
Attach Document
<input type="file" name="attachDocument"/>
Description
<textarea name="Description"></textarea>

<input type="submit" value="save"/>
</pre>
</form>
 ${msg} <br><br>
 
 
 
 
<%--  
 <a href="addItemStockExcelExport">Export To Excel</a> 
<table border="1">
<tr>
	<th>Name</th>
	<th>Category</th>
	<th>Supplier</th>
	<th>Store</th>
	<th>Quantity</th>
	<th>Date</th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${additemstocks}" var="additemstocks">
<tr>
 <td><c:out value="${additemstocks.itemcategory}"/></td>
 <td><c:out value="${additemstocks.itemcategory}"/></td> 
 <td><c:out value="${additemstocks.itemSupplier}"/></td> 
 <td><c:out value="${additemstocks.store}"/></td> 
 <td><c:out value="${additemstocks.quantity}"/></td> 
 <td><c:out value="${additemstocks.date}"/></td> 
 <td>
 	<a href="deleteItemStock?itemStockId=${additemstocks.itemStockId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditItemStock?itemStockId=${additemstocks.itemStockId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table>
  --%>
  </div>
</body>
</html>
