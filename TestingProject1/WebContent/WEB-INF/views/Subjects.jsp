<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subjects</title>
</head><%@include file="Home.jsp" %>
<body>	
<form action="insertSubjects" class="col-md-3" method="post" >
<pre>
Subject Name
<input type="text" name="subjectname"/>
Subject Type
<select name="subject">
    <option value="NONE">select</option>
    <option value="Theory">Theory</option>
    <option value="Practical">Practical</option>
</select>
Subject Code
<input type="text" name="subjectcode"/>
<input type="submit" value="save"/>	
</pre>
</form>  
${msg} 
<br/>
<h3><a href="viewAllSbjs">view All Subjects</a></h3>                     
</body>
</html>