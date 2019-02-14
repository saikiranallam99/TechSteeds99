<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Home.jsp" %>
<body>
<h1>Expenses </h1><br><br>
 <form name="form1" class="col-md-3" action="searchExpensesByDate" method="post" >
<pre>
Date From
<input type="text" name="dateFrom" placeholder="dd/mm/yyyy" required  onblur="validatedate(document.form1.dateFrom)"/>
Date To
<input type="text" name="dateTo" placeholder="dd/mm/yyyy" required />
<input type="submit" value="Search" />	
</pre>
<!-- onclick="validatedate(document.form1.dateFrom)" -->
</form>
${msg} 

<script >
function validatedate(inputText) {
    var dateformat = /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/;
    if (inputText.value.match(dateformat)) {
        document.form1.text1.focus();
        var opera1 = inputText.value.split('/');
        var opera2 = inputText.value.split('-');
        lopera1 = opera1.length;
        lopera2 = opera2.length;
        if (lopera1 > 1) {
            var pdate = inputText.value.split('/');
        } else if (lopera2 > 1) {
            var pdate = inputText.value.split('-');
        }
        var dd = parseInt(pdate[0]);
        var mm = parseInt(pdate[1]);
        var yy = parseInt(pdate[2]);
        var ListofDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
        if (mm == 1 || mm > 2) {
            if (dd > ListofDays[mm - 1]) {
                alert('Invalid date format!');
                return false;
            }
        }
        if (mm == 2) {
            var lyear = false;
            if ((!(yy % 4) && yy % 100) || !(yy % 400)) {
                lyear = true;
            }
            if ((lyear == false) && (dd >= 29)) {
                alert('Invalid date format!');
                return false;
            }
            if ((lyear == true) && (dd > 29)) {
                alert('Invalid date format!');
                return false;
            }
        }
    } else {
        alert("Invalid date format!");
        document.form1.dateFrom.focus();
        return false;
    }
}
</script>
</body>
</html>