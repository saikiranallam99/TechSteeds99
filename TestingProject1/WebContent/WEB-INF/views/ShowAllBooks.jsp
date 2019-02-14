<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Book</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Library</h1><br>
<h2>List of Book</h2><br>
<a href="bookExcelExport">Export To Excel</a> 
<table border="1">
<tr>
	<th>Book Title   </th>
	<th>Book Number   </th>
	<th>ISBN Number   </th>
	<th>Publisher   </th>
	<th>Author   </th>
	<th>Subject   </th>
	<th>Rack Number   </th>
	<th>Qty   </th>
	<th>Book Price   </th>
	<th>Post Date   </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${books}" var="books">
<tr>
 <td><c:out value="${books.bookTitle}"/></td>
 <td><c:out value="${books.bookNumber}"/></td> 
 <td><c:out value="${books.bookISBNNumber}"/></td>
 <td><c:out value="${books.publisher}"/></td> 
 <td><c:out value="${books.author}"/></td>
 <td><c:out value="${books.subject}"/></td> 
 <td><c:out value="${books.rackNumber}"/></td>
 <td><c:out value="${books.qty}"/></td> 
 <td><c:out value="${books.bookPrice}"/></td>
 <td><c:out value="${books.postDate}"/></td> 
 <td><a href="deleteBook?bookId=${books.bookId}">DELETE</a></td>
 <td><a href="showBookDataEdit?bookId=${books.bookId}">EDIT</a></td>
</tr> 
</c:forEach>
</table>
</body>
</html>
				