<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Class Time Table</title>
</head><%@include file="Home.jsp" %>
<body>
<form action="insertTimeTable" class="col-md-3" method="post" >
<pre>
<h2><a href="showAdd">Add</a></h2>
<br>
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
</body>
</html>