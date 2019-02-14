<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction Report By Date</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h3>Transaction From ${searchByDate.dateFrom} To ${searchByDate.dateTo}</h3><br>
<h3>FeeCollection Details </h3>
<table border="1">
<tr>
	<th>Payment Id </th>
	<th>Date </th>
	<th>Name</th>
	<th>Class </th>
	<th>Fees Type </th>
	<th>Amount </th>
	<th>Discount </th>
	<th>Fine  </th>
	<th>Total</th>
	
</tr>
<%-- <c:forEach  items="" var="">
<tr>
 <td><c:out value=""/></td>
 <td><c:out value=""/></td>
 <td><c:out value=""/></td> 
 <td><c:out value=""/></td>  
 <td><c:out value=""/></td>
 <td><c:out value=""/></td>
 <td><c:out value=""/></td> 
 <td><c:out value=""/></td> 
 <td><c:out value=""/></td> 
</tr> 
</c:forEach> --%>
</table>




<h2>Income Details </h2>
<table border="1">
<tr>
	<th>Date </th>
	<th>Income Head </th>
	<th>Name </th>
	<th>Amount </th>
	
</tr>
<c:forEach  items="${income1}" var="income1">
<tr>
 <td><c:out value="${income1.date}"/></td>
 <td><c:out value="${income1.incomeHead}"/></td>
 <td><c:out value="${income1.incomeName}"/></td> 
 <td><c:out value="${income1.amount}"/></td>  
</tr> 
</c:forEach>
</table>

<h2>Expenses details </h2>
<table border="1">
<tr>
	<th>Date </th>
	<th>Expense Head </th>
	<th>Name </th>
	<th>Amount </th>
	
</tr>
<c:forEach  items="${expenses1}" var="expenses1">
<tr>
 <td><c:out value="${expenses1.date}"/></td>
 <td><c:out value="${expenses1.expensesHead}"/></td>
 <td><c:out value="${expenses1.expensesName}"/></td> 
 <td><c:out value="${expenses1.amount}"/></td>  
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>