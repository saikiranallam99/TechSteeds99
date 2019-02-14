<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction Reports</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>Reports</h1>
<form action="searchTransactionsByDate" class="col-md-3" method="post">
<pre>
Date From
<input type="text" name="dateFrom" placeholder="dd/mm/yyyy" required/><br>
Date To
<input type="text" name="dateTo" placeholder="dd/mm/yyyy" required/><br>
<input type="submit" value="Search"/>		<br>
</pre></form>
</div>
</body>
</html>