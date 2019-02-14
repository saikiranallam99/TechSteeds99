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
<div class="main">
<h1>Fees Collection</h1>
<table >
<tr>
	<th >Payment Id</th>
	<th ><c:out value="${collectFee.paymentId}"/></th>
</tr>
<tr>
	<th >Admission Number</th>
	<th ><c:out value="${collectFee.admissionNumber}"/></th>
</tr>
<tr>
	<th >Date</th>
	<th ><c:out value="${collectFee.date}"/></th>
</tr>
<tr>
	<th >Amount</th>
	<th ><c:out value="${collectFee.amount}"/></th>
</tr>
<tr>
	<th>Discount</th>
	<th><c:out value="${collectFee.discount}"/></th>
</tr>
<tr>
	<th>Fine</th>
	<th><c:out value="${collectFee.fine}"/></th>
</tr>
<tr>
	<th>Mode</th>
	<th><c:out value="${collectFee.mode}"/></th>
</tr>
<tr>
	<th>Note</th>
	<th><c:out value="${collectFee.note}"/></th>
</tr>
</table>
</div>
</body>
</html>