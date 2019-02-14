<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Income </h1><br>
<h2>Income Head</h2>
<form action="searchIncomeByDate" class="col-md-3" method="post">
<pre>
Date From
<input type="text" name="dateFrom" placeholder="dd/mm/yyyy" required/>
Date To
<input type="text" name="dateTo" placeholder="dd/mm/yyyy" required/>
<input type="submit" value="Search"/>		<br>
</pre>
</form>
</body>
</html>