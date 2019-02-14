<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Hostel Room</title>
</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>HOSTEL</h1><br><br>
<h2>Add Hostel Room</h2>
<form action="insertHostelRoom" class="col-md-3" method="post">
<pre>
Room Number / Name
<input type="text" name="roomNumber"/>
Hostel
<select name="hostelName">
                      <c:forEach items="${addHostels}" var="addHostels">
                           <option value="${addHostels.hostelName}">${addHostels.hostelName}</option>
                      </c:forEach>
                    </select>
Room Type
<select name="roomType">
                      <c:forEach items="${roomTypes}" var="roomTypes">
                           <option value="${roomTypes.roomType}">${roomTypes.roomType}</option>
                      </c:forEach>
                    </select>
Number Of Bed
<input type="text" name="numberOfBed"/>
Cost Per Bed
<input type="text" name="nostPerBed"/>
Description
<input type="text" name="description"/>
<input type="submit" value="save"/>
</pre>
</form>
 ${msg} 
 <br>
 <a href="addHostelRoomExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Room Number / Name   </th>
	<th>Hostel </th>
	<th>Room Type </th>
	<th>Number Of Bed</th>
	<th>Cost Per Bed </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${addHostelRooms}" var="addHostelRooms">
<tr>
 <td><c:out value="${addHostelRooms.roomNumber}"/></td>
 <td><c:out value="${addHostelRooms.hostelName}"/></td>
 <td><c:out value="${addHostelRooms.roomType}"/></td> 
 <td><c:out value="${addHostelRooms.numberOfBed}"/></td> 
 <td><c:out value="${addHostelRooms.nostPerBed}"/></td>  
 <td>
 	<a href="deleteHostelRoom?roomId=${addHostelRooms.roomId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditHostelRoom?roomId=${addHostelRooms.roomId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table></div>
</body>
</html>