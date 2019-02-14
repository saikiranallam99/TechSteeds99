<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp"%>
<body>
	<div class="main">
		<h1>Communicate</h1>
		<h2>
			<i class="fa fa-comment-o"></i> Notice Board
		</h2>
		<br>
		<div align="right">
			<h3>
				<a href="postNewMessage"><i class="fa fa-plus"></i> Post New
					Message</a>
			</h3>
		</div>

		<table>
			<c:forEach items="${notices}" var="notices">
				<tr>
					<td><a href="showNotice?noticeId=${notices.noticeId}"><c:out value="${notices.noticeTitle}" /></a></td>
					<td><a href="deleteNotice?noticeId=${notices.noticeId}"><i class="fa fa-times"></i></a></td>
					<td><a href="showEditNotice?noticeId=${notices.noticeId}"><i class="fa fa-pencil"></i></a></td>
				</tr>
			</c:forEach>
		</table>



	</div>
</body>
</html>