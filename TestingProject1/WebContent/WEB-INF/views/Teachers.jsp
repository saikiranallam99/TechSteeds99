<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teachers</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Teachers</h1>
<form action="insertTeachers"  class="col-md-3" method="post" enctype="multipart/form-data">
<pre>
Teacher Name   
<input type="text" name="teachername"/>
Email  
<input type="text" name="email"/>
Gender
<select name="gen">
   <option value="NONE">select</option>
   <option value="Male">Male</option>
   <option value="Female">Female</option>
</select>
Date Of Birth
<input type="text" name="dob" placeholder="dd/mm/yyyy" required>
ADDRESS
<textarea name ="teacherAddr"></textarea>
Phone
<input type="text" name="phone"/>
Teacher Photo
<input type="file" name="fileOb"/>
<input type="submit" value="save"/>	
</pre>
</form>
 ${msg} 
<br/>
<h3><a href="viewAllTchs">view All Teachers</a></h3>
</body>
</html>