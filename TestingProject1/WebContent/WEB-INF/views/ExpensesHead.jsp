<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expenses Head</title>

</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>Expenses </h1><br>
<h2>Expenses Head</h2>
<form action="insertExpensesHead" class="col-md-4" method="post">
<pre>
Expense Head
<input type="text" name="expenseHeadName"/>
Description
<textarea name="description"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<a href="addExpenseHeadExcelExport">Export To Excel</a> 
<table border="1" class="col-md-8">
<tr>
	<th>Expense Head    </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${expensesHeads}" var="expensesHeads">
<tr>
 <td><c:out value="${expensesHeads.expenseHeadName}"/></td>
 <td><a href="deleteExpensesHead?expensesHeadId=${expensesHeads.expensesHeadId}">DELETE</a></td>
 <td><a href="showEditExpensesHead?expensesHeadId=${expensesHeads.expensesHeadId}">EDIT</a></td>
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>