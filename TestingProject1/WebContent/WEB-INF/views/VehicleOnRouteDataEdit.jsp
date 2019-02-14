<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp"%>
<body><div class="main">
	<h1>Transport</h1>
	
	<h2>Update Vehicle On Route</h2>
	<form action="editVehicleOnRoute" class="col-md-3" method="post">
		<pre>
VehicleOnRoute Id
<input type="text" name="vehicleOnRouteId" value="${vehicleOnRoute.vehicleOnRouteId}" readonly="readonly"/><br>
Route
<select name="route">
                         <c:forEach items="${routes}" var="routes">
                            <option value="${routes.routeTitle}">${routes.routeTitle}</option>
                         </c:forEach>
                    </select><br>

Vehicle
<select name="vehicle">
                  <c:forEach items="${vehicles}" var="vehicles">
                  <option value="${vehicles.vehicleNumber}">${vehicles.vehicleNumber}</option>
                  </c:forEach>
                  </select><br>

<input type="submit" value="Update" />		<br>
</pre>
	</form></div>
</body>
</html>