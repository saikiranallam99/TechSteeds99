<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp" %>

<body><div class="main">
<h1>Download Center</h1><br>
<h2>Syllabus List</h2><br>
<table border="1">
<tr>
	<th>Content Title </th>
	<th>Content Type </th>
	<th>Date</th>
	<th>Available For </th>
	<th colspan="2">Action</th>
	
</tr>
<c:forEach  items="${contents}" var="contents">
<tr>
 <td><c:out value="${contents.contentTitle}"/></td>
 <td><c:out value="${contents.contentType}"/></td>
 <td><c:out value="${contents.date}"/></td> 
 <td><c:out value="${contents.availabileFor}"/></td>  
 <td>
 	<a href="deleteContent?contentId=${contents.contentId}"><i class="fa fa-times"></i></a>
 </td>
 <td>
 	<a href="downloadContent?contentId=${contents.contentId}"><i class="fa fa-download"></i></a>
 </td>
</tr> 
</c:forEach>
</table></div>
</body>
</html>