<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Email</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">

<h1>  Communicate  </h1><br>
<h2>Send Email / SMS</h2>
<form action="sendEmailToMultiple" class="col-md-4" method="post" enctype="multipart/form-data">
<pre>
Title
<input type="text" name="mailTitle"/>
Notice Date
<input type="text" name="mailNoticeDate" placeholder="dd/mm/yyyy" required/>
Publish On
<input type="text" name="mailPublishOn" placeholder="dd/mm/yyyy" required/>
Message 
<textarea name="mailMessage"></textarea> 
Insert File     <input type="file" name="attachfile"/> <br>
Message To          <input type="checkbox" name="mailSendTo" value="Student"> Student       
                    <input type="checkbox" name="mailSendTo" value="Teacher"> Teacher
                    <input type="checkbox" name="mailSendTo" value="Guardians"> Guardians
                    <input type="checkbox" name="mailSendTo" value="Accountants"> Accountants
                    <input type="checkbox" name="mailSendTo" value="Librarians"> Librarians

<input type="submit" value="Send"/>		<br>

${message} <br><br><br><br><br>
</pre>
</form></div>
</body>
</html>