<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory</title>
</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>Inventory</h1><br><br>
<h2>Add Item</h2>
<form action="editItem" class="col-md-3" method="post">
<pre>
Item Id
<input type="text" name="itemId" value="${item.itemId}" readonly="readonly"/><br>
Item
<input type="text" name="itemName" value="${item.itemName}"/><br>
Item Category
<select name="itemcategory">
<c:forEach items="${categories}" var="category">
             <option value="${category.itemcategory}">${category.itemcategory}</option>
 </c:forEach></select>
<br>
Description
<textarea name="categorydescription"value="${item.itemdescription}">${item.itemdescription}</textarea><br>
<input type="submit" value="UPDATE"/>		<br>
</pre>
</form></div>
</body>
</html>