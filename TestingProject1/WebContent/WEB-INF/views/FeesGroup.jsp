<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees Group</title>
</head>
<%@include file="Home.jsp" %>

<body><div class="main"><h1> Fees Collection </h1><br>
<h2>Add Fees Group</h2>
<form action="insertFeesGroup" class="col-md-3" method="post">
<pre>
Name
<input type="text" name="feesGroupName"/>
Description
<textarea name="feesGroupDescription"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<a href="feesGroupExcelExport">Export To Excel</a> | <a href="feesGroupPdfExport">Export To PDF</a>
<table border="1" class="col-md-9">
<tr>
	<th>       Name         </th>
	<th colspan="2">Action</th>
</tr>
   <c:forEach  items="${feesGroups}" var="feesGroups">
<tr>
 <td>
     <c:out value="${feesGroups.feesGroupName}"/></td>
 <td>
 	<a href="deleteFeesGroup?feesGroupId=${feesGroups.feesGroupId}">DELETE</a>
 </td>
 <td>
 	<a href="showEditFeesGroup?feesGroupId=${feesGroups.feesGroupId}">EDIT</a>
 </td>
</tr> 
</c:forEach>
</table></div>
</body>
</html>