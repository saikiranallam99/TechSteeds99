<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accountants</title>
</head>
<%@include file="Home.jsp" %>

<body>
<h1> Fees Collection </h1><br>
<h2>Accountants</h2>
<form action="insertAccountant" method="post" class="col-md-4" enctype="multipart/form-data">
<pre>
Name
<input type="text" name="accountantName"/>
Email
<input type="text" name="accountantEmail"/>
Gender
<select name="accountantGender ">
      <option value="Male">Male</option>
      <option value="Female">Female</option>
</select>
Date Of Birth
<input type="text" name="accountantDateOfBirth" placeholder="dd/mm/yyyy" required/>
Address
<textarea name="accountantAddress"></textarea>
Phone
<input type="text" name="accountantPhone"/>
Accountant Photo
<input type="file" name="accountantPhoto"/>
<input type="submit" value="save"/>
</pre>
</form>
 ${msg}
 <table border="1" class="col-md-8">
<tr>
	<th>Name </th>
	<th>Email  </th>
	<th>Date Of Birth  </th>
	<th>Phone  </th>
	<th colspan="3">Action</th>
	
</tr>
<c:forEach  items="${accountants}" var="accountants">
<tr>
 <td><c:out value="${accountants.accountantName}"/></td>
 <td><c:out value="${accountants.accountantEmail}"/></td>
 <td><c:out value="${accountants.accountantDateOfBirth}"/></td> 
 <td><c:out value="${accountants.accountantPhone}"/></td>  
 <td>
 	<a href="deleteAccountant?accountantId=${accountants.accountantId}"><i class="fa fa-times"></i></a>
 </td>
 <td>
 	<a href="showEditAccountant?accountantId=${accountants.accountantId}"><i class="fa fa-pencil"></i></a>
 </td>
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>