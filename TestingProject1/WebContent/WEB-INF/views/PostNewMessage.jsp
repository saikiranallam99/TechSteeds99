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
<div class="main">
<h1> Notifications  </h1>
<br>
<h2><i class="fa fa-comment-o"></i>Compose New Message</h2>
<form action="sendMessageToNoticeBoard" class="col-md-4" method="post" enctype="multipart/form-data">
<pre>
Title
<input type="text" name="noticeTitle"/>
Notice Date
<input type="text" name="noticeDate" placeholder="dd/mm/yyyy" required/>
Publish On
<input type="text" name="noticePublishOn" placeholder="dd/mm/yyyy" required/><br>
Message
<textarea name="noticeMessage"></textarea> 
Message To
<input type="checkbox" name="noticeSendTo" value="Student"> Student 
<input type="checkbox" name="noticeSendTo" value="Teacher"> Teacher
<input type="checkbox" name="noticeSendTo" value="Guardians"> Parent   
<input type="submit" value="Send"/>		<br>

${message} <br><br><br><br><br>
</pre>
</form>
</div>
</body>
</html>