<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Content</title>
</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>Download Center</h1><br><br>
<h2>Upload Content</h2>
<form action="uploadContent" class="col-md-3" method="post" enctype="multipart/form-data">
<pre>
Content Title
<input type="text" name="contentTitle"/>
Content Type
<select name="contentType">
     <option value="Assignment">Assignment</option>
     <option value="StudyMaterial">StudyMaterial</option>
     <option value="Syllabus">Syllabus</option>
     <option value="OtherDownload">OtherDownload</option>
</select>
Class
<select name="availabileFor">
   <option value="AvailableForAll">AvailableForAll</option>
   <c:forEach items="${Clas}" var="clas">
       <option value="${clas.clas}">${clas.clas}</option>
   </c:forEach>
</select>
Upload Date
<input type="text" name="date" placeholder="dd/mm/yyyy" required/>
Description
<textarea name="description"></textarea>
Content File
<input type="file" name="contentFile"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<table border="1" class="col-md-9">
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
 	<a href="deleteContent?contentId=${contents.contentId}">DELETE</a>
 </td>
 <td>
 	<a href="downloadContent?contentId=${contents.contentId}">Download</a>
 </td>
</tr> 
</c:forEach>
</table></div>
</body>
</html>