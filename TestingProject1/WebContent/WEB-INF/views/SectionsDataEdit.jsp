<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Academics Sections</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Academics Sections!!</h1>
	<form action="updatesc" class="col-md-3" method="POST">
    <pre>
Section Name
<input type="text" name="sections" value="${sc.sections}"/><br>
<input type="submit" value="Update" />
</pre>
</form>
</div></body>
</html>