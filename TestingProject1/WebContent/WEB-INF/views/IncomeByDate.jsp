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
<body><div class="main">
<h1>Income </h1><br><br>
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
</table></div>
</body>
</html>