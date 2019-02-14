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
<body>
<h1>Inventory</h1><br>
<h2>Add Item Store</h2>
<form action="editItemStore" class="col-md-3" method="post">
<pre>
Item Store Id
<input type="text" name="itemIssueId" value="${itemStores.storeId}" readonly="readonly"/>
Item Store Name
<input type="text" name="itemstockname" value="${itemStores.itemstockname}" readonly="readonly"/>
Item Stock Code
<input type="text" name="itemstockcode" value="${itemStores.itemstockcode}"/>
DESCRIPTION
<textarea name="storedescription" >${itemStores.storedescription}</textarea>
<input type="submit" value="save"/>		<br>
</pre>
</form>
 ${msg}
</body>
</html>