<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Book</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Library</h1><br>
<h2>Update Book</h2><br>
<form action="editBook" class="col-md-3" method="post" >
<pre>
Book Id 
<input type="text" name="bookId" value="${book.bookId}" readonly="readonly"/>
Book Title
<input type="text" name="bookTitle" value="${book.bookTitle}"/>
Book Number
<input type="text" name="bookNumber" value="${book.bookNumber}"/>
ISBN Number
<input type="text" name="bookISBNNumber" value="${book.bookISBNNumber}"/>
Publisher
<input type="text" name="publisher" value="${book.publisher}"/>
Author
<input type="text" name="author" value="${book.author}"/>
Subject
<input type="text" name="subject" value="${book.subject}"/>
Rack Number
<input type="text" name="rackNumber" value="${book.rackNumber}"/>
Qty
<input type="text" name="qty" value="${book.qty}"/>
Book Price
<input type="text" name="bookPrice" value="${book.bookPrice}"/>
Post Date
<input type="text" name="postDate" value="${book.postDate}" placeholder="dd/mm/yyyy" required/>
Description
<textarea name="bookDescription" value="${book.bookDescription}">${book.bookDescription}</textarea>
<input type="submit" value="Update"/>
</pre>
</form>
</body>
</html>