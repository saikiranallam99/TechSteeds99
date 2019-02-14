<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teachers Details</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Student Admission Edit Page!!</h1>
<form action="updatet" class="col-md-3" method="POST" enctype="multipart/form-data">
<pre>
Teacher Id          : <input type="text" name="teacherId" value="${t.teacherId}"/><br>
Teacher Name        : <input type="text" name="teachername" value="${t.teachername}"/><br>
Email               : <input type="text" name="email" value="${t.email}"/><br>
Gender              : <select id=tType name="gen">
                          <option value="NONE">select</option>
                          <option value="Male">Male</option>
                          <option value="Female">Female</option>
                          </select><br>
Date Of Birth       : <input type="text" name="dob" value="${t.dob}" placeholder="dd/mm/yyyy" required/><br>
ADDRESS             :<textarea name ="teacherAddr">"${t.teacherAddr}"</textarea><br>
Phone               : <input type="text" name="phone" value="${t.phone}"/><br>

<input type="submit" value="Update" />
</pre>
</form>
</div></body>
</html>