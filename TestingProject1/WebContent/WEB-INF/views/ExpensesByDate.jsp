<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>Expenses </h1><br>
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
</table></div>
</body>
</html>