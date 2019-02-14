<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp"%>	
<body>   
<h1>HOSTEL</h1>	<br>	
<h2>Add Hostel</h2><br>
<form action="insertAddHostel" class="col-md-4"  method="post">
Hostel Name
<input type="text" name="hostelName" />
Type
<select name="hostelType">
                 <option value="Boys">Boys</option>
                 <option value="Girls">Girls</option>
                 <option value="Combine">Combine</option>
               </select>
Address
<input type="text" name="hostelAddress" />
Intake
<input type="text" name="hostelIntake" />
Description
<textarea name="description"></textarea>		
<input type="submit" value="save" />
</form>

${msg}
<br> 
<a href="addHostelExcelExport">Export To Excel</a>
<table border="1" class="col-md-8" >
	<tr>
		<th>Hostel Name</th>
		<th>Type</th>
		<th>Address</th>
		<th>Intake</th>
		<th colspan="2">Action</th>
	</tr>
	<c:forEach items="${addHostels}" var="addHostels">
		<tr>
			<td><c:out value="${addHostels.hostelName}" /></td>
			<td><c:out value="${addHostels.hostelType}" /></td>
			<td><c:out value="${addHostels.hostelAddress}" /></td>
			<td><c:out value="${addHostels.hostelIntake}" /></td>
			<td><a href="deleteAddHostel?hostelId=${addHostels.hostelId}">DELETE</a>
			</td>
			<td><a href="showEditAddHostel?hostelId=${addHostels.hostelId}">EDIT</a>
			</td>
		</tr>
	</c:forEach>
</table>
   
</body>
</html>