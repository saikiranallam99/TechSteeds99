<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
</head><%@include file="Home.jsp"%>
<body>
<div class="main">
<h1>Welcome to Student Admission Edit Page!!</h1>
<form action="updateStu" class="col-md-3" method="POST" enctype="multipart/form-data">
<pre>
Admission Number<input type="text" name="studentId" value="${stu.studentId}" /><br>
Roll Number<input type="text" name="rlnm" value="${stu.rlnm}" /><br>
Class
<select id="stuType" name="clas">
     <option value="NONE">select</option> 
</select>
Section
<select id="stuType" name="sections">
    <option value="NONE">select</option>
</select>
<br>
First Name<input type="text" name="fsnm" value="${stu.fsnm}" /><br>
Last Name<input type="text" name="lsnm" value="${stu.lsnm}" /><br>
Gender<select id="stuType" name="gen">
         <option value="NONE">select</option>
         <option value="Male">Male</option>
         <option value="Female">Female</option>
      </select><br>
Date Of Birth<input type="text" name="dob" value="${stu.dob}" placeholder="dd/mm/yyyy" required /><br>
Category<select id="stuType" name="category">
             <option value="NONE">select</option> 
        </select><br>
Religion<input type="text" name="rgn" value="${stu.rgn}" /><br>
Cast<input type="text" name="cast" value="${stu.cast}" /><br>
Mobile Number<input type="text" name="mbnm" value="${stu.mbnm}" /><br>
Email<input type="text" name="email" value="${stu.email}" /><br>
Admission Date<input type="text" name="addt" value="${stu.addt}" placeholder="dd/mm/yyyy" required /><br>
RTE<select id="stuType" name="rte">
       <option value="NONE">select</option>
       <option value="YES">YES</option>
       <option value="NO">NO</option>
   </select><br>
<input type="submit" value="Update" />
</pre>
		</form>
	</div>
</body>
</html>