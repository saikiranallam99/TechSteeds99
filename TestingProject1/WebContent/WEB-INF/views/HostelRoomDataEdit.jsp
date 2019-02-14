<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Hostel Room</title>
</head>
<%@include file="Home.jsp" %>
<body><div class="main">
<h1>HOSTEL</h1><br>
<h2>Update Hostel Room</h2>
<form action="editHostelRoom" class="col-md-3" method="post">
<pre>
Hostel RoomId
<input type="text" name="roomId" value="${addHostelRoom.roomId}" readonly="readonly"/>
Room Number / Name
<input type="text" name="roomNumber" value="${addHostelRoom.roomNumber}"/>
Hostel
<select name="hostelName">
                      <c:forEach items="${addHostels}" var="addHostels">
                           <option value="${addHostels.hostelName}">${addHostels.hostelName}</option>
                      </c:forEach>
                    </select>
Room Type
<select name="roomType">
                      <c:forEach items="${roomTypes}" var="roomTypes">
                           <option value="${roomTypes.roomType}">${roomTypes.roomType}</option>
                      </c:forEach>
                    </select>
Number Of Bed
<input type="text" name="numberOfBed" value="${addHostelRoom.numberOfBed}"/>
Cost Per Bed
<input type="text" name="nostPerBed" value="${addHostelRoom.nostPerBed}"/>
Description
<input type="text" name="description" value="${addHostelRoom.description}"/>
<input type="submit" value="Update"/>
</pre>

</form>
</div>
</body>
</html>