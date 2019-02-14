<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Academics Update</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Academics !!</h1>
<a href="tExcelExport">Export Excel</a> | <a href="tPdfExport">Export to PDF</a> 
<table border="1">
<tr>
            <td>Teacher Name</td>          
            <td>Email</td>       
            <td>Gender</td>  
            <td>Date Of Birth </td>          
            <td>ADDRESS</td>        
            <td>Phone</td> 
            <td colspan="2">Action</td> 

</tr>
 <c:forEach items="${Teachers}" var="t">
 <tr>
		<td><c:out value="${t.teachername}"/></td>
		<td><c:out value="${t.email}"/></td>
		<td><c:out value="${t.gen}"/></td>
		<td><c:out value="${t.dob}"/></td>
		<td><c:out value="${t.teacherAddr}"/></td>
		<td><c:out value="${t.phone}"/></td>
		
		
		
		<td>
			<a href="deletet?teacherId=${t.teacherId}">DELETE</a>
		</td>
		<td>
			<a href="editt?teacherId=${t.teacherId}">EDIT</a>
		</td>
      </tr>
</c:forEach>
</table>
</div></body>
</html>