<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Session</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>System Settings</h1><br>
<h2>Add Session</h2><br>
<form action="insertSession" class="col-md-3" method="post">
<pre>
Session
<input type="text" name="sessionTimePediod" />
<input type="submit" value="save" />	
</pre>
</form>
${msg}
<br>
<a href="sessionExcelExport">Export To Excel</a> | <a href="sessionPdfExport">Export To Pdf</a>
	<table border="1" width="80%" class="col-md-8">
		<tr>
			<th align="center">Session</th>
			<th align="center">Status</th>
			<th colspan="2" align="center">Action</th>
		</tr>
		  <c:forEach items="${sessions}" var="sessions">
			<tr>
				<td align="center"><c:out value="${sessions.sessionTimePediod}" /></td>
				<c:choose>
				<c:when test="${session eq sessions.sessionTimePediod}">
				<td align="center"><c:out value= "Active"/></td>
				</c:when>
            <c:otherwise>
	         <td align="center"><c:out value= ""/></td>
           </c:otherwise>
           </c:choose>
				<td align="center"><a href="deleteSession?sessionId=${sessions.sessionId}">DELETE</a>
				</td>
				<td align="center"><a
					href="showSessionDataEdit?sessionId=${sessions.sessionId}">EDIT</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>