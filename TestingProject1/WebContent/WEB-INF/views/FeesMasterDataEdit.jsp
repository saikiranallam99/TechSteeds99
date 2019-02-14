<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>Fees Collection</h1>
<h2>Add Fees Master : 2018-19</h2>
	<form action="editFeesMaster" class="col-md-3" method="post">
		<pre>
Fees Master Id
<input type="text" name="feeMasterId" value="${feesMaster.feeMasterId}"  readonly="readonly"/><br>		

Fees Group
<select name="feesGroupName">
                          <c:forEach items="${feesGroups}"
					var="feesGroups">
                               <option
						value="${feesGroups.feesGroupName}">${feesGroups.feesGroupName}</option>
                          </c:forEach>
                       </select><br>
Fees Type
<select name="feesTypeName">
                          <c:forEach items="${feesTypes}"
					var="feesTypes">
                               <option value="${feesTypes.feesTypeName}">${feesTypes.feesTypeName}</option>
                          </c:forEach>
                       </select><br>
Due Date
<input type="text" name="dueDate" /><br>
Amount
<input type="text" name="amount" value="${feesMaster.amount}"  /><br> 
<input type="submit" value="Upadte" />		<br>
</pre>
	</form></div>
</body>
</html>