<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parent Details</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Student Admission Page!!</h1>
<table border="1">
<tr>
            <td> Father Name</td>          
            <td>Father Phone </td>       
            <td>Father Occupation </td>  
            <td>Mother Name</td>          
            <td>Mother Phone </td>        
            <td>Mother Occupation</td>    
            <td>If Guardian is</td>
            <td>Guardian Name </td>        
            <td>Guardian Relation </td>  
            <td>Guardian Email</td>
            <td>Guardian Phone </td>  
           <td>Guardian Occupation </td> 
          <td>Guardian Address</td>
          <th colspan="2">OPERATIONS</th>
          
 </tr>
 <c:forEach items="${ParentDetails}" var="pd">
       <tr>
		<td><c:out value="${pd.name}"/></td>
		<td><c:out value="${pd.phone}"/></td>
		<td><c:out value="${pd.occup}"/></td>
		<td><c:out value="${pd.mname}"/></td>
		<td><c:out value="${pd.mphone}"/></td>
		<td><c:out value="${pd.moccup}"/></td>
		<td><c:out value="${pd.grn }"/></td>
		<td><c:out value="${pd.gname}"/></td>
		<td><c:out value="${pd.grltn}"/></td>
		<td><c:out value="${pd.gemail}"/></td>
		<td><c:out value="${pd.gphone}"/></td>
		<td><c:out value="${pd.goccp}"/></td>
		<td><c:out value="${pd.gadrs}"/></td>
		
		<td>
			<a href="deletePd?parentId=${pd.parentId}">DELETE</a>
		</td>
		<td>
			<a href="editPd?parentId=${pd.parentId}">EDIT</a>
		</td>
      </tr>
</c:forEach>
</table>
</div></body>
</html>