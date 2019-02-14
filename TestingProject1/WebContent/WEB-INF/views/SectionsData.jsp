<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Academics Sections</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Academic Sections !!</h1>
<a href="scExcelExport">Export Excel</a> | <a href="scPdfExport">Export to PDF</a> 
<table border="1">
    <tr>
            <td>Section Name</td> 
    </tr>
 <c:forEach items="${Sections}" var="sc">
 <tr>
            <td> <c:out value="${sc.sections}"/></td>           
      <td>
			<a href="deletesc?sectiontId=${sc.sectiontId}">DELETE</a>
		</td>
		<td>
			<a href="editsc?sectiontId=${sc.sectiontId}">EDIT</a>
		</td>		    
</tr>		    
</c:forEach>
</table>                 
</div></body>
</html>