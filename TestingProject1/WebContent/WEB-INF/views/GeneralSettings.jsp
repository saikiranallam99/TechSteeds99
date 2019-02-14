<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SystemSettings</title>
</head>
<%@include file="Home.jsp" %>
<body>
<div class="main">
<h1>System Settings</h1>
<h2>General Setting</h2><br>
<h3>
<a href="showupdateGeneralSettings?generalSettingId=${generalSetting.generalSettingId}">EDIT</a></h3>
<table >
<tr>
	<th >School Name</th>
	<th ><c:out value="${generalSetting.schoolName}"/></th>
</tr>
<tr>
	<th >Address</th>
	<th ><c:out value="${generalSetting.schoolAddress}"/></th>
</tr>
<tr>
	<th >Phone</th>
	<th ><c:out value="${generalSetting.schoolPhone}"/></th>
</tr>
<tr>
	<th >Email</th>
	<th ><c:out value="${generalSetting.schoolEmail}"/></th>
</tr>
<tr>
	<th>School Code</th>
	<th><c:out value="${generalSetting.schoolCode}"/></th>
</tr>
<tr>
	<th>Session</th>
	<th><c:out value="${generalSetting.session}"/></th>
</tr>
<tr>
	<th>Session Start Month</th>
	<th><c:out value="${generalSetting.sessionStartMonth}"/></th>
</tr>
<tr>
	<th>Language</th>
	<th><c:out value="${generalSetting.language}"/></th>
</tr>
<tr>
	<th>Language RTL Text Mode</th>
	<th><c:out value="${generalSetting.languageRTLTextMode}"/></th>
</tr>
<tr>
	<th>Timezone</th>
	<th><c:out value="${generalSetting.timezone}"/></th>
</tr>
<tr>
	<th>Date Format</th>
	<th><c:out value="${generalSetting.dateFormat}"/></th>
</tr>
<tr>
	<th>Currency</th>
	<th><c:out value="${generalSetting.currency}"/></th>
</tr>
<tr>
	<th>Currency Symbol</th>
	<th><c:out value="${generalSetting.currencySymbol}"/></th>
</tr>
</table>
</div>
</body>
</html>