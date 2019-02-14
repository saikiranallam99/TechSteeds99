<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add More Details</title>
</head><%@include file="Home.jsp" %>
<body><div  class="main">
<form action="insertmore" class="col-md-3" method="post">
<pre>
<input type="radio" name="gadd" value="If Guardian Address is Current Address">If Guardian Address is Current Address
Current Address   :<input type="text" name="cadd"/>
<br>
<input type="radio" name="gaddr" value="If Permanent Address is Current Address">If Permanent Address is Current Address
perminant Address :<input type="text" name="padd"/>
<br>
<h1>Transport Details</h1>
<br>
Route List        :<select name="rls">
                   <option value="NONE">select</option>
                   </select>
<br>
<h1>Miscellaneous Details</h1>
<br>
Bank Account No   : <input type="text" name="accno"/>
<br>
Bank Name         : <input type="text" name="bknm"/>
<br>
IFSC Code         : <input type="text" name="ifscc"/>
<br>
National Identification Number :<input type="text" name="nidno"/>
<br>
Local Identification Number    :<input type="text" name="lidno"/>
<br>
Previous School Details        :<input type="text" name="pssd"/>
<br>
<input type="submit" value="Register"/>		
</pre>
</form>
 ${msg} 
</div></body>
</html>