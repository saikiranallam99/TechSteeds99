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
<h1>Income </h1><br>
<h2>Income Head</h2>
<form action="insertIncomeHead" class="col-md-3" method="post">
<pre>
Income Head
<input type="text" name="incomeHeadName"/>
Description
<textarea name="description"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<a href="addIncomeHeadExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>Income Head    </th>
	<th colspan="2">Action</th>
</tr>
   <c:forEach  items="${incomeHeads}" var="incomeHeads">
<tr>
 <td>
     <c:out value="${incomeHeads.incomeHeadName}"/></td>
 <td>
 	<a href="deleteIncomeHead?incomeHeadId=${incomeHeads.incomeHeadId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditIncomeHead?incomeHeadId=${incomeHeads.incomeHeadId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table>
</body>
</html>