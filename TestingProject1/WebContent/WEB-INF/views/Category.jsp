<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Student category</h1>
<form action="insertCategory" class="col-md-3" method="post"><br>
<pre>
NAME
<input type="text" name="category"/>
<input type="submit" value="save"/>	
</pre>
</form>
</div></body>
</html>