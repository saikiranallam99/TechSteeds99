<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Issue Item</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1> Inventory </h1><br>
<h2>Issue Item</h2>
<form action="insertissueitem" class="col-md-3" method="post"><pre>
User Type
<input type="radio" name="userType" value="Teacher">  Teacher
<input type="radio" name="userType" value="Librarian">  Librarian
<input type="radio" name="userType" value="Accountant">  Accountant
<input type="radio" name="userType" value="Admin">  Admin
Issue To
<input type="text" name="issueTo"/>
Issue By
<input type="text" name="issueBy"/>
Issue Date
<input type="text" name="issueDate" placeholder="dd/mm/yyyy" required/>
Return Date
<input type="text" name="returnDate" placeholder="dd/mm/yyyy" required/>
Note
<input type="text" name="note"/>
Item Category
<select name="itemcategory">
<c:forEach items="${categories}" var="category">
 <option value="${category.itemcategory}">${category.itemcategory}</option>
 </c:forEach></select>
Item              
<input type="text" name="item"/>
Quantity
<input type="text" name="quantity"/>
<input type="submit" value="SUBMIT"/>
</pre>
</form>
 ${msg}
 

 
 <div class="" align="right">
<a  href="issueItemExcelExport"><i class="fa fa-file-excel-o" ></i></a>
</div>
<br> 
<table border="1" class="col-md-9">
<tr>
	<th>Item</th>
	<th>Item Category</th>
	<th>Issue Return</th>
	<th>Issue To </th>
	<th>Issued By </th>
	<th>Quantity  </th>
	
	<th colspan="2">OPERATIONS</th>
</tr>
<c:forEach  items="${issueitems}" var="issueitem">
<tr>
 <td><c:out value="${issueitem.item}"/></td>
 <td><c:out value="${issueitem.itemcategory}"/></td>
 <td><c:out value="${issueitem.issueDate}"/></td>
 <td><c:out value="${issueitem.issueTo}"/></td>
 <td><c:out value="${issueitem.issueBy}"/></td>
 <td><c:out value="${issueitem.quantity}"/></td>
 <td>
 	<a href="deleteissueItem?itemIssueId=${issueitem.itemIssueId}"><i class="fa fa-times"></i></a>
 </td>
 <td>
 	<a href="showeditissueItem?itemIssueId=${issueitem.itemIssueId}"><i class="fa fa-pencil"></i></a>
 </td>
</tr> 
</c:forEach>
</table>
</body>
</html>