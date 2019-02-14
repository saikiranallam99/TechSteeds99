<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Marks Grade</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Marks Grade</h1>
<a href="mgExcelExport">Export Excel</a> | <a href="mgPdfExport">Export to PDF</a>
<table border="1">
<tr>
            <td>Grade Name</td>          
            <td>Percent From</td>       
            <td>Percent Upto </td>  
            <td>Description </td> 
            <th colspan="2">OPERATIONS</th>      
  
  </tr>
 <c:forEach items="${marksGrade}" var="mg">
       <tr>
       <td><c:out value="${mg.gradename}"/></td>
		<td><c:out value="${mg.percentfrom}"/></td>
		<td><c:out value="${mg.percentupto}"/></td>
		<td><c:out value="${mg.description}"/></td>
		<td>
			<a href="deletemg?marksId=${mg.marksId}">DELETE</a>
		</td>
		<td>
			<a href="editmg?marksId=${mg.marksId}">EDIT</a>
		</td>
      </tr>
</c:forEach>
</table>
       
</div></body>
</html>