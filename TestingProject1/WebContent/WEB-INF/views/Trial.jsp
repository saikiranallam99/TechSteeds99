<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: "Lato", sans-serif;
}

/* Fixed sidenav, full height */
.sidenav {
	height: 100%;
	width: 250px;
	position: fixed;
	z-index: 1;
	top: 0;
	left: 0;
	background-color: #111;
	overflow-x: hidden;
	padding-top: 10px;
}

/* Style the sidenav links and the dropdown button */
.sidenav a,.dropdown-btn {
	padding: 10px 12px 10px 20px;
	text-decoration: none;
	font-size: 20px;
	color: #818181;
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
	margin-left: 250px; /* Same as the width of the sidenav */
	font-size: 20px; /* Increased text to enable scrolling */
	padding: 0px 10px;
}

/* Add an active class to the active dropdown button */
.active {
	background-color: green;
	color: white;
}

/* Dropdown container (hidden by default). Optional: add a lighter background color and some left padding to change the design of the dropdown content */
.dropdown-container {
	display: none;
	background-color: #262626;
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
.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
</head>
<body>


<div class="header">
  <a href="#default" class="logo">CompanyLogo</a>
  <div class="header-right">
    <a class="active" href="showIncome">Home</a>
    <a href="userLogout">Logout</a>
  </div>
</div>

	<div class="sidenav">
		<a href="showIncome">MY SCHOOL</a>
		<button class="dropdown-btn">
			Student Information <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showStudentDetails">Student Details</a>
			<a href="showStudent">Student Admissions</a>
			<a href="showCategory">Student Categories</a>
			<a href="showPromote">Promote Students</a>
		</div>
		<button class="dropdown-btn">
			Fees Collection <i class="fa fa-caret-down"></i>
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
		<button class="dropdown-btn">
			Income <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showAddIncome"> Add Income </a> 
			<a href="showSearchIncome">Search Income </a> 
			<a href="showIncomeHead"> Income Head </a>
		</div>
		<button class="dropdown-btn">
			Expenses <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showAddExpenses"> Add Expenses </a> 
			<a href="showSearchExpenses"> Search Expenses </a> 
			<a href="showExpensesHead">Expense Head</a>
		</div>
		<button class="dropdown-btn">
			Attendance <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="#">  Student Attendance  </a> 
            <a href="#">  Attendance By Date  </a> 
            <a href="#">  Attendance Report  </a>
		</div>
		<button class="dropdown-btn">
			Examinations <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showExamList">  Exam List   </a>
            <a href="showExamSchedule">  Exam Schedule   </a>
            <a href="#">  Marks Register   </a>
            <a href="showmarksGrade">  Marks Grade   </a>
		</div>
		<button class="dropdown-btn">
			Accademics <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showTimetable">   Class Time Table    </a> 
            <a href="#">   Assign Subjects   </a> 
            <a href="showSubjects">   Subjects   </a>
            <a href="showTeachers">   Teachers   </a> 
            <a href="showClas">   Class   </a>
             <a href="showSections">   Sections   </a>
		</div>
		<button class="dropdown-btn">
			Download Center <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showUploadContent">  Upload Content  </a> 
            <a href="showAssignment">  Assignments  </a>
            <a href="showStudyMaterial">  Study Material </a> 
            <a href="showSyllabus">  Syllabus </a> 
            <a href="showOtherDownload">  Others Downloads </a>
		</div>
		<button class="dropdown-btn">
			Library <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showAddBook"> Add Book </a>
            <a href="showAllBooks"> Book List </a>
            <a href="#"> Issue Return </a>
            <a href="#"> Add Student </a>
            <a href="#"> Add Teacher </a> 
            <a href="showLibrarian"> Librarians </a>
		</div>
		<button class="dropdown-btn">
			Inventory <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showIssueItem"> Issue Item </a> 
            <a href="showAddItemStock"> Add Item Stock </a>
            <a href="showadditem"> Add Item  </a>
            <a href="showitemcategory"> Item Category </a>
            <a href="showitemstore"> Item Store </a>
            <a href="showitemsupplier"> Item Supplier </a>
		</div>
		<button class="dropdown-btn">
			Transport <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="showCreateRoute"> Routes </a> 
            <a href="showAddVehicle"> Vechiles </a>
            <a href="showVehicleOnRoute"> Assign Vechiles </a>
		</div>
		<button class="dropdown-btn">
			Hostel <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="showAddHostelRoom"> Hostel Rooms </a> 
             <a href="showAddRoomType"> Room Type</a>
             <a href="showAddHostel"> Hostel </a>
		</div>
		<button class="dropdown-btn">
			Communicate <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="#"> Notice Board </a> 
             <a href="#"> Send Message</a>
             <a href="showMailSender"> Send Email / SMS </a>
             <a href="#"> Email / SMS Log </a>
		</div>
		<button class="dropdown-btn">
			Reports <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="#"> Student Report</a> 
             <a href="#"> Fee Statement</a>
             <a href="#"> Balance Fees Report </a>
             <a href="#"> Transaction Report</a>
             <a href="#"> Attendance Report</a>
             <a href="#"> Exam Marks Report</a>
             <a href="#"> User Log</a>
		</div>
		<button class="dropdown-btn">
			System Setting <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			 <a href="#"> General Setting </a> 
             <a href="#"> Session Setting</a>
             <a href="#"> Notification Setting </a>
             <a href="#"> SMS Setting </a>
             <a href="#"> Email Setting </a>
             <a href="#"> Payment Setting </a>
             <a href="#"> Backup / Restore </a>
             <a href="showAdmin"> Admin Users </a>
             <a href="#"> Users </a>
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
