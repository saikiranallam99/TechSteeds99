<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Academic Class</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Academic Class !!</h1>
<a href="csExcelExport">Export Excel</a> | <a href="csPdfExport">Export to PDF</a> 
<table border="1">
    <tr>
            <td>Class</td>          
            <td>Section</td>       
    </tr>
 <c:forEach items="${Clas}" var="cs">
 <tr>
            <td><c:out value="${cs.clas}"/></td>
		    <td><c:out value="${cs.sections}"/></td>
		    
   <td>
			<a href="deletecs?classid=${cs.classid}">DELETE</a>
		</td>
		<td>
			<a href="editcs?classid=${cs.classid}">EDIT</a>
		</td>		    
</tr>		    
 </c:forEach>
 </table>                    
</div></body>
</html>