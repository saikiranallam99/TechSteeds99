<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Inventory</h1><br><br>
<h2>Add Item</h2>
<form action="insertItem" class="col-md-4" method="post">
<pre>
Item
<input type="text" name="itemName"/>
Item Category
<select name="itemcategory">
  <c:forEach items="${categories}" var="category">
    <option value="${category.itemcategory}">${category.itemcategory}</option>
  </c:forEach>
</select>
Description
<textarea name="categorydescription"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
 ${msg} 

 <a href="addItemExcelExport">Export To Excel</a> 
<table border="1" class="col-md-8" >
<tr>
	<th>Item   </th>
	<th>Category</th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${additems}" var="additem">
<tr>
 <td><c:out value="${additem.itemName}"/></td>
 <td><c:out value="${additem.itemcategory}"/></td> 
 <td>
 	<a href="deleteItem?itemId=${additem.itemId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditItem?itemId=${additem.itemId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table>
</body>
</html>
