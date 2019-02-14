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
<h1>Transport</h1><br>
<h2>Assign Vehicle On Route</h2>
<form action="insertVehicleOnRoute" class="col-md-3" method="post">
<pre>
Route
<select name="route">
             <c:forEach items="${routes}" var="routes">
                 <option value="${routes.routeTitle}">${routes.routeTitle}</option>
             </c:forEach>
</select>
Vehicle
<select name="vehicle">
             <c:forEach items="${vehicles}" var="vehicles">
                 <option value="${vehicles.vehicleNumber}">${vehicles.vehicleNumber}</option>
             </c:forEach>
</select>
<input type="submit" value="save"/>
</pre>
</form>
${msg} <br>
 <a href="vehicleOnRouteExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Route   </th>
	<th>Vehicle</th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${vehiclesOnRoutes}" var="vehiclesOnRoutes">
<tr>
 <td><c:out value="${vehiclesOnRoutes.route}"/></td>
 <td><c:out value="${vehiclesOnRoutes.vehicle}"/></td> 
 <td>
 	<a href="deleteVehicleOnRoute?vehicleOnRouteId=${vehiclesOnRoutes.vehicleOnRouteId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditVehicleOnRoute?vehicleOnRouteId=${vehiclesOnRoutes.vehicleOnRouteId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table>
</body>
</html>