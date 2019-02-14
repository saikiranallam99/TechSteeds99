<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees Statement</title>
</head>
<%@include file="Home.jsp" %>

<body>
<h1>Fees Collection </h1><br>
<h2>Fees Statement</h2>
<form action="showFeesStatement1" class="col-md-3" method="post">
<pre>
Class
<select name="clas">
      <c:forEach items="${Clas}"  var="clas">
          <option value="${clas.clas}">${clas.clas}</option>
      </c:forEach>
</select>
Section  
<select name="sections">
      <c:forEach items="${Sections}" var="sections">
            <option value="${sections.sections}">${sections.sections}</option>
      </c:forEach>
</select>
<input type="submit" value="Search"/>
</pre>
</form>
</body>
</html> 