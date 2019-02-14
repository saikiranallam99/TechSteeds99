<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees Discount</title>
</head>
<%@include file="Home.jsp" %>

<body><div class="main">
<h1> Fees Collection </h1><br>
<h2>Add Fees Discount</h2>
<form action="insertFeesDiscount" class="col-md-3" method="post">
<pre>
Name 
<input type="text" name="discountName"/>
Discount Code
<input type="text" name="discountCode"/>
Amount
<input type="text" name="discountAmount"/>
Description
<textarea name="discountDescription"></textarea>
<input type="submit" value="save"/>
</pre>
</form>
${msg} 
<a href="feesGroupExcelExport">Export To Excel</a> 
<table border="1" class="col-md-9">
<tr>
	<th>       Name         </th>
	<th>    Discount Code    </th>
	<th>      Amount     </th>
	<th colspan="2">Action</th>
</tr>
<c:forEach  items="${feesDiscounts}" var="feesDiscounts">
<tr>
 <td><c:out value="${feesDiscounts.discountName}"/></td>
 <td><c:out value="${feesDiscounts.discountCode}"/></td>
 <td><c:out value="${feesDiscounts.discountAmount}"/></td>
 <td><a href="deleteFeesDiscount?discountId=${feesDiscounts.discountId}">DELETE</a></td>
 <td><a href="showFeesDiscountDataEdit?discountId=${feesDiscounts.discountId}">EDIT</a></td>
</tr> 
</c:forEach>
</table></div>
</body>
</html>