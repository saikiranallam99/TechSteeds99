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
<h1>HOSTEL</h1><br>
<h2>Add Room Type</h2>
<form action="insertRoomType" class="col-md-3" method="post">
<pre>
Room Type
<input type="text" name="roomType"/>
Description
<textarea name="description"></textarea>
<input type="submit" value="save"/>	
</pre>
</form>
${msg} 
<br>
<a href="roomTypeExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Room Type    </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${roomTypes}" var="roomTypes">
<tr>
 <td><c:out value="${roomTypes.roomType}"/></td>
 <td><a href="deleteRoomType?roomTypeId=${roomTypes.roomTypeId}">DELETE</a></td>
 <td><a href="showEditRoomType?roomTypeId=${roomTypes.roomTypeId}">EDIT</a></td>
</tr> 
</c:forEach>
</table>
</body>
</html>