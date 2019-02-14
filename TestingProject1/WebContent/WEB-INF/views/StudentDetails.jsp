<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>Student Information </h1>
<form action="searchDetails" class="col-md-3" method="post">
<pre>
Class    :<select name="clas">
                 <c:forEach items="${Clas}"  var="clas">
                     <option value="${clas.clas}">${clas.clas}</option>
                  </c:forEach>
               </select><br>
Section  :<select name="sections">
               <c:forEach items="${Sections}" var="sections">
                     <option value="${sections.sections}">${sections.sections}</option>
                  </c:forEach>
               </select><br>
<input type="submit" value="Search"/>		<br>
</pre>
</form>
${msg} 
<br>
 <table border="1">
	<tr>
		<th>Admission Number</th>
		<th>Roll Number</th>
		<th>Class</th>
		<th>Section</th>
		<th>First Name </th>
		<th>Last Name</th>
		<th>Gender</th>
		<th>Date Of Birth</th>
		<th>Category</th>
		<th>Religion</th>
		<th>Cast</th>
		<th>Mobile Number</th>
		<th>Email</th>
		<th>Admission Date</th>
		<th>RTE</th>
        <th colspan="2">OPERATIONS</th>
	</tr>
	<c:forEach items="${students}" var="stu">
	<tr>
		<td><c:out value="${stu.studentId}"/></td>
		<td><c:out value="${stu.rlnm}"/></td>
		<td><c:out value="${stu.clas}"/></td>
		<td><c:out value="${stu.sections}"/></td>
		<td><c:out value="${stu.fsnm}"/></td>
		<td><c:out value="${stu.lsnm}"/></td>
		<td><c:out value="${stu.gen}"/></td>
		<td><c:out value="${stu.dob}"/></td>
		<td><c:out value="${stu.category}"/></td>
		<td><c:out value="${stu.rgn}"/></td>
		<td><c:out value="${stu.cast}"/></td>
		<td><c:out value="${stu.mbnm}"/></td>
		<td><c:out value="${stu.email}"/></td>
		<td><c:out value="${stu.addt}"/></td>
		<td><c:out value="${stu.rte}"/></td>
		
		<td>
			<a href="deleteStu?studentId=${stu.studentId}">DELETE</a>
		</td>
		<td>
			<a href="editStu?studentId=${stu.studentId}">EDIT</a>
		</td>
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>