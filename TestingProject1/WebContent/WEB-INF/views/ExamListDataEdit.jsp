<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exam List</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Exams List</h1>
<form action="updateet" class="col-md-3" method="POST">
<pre>
Exam id
<input type="text" name="examid" value="${et.examid}" readonly="readonly"/><br>
Name
<input type="text" name="name" value="${et.name}"/><br>
Note
<textarea name ="note">"${et.note}"</textarea><br>

<input type="submit" value="Update" />
</pre>
</form>
</div></body>
</html>