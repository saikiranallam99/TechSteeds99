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
<h1>Transport</h1><br><br>
<h2>Update Route</h2>
<form action="editRoute" class="col-md-3" method="post">
<pre>
Route Id
<input type="text" name="routeId" value="${route.routeId}" readonly="readonly"/><br>
Route Title
<input type="text" name="routeTitle" value="${route.routeTitle}"/><br>
Fare
<input type="text" name="routeFare" value="${route.routeFare}"/><br>
<input type="submit" value="Update"/>		<br>
</pre>
</form></div>
</body>
</html>