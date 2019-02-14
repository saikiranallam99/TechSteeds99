<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Store</title>
</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>Inventory</h1><br>
<h2>Add Item Store</h2>
<form action="insertItemStore" class="col-md-3" method="post">
<pre>
Item Store Name
<input type="text" name="itemstockname"/>
Item Stock Code
<input type="text" name="itemstockcode"/>
DESCRIPTION
<textarea name="storedescription"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
 ${msg}
 <a href="itemStoreExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Item Store Name   </th>
	<th>Item Stock Code </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${itemStores}" var="itemstore">
<tr>
 <td><c:out value="${itemstore.itemstockname}"/></td>
 <td><c:out value="${itemstore.itemstockcode}"/></td> 
 <td><a href="deleteStore?storeId=${itemstore.storeId}">DELETE</a></td>
 <td><a href="showEditItemStore?storeId=${itemstore.storeId}">EDIT</a></td>
</tr> 
</c:forEach>
</table>
 </div>
</body>
</html>
