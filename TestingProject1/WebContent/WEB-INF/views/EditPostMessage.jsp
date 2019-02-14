<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1> Notifications  </h1>
<h2><i class="fa fa-comment-o"></i>Compose New Message</h2>
<form action="sendEditedMessageToNoticeBoard" class="col-md-4" method="post" enctype="multipart/form-data">
<pre>
Notice Id    <input type="text" name="noticeTitle" value="${notice.noticeId}" readonly="readonly"/>
Title              <input type="text" name="noticeTitle" value="${notice.noticeTitle}"/>
Notice Date  <input type="text" name="noticeDate" placeholder="dd/mm/yyyy" value="${notice.noticeDate}" required/>
Publish On   <input type="text" name="noticePublishOn" placeholder="dd/mm/yyyy" value="${notice.noticePublishOn}" required/><br>
Message       <textarea name="noticeMessage" value="${notice.noticeMessage}">${notice.noticeMessage}</textarea> 
Message To          <input type="checkbox" name="noticeSendTo" value="Student"> Student       
                             <input type="checkbox" name="noticeSendTo" value="Teacher"> Teacher<br>
                             <input type="checkbox" name="noticeSendTo" value="Guardians"> Parent   

<input type="submit" value="Send"/>		<br>

${message} <br><br><br><br><br>
</pre>
</form>
</div>
</body>
</html>