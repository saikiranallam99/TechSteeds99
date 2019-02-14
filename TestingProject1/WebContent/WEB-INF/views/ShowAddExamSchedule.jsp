<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Exam Scheduling</title>
</head><%@include file="Home.jsp" %>
<body>
<h1>Examinations</h1>
<form action="insertExamSchedule" class="col-md-3" method="post" >
<pre>
Exam Name
<select name=examName>
	   <c:forEach items="${names}" var="name">
	        <option value="${name.name}">${name.name}</option>
	   </c:forEach>
</select>
Class
<select name=cls>
      <c:forEach items="${Clas}" var="clas">
           <option value="${clas.clas}">${clas.clas}</option>
      </c:forEach>
</select>
Section
<select name=sec>
      <c:forEach items="${Sections}" var="sections">
           <option value="${sections.sections}">${sections.sections}</option>
      </c:forEach>
</select>
Date
<input type="text" name="date" placeholder="dd/mm/yyyy" required>
Start Time
<input type="text" name="startTime">
End Time
<input type="text" name="endTime">
Room
<input type="text" name="room">
Full Marks
<input type="text" name="fullMarks">
Passing Marks
<input type="text" name="passingMarks">                        
 <input type="submit" value="Search">
 </pre>
 </form>
${msg}                       
</body>
</html>