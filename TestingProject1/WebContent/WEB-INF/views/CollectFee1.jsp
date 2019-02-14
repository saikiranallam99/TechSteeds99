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
<div class="main">
<h1> Fees Collection </h1><br>

<form action="showCollectFees2" class="col-md-3" method="post">
<pre>
Class
<input type="text" name="clas" value="${studentClass}" readonly="readonly"/>
Section
<input type="text" name="sections" value="${studentSection}" readonly="readonly"/>
Student
<select name="student1" >
               <c:forEach items="${students}" var="students">
                     <option value="${students.fsnm} ">${students.fsnm} </option>
                  </c:forEach>
               </select>                     
<input type="submit" value="Search"/>
</pre>
</form>
</div>
</body>
</html> 