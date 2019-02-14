<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><%@include file="Home.jsp"%>
<body>
<div class="main">
<h1>Fees Collection</h1><br>		
<form action="showCollectFees3" class="col-md-3" method="post">
<pre>
Class
<input type="text" name="clas" value="${student.clas}" readonly="readonly" />
Section	
<input type="text" name="sections" value="${student.sections}" readonly="readonly" />
Admission Number
<input type="text" name="studentId" value="${student.studentId}" readonly="readonly" />
Student Name
<input type="text" name="fsnm" value="${student.fsnm}" readonly="readonly" />
Father Name
<input type="text" name="gname" value="${student.gname}" readonly="readonly" />
Date Of Birth
<input type="text" name="dob" value="${student.dob}" readonly="readonly" />
Phone	
<input type="text" name="mbnm" value="${student.mbnm}" readonly="readonly" />
<input type="submit" value="Collect Fees">
</pre>
</form>
</div>
</body>
</html>