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
<body>
<h1>Expenses </h1><br>
<h2>Add Expense</h2>
<form action="insertExpenses" method="post" class="col-md-4"  enctype="multipart/form-data">
<pre>
Expense Head
<select name="expensesHead">
     <c:forEach items="${expensesHeads}" var="expensesHeads">
        <option value="${expensesHeads.expenseHeadName}">${expensesHeads.expenseHeadName}</option>
     </c:forEach>
</select>
Name
<input type="text" name="expensesName"/>
Date
<input type="text" name="date" placeholder="dd/mm/yyyy" required/>
Amount
<input type="text" name="amount"/>
Attach Document
<input type="file" name="expensesDocument"/>
Description
<textarea name="description"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<table border="1" class="col-md-4" >
<tr>
	<th>Date </th>
	<th>Expense Head </th>
	<th>Name </th>
	<th>Amount </th>
	<th colspan="3">Action</th>
</tr>
<c:forEach  items="${expenses}" var="expenses">
<tr>
 <td><c:out value="${expenses.date}"/></td>
 <td><c:out value="${expenses.expensesHead}"/></td>
 <td><c:out value="${expenses.expensesName}"/></td> 
 <td><c:out value="${expenses.amount}"/></td>  
 <td>
 	<a href="deleteExpenses?expenseId=${expenses.expenseId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditExpenses?expenseId=${expenses.expenseId}">EDIT</a>
 </td>
 <td>
 	<a href="downloadExpenses?expenseId=${expenses.expenseId}">Download</a>
 </td>
</tr> 
</c:forEach>
</table>
</body>
</html>