<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Report</title>
</head>
<%@include file="Home.jsp"%>
<body>
	<div class="main">
		<h1>Student Report</h1><br>
<form action="searchStudentDetails" class="col-md-3" method="post">
<pre>
Class
<select name="cls">
                 <c:forEach items="${Clas}" var="clas">
                     <option value="${clas.clas}">${clas.clas}</option>
                  </c:forEach>
               </select>
Section
<select name="section">
               <c:forEach items="${Sections}" var="sections">
                     <option value="${sections.sections}">${sections.sections}</option>
                  </c:forEach>
               </select>
Category
<select name=category>
                          <c:forEach items="${categories}" var="cate">
                               <option value="${cate.category}">${cate.category}</option>
                          </c:forEach>
                          </select> 
Gender 
<select name="gender">
                          <option value="NONE">select</option>
                          <option value="Male">Male</option>
                          <option value="Female">Female</option>
</select><br>
RTE 
<select name="rte">
    <option value="NONE">select</option>
    <option value="YES">YES</option>
    <option value="NO">NO</option>
</select><br>        
<input type="submit" value="Search" />		<br>
</pre>
</form>
</div>
</body>
</html>
