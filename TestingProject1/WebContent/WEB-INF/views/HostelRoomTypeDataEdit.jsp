<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Room Type</title>
</head>
<%@include file="Home.jsp" %>

<body>
<div class="main">
<h1>HOSTEL</h1><br><br>
<h2>Update Room Type</h2>
<form action="editRoomType" class="col-md-3" method="post">
<pre>
Room Type
<input type="text" name="roomTypeId" value="${roomType.roomTypeId}" readonly="readonly"/><br>
Room Type
<input type="text" name="roomType" value="${roomType.roomType}"/><br>
Description
<textarea name="description" value="${roomType.description}">${roomType.description}</textarea><br>
<input type="submit" value="Update"/>		<br>
</pre>
</form></div>
</body>
</html>