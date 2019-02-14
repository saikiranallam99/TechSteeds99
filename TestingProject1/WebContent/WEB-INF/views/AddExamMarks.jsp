<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Exam Marks</title>
</head>
<%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Examinations</h1>
<form action="showAddmarks" class="col-md-4"  method="post" >
<pre>
Exam Name
<select name=exams>
                          <c:forEach items="${exams}" var="exams">
                               <option value="${exams.name}">${exams.name}</option>
                          </c:forEach>
                          </select>
                          <br>
Class
<select name=clas>
                          <c:forEach items="${Clas}" var="clas">
                               <option value="${clas.clas}">${clas.clas}</option>
                          </c:forEach>
                          </select>
                          <br>
Section
<select name=sections>
                          <c:forEach items="${Sections}" var="sections">
                               <option value="${sections.sections}">${sections.sections}</option>
                          </c:forEach>
                          </select>
                          <br>
                          
 <input type="submit" value="Search"> <br>
 </pre>
 </form>
 ${msg}
</div></body>
</html>