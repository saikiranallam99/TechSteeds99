<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Examinations</h1>
<br>
<h2><a href="showAddExamSchedule"> ADD </a></h2>

<form action="" class="col-md-3" method="post" >
<pre>
Class
<select name=clas>
      <c:forEach items="${Clas}" var="clas">
           <option value="${clas.clas}">${clas.clas}</option>
      </c:forEach>
</select>
Section
<select name=sections>
      <c:forEach items="${Sections}" var="sections">
           <option value="${sections.sections}">${sections.sections}</option>
      </c:forEach>
</select>                         
<input type="submit" value="Search">
 </pre>
 </form>
</div></body>
</html>