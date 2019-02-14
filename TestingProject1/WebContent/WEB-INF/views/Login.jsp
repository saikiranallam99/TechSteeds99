<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style>
div {
  border: 1px solid black;
  background-color: lightblue;
  
}
</style>
</head>
<body>
<div align="center">
<h1 > School</h1>
<h1 > ADMIN LOGIN  </h1><br>
<form action="doLogin" method="post">
<pre>

User Name   : <input align="middle"  type="text" name="adminEmail"/><br>
Password     : <input align="middle"  type="password" name="adminPassword"/><br>
<input align="middle" type="submit" value="login"/>		

</pre>
</form>
${message} 
</div>
<br><br>
</body>
</html>