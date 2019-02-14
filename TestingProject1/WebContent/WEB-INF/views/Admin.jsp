<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Admin User</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>System Settings </h1><br>
<h2>Add Admin User</h2><br>
<form action="insertAdmin" class="col-md-3" method="post" >
<pre>
Admin Name
<input type="text" name="adminName"/>
Admin Email
<input type="text" name="adminEmail"/>
Admin Password
<input type="text" name="adminPassword"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 

<table border="1" class="col-md-9">
<tr>
	<th>Admin Name </th>
	<th>Admin Email </th>
	
	<th colspan="2">Action</th>
	
</tr>
<c:forEach  items="${admins}" var="admins">
<tr>
 <td><c:out value="${admins.adminName}"/></td>
 <td><c:out value="${admins.adminEmail}"/></td>
 
 <td>
 	
 </td>
 <td>
 	
 </td>
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>