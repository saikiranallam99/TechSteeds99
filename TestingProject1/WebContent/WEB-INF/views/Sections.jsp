<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sections</title>
</head><%@include file="Home.jsp" %>
<body>
<form action="insertSections" class="col-md-3" method="post" >
<pre>
Section Name       
<input type="text" name="sections"/>
<input type="submit" value="Save"/>
</pre>
</form>
${message}
<br/>
<h3><a href="viewAllsc">view All Sections</a></h3>
</body>
</html>