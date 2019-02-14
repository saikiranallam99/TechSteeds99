<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees Master</title>
</head>
<%@include file="Home.jsp" %>

<body><div class="main">
<h1>Fees Collection</h1><br>
<h2>Add Fees Master : 2018-19</h2>
<form action="insertFeesMaster" class="col-md-3" method="post">
<pre>
Fees Group
<select name="feesGroupName">
    <c:forEach items="${feesGroups}" var="feesGroups">
         <option value="${feesGroups.feesGroupName}">${feesGroups.feesGroupName}</option>
    </c:forEach>
 </select>
Fees Type
<select name="feesTypeName">
   <c:forEach items="${feesTypes}" var="feesTypes">
        <option value="${feesTypes.feesTypeName}">${feesTypes.feesTypeName}</option>
   </c:forEach>
</select>
Due Date
<input type="text" name="dueDate" />
Amount
<input type="text" name="amount" /> 
<input type="submit" value="save" />
</pre>
</form>
${msg}
	<a  href="feesMasterExcelExport" >Export To Excel</a> | <a href="feesMasterPdfExport">Export To PDF</a>
<table border="1" class="col-md-9">
	<tr>
		<th>Fees Group</th>
		<th>Fees Type</th>
		<th colspan="3">Action</th>
	</tr>
	<c:forEach items="${feesMasters}" var="feesMasters">
	<tr>
		<td><c:out value="${feesMasters.feesGroupName}" /></td>
		<td><c:out value="${feesMasters.feesTypeName}" /></td>
		<td><a href="deleteFeesMaster?feeMasterId=${feesMasters.feeMasterId}">DELETE</a>
		</td>
		<td><a href="showFeesMasterDataEdit?feeMasterId=${feesMasters.feeMasterId}">EDIT</a>
		</td>
		<td><a href="showFeesMasterAssign?feeMasterId=${feesMasters.feeMasterId}">Assign</a>
		</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>