<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><%@include file="Home.jsp" %>
<body>
<div  class="main">
<h1>Examinations</h1>
<table border="1" width="80%">
	<tr>
	    <th>No.</th>
	    <th>Exam</th>
		<th>Admission Number</th>
		<th>Roll Number</th>
		<th>Student</th>
		<th>Father Name</th>
		<th>${examSchedule2.examName}(${examSchedule2.passingMarks}/${examSchedule2.fullMarks})</th>
		<th>Grand Total</th>
		<th>Percent</th>
		<th>Result</th>	
	</tr>
	<c:forEach items="${studentSubjectMarks}" var="studentSubjectMarks" varStatus="status">
		<tr>
			<td align="center">${status.count}</td>
			<td><c:out value="${studentSubjectMarks.subject}"/></td>
            <td><c:out value="${studentSubjectMarks.admissionNumber}"/></td>
            <td><c:out value="${studentSubjectMarks.rollNumber}"/></td>
            <td><c:out value="${studentSubjectMarks.studentName}"/></td>
            <td><c:out value="${studentSubjectMarks.fathername}"/></td>
            <td><c:out value="${studentSubjectMarks.marks}"/></td>
            <td><c:out value="${studentSubjectMarks.marks}/100"/></td>
            <td><c:out value="${studentSubjectMarks.marks*100/studentSubjectMarks.marks}"/></td>
            <td><c:out value="${studentSubjectMarks.marks ge 40 ? 'pass': 'fail'}"/></td>
		</tr>
	</c:forEach>
</table>
${msg }	
</div>
</body>

</html>