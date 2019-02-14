<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Class</title>
</head><%@include file="Home.jsp" %>
<body>
<form action="insertClas" class="col-md-3" method="post" >
<pre>
Class
<input type="text" name="clas"/>
Section
<select name=sections>
   <c:forEach items="${Sections}" var="sections">
        <option value="${sections.sections}">${sections.sections}</option>
   </c:forEach>
</select>
<input type="submit" value="Save"/>	
</pre>
</form>	
${msg} 
<h3><a href="viewAllcs">view All Class</a></h3>                           
</body>
</html>