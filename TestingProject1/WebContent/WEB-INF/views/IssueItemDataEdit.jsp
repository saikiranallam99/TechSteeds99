<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IssueItemDataEdit</title>
</head>
<%@include file="Home.jsp" %>

<body>
<div class="main">
<h1> Inventory </h1>
<h4>Issue Item</h4>
<form action="editissueItem" class="col-md-3" method="post"><pre>
IssueId
<input type="text" name="itemIssueId" value="${issueitem.itemIssueId}" readonly="readonly"/><br>
Item
<input type="text" name="item" value="${issueitem.item}" readonly="readonly"/><br>
User Type
<input type="radio" name="userType" value="Teacher">Teacher   <input type="radio" name="userType" value="Librarian">Librarian      <input type="radio" name="userType" value="Accountant">Accountant      <input type="radio" name="userType" value="Admin">Admin <br>
Issue To
<input type="text" name="issueTo" value="${issueitem.issueTo}"/><br>
Issue By
<input type="text" name="issueBy" value="${issueitem.issueBy}" /><br>
Issue Date
<input type="text" name="issueDate" value="${issueitem.issueDate}" placeholder="dd/mm/yyyy" required/><br>
Return Date
<input type="text" name="returnDate" value="${issueitem.returnDate}" placeholder="dd/mm/yyyy" required/><br>
Note
<input type="text" name="note" value="${issueitem.note}"/><br>
Item Category
<select name="itemcategory">
<c:forEach items="${categories}" var="category">
 <option value="${category.itemcategory}">${category.itemcategory}</option>
 </c:forEach></select>
<br>

Quantity           :<input type="text" name="quantity" value="${issueitem.quantity}"/><br>
<br>
<input type="submit" value="SUBMIT"/>		<br></pre></form></div>
</body>
</html>