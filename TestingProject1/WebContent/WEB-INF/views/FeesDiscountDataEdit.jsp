<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees Discount Data Edit</title>
</head>
<%@include file="Home.jsp" %>

<body><div class="main">
<h1> Fees Collection </h1><br>
<h2> Update Fees Discount</h2>
<form action="editFeesDiscount"  method="post">
<pre>
ID
<input type="text" name="discountId" value="${feesDiscount.discountId}" readonly="readonly"/><br>
Name 
<input type="text" name="discountName" value="${feesDiscount.discountName}"/><br>
Discount Code
<input type="text" name="discountCode" value="${feesDiscount.discountCode}"/><br>
Amount
<input type="text" name="discountAmount" value="${feesDiscount.discountAmount}"/><br>
Description
<textarea name="discountDescription" value="${feesDiscount.discountDescription}">${feesDiscount.discountDescription}</textarea><br>
<input type="submit" value="save"/>		<br>
</pre>
</form> </div>
</body>
</html>