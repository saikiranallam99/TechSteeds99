<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parent Guardian Details</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<form action="insertparent" class="col-md-3" method="post">
<pre>

Father Name
<input type="text" name="name"/>
Father Phone
<input type="text" name="phone"/>
Father Occupation
<input type="text" name="occup">
Mother Name
<input type="text" name="mname"/>
Mother Phone
<input type="text" name="mphone"/>
Mother Occupation
<input type="text" name="moccup"/>
If Guardian is
<select name="grn">
       <option value="NONE">select</option> 
       <option value="Father">Father</option>
       <option value="Mother">Mother</option>
       <option value="Other">Other</option>
</select>
Guardian Name
<input type="text" name="gname"/>
Guardian Relation
<input type="text" name="grltn"/>
Guardian Email
<input type="text" name="gemail"/>
Guardian Phone
<input type="text" name="gphone"/>
Guardian Occupation
<input type="text" name="goccp"/>
Guardian Address
<input type="text" name="gadrs"/>
<input type="submit" value="Register"/>		
</pre>
</form>
 ${msg} 
<br/>
<h3><a href="viewAllPds">view All</a></h3>
</div></body>
</html>