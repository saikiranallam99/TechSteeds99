<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><%@include file="Home.jsp" %>
<body>
<form action="insertExamsList" class="col-md-3" method="post" >
<pre>
Name
<input type="text" name="name"/>
Note
<textarea name ="note"></textarea>
<input type="submit" value="Save"/>	
</pre>
</form>
${msg} 
<h3><a href="viewAllEms">view All ExamsList</a></h3>     
</body>
</html>