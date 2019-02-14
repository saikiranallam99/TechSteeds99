<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Academics Class</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Academics Class !!</h1>
	<form action="updatecs" class="col-md-3" method="POST">
    <pre>
Class
<input type="text" name="clas" value="${cs.clas}"/><br>
Section
<<select id="csType" name="sections">
                          <option value="NONE">select</option>
                          </select>

<input type="submit" value="Update" />
</pre>
</form>
</div></body>
</html>