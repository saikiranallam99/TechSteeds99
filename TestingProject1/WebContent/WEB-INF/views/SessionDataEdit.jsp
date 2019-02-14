<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Session</title>
</head>
<body>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>System Settings</h1>
<h2>Update Session</h2>
<form action="updateSession" class="col-md-3" method="post">
<pre>
Session ID
<input type="text" name="sessionId" value="${session.sessionId}" readonly="readonly"/><br>
Session
<input type="text" name="sessionTimePediod" value="${session.sessionTimePediod}"/><br>
<input type="submit" value="Update" />		<br>
</pre>
</form>
</div>
</body>
</html>