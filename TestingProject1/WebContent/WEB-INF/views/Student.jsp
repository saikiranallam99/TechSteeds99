<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Admission</title>
</head><%@include file="Home.jsp"%>
<body>
	<div class="main">
		<form action="insertStudent" method="post"
			enctype="multipart/form-data">
			<pre>
<table border="0">
 <tr>
<!-- Admission Number        : <input type="text" name="studentId"/><br> -->
<td>Roll Number</td>
						<td><input type="text" name="rlnm" /></td>
<td>Class</td>
						<td> <select name=clas>
                          <c:forEach items="${Clas}" var="clas">
                               <option value="${clas.clas}">${clas.clas}</option>
                          </c:forEach>
                          </select></td>
<td>Section</td>
						<td> <select name=sections>
                          <c:forEach items="${Sections}" var="sections">
                               <option value="${sections.sections}">${sections.sections}</option>
                          </c:forEach>
                          </select></td>
</tr>
					<tr>                        
<td>First Name</td>
						<td><input type="text" name="fsnm" /> </td>
<td>Last Name</td>
						<td><input type="text" name="lsnm" /> </td>
<td>Gender</td>
						<td><select name="gen">
                          <option value="NONE">select</option>
                          <option value="Male">Male</option>
                          <option value="Female">Female</option>
                          </select> </td>
						<br>
  </tr>
   <tr>      
<td>Date Of Birth</td>
						<td><input type="text" name="dob" placeholder="dd/mm/yyyy"
							required> </td>
<td>Category</td>
						<td><select name=category>
                          <c:forEach items="${categories}" var="cate">
                               <option value="${cate.category}">${cate.category}</option>
                          </c:forEach>
                          </select> </td>
<td>Religion</td>
						<td><input type="text" name="rgn" /> </td>
                           </tr>
   <tr>  
<td>Cast</td>
						<td><input type="text" name="cast" /> </td>
<td>Mobile Number</td>
						<td><input type="text" name="mbnm" /> </td>
<td>Email</td>
						<td><input type="text" name="email" /> </td>
 </tr>
   <tr>  
<td>Admission Date</td>
						<td><input type="text" name="addt" placeholder="dd/mm/yyyy"
							required /></td>
<td>Select Image</td>
						<td><input type="file" name="fileOb" />  </td>
<td>RTE</td>
						<td><select name="rte">
                          <option value="NONE">select</option>
                          <option value="YES">YES</option>
                          <option value="NO">NO</option>
                          </select></td>
						
                           </tr>
   <tr>  
<td>Father Name</td>
						<td><input type="text" name="name" /></td>
<td>Father Phone</td>
						<td><input type="text" name="phone" /></td>				
<td>Father Occupation</td> <td><input type="text" name="occup"></td>
 </tr>
   <tr>  
<td>Mother Name</td>
						<td><input type="text" name="mname" /></td>
					
<td>Mother Phone</td>
						<td><input type="text" name="mphone" /></td>
<td>Mother Occupation</td>
						<td><input type="text" name="moccup" /></td>
</tr>
<tr>  			
<td>If Guardian is</td>
						<td><select name="grn">
                          <option value="NONE">select</option> 
                          <option value="Father">Father</option>
                          <option value="Mother">Mother</option>
                          <option value="Other">Other</option>
                          </select></td>
                 
</tr>
<tr>                            
<td>Guardian Name </td>
						<td><input type="text" name="gname" /></td>
<td>Guardian Relation</td>
						<td><input type="text" name="grltn" /></td>
<td>Guardian Email</td>
						<td><input type="text" name="gemail" /></td>
</tr>
<tr>  
<td>Guardian Phone</td>
						<td><input type="text" name="gphone" /></td>
<td>Guardian Occupation</td>
						<td><input type="text" name="goccp" /></td>
<td>Guardian Address</td>
						<td><input type="text" name="gadrs" /></td>
</tr>
<tr>                            
<td><input type="submit" value="Save" /></td>
</tr>
<tr>                         
<td><a href="showAddsibling">Add Sibling</a></td>
<td><a href="showParentDetails">Parent Guardian Detail</a></td>
<td><a href="showAddmore">Add more</a></td>
<td><a href="showStudentDetails">Student Details</a></td>
</tr>
</table>
</pre>
		</form>
		${message} <br />
		<h3>
			<a href="viewAllStus">view All</a>
		</h3>
	</div>
</body>
</html>