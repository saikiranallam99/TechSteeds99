<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Fees Payment</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1> Fees Collection </h1><br>
<h2>Search Fees Payment</h2>
<form action="searchByPaymentId" class="col-md-3" method="post">
<pre>
Payment Id
<input type="text" name="paymentId">         
<input type="submit" value="Search"/>		<br>
</pre>
</form>
</body>
</html>