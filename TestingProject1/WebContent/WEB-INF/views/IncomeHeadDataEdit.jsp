<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Income Head</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Income </h1><br><br>
<h2>Update Income Head</h2>
<form action="editIncomeHead" class="col-md-3" method="post">
<pre>
Income Head Id
<input type="text" name="incomeHeadId" value="${incomeHead.incomeHeadId}" readonly="readonly"/>
Income Head
<input type="text" name="incomeHeadName" value="${incomeHead.incomeHeadName}"/>
Description
<textarea name="description" value="${incomeHead.description}">${incomeHead.description}</textarea>
<input type="submit" value="Update"/>		
</pre>
</form>
</body>
</html>