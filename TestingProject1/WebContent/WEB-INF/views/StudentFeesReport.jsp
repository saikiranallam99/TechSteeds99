<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1> Fees Collection </h1><br>
<h2>Student Fees Report</h2>
<a href="itemSupplierExcelExport">Export To Excel</a> || <a href="itemSupplierExcelExport">Export To Pdf</a>
<table border="1">
<tr>
	<th>Student Name</th>
	<th>Admission Number</th>
	<th>Roll Number</th>
	<th>Father Name</th>
	<th>Total Fees</th>
	<th>Discount</th>
	<th>Paid Fees</th>
	<th>Balance</th>
</tr>
<c:forEach  items="${studentFeePaid}" var="studentFeePaid">
<tr>
 <td><c:out value="${studentFeePaid.studentName}"/></td>
 <td><c:out value="${studentFeePaid.admissionNumber}"/></td> 
 <td><c:out value="${studentFeePaid.rollNumber}"/></td>
 <td><c:out value="${studentFeePaid.fatherName}"/></td>
 <td><c:out value="${studentFeePaid.totalFees}"/></td>
 <td><c:out value="${studentFeePaid.discount}"/></td>
 <td><c:out value="${studentFeePaid.paidFees}"/></td>
 <td><c:out value="${studentFeePaid.totalFees - studentFeePaid.discount - studentFeePaid.paidFees}"/></td>
<%--  <td><c:out value="${studentFeePaid.balance}"/></td>  --%>
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>