<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Income</title>
</head>
<%@include file="Home.jsp"%>
<%-- <%@include file="Officemanager.jsp"%> --%>
<h1></h1>
<body>
	<div class="row">
		<div class="index-boxes">
			<div class="col-md-12">

				<div class="col-md-3">
					<div align="center" class="index-boxes-part green fa_index_1">
						<i class="fa fa-globe"></i>
						<h3>999</h3>

						<h6>
							<a href="#"> <span class="fa fa-money"></span>Monthly Fees
								Collection
							</a>
						</h6>
					</div>
				</div>

				<div class="col-md-3">
					<div align="center" class="index-boxes-part orange fa_index_2">
						<i class="fa fa-globe"></i>
						<h3>999</h3>

						<h6>
							<a href="#"> <span class="fa fa-credit-card"></span>Monthly
								Expenses
							</a>
						</h6>
					</div>
				</div>

				<div class="col-md-3">
					<div align="center" class="index-boxes-part red fa_index_3">
						<i class="fa fa-globe"></i>
						<h3>${studentsCount}</h3>

						<h6>
							<a href="#"> <span class="fa fa-user"></span>Students
							</a>
						</h6>
					</div>
				</div>

				<div class="col-md-3">
					<div align="center" class="index-boxes-part linear-g fa_index_4">
						<i class="fa fa-globe"></i>
						<h3>${teachersCount}</h3>

						<h6>
							<a href="#"> <span class="fa fa-user-secret"></span>Teachers
							</a>
						</h6>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>