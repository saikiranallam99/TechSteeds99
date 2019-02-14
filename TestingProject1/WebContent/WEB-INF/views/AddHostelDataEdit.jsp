<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>HOSTEL</h1><br>
<h2>Update Hostel</h2><br>
<form action="editAddHostel" class="col-md-4"  method="post">
Hostel Id
<input type="text" name="hostelId" value="${addHostel.hostelId}" readonly="readonly"/><br>
Hostel Name
<input type="text" name="hostelName" value="${addHostel.hostelName}"/><br>
Type
<select name="hostelType">
                 <option value="Boys">Boys</option>
                 <option value="Girls">Girls</option>
                 <option value="Combine">Combine</option>
               </select><br>
Address
<input type="text" name="hostelAddress" value="${addHostel.hostelAddress}"/><br>
Intake
<input type="text" name="hostelIntake" value="${addHostel.hostelIntake}"/><br>
Description
<textarea name="description" value="${addHostel.description}">${addHostel.description}</textarea><br>
<input type="submit" value="update"/>		<br>

</form>
</body>
</html>