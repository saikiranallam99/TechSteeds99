<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ExpensesHeadDataEdit</title>
</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>Expenses </h1><br><br>
<h2>Update Expenses Head</h2>
<form action="editExpensesHead" class="col-md-3" method="post">
<pre>
Expense Head Id
<input type="text" name="expensesHeadId" value="${expensesHead.expensesHeadId}" readonly="readonly"/><br>
Expense Head
<input type="text" name="expenseHeadName" value="${expensesHead.expenseHeadName}"/><br>
Description
<textarea name="description" value="${expensesHead.description}">${expensesHead.description}</textarea><br>
<input type="submit" value="Update"/>		<br>
</pre>
</form></div>
</body>
</html>