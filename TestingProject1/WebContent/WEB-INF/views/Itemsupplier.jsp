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
<h1>Inventory</h1>
<br>
<h2>Add Item Supplier</h2>
<form action="insertItemSupplier" class="col-md-3" method="post">
<pre>
NAME
<input type="text" name="name"/>
PHONE
<input type="text" name="phone"/>
EMAIL
<input type="text" name="email"/>
ADDRESS
<textarea name="address"></textarea>
CONTACT PERSON NAME
<input type="text" name="contact_person_name"/>
CONTACT PERSON PHONE
<input type="text" name="contact_person_phone"/>
CONTACT PERSON EMAIL
<input type="text" name="contact_person_email"/>
DESCRIPTION
<textarea name="description"></textarea>
<input type="submit" value="Register"/>		
</pre>
</form>
 ${msg} 
<a href="itemSupplierExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9" >
<tr>
	<th>Item Supplier </th>
	<th>CONTACT PERSON</th>
	<th>ADDRESS</th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${itemsuppliers}" var="itemsuppliers">
<tr>
 <td><c:out value="${itemsuppliers.name}"/></td>
 <td><c:out value="${itemsuppliers.contact_person_name}"/></td> 
 <td><c:out value="${itemsuppliers.address}"/></td> 
 <td>
 	<a href="deleteItemSupplier?supplierId=${itemsuppliers.supplierId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditItemSupplier?supplierId=${itemsuppliers.supplierId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table>
</body>
</html>
