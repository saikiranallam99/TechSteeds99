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
<h1>Inventory</h1><br>
<h2>Add Item Category</h2><br>
<form action="insertItemCategory" class="col-md-3" method="post">
<pre>
Item Category
<input type="text" name="itemcategory"/>
Description
<textarea name="categorydescription"></textarea>
<input type="submit" value="save"/>		<br>
</pre>
</form>
 ${msg}
 
 <a href="itemCategoryExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Item Category</th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${categories}" var="categories">
<tr>
 <td><c:out value="${categories.itemcategory}"/></td>
 <td><a href="deleteItemCategory?categoryId=${categories.categoryId}">DELETE</a></td>
 <td><a href="showEditItemCategory?categoryId=${categories.categoryId}">EDIT</a></td>
</tr> 
</c:forEach>
</table>
</body>
</html>
