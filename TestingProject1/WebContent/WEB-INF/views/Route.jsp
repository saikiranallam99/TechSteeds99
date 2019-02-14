<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Route</title>
</head><%@include file="Home.jsp" %>
<body>
<h1>Transport</h1><br><br>
<h2>Create Route</h2>
<form action="insertRoute" class="col-md-3" method="post">
<pre>
Route Title
<input type="text" name="routeTitle"/>
Fare
<input type="text" name="routeFare"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<a href="routeExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Route Title    </th>
	<th>Fare  </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${routes}" var="routes">
<tr>
 <td><c:out value="${routes.routeTitle}"/></td>
 <td><c:out value="${routes.routeFare}"/></td> 
 <td><a href="deleteRoute?routeId=${routes.routeId}">DELETE</a></td>
 <td><a href="showEditRoute?routeId=${routes.routeId}">EDIT</a></td>
</tr> 
</c:forEach>
</table>
</body>
</html>