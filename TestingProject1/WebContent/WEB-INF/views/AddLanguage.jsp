<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Language</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>System Settings</h1>
<h2>Add Language</h2>
<br>
<form action="insertLanguage" class="col-md-3" method="post">
<pre>
Language
<input type="text" name="languageName" /><br>
<input type="submit" value="save" />		<br>
</pre>
</form>
${msg}
<br>

</div>
</body>
</html>