<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees Master</title>
</head>
<%@include file="Home.jsp" %>

<body>
<div class="main">
<h1>Fees Collection</h1>
<form action="saveAssignFee" class="col-md-3" method="post">
<pre>
Fee Group 
<input type="text" name="feeGroup" value="${feeMaster.feesGroupName}" readonly="readonly"/>
Fee Type
<input type="text" name="feeType" value="${feeMaster.feesTypeName}" readonly="readonly"/>
Amount
<input type="text" name="amount" value="${feeMaster.amount}" readonly="readonly"/>
Due Date
<input type="text" name="dueDate" value="${feeMaster.dueDate}" readonly="readonly"/>
Class
<input type="text" name="cls" value="${classss}" readonly="readonly"/>
Section
<input type="text" name="section" value="${sectionnn}" readonly="readonly"/>
Assign
<select name="availabileFor">
   <option value="ForAll">AvailableForAll</option>
    <c:forEach items="${students}" var="students">
    <option value="${students.fsnm} ">${students.fsnm} </option>
   </c:forEach>              
</select>
<input type="submit" value="Save"/>
</pre>
</form>
${msg}
</div>
</body>
</html>