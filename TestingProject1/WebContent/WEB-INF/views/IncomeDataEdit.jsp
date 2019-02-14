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
<body><div class="main">
<h1>Income </h1><br><br>
<h2>Update Income</h2>
<form action="editIncome" class="col-md-3" method="post" enctype="multipart/form-data">
<pre>
Income Id 
<input type="text" name="incomeId" value="${income.incomeId}"  readonly="readonly"/><br>
Income Head
<select name="incomeHead">
                      <c:forEach items="${incomeHeads}" var="incomeHeads">
                         <option value="${incomeHeads.incomeHeadName}">${incomeHeads.incomeHeadName}</option>
                      </c:forEach>
                    </select><br>
Name
<input type="text" name="incomeName" value="${income.incomeName}"/><br>
Date
<input type="text" name="date" /><br>
Amount
<input type="text" name="amount" value="${income.amount}"/><br>
Attach Document
<input type="file" name="incomeDocument"/><br> 
Description
<textarea name="description" value="${income.description}">${income.description}</textarea><br>
<input type="submit" value="Update"/>		<br>
</pre>
</form></div>
</body>
</html>