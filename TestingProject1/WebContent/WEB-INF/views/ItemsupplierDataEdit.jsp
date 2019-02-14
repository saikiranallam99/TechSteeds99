<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Item Supplier</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Inventory</h1>
<br>
<h2>Edit Item Supplier</h2>
<form action="editItemSupplier" class="col-md-3" method="post">
<pre>
ID
<input type="text" name="name" value="${itemSupplier.supplierId}" readonly="readonly"/>
NAME
<input type="text" name="name" value="${itemSupplier.name}" readonly="readonly"/>
PHONE
<input type="text" name="phone" value="${itemSupplier.phone}"/>
EMAIL
<input type="text" name="email" value="${itemSupplier.email}"/>
ADDRESS
<textarea name="address" value="${itemSupplier.address}">${itemSupplier.address}</textarea>
CONTACT PERSON NAME
<input type="text" name="contact_person_name" value="${itemSupplier.contact_person_name}"/>
CONTACT PERSON PHONE
<input type="text" name="contact_person_phone" value="${itemSupplier.contact_person_phone}"/>
CONTACT PERSON EMAIL
<input type="text" name="contact_person_email" value="${itemSupplier.contact_person_email}"/>
DESCRIPTION
<textarea name="description" value="${itemSupplier.description}">${itemSupplier.description}</textarea>
<input type="submit" value="Update"/>		
</pre>
</form>
</body>
</html>