<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Accountants</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%@include file="Home.jsp" %>

<body>
<div class="main">
<h1>System Settings</h1>
<h2>Users</h2>
<nav class="navbar navbar-default">
 <ul class="nav navbar-nav">
      <li ><a href="showAllStudents">Students</a></li>
      <li><a href="showAllParents">Parents</a></li>
      <li><a href="showAllTeachers">Teachers</a></li>
      <li><a href="showAllAccountants">Accountants</a></li>
      <li><a href="showAllLibrarians">Librarians</a></li>
    </ul>
</nav>
<h3>Teachers</h3>
<a href="tExcelExport">Export Excel</a> | <a href="tPdfExport">Export to PDF</a> 
<table border="2">
<tr>
            <td>Teacher Name</td>          
            <td>Email</td>       
            <td>Gender</td>  
            <td>Date Of Birth </td>          
            <td>ADDRESS</td>        
            <td>Phone</td> 
</tr>
 <c:forEach items="${Teachers}" var="t">
 <tr>
		<td><c:out value="${t.teachername}"/></td>
		<td><c:out value="${t.email}"/></td>
		<td><c:out value="${t.gen}"/></td>
		<td><c:out value="${t.dob}"/></td>
		<td><c:out value="${t.teacherAddr}"/></td>
		<td><c:out value="${t.phone}"/></td>
      </tr>
</c:forEach>
</table>
</div>
</body>
</html>