<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><%@include file="Home.jsp" %>
<body>
<form action="insertMarksGrade" class="col-md-3" method="post" >
<pre>
Grade Name
<input type="text" name="gradename"/>
Percent From
<input type="text" name="percentfrom"/>
Percent Upto
<input type="text" name="percentupto"/>
Description
<textarea name="description"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<br/>
<h3><a href="viewAllmks">view All Marks</a></h3>
</body>
</html>