<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Report</title>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1> Student  Report </h1><br>
<a href="studentsReportExcelExport">Export To Excel</a> || <a href="studentsReportPdfExport">Export To Pdf</a>  
<table border="1">
<tr>
	<th>Section</th>
	<th>Admission Number</th>
	<th>Student Name</th>
	<th>Father Name</th>
	<th>Date Of Birth</th>
	<th>Gender</th>
	<th>Category</th>
	<th>Mobile Number</th>
	<th>National Identification Number</th>
	<th>Local Identification Number	</th>
	<th>RTE</th>
</tr>
<c:forEach  items="${students}" var="students">
<tr>
 <td><c:out value="${students.sections}"/></td>
 <td><c:out value="${students.studentId}"/></td> 
 <td><c:out value="${students.fsnm} ${students.lsnm}"/></td>
 <td><c:out value="${students.gname}"/></td>
 <td><c:out value="${students.dob}"/></td>
 <td><c:out value="${students.gen}"/></td>
 <td><c:out value="${students.category}"/></td>
 <td><c:out value="${students.mbnm}"/></td>
 <td></td>
 <td></td>
 <td><c:out value="${students.rte}"/></td>
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>