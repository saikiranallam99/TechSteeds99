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
<h2>Search Due Fees</h2>
<a href="feestatementofstudentExcelExport">Export To Excel</a> || <a href="feestatementofstudentPdfExport">Export To Pdf</a>  
<table border="1">
<tr>
	<th>Admission Number</th>
	<th>Roll Number</th>
	<th>Student Name</th>
	<th>Date Of Birth</th>
	<th>Due Date</th>
	<th>Amount</th>
	<th>Deposit</th>
	<th>Action</th>
</tr>
<%-- <c:forEach  items="${students}" var="students"> --%>
<tr>
 <td></td>
 <td></td> 
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
</tr> 
<%-- </c:forEach> --%>
</table>
</div>
</body>
</html>