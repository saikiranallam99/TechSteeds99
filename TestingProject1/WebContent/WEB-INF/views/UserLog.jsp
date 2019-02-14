<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserLog</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Admin User Log</h1>
<table border="1" width="80%">
	<tr>
	    <th>Users</th>
	    <th>Role</th>
		<th>IP Address</th>
		<th>Login Time</th>
		<th>User Agent</th>

	</tr>
	<c:forEach items="${userLogs}" var="userLogs" varStatus="status">
		<tr>
			<td><c:out value="${userLogs.users}"/></td>
            <td><c:out value="${userLogs.role}"/></td>
            <td><c:out value="${userLogs.ipAddress}"/></td>
            <td><c:out value="${userLogs.loginTime}"/></td>
            <td><c:out value="${userLogs.userAgent}"/></td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>