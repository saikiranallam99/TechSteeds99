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
<h3>Students</h3>
<a href="stuExcelExport">Export Excel</a> | <a href="stuPdfExport">Export to PDF</a> 
<table border="1" width="100%">
	<tr>
		<th align="center">Admission Number</th>
		<th align="center"> Name </th>
		<th align="center">Class</th>
		<th align="center">Section</th>
		<th align="center">Gender</th>
		<th align="center">Date Of Birth</th>
		<th align="center">Category</th>
		<th align="center">Mobile Number</th>
        <th align="center">ACTION</th>
	</tr>
	<c:forEach items="${Students}" var="stu">
	<tr>
		<td align="center"><c:out value="${stu.studentId}"/></td>
		<td align="center"><c:out value="${stu.fsnm} ${stu.lsnm}"/></td>
		<td align="center"><c:out value="${stu.clas}"/></td>
		<td align="center"><c:out value="${stu.sections}"/></td>
		<td align="center"><c:out value="${stu.gen }"/></td>
		<td align="center"><c:out value="${stu.dob}"/></td>
		<td align="center"><c:out value="${stu.category}"/></td>
		<td align="center"><c:out value="${stu.mbnm}"/></td>
				
		<td></td>
	</tr>
</c:forEach>
</table>

</div>
</body>
</html>