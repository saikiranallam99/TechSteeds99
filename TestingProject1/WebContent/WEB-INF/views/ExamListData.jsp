<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exams List</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Exams List!!</h1>
<a href="etExcelExport">Export Excel</a> | <a href="etPdfExport">Export to PDF</a>
<table border="1">
<tr>
            <td>Name</td>          
            <td>Note</td> 
            <th colspan="2">OPERATIONS</th>  
</tr>
 <c:forEach items="${ExamList}" var="et">
       <tr>
       <td><c:out value="${et.name}"/></td>
		<td><c:out value="${et.note}"/></td>
		
        <td>
			<a href="deleteet?examid=${et.examid}">DELETE</a>
		</td>
		<td>
			<a href="editet?examid=${et.examid}">EDIT</a>
		</td>
      </tr>	
   </c:forEach>
   </table>   	
</div></body>
</html>