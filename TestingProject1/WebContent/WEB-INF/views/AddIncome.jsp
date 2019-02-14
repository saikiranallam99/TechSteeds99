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
<h2>Add Income</h2>
<form action="insertIncome" class="col-md-3" method="post" enctype="multipart/form-data">
<pre>
Income Head
<select name="incomeHead">
     <c:forEach items="${incomeHeads}" var="incomeHeads">
        <option value="${incomeHeads.incomeHeadName}">${incomeHeads.incomeHeadName}</option>
     </c:forEach>
</select>
Name
<input type="text" name="incomeName"/>
Date
<input type="text" name="date" placeholder="dd/mm/yyyy" required/>
Amount
<input type="text" name="amount"/>
Attach Document
<input type="file" name="incomeDocument"/>
Description
<textarea name="description"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<table border="1" class="col-md-8">
<tr>
	<th>Date </th>
	<th>Income Head </th>
	<th>Name </th>
	<th>Amount </th>
	<th colspan="3">Action</th>
	
</tr>
<c:forEach  items="${income}" var="income">
<tr>
 <td><c:out value="${income.date}"/></td>
 <td><c:out value="${income.incomeHead}"/></td>
 <td><c:out value="${income.incomeName}"/></td> 
 <td><c:out value="${income.amount}"/></td>  
 <td>
 	<a href="deleteIncome?incomeId=${income.incomeId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditIncome?incomeId=${income.incomeId}">EDIT</a>
 </td>
 <td>
 	<a href="downloadIncome?incomeId=${income.incomeId}">Download</a>
 </td>
</tr> 
</c:forEach>
</table>
</div>
</body>
</html>