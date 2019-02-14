<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Library</h1><br>
<h2>Add Book</h2><br>
<form action="insertBook" class="col-md-4" method="post" >
<pre>
Book Title
<input type="text" name="bookTitle"/>
Book Number
<input type="text" name="bookNumber"/>
ISBN Number
<input type="text" name="bookISBNNumber"/>
Publisher
<input type="text" name="publisher"/>
Author
<input type="text" name="author"/>
Subject
<input type="text" name="subject"/>
Rack Number
<input type="text" name="rackNumber"/>
Qty
<input type="text" name="qty"/>
Book Price
<input type="text" name="bookPrice"/>
Post Date
<input type="text" name="postDate" placeholder="dd/mm/yyyy" required/>
Description
<textarea name="bookDescription"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
 ${msg} 
</body>
</html>