<%@page import="com.app.model.StudentSubjectMarks"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%!int i = 0;%>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">	<h1>Examinations</h1>
	<form action="addMarks" method="post" modelAttribute="marksFrom">
		<table border="1" width="80%">
			<tr>
				<th>No.</th>
				<th>Exam</th>
				<th>Admission Number</th>
				<th>Roll Number</th>
				<th>Student</th>
				<th>Parent</th>
				<th>Absent</th>
				<th>${examSchedule2.examName}(${examSchedule2.passingMarks}/${examSchedule2.fullMarks})</th>
			</tr>
			<c:forEach items="${studentSubjectMarks}" var="studentSubjectMarks"
				varStatus="status">
				<tr>
					<td align="center">${status.count}</td>
					<td><input type="text"
						name="studentSubjectMarks[${status.index}].subject"
						value="${examSchedule2.examName}" readonly="readonly" /></td>
					<td><input type="text"
						name="studentSubjectMarks[${status.index}].admissionNumber"
						value="${studentSubjectMarks.admissionNumber}" readonly="readonly" /></td>
					<td><input type="text"
						name="studentSubjectMarks[${status.index}].rollNumber"
						value="${studentSubjectMarks.rollNumber}" readonly="readonly" /></td>
					<td><input type="text"
						name="studentSubjectMarks[${status.index}].studentName"
						value="${studentSubjectMarks.studentName}" readonly="readonly" /></td>
					<td><input type="text"
						name="studentSubjectMarks[${status.index}].fathername"
						value="${studentSubjectMarks.fathername}" readonly="readonly" /></td>
					<td><input type="text"
						name="studentSubjectMarks[${status.index}].absent" /></td>
					<td><input type="text"
						name="studentSubjectMarks[${status.index}].marks" /></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <input type="submit" value="save"> <br>
	</form>
	</div>
</body>
</html>