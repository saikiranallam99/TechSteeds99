<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">	
<style>
body {
    background-color:lightblue;
	 font-family: Arial, Helvetica, sans-serif;
}

/* Fixed sidenav, full height */
.sidenav {
	height: 100%;
	width: 280px;
	position: fixed;
	z-index: 1;
	top: 8px;
	left: 0;
	background-color:#1ab2ff;
	overflow-x: hidden;
	padding-top: 10px;
}

/* Style the sidenav links and the dropdown button */
.sidenav a,.dropdown-btn {
	padding: 10px 12px 10px 20px;
	text-decoration: none;
	font-size: 18px;
	color: #000000;
	display: block;
	border: none;
	background: none;
	width: 100%;
	text-align: left;
	cursor: pointer;
	outline: none;
}

/* On mouse-over */
.sidenav a:hover,.dropdown-btn:hover {
	color: #f1f1f1;
}

/* Main content */
.main {

	margin-left: 280px; /* Same as the width of the sidenav */
	font-size: 16px; /* Increased text to enable scrolling */
	padding: 0px 10px;
}

/* Add an active class to the active dropdown button */
.active {
	background-color: #1ab2ff;
	color: white;
}

/* Dropdown container (hidden by default). Optional: add a lighter background color and some left padding to change the design of the dropdown content */
.dropdown-container {
	display: none;
	background-color: #80ffff;
	padding-left: 8px;
}

/* Optional: Style the caret down icon */
.fa-caret-down {
	float: right;
	padding-right: 8px;
}

/* Some media queries for responsiveness */
@media screen and (max-height: 450px) {
	.sidenav {
		padding-top: 20px;
	}
	.sidenav a {
		font-size: 20px;
	}
}

.navbar {
  overflow: hidden;
  background-color: #1ab2ff;
  font-family: Arial, Helvetica, sans-serif;
}

.navbar a {
  float: right;
  font-size: 16px;
  color:#1ab2ff;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: right;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {

  background-color:#1ab2ff;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color:#00bfff;
  min-width: 200px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}

a:link, a:visited {

  color: #3385ff;
  padding: 10px 20px;
  text-align: left;
  text-decoration: none;
  display: inline-block;
}



input[type=text], select {
  width: 25%;
  padding: 10px 10px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
textarea {
  width: 25%;
  padding: 10px 10px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 25%;
  background-color: #818181;
  color: white;
  padding: 10px 10px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=file] {
 width: 25%;
  padding: 10px 10px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
select {
  width: 25%;
padding: 10px 10px;
  border: none;
  border-radius: 4px;
  background-color: #f1f1f1;
}
table, td, th {  
  border: 1px solid #ddd;
  text-align: center;
}

table {
  float: right;
  width: 300px;
  padding: 10px;
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 15px;
}
input[type=submit]:hover {
  background-color: #45a049;
}

</style>
</head>
<body>


<div class="navbar">
  
  <div class="dropdown">
    <button class="dropdown-btn"> Admin <i class="fa fa-caret-down"></i></button>
    <div class="dropdown-content">
      <a href="#">Change Password</a>
      <a href="userLogout">LOGOUT</a>
    </div>
  </div> 
  
  <a  href="#">${schoolName}</a>
  
</div>

	<div class="sidenav">
		<a href="showIncome">SMART SCHOOL</a>
		<button class="dropdown-btn"><i class="fa fa-lg fa-user-plus"></i>  Student Information <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showStudentDetails">Student Details</a>
			<a href="showStudent">Student Admissions</a>
			<a href="showCategory">Student Categories</a>
			<a href="showPromote">Promote Students</a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-money"></i>     Fees Collection <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showCollectFees"> Collect Fees </a>
            <a href="showFeesMaster"> Fees Master </a>
            <a href="showFeesGroup"> Fees Group  </a>
            <a href="showFeestype"> Fees Type  </a>
            <a href="showFeesDiscount"> Fees Discount  </a>
            <a href="showSearchFeesPayment"> Search Fees Payment  </a>
            <a href="showSearchDueFees"> Search Due Fees  </a>
            <a href="showFeesStatement"> Fees Statement  </a>
            <a href="showBalanceFeesReport"> Balance Fees Report  </a>
            <a href="showAccountants"> Accountants  </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-usd"></i>  Income <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showAddIncome"> Add Income </a> 
			<a href="showSearchIncome">Search Income </a> 
			<a href="showIncomeHead"> Income Head </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-credit-card"></i>  Expenses <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showAddExpenses"> Add Expenses </a> 
			<a href="showSearchExpenses"> Search Expenses </a> 
			<a href="showExpensesHead">Expense Head</a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-calendar-check-o"></i>  Attendance <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="#">  Student Attendance  </a> 
            <a href="#">  Attendance By Date  </a> 
            <a href="#">  Attendance Report  </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-map-o"></i>  Examinations <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showExamList">  Exam List   </a>
            <a href="showExamSchedule">  Exam Schedule   </a>
            <a href="showmarksRegister">  Marks Register   </a>
            <a href="showmarksGrade">  Marks Grade   </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-mortar-board"></i>  Accademics <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showTimetable">   Class Time Table    </a> 
            <a href="showAssignSubjects">   Assign Subjects   </a> 
            <a href="showSubjects">   Subjects   </a>
            <a href="showTeachers">   Teachers   </a> 
            <a href="showClas">   Class   </a>
             <a href="showSections">   Sections   </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-download"></i>  Download Center <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showUploadContent">  Upload Content  </a> 
            <a href="showAssignment">  Assignments  </a>
            <a href="showStudyMaterial">  Study Material </a> 
            <a href="showSyllabus">  Syllabus </a> 
            <a href="showOtherDownload">  Others Downloads </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-book"></i>  Library <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showAddBook"> Add Book </a>
            <a href="showAllBooks"> Book List </a>
            <a href="#"> Issue Return </a>
            <a href="#"> Add Student </a>
            <a href="#"> Add Teacher </a> 
            <a href="showLibrarian"> Librarians </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-object-group"></i>  Inventory <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showIssueItem"> Issue Item </a> 
            <a href="showAddItemStock"> Add Item Stock </a>
            <a href="showadditem"> Add Item  </a>
            <a href="showitemcategory"> Item Category </a>
            <a href="showitemstore"> Item Store </a>
            <a href="showitemsupplier"> Item Supplier </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-bus"></i>  Transport <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showCreateRoute"> Routes </a> 
            <a href="showAddVehicle"> Vechiles </a>
            <a href="showVehicleOnRoute"> Assign Vechiles </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-building-o"></i>  Hostel <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="showAddHostelRoom"> Hostel Rooms </a> 
             <a href="showAddRoomType"> Room Type</a>
             <a href="showAddHostel"> Hostel </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-bullhorn"></i>  Communicate <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="showNoticeBoard"> Notice Board </a> 
             <a href="showMailSender"> Send Message</a>
             <a href="showmultipleMailSender"> Send Email / SMS </a>
             <a href="#"> Email / SMS Log </a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-line-chart"></i>  Reports <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="showStudentReports">  Student Report</a> 
             <a href="showFeesStatement"> Fee Statement</a>
             <a href="showBalanceFeesReport"> Balance Fees Report </a>
             <a href="showsearchTransactionsByDate"> Transaction Report</a>
             <a href="#"> Attendance Report</a>
             <a href="showmarksRegister"> Exam Marks Report</a>
             <a href="showAllUSerLogs"> User Log</a>
		</div>
		<button class="dropdown-btn"><i class="fa fa-gears"></i>  System Settings <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="showGeneralSetting"> General Setting </a> 
             <a href="showSession"> Session Setting</a>
             <a href="#"> Notification Setting </a>
             <a href="#"> SMS Setting </a>
             <a href="#"> Email Setting </a>
             <a href="#"> Payment Setting </a>
             <a href="showLanguageList"> Languages </a>
             <a href="showDbBackUp"> Backup / Restore </a>
             <a href="showAdmin"> Admin Users </a>
             <a href="showUsers"> Users </a>
		</div>
	</div>

	<!-- <div class="main">
		<h2>Sidebar Dropdown</h2>
		<p>Click on the dropdown button to open the dropdown menu inside
			the side navigation.</p>
		<p>This sidebar is of full height (100%) and always shown.</p>
		<p>Some random text..</p>
	</div> -->

	<script>
/* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */
var dropdown = document.getElementsByClassName("dropdown-btn");
var i;

for (i = 0; i < dropdown.length; i++) {
  dropdown[i].addEventListener("click", function() {
  this.classList.toggle("active");
  var dropdownContent = this.nextElementSibling;
  if (dropdownContent.style.display === "block") {
  dropdownContent.style.display = "none";
  } else {
  dropdownContent.style.display = "block";
  }
  });
}
</script>

</body>
</html>
