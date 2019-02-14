<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>

</head><%@include file="Home.jsp" %>
<body><div  class="main">
<form action="insertAdd" method="post" >
<pre>
Class                   : <select name=clas>
                          <c:forEach items="${Clas}" var="clas">
                               <option value="${clas.clas}">${clas.clas}</option>
                          </c:forEach>
                          </select><br>
                          <br>
Section                 : <select name=sections>
                          <c:forEach items="${Sections}" var="sections">
                               <option value="${sections.sections}">${sections.sections}</option>
                          </c:forEach>
                          </select>
                          <br>
                          
Subject                 : <select name="subject">
                          <c:forEach items="${Subjects}" var="subject">
                               <option value="${subject.subject}">${subject.subject}</option>
                          </c:forEach>
                          </select>
                          <br>
                          
 <input type="button" value="Search">
 </pre>
 </form>                                            
</div></body>
</html>