<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Due Fees</title>
</head>
<%@include file="Home.jsp" %>

<body>
<div class="main">
<h1> Fees Collection </h1><br>
<table >
<tr>
	<th>Name</th>
	<th ><c:out value="${student.fsnm} ${student.lsnm}"/></th>
	<th>Class Section</th>
	<th><c:out value="${student.clas} (${student.sections})"/></th>
</tr>
<tr>
	<th>Father Name</th>
	<th><c:out value="${student.gname}"/></th>
	<th>Admission Number</th>
	<th><c:out value="${student.studentId}"/></th>
</tr>
<tr>
	<th>Mobile Number</th>
	<th><c:out value="${student.mbnm}"/></th>
	<th>Roll Number</th>
	<th><c:out value="${student.rlnm}"/></th>
</tr>
<tr>
	<th>Category</th>
	<th><c:out value="${student.category}"/></th>
	<th>RTE</th>
	<th><c:out value="${student.rte}"/></th>
</tr>
</table>
<br>
<h3>Fee Assigned</h3>
<table border="1">
<tr>
	<th>Fees Group</th>
	<th>Fees Code</th>
	<th>Due Date</th>
	<th>Status</th>
	<th>Amount</th>
</tr>
<c:forEach  items="${assignFee}" var="assignFee">
<tr>

 <td><c:out value="${assignFee.feeGroup}"/></td>
 <td><c:out value="${assignFee.feeType}"/></td> 
 <td><c:out value="${assignFee.dueDate}"/></td>
 <td></td>
 <td><c:out value="${assignFee.amount}"/></td>
</tr> 
</c:forEach>
</table>
<br>
<br>
<h3>Fee Paid</h3>
<table border="1">
<tr>
	<th>Payment Id</th>
	<th>Mode</th>
	<th>Date</th>
	<th>Discount</th>
	<th>Fine</th>
	<th>Paid</th>
	<th>Balance</th>
</tr>
<c:forEach  items="${payments}" var="payments">
<tr>
 <td><c:out value="${payments.paymentId}"/></td>
 <td><c:out value="${payments.mode}"/></td> 
 <td><c:out value="${payments.date}"/></td>
 <td><c:out value="${payments.discount}"/></td>
 <td><c:out value="${payments.fine}"/></td>
 <td><c:out value="${payments.amount}"/></td>
 <td></td>
</tr> 
</c:forEach>
</table>

</div>
</body>
</html>