<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FeesGroupDataEdit</title>
</head>
<%@include file="Home.jsp" %>
<div class="main">
<body><h1> Fees Collection </h1><br>
<h2>Update Fees Group</h2>
<form action="editFeesGroup" class="col-md-3" method="post">
<pre>
Id
<input type="text" name="feesGroupId" value="${feesGroup.feesGroupId}" readonly="readonly"/><br>
Name
<input type="text" name="feesGroupName" value="${feesGroup.feesGroupName}"/><br>
Description
<textarea name="feesGroupDescription" value="${feesGroup.feesGroupDescription}">${feesGroup.feesGroupDescription}</textarea><br>
<input type="submit" value="Update"/>		<br>
</pre>
</form></div>
</body>
</html>