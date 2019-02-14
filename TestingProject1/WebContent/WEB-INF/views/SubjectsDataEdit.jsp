<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subjects</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Student Admission Edit Page!!</h1>
	<form action="updatesb" method="POST">
    <pre>
Subject Name
<input type="text" name="subjectname" value="${sb.subjectname}"/><br>
Subject Type
<select id="sbType" name="subject">
                          <option value="NONE">select</option>
                          <option value="Theory">Theory</option>
                          <option value="Practical">Practical</option>
                          </select><br>
Subject Code
<input type="text" name="subjectcode" value="${sb.subjectcode}"/><br>          
Teacher Photo
<input type="file" name="fileOb" value="${sb.fileOb}"/>
<input type="submit" value="Update" />
</pre>
</form>
</div></body>
</html>