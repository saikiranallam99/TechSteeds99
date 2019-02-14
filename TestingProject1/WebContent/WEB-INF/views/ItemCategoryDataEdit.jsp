<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IssueItemDataEdit</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Inventory</h1><br>
<h2>Edit Item Category</h2><br>
<form action="editItemCategory" method="post"><pre>
Item Id
<input type="text" name="categoryId" value="${itemcategory.categoryId}" />
Item Category
<input type="text" name="itemcategory"  value="${itemcategory.itemcategory}"/>
Description
<textarea name="categorydescription">${itemcategory.categorydescription}</textarea>
<input type="submit" value="SUBMIT"/>		
</pre>
</form>
</body>
</html>