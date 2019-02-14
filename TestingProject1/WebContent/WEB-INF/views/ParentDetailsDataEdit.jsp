<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parent Details</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<h1>Welcome to Student Admission Edit Page!!</h1>
	<form action="updatePd" class="col-md-3" method="POST">
    <pre>
Parent Id 	  <input type="text" name="parentId" value="${pd.parentId}" readonly="readonly" />	Father Name		<input type="text" name="name" value="${pd.name}"/><br>
Father Phone  <input type="text" name="phone" value="${pd.phone}"/>	Father Occupation	<input type="text" name="occup" value="${pd.occup}"/><br>
Mother Name	  <input type="text" name="mname" value="${pd.mname}"/>	Mother Phone	<input type="text" name="mphone" value="${pd.mphone}"/><br>
Mother Occupation	<input type="text" name="moccup" value="${pd.moccup}"/><br>
If Guardian is	<select id="pdType" name="grn">
                          <option value="NONE">select</option> 
                          <option value="Father">Father</option>
                          <option value="Mother">Mother</option>
                          <option value="Other">Other</option>
                          </select>
Guardian Name	    <input type="text" name="gname" value="${pd.gname}"/>	 Guardian Relation	<input type="text" name="grltn" value="${pd.grltn}"/><br>
Guardian Email	    <input type="text" name="gemail" value="${pd.gemail}"/>	 Guardian Phone	    <input type="text" name="gphone" value="${pd.gphone}"/><br>
Guardian Occupation	<input type="text" name="goccp" value="${pd.goccp}"/>    Guardian Address	<input type="text" name="gadrs" value="${pd.gadrs}"/><br>

<input type="submit" value="Update" />
</pre>
</form>
</div></body>
</html>