<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees type</title>
</head>
<%@include file="Home.jsp" %>

<body><div class="main">
<h1>Fees Collection</h1>
<br>
<h2>Add Fees Type</h2>
<form action="insertFeesType" class="col-md-3" method="post">
<pre>
Name
<input type="text" name="feesTypeName" />
Fees Code
<input type="text" name="feesTypeCode" />
Description
<textarea name="feesTypeDescription"></textarea>
<input type="submit" value="save" />
</pre>
</form>
	${msg}
<a href="feesGroupExcelExport">Export To Excel</a>
<table border="1" class="col-md-9">
<tr>
	<th>Name</th>
	<th>Fees Code</th>
	<th colspan="2">Action</th>
</tr>
<c:forEach items="${feesTypes}" var="feesTypes">
	<tr>
		<td><c:out value="${feesTypes.feesTypeName}" /></td>
		<td><c:out value="${feesTypes.feesTypeCode}" /></td>
		<td><a href="deleteFeesType?feesTypeId=${feesTypes.feesTypeId}">DELETE</a></td>
		<td><a href="showFeesTypeDataEdit?feesTypeId=${feesTypes.feesTypeId}">EDIT</a></td>
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>