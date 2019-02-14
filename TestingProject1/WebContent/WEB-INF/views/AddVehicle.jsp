<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Route</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>Transport</h1><br><br>
<h2>Add Vehicle</h2>
<form action="insertVehicle" class="col-md-3" method="post">
<pre>
Vehicle Number
<input type="text" name="vehicleNumber"/>
Vehicle Model
<input type="text" name="vehicleModel"/>
Year Made
<input type="text" name="yearMade"/>
Driver Name
<input type="text" name="driverName"/>
Driver License
<input type="text" name="driverLicense"/>
Driver Contact
<input type="text" name="driverContact"/>
Note
<input type="text" name="note"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<a href="vehicleExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Vehicle Number </th>
	<th>Vehicle Model  </th>
	<th>Year Made   </th>
	<th>Driver Name  </th>
	<th>Driver License  </th>
	<th>Driver Contact  </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${vehicles}" var="vehicles">
<tr>
 <td><c:out value="${vehicles.vehicleNumber}"/></td>
 <td><c:out value="${vehicles.vehicleModel}"/></td> 
 <td><c:out value="${vehicles.yearMade}"/></td>
 <td><c:out value="${vehicles.driverName}"/></td> 
 <td><c:out value="${vehicles.driverLicense}"/></td>
 <td><c:out value="${vehicles.driverContact}"/></td> 
 <td>
 	<a href="deleteVehicle?vehicleId=${vehicles.vehicleId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditVehicle?vehicleId=${vehicles.vehicleId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>