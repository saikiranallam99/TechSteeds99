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
<h2>Update Vehicle</h2>
<form action="editVehicle" class="col-md-3" method="post">
<pre>
Vehicle Id
<input type="text" name="vehicleId" value="${vehicle.vehicleId}" readonly="readonly"/>
Vehicle Number
<input type="text" name="vehicleNumber" value="${vehicle.vehicleNumber}"/>
Vehicle Model
<input type="text" name="vehicleModel" value="${vehicle.vehicleModel}"/>
Year Made
<input type="text" name="yearMade" value="${vehicle.yearMade}"/>
Driver Name
<input type="text" name="driverName" value="${vehicle.driverName}"/>
Driver License
<input type="text" name="driverLicense" value="${vehicle.driverLicense}"/>
Driver Contact
<input type="text" name="driverContact" value="${vehicle.driverContact}"/>
Note
<input type="text" name="note" value="${vehicle.note}"/>
<input type="submit" value="Update"/>
</pre>
</form>
</body>
</html>