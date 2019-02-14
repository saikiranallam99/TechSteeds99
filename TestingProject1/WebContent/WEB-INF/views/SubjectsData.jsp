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
<h1>Welcome to Academic Subject !!</h1>
<a href="sbExcelExport">Export Excel</a> | <a href="sbPdfExport">Export to PDF</a> 
<table border="1">
<tr>
            <td>Subject Name </td>          
            <td>Subject Type  </td>       
            <td>Subject Code </td>  
 </tr>
 <c:forEach items="${Subjects}" var="sb">
 <tr>
            <td><c:out value="${sb.subjectname}"/></td>
		    <td><c:out value="${sb.subject}"/></td>
		    <td><c:out value="${sb.subjectcode}"/></td>
		    
   <td>
			<a href="deletesb?subjectId=${sb.subjectId}">DELETE</a>
		</td>
		<td>
			<a href="editsb?subjectId=${sb.subjectId}">EDIT</a>
		</td>		    
</tr>		    
 </c:forEach>
 </table>          
</div></body>
</html>