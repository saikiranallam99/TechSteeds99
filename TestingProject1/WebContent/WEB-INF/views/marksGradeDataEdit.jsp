<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Marks Grade</title>
</head><%@include file="Home.jsp" %>
<body>
<h1>Marks Grade</h1>
<form action="updatemg" class="col-md-3" method="POST">
<pre>
Marks Id
<input type="text" name="marksId" value="${mg.marksId}" readonly="readonly"/>
Grade Name
<input type="text" name="gradename" value="${mg.gradename}"/>
Percent From
<input type="text" name="percentfrom" value="${mg.percentfrom}"/>
Percent Upto
<input type="text" name="percentupto" value="${mg.percentupto}"/>
Description
<textarea name="description">"${mg.description}"</textarea>
<input type="submit" value="Update" />
</pre>
</form>
</body>
</html>