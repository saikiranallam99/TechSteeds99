<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian</title>
</head><%@include file="Home.jsp" %>
<body>
<h1>Library</h1><br>
<h2>Add Librarian</h2><br>
<form action="insertLibrarian" class="col-md-3" method="post" enctype="multipart/form-data">
<pre>
Name
<input type="text" name="librarianName"/>
Email
<input type="text" name="librarianEmail"/>
Gender
<select name="librarianGender ">
    <option value="Male">Male</option>
    <option value="Female">Female</option>
</select>
Date Of Birth
<input type="text" name="librarianDateOfBirth" placeholder="dd/mm/yyyy" required/>
Address
<textarea name="librarianAddress"></textarea>
Phone
<input type="text" name="librarianPhone"/>
Librarian Photo
<input type="file" name="librarianPhoto"/>
<input type="submit" value="save"/>
</pre>
</form>
 ${msg} 
 </body>
 </html>