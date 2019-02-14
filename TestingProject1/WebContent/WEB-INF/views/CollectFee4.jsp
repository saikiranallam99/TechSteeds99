<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Collect Fee</title>
</head>
<%@include file="Home.jsp" %>

<body>
<div class="main">
<h1> Fees Collection </h1><br>
<form action="saveCollectFees123" class="col-md-3" method="post">
<pre>
Admission Number
<input type="text" name="admissionNumber" value="${admissionNumber1}" readonly="readonly"/>
Date 
<input type="text" name="date" />
Amount
<input type="text" name="amount" />
Discount
<input type="text" name="discount" value="0"/>
Fine
<input type="text" name="fine" value="0"/>
Payment Mode
    
<input type="radio" name="mode" value="Cash" checked> Cash  <input type="radio" name="mode" value="Cheque"> Cheque  <input type="radio" name="mode" value="DD"> DD 

Note
<input type="text" name="note" />
<input type="submit" value="Collect Fee"/>
</pre>
</form>
${msg}
</div>
</body>
</html>