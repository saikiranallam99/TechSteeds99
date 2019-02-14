<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees type Data Edit</title>
</head>
<%@include file="Home.jsp" %>

<body><div class="main"><h1>Fees Collection</h1>
<br>
<h2>Update Fees Type</h2>
<form action="editFeesType" class="col-md-3" method="post">
		<pre>
Id
<input type="text" name="feesTypeId" value="${feesType.feesTypeId}" readonly="readonly"/><br>
Name
<input type="text" name="feesTypeName" value="${feesType.feesTypeName}"/><br>
Fees Code
<input type="text" name="feesTypeCode" value="${feesType.feesTypeCode}"/><br>
Description
<textarea name="feesTypeDescription" value="${feesType.feesTypeDescription}">${feesType.feesTypeDescription}</textarea>
			<br>
<input type="submit" value="save" />		<br>
       </pre>
	</form></div>
</body>
</html>