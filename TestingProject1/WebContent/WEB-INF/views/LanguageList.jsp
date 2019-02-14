<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Language List</title>
</head><%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>System Settings</h1>
<h2>Add Language</h2>
<br>
<form action="showAddLanguage">
    <input type="submit" value="ADD +" />
</form>
<br>
<br>
<table border="1" width="50%">
		<tr>
			<th align="center">Language</th>
			<th align="center">Status</th>
		</tr>
		  <c:forEach items="${languages}" var="languages">
			<tr>
				<td align="center"><c:out value="${languages.languageName}" /></td>
				
				<c:choose>
				<c:when test="${language eq languages.languageName}">
				<td align="center"><c:out value= "Active"/></td>
				</c:when>
                <c:otherwise>
                <td align="center"><c:out value="" /></td>
                </c:otherwise>
                </c:choose>
			</tr>
		</c:forEach>
	</table>

</div>
</body>
</html>