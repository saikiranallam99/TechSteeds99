<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddExpensesDataEdit</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<form action="editExpenses" class="col-md-4"  method="post" enctype="multipart/form-data">
<pre>
Expense Id
<input type="text" name="expenseId" value="${expenses.expenseId}"/>
Expense Head
<select name="expensesHead">
      <c:forEach items="${expensesHeads}" var="expensesHeads">
         <option value="${expensesHeads.expenseHeadName}">${expensesHeads.expenseHeadName}</option>
      </c:forEach>
</select>
Name
<input type="text" name="expensesName" value="${expenses.expensesName}"/>
Date
<input type="text" name="date" placeholder="dd/mm/yyyy" required/>
Amount
<input type="text" name="amount" value="${expenses.amount}"/>
Attach Document
<input type="file" name="expensesDocument"/>
Description
<textarea name="description" value="${expenses.description}">${addHostel.description}</textarea><br>
<input type="submit" value="save"/>
</pre>
</form>
</div>
</body>
</html>