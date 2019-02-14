<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main-styles.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Ubuntu');
@import url('https://fonts.googleapis.com/css?family=Open+Sans');

body{
    font-family: 'Ubuntu', sans-serif;
    width: 100%;
    margin: 0;
    background: #f9f9f9;
}
p,a{
   font-size: 14px;
    margin:0;
    font-family: 'Ubuntu', sans-serif;
}
h1,h2,h3,
h4,h5,h6{
    font-family: 'Open Sans', sans-serif;
    margin:0;
}
.no_padding{
    padding: 0;
}
.no_margin{
    margin: 0;
}
a{
    text-decoration: none!important;
}
:focus{
    outline: none;
}
::placeholder{
    font-style: italic;
}
ul{
    list-style: none;
}
.pt_20{
    padding-top: 20px;
}
.pb_20{
    padding-bottom: 20px;
}
.mt_20{
    margin-top: 20px;
}
.mb_20{
    margin-bottom: 20px;
}
.mt_40{
    margin-top: 40px;
}
.green{
    background: #46c37b;
}
.orange{
    background: #f3b760;
}
.red{
    background: #d26a5c;
}
.linear-g{
    background: linear-gradient(to right, #555299 0%, #2574ab 100%);
}


/* Header */
.header{
    position: fixed;
    width:100%;
    background: #333;
    padding: 10px 0;
    z-index: 9999;
    background-color: #605ca8;
    background-image: -webkit-linear-gradient(left, #605ca8 0%, #2574ab 100%);
    background-image: -o-linear-gradient(left, #605ca8 0%, #2574ab 100%);
    background-image: linear-gradient(to right, #605ca8 0%, #2574ab 100%);
    background-repeat: repeat-x;
}
.header_left h3{
    color: #fff;
    text-align: center;
}
.header_left h3 a{
    float: right;
    color: #f5f5f5;
    font-size: 22px;
    margin-right: 40px;
}
.header_left h3 a i{
    float: right;
    color: #f5f5f5;
    font-size: 22px;
    margin-right: 40px;
}
.header_middle h3 {
  color: #fff;
  float: right;
  font-size: 22px;
  margin-right: 40px;
  text-align: center;
}
.header_right{
    float:right;
}
.icon-1 .fa{
    color: #fff;
    padding-right: 5px;
}
.icon-1 ul{
    padding: 0;
    margin: 0;
}
.icon-1 ul li{
    float: left;
}
.icon-1 ul li a{
    color: #fff;
    padding: 0 20px;
}
.header_right{
    position: relative; 
}
.anc_line::after{
    content: '';
    position: absolute;
    left: 0;
    width: 2px;
    height: 20px;
    background: #ddd;
}
/* Header */

/* Sidemenu */
.wrap {
  position: relative;
}
.wrap .nav-bar .navbar-brand {
  margin-top: 15px;
}
.wrap .nav-bar .navbar-form {
  margin-top: 25px;
}
.wrap .nav-bar .nav {
  float: right !important;
}
.wrap .nav-bar .nav .dropdown span.fa,
.wrap .nav-bar .nav .dropdown span.caret {
  margin-right: 10px;
}
.wrap .nav-bar .nav .dropdown-menu {
  background: #333;
  left: auto;
  width: 200px;
  right: 0;
}
.wrap .nav-bar .nav .dropdown-menu > li > a {
  color: #ddd;
  padding: 8px;
}
.wrap .nav-bar .nav .dropdown-menu > li > a:hover {
  background: #3355ff;
}
.wrap .side-menu-link {
  left: 21em;
}
.wrap .burger {
  position: relative;
  width: 35px;
  height: 30px;
  left: 10px;
  top: 5px;
  z-index: 500000;
}
.wrap .burger .burger_inside {
  position: absolute;
  background-color: #222;
  width: 30px;
  height: 5px;
  left: 2.5px;
  -webkit-transition: all 0.5s ease-out;
  -moz-transition: all 0.5s ease-out;
  -ms-transition: all 0.5s ease-out;
  -o-transition: all 0.5s ease-out;
  transition: all 0.5s ease-out;
}
.wrap .burger #bgrOne {
  top: 0;
}
.wrap .burger #bgrTwo {
  top: 10px;
}
.wrap .burger #bgrThree {
  top: 20px;
}
.wrap #side-menu {
  position: absolute;
  z-index: -1;
  background: #222d32;
  width: 100%;
  padding-top: 20px;
  float: left;
  display: block;
  left: 0;
  height: -webkit-fill-available;
}
.wrap .content {
  position: absolute;
  right: 0;
  min-width: 400px;
  -webkit-transition: all 0.3s ease-out;
  -moz-transition: all 0.3s ease-out;
  -ms-transition: all 0.3s ease-out;
  -o-transition: all 0.3s ease-out;
  transition: all 0.3s ease-out;
}
.wrap .content .top-bar {
  height: 40px;
  background: #ddd;
}
.wrap .content .content-inner {
  padding: 0;
  margin: 0;
  background: #fff;
  padding-left: 20px;
  display: block;
  position: absolute;
  height: 900px;
  width: 100%;
}
.wrap ul.accordion {
  width: 100%;
  background: transparent;
}
.wrap ul.accordion .link {
  cursor: pointer;
  display: block;
  padding: 15px 15px 15px 42px;
  color: #9D9D9D;
  font-size: 14px;
  font-weight: 700;
  border-bottom: 1px dotted #666;
  position: relative;
  -webkit-transition: all 0.4s ease;
  -o-transition: all 0.4s ease;
  transition: all 0.4s ease;
}
.wrap ul.accordion li:not(open) last-child .link {
  border-bottom: 0;
}
.wrap ul.accordion li i {
  position: absolute;
  top: 16px;
  left: 12px;
  font-size: 18px;
  color: #999;
  -webkit-transition: all 0.4s ease;
  -o-transition: all 0.4s ease;
  transition: all 0.4s ease;
}
.wrap ul.accordion li i.fa-chevron-down {
    right: 12px;
    left: auto;
    font-size: 10px;
    top: 20px;
}
.wrap ul.accordion li.open .link {
  color: #fff;
}
.wrap ul.accordion li.open i {
  color: #fff;
}
.wrap ul.accordion li.open i.fa-chevron-down {
  -webkit-transform: rotate(180deg);
  -ms-transform: rotate(180deg);
  -o-transform: rotate(180deg);
  transform: rotate(180deg);
}
.wrap ul.accordion ul.submenu {
  display: none;
  background: transparent;
  font-size: 14px;
  padding: 0;
}
.wrap ul.accordion ul.submenu li {
  border-bottom: 1px solid #4b4a5e;
  list-style: none;
}
.wrap ul.accordion ul.submenu li a {
    display: block;
    text-decoration: none;
    color: #d9d9d9;
    padding: 12px;
    padding-left: 40px;
    font-weight:bold;
    -webkit-transition: all 0.25s ease-in-out;
    -o-transition: all 0.25s ease-in-out;
    transition: all 0.25s ease-in-out;
}
.wrap ul.accordion ul.submenu li a:hover {
  background: linear-gradient(to right, #605ca8 0%, #2574ab 100%);
  color: #fff;
}
@media screen and (max-width: 768px) {
  .wrap .nav-bar .navbar-brand {
    margin-top: 0;
    padding-left: 0;
  }
  .wrap .side-menu-link {
    display: inline-block;
  }
  .wrap #side-menu #qform {
    position: absolute;
    top: 10px;
  }
  .wrap .content {
    left: 0;
  }
  .wrap.active .content {
    left: 21em;
  }
  .wrap.active .content #bgrOne {
    top: 10px;
    transform: rotate(225deg);
  }
  .wrap.active .content #bgrTwo {
    opacity: 0;
  }
  .wrap.active .content #bgrThree {
    top: 10px;
    transform: rotate(315deg);
  }
}
@media screen and (min-width: 769px) {
  .side-menu-link {
    display: none;
  }
  .wrap {
    position: relative;
  }
  .wrap .content {
    left: 21em;
    right: 0;
  }
}

::-webkit-scrollbar {
    width: 10px;
}
 
::-webkit-scrollbar-track {
    background: #ddd;
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
}
 
::-webkit-scrollbar-thumb {
  background-color: #999;
  outline: 1px solid #fff;
}
.user_main {
    width:100%;
    height:70px;
}
.user_main img{
    float:left;
}
.user_main p{
    float: right;
    color: #fff;
    text-align: center;
    padding: 10px 0;
    width: 60%;
    font-size: 16px;
}
.user_main p span{
    font-size: 14px;
}
/* Sidemenu */

/* Toggle Menu */
#wrapper {
    padding-left: 0;
    -webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
}

#wrapper.toggled {
    padding-left: 250px;
}

#sidebar-wrapper {
    z-index: 1000;
    position: fixed;
    left: 250px;
    width: 0;
    height: 100%;
    margin-left: -250px;
    overflow-y: auto;
    background: #222d32;
    -webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
}

#wrapper.toggled #sidebar-wrapper {
    width: 250px;
}

#page-content-wrapper {
    width: 100%;
    position: absolute;
    padding: 15px;
}

#wrapper.toggled #page-content-wrapper {
    position: absolute;
    margin-right: -250px;
}

/* Sidebar Styles */

.sidebar-nav {
    position: absolute;
    top: 0;
    width: 250px;
    margin: 0;
    padding: 0;
    list-style: none;
}

.sidebar-nav li {
    text-indent: 20px;
    line-height: 40px;
}

.sidebar-nav li a {
    display: block;
    text-decoration: none;
    color: #999999;
}

.sidebar-nav li a:hover {
    text-decoration: none;
    color: #fff;
    background: rgba(255,255,255,0.2);
}

.sidebar-nav li a:active,
.sidebar-nav li a:focus {
    text-decoration: none;
}

.sidebar-nav > .sidebar-brand {
    height: 65px;
    font-size: 18px;
    line-height: 60px;
}

.sidebar-nav > .sidebar-brand a {
    color: #999999;
}

.sidebar-nav > .sidebar-brand a:hover {
    color: #fff;
    background: none;
}

.nav-header-no::before{
    display: none;
}
.nav-header::before{
    content:'';
    width:2px;
    height:50px;;
    position: absolute;
    background: transparent;
    transition: all ease-in-out 0.5;
}
.nav-header:hover::before{
    background: #605ca8 ;
    transition: all ease-in-out 0.5;
}

@media(min-width:768px) {
    #wrapper {
        padding-left: 250px;
    }

    #wrapper.toggled {
        padding-left: 0;
    }

    #sidebar-wrapper {
        width: 250px;
    }

    #wrapper.toggled #sidebar-wrapper {
        width: 0;
    }

    #page-content-wrapper {
        padding: 20px;
        position: relative;
    }

    #wrapper.toggled #page-content-wrapper {
        position: relative;
        margin-right: 0;
    }
}
/* Toggle Menu */



/* Content Part */
.main_heading h5{
    font-size: 20px;
    color: #09c;
    background: #f1f1f1;
    font-weight: bold;
    text-transform: uppercase;
    padding: 15px 20px;
    margin: 10px 15px;
    border-radius: 5px;
    text-align: center;  
}
.index-boxes{
    padding: 50px 0;
    display: flex;
}
.index-boxes-part{
    padding: 10px 0 0px 0;
    border-radius: 5px;
    box-shadow: 1px 1px 2px 0px #00000036;
}
.index-boxes-part h3{
    font-family: fantasy;
    padding: 6px 0;
    color: #fff;
}
.index-boxes-part h5{
    color: #fff;
    font-size: 14px;
    text-transform: uppercase;
}
.index-boxes-part h6{
    margin: 10px 0;
    padding: 10px 0;
    font-size: 14px;
    letter-spacing: 0.6px;
    font-weight: bold;
    background: #fff;
    border-radius: 0 0 5px 5px;
}
.index-boxes-part h6 a {
    color: #09c;
    text-transform: uppercase;
}
.index-boxes-part h6 a span{
    padding-right: 10px;
}
.index-boxes-part h5{
    font-size: 16px;
    text-transform: uppercase;
    font-weight: bold; 
    color: #fff;
}
.fa_index_1 i{
    font-size: 32px;
    color: #fff;
    padding-bottom: 30px;
    background: #46c37b;
    border-radius: 50px;
    padding: 20px 23px;
    margin-top: -40px;
    display: table-caption;
    transition:all ease-in-out 0.5s;
}
.fa_index_2 i{
    font-size: 32px;
    color: #fff;
    padding-bottom: 30px;
    background: #f3b760;
    border-radius: 50px;
    padding: 20px 23px;
    margin-top: -40px;
    display: table-caption;
    transition:all ease-in-out 0.5s;
}
.fa_index_3 i{
    font-size: 32px;
    color: #fff;
    padding-bottom: 30px;
    background: #d26a5c;
    border-radius: 50px;
    padding: 20px 23px;
    margin-top: -40px;
    display: table-caption;
    transition:all ease-in-out 0.5s;
}
.fa_index_4 i{
    font-size: 32px;
    color: #fff;
    padding-bottom: 30px;
    background: linear-gradient(to right, #555299 0%, #2574ab 100%) ;
    border-radius: 50px;
    padding: 20px 23px;
    margin-top: -40px;
    display: table-caption;
    transition:all ease-in-out 0.5s;
}
.fa_index_1::before{
    position: absolute;
    top: -38px;
    left: 0;
    right: 0;
    content: '';
    width: 90px;
    height: 90px;
    margin: 0px auto;
    background: transparent;
    border: 2px solid  #46c37b ;
    border-radius: 50px;
    z-index: -1;
}

.fa_index_2::before{
    position: absolute;
    top: -38px;
    left: 0;
    right: 0;
    content: '';
    width: 90px;
    height: 90px;
    margin: 0px auto;
    background: transparent;
    border: 2px solid  #f3b760 ;
    border-radius: 50px;
    z-index: -1;
}

.fa_index_3::before{
    position: absolute;
    top: -38px;
    left: 0;
    right: 0;
    content: '';
    width: 90px;
    height: 90px;
    margin: 0px auto;
    background: transparent;
    border: 2px solid  #d26a5c ;
    border-radius: 50px;
    z-index: -1;
}

.fa_index_4::before{
    position: absolute;
    top: -38px;
    left: 0;
    right: 0;
    content: '';
    width: 90px;
    height: 90px;
    margin: 0px auto;
    background: transparent;
    border: 2px solid  #555299 ;
    border-radius: 50px;
    z-index: -1;
}
.fa_index_1:hover i,
.fa_index_2:hover i,
.fa_index_3:hover i,
.fa_index_4:hover i{
       transform: rotate(-360deg);
}
/* Content Part */

/* accountbalance */
.account_balance{
    padding: 10px;
    height:380px;
    box-shadow: 2px 2px 2px 1px #f1f1f1;
    margin-bottom: 20px;
    background: #FFF none repeat scroll 0% 0%;
    transition: all 0.4s ease 0s;
    border-radius: 5px;
}
.account_balance h5{
    color: #fff;
    font-weight: 600;
    padding: 12px 0;
    text-align: center;
    border-radius: 2px;
    background: linear-gradient(to right, #605ca8 0%, #2574ab 100%);
    font-size: 16px;
    letter-spacing: 1px;
    margin-top: -25px;
    margin-bottom: 25px;
}
.account_table thead tr th,
.account_table tbody tr td{
        border-top: 1px dotted #f1f1f1!important;
}
.table>thead>tr>th {
    vertical-align: bottom;
    border-bottom: 1px dotted #f1f1f1!important;
}
.account_output{
    background: #f9f9f9;
}
.account_table_text td a{
    color: #555299;
    font-weight: 600;
}
.table>thead>tr>th {
    padding: 10px 0!important;
}
.main_income{
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    height: 200px;
}
.main_income h3{
    display: block;
    font-size: 24px;
    font-weight: 900;
    color: #666;
    letter-spacing: 1px;
}
.main_income h6{
    font-size: 16px;
    padding: 10px 40px;
    font-weight: bold;
    background: #4567a9;
    margin: 10px;
    color: #fff;
    letter-spacing: 1px;
}
.main_income_100{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
}
.main_income_50{
    text-align: center;
    width: 50%;
}
.main_income_50 span{
    display: block;
    font-size: 20px;
    font-weight: 900;
    color: #666;
}
.account_table_full tbody tr td{
    padding: 10px 0;
}
.footer_part p{
    font-size: 16px;
    background: #222d32;
    padding: 15px 30px;
    color: #fff;
}
/* accountbalance */

/* Graph */
#bar-chart{
    height:100%!important;
}
.highcharts-button{
    display: none!important;
}
.highcharts-credits{
    display: none!important;
}
.highcharts-point, .highcharts-color-0 {
    fill: #4a65a9!important;
}
/* Graph */
</style>
</head>
<body>
 <div class="row header">
            <div class="col-md-12">
                <div class="col-md-3">
                    <div class="header_left">
                        <a href="" class="" id="click"> <h3> Logo &nbsp;&nbsp;&nbsp;&nbsp; <i class="fa fa-list"></i>   </a> </h3>
                    </div>
                </div>
                <div class="col-md-2">
                	<div class="header_middle">
                	<a href="index.html"><h3>MY SCHOOL </h3></a>	
                	</div>
                	

                </div>

                <div class="col-md-7">
                    <div class="header_right">
                            
                        <div class="icon-1">
                            <ul>

                            	<li>
                            		<form action="">
                                     <input type="text" placeholder="Search.." name="search">
                                     <button type="submit"><i class="fa fa-search" style="color: blue"></i></button>
                                     </form>
                            	</li>
                                    
                                    <li>
                                    	
                                    	<div class="navbar-custom-menu">
                                <ul class="nav navbar-nav"> 

                                    <li class="dropdown">
                                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">Admin <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                                        </a>
                                        <ul class="dropdown-menu dropdown-user">
                                            <li><a href=""><i class="fa fa-key"></i> Change Password</a>
                                            </li>
                                            <li class="divider"></li>
                                            <li><a href=""><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                                            </li>
                                        </ul>                             
                                    </li>   
                                </ul>
                            </div>
                                    </li>


                                
                            </ul>
                        </div>
                            
                    </div>
                </div>
            </div>
        </div>
    
        <div id="wrapper">
            <div id="sidebar-wrapper">
                
                <div class="sidemenu mt_40">
                    <div class="wrap">
                        <aside id="side-menu" class="aside" role="navigation">            
                            <ul class="nav nav-list accordion">  
                                        
                              <li class="nav-header nav-header-no">
                                    <div class="user_main no_padding">
                                        <img src="images/man.png">
                                            <p> 
                                                Admin Name <br>
                                                <span> Designation </span>
                                            </p>

                                    </div>
                                </li>
                                        

                           

                                      <li class="nav-header">
                                        <div class="link">
                                            <i class="fa fa-lg fa-globe"></i> 
                                            Quick Links <span class="glyphicon glyphicon-th pull-right"></span>
                                        </div>
                                      </li>
                                        
                                      <li class="nav-header">
                                        <div class="link"><i class="fa fa-lg fa-user-plus"></i> Student Information <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#">Student Details</a></li>  
                                          <li><a href="#">Student Admissions</a></li>
                                          <li><a href="#">Student Categories</a></li>
                                          <li><a href="#">Promote Students</a></li>  
                                        </ul>
                                      </li>

                                      <li class="nav-header">
                                        <div class="link"><i class="fa fa-money"></i>Fees Collection<i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> Collect Fees </a></li>
                                          <li><a href="#"> Fees Master </a></li>
                                          <li><a href="#"> Fees Group  </a></li>
                                          <li><a href="#"> Fees Type  </a></li>
                                          <li><a href="#"> Fees Discount  </a></li>
                                          <li><a href="#"> Search Fees Payment  </a></li>
                                          <li><a href="#"> Search Due Fees  </a></li>
                                          <li><a href="#"> Fees Statement  </a></li>
                                          <li><a href="#"> Balance Fees Report  </a></li>
                                        </ul>
                                      </li>

                                      <li class="nav-header">
                                        <div class="link"><i class="fa fa-usd"></i>Income<i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                            
                                          <li><a href="#">  Add Income  </a></li>
                                          <li><a href="#">  Search Income  </a></li>
                                          <li><a href="#">  Income Head  </a></li>
                                            
                                        </ul>
                                      </li>  

                                       <li class="nav-header">
                                        <div class="link"><i class="fa fa-credit-card"></i>Expenses<i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> Add Expenses </a></li>
                                          <li><a href="#"> Search Expenses </a></li>
                                           <li><a href="#">Expense Head</a></li>
                                        </ul>
                                      </li>

                                      <li class="nav-header">
                                        <div class="link"><i class="fa fa-calendar-check-o"></i>Attendance<i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#">  Student Attendance  </a></li> 
                                          <li><a href="#">  Attendance By Date  </a></li> 
                                          <li><a href="#">  Attendance Report  </a></li>          
                                        </ul>
                                      </li>
                                        
                                        <li class="nav-header">
                                        <div class="link"><i class="fa fa-map-o"></i>  Examinations <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#">  Exam List   </a></li> 
                                          <li><a href="#">  Exam Schedule   </a></li>
                                          <li><a href="#">  Marks Register   </a></li>
                                          <li><a href="#">  Marks Grade   </a></li> 
                                        </ul>
                                      </li>
                                        
                                        <li class="nav-header">
                                        <div class="link"><i class="fa fa-mortar-board"></i>   Accademics    <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#">   Class Time Table    </a></li> 
                                          <li><a href="#">   Assign Subjects   </a></li> 
                                          <li><a href="#">   Subjects   </a></li> 
                                          <li><a href="#">   Teachers   </a></li> 
                                          <li><a href="#">   Class   </a></li>
                                          <li><a href="#">   Sections   </a></li>          
                                        </ul>
                                      </li>
                                        
                                        <li class="nav-header">
                                        <div class="link"><i class="fa fa-download"></i>   Download Center   <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#">  Upload Content  </a></li> 
                                          <li><a href="#">  Assignments  </a></li> 
                                          <li><a href="#">  Study Material </a></li> 
                                          <li><a href="#">  Syllabus </a></li> 
                                          <li><a href="#">  Others Downloads  </a></li>     
                                        </ul>
                                      </li>
                                        
                                         <li class="nav-header">
                                        <div class="link"><i class="fa fa-book"></i> Library  <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> Add Book </a></li> 
                                          <li><a href="#"> Book List </a></li>
                                          <li><a href="#"> Issue Return </a></li>
                                          <li><a href="#"> Add Student </a></li>
                                          <li><a href="#"> Add Teacher </a></li> 
                                          <li><a href="#"> Librarians </a></li>
                                        </ul>
                                      </li>


                                      <li class="nav-header">
                                            <div class="link"><i class="fa fa-object-group"></i>Inventory<i class="fa fa-chevron-down"></i></div>
                                            <ul class="submenu">
                                              <li><a href="#"> Issue Item </a></li> 
                                              <li><a href="#"> Add Item Stock </a></li>
                                              <li><a href="#"> Add Item  </a></li>
                                              <li><a href="#"> Item Category </a></li>
                                              <li><a href="#"> Item Store </a></li>
                                              <li><a href="#"> Item Supplier </a></li>

                                            </ul>
                                          </li>
                                     
                                    <li class="nav-header">
                                        <div class="link"><i class="fa fa-bus"></i> Transport  <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> Routes </a></li> 
                                          <li><a href="#"> Vechiles </a></li>
                                          <li><a href="#"> Assign Vechiles </a></li>
                                        </ul>
                                      </li>


                                      <li class="nav-header">
                                        <div class="link"><i class="fa fa-building-o"></i> Hostel  <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> Hostel Rooms </a></li> 
                                          <li><a href="#"> Room Type</a></li>
                                          <li><a href="#"> Hostel </a></li>
                                        </ul>
                                      </li>
                                        
                                    

                                     <li class="nav-header">
                                        <div class="link"><i class="fa fa-bullhorn"></i> Communicate  <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> Notice Board </a></li> 
                                          <li><a href="#"> Send Message</a></li>
                                          <li><a href="#"> Send Email / SMS </a></li>
                                          <li><a href="#"> Email / SMS Log </a></li>
                                        </ul>
                                      </li>

                                      <li class="nav-header">
                                        <div class="link"><i class="fa fa-line-chart"></i> Reports  <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> Student Report</a></li> 
                                          <li><a href="#"> Fee Statement</a></li>
                                          <li><a href="#"> Balance Fees Report </a></li>
                                          <li><a href="#"> Transaction Report</a></li>
                                          <li><a href="#"> Attendance Report</a></li>
                                          <li><a href="#"> Exam Marks Report</a></li>
                                          <li><a href="#"> User Log</a></li>
                                        </ul>
                                      </li>

                                      <li class="nav-header">
                                        <div class="link"><i class="fa fa-gears"></i> System Setting  <i class="fa fa-chevron-down"></i></div>
                                        <ul class="submenu">
                                          <li><a href="#"> General Setting </a></li> 
                                          <li><a href="#"> Session Setting</a></li>
                                          <li><a href="#"> Notification Setting </a></li>
                                          <li><a href="#"> SMS Setting </a></li>
                                          <li><a href="#"> Email Setting </a></li>
                                          <li><a href="#"> Payment Setting </a></li>
                                          <li><a href="#"> Backup / Restore </a></li>
                                        </ul>
                                      </li>

                                </ul>
                            </aside>
                        </div>
                    </div>
                </div>
            
            
                <div id="page-content-wrapper ">
                    <div class="container-fluid">
                        
                        <div class="row mt_40">
                             <div class="main_heading">
                                <h5> Office Manager Dashboard </h5>
                             </div>
                        </div>
                        
                        <!-- row Part start-->
                        <div class="row">
                            <div class="index-boxes">
                                <div class="col-md-12">
                                    
                                    <div class="col-md-3">
                                        <div align="center" class="index-boxes-part green fa_index_1">
                                            <i class="fa fa-globe"></i>
                                            <h3> 999 </h3>
                                            
                                            <h6>
                                                <a href="#">
                                                    <span class="fa fa-money"></span>Monthly Fees Collection
                                                </a>
                                            </h6>
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-3">
                                        <div align="center" class="index-boxes-part orange fa_index_2">
                                            <i class="fa fa-globe"></i>
                                            <h3> 999 </h3>
                                            
                                            <h6>
                                                <a href="#">
                                                    <span class="fa fa-credit-card"></span>Monthly Expenses
                                                </a>
                                            </h6>
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-3">
                                        <div align="center" class="index-boxes-part red fa_index_3">
                                            <i class="fa fa-globe"></i>
                                            <h3> 999 </h3>
                                            
                                            <h6>
                                                <a href="#">
                                                    <span class="fa fa-user"></span>Students
                                                </a>
                                            </h6>
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-3">
                                        <div align="center" class="index-boxes-part linear-g fa_index_4">
                                            <i class="fa fa-globe"></i>
                                            <h3> 999 </h3>
                                            
                                            <h6>
                                                <a href="#">
                                                    <span class="fa fa-user-secret"></span>Teachers
                                                </a>
                                            </h6>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- row Part end-->
                        
                        <!-- row Part start-->
                        <div class="row">
                            <div class="col-md-12">
                                <div class="col-md-12">
                                    <div class="account_balance">
                                        <h5> CASH FLOW OF THE YEAR 2018 </h5>
                                        
                                        <div id="graph-1" style="width:100%; height: 350px; margin: 0 auto"></div>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- row Part end-->
                        
                        <!-- row Part start-->
                        <div class="row mt_40">
                            <div class="col-md-12">
                                <div class="col-md-6">
                                    <div class="account_balance">
                                        <h5> ACCOUNT BALANCE </h5>
                                        <table class="table account_table">
                                            <thead>
                                                <tr> 
                                                    <th>Name</th>
                                                    <th>Balance</th>
                                                </tr>
                                            </thead>
                                            
                                            <tbody>
                                                <tr class="account_table_text">
                                                    <td> <a href="">Pety Cash</a> </td>
                                                    <td> 0.00 </td>
                                                </tr>
                                                
                                                <tr class="account_table_text">
                                                    <td> <a href="">Accounts Receivable (A/R)</a> </td>
                                                    <td> 0.00 </td>
                                                </tr>
                                                
                                                <tr class="account_table_text">
                                                    <td> <a href="">Accounts Payable (A/P)</a> </td>
                                                    <td> 0.00 </td>
                                                </tr>
                                                
                                                <tr class="account_output">
                                                    <td> <b>Balance</b> </td>
                                                    <td> <b>INR 0.00</b> </td>
                                                </tr>
                                            </tbody>
                                            
                                        </table>
                                    </div>
                                </div>
                                
                                <div class="col-md-6">
                                    <div class="account_balance">
                                        <h5> INCOME VS EXPENSE YEAR 2018 </h5>
                                        
                                        <div class="main_income">
                                            <h3>INCOME </h3>  
                                            <h6> 000 </h6>
                                        </div>
                                        
                                        <div class="main_income_100">
                                             <div class="main_income_50">
                                                <span>INR 0.00</span>
                                                <p>Income this Year</p>
                                            </div>
                                            
                                             <div class="main_income_50">
                                                <span>INR 0.00</span>
                                            </div>
                                        </div>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- row Part end-->
                        
                        <!-- row Part start-->
                        <div class="row mt_40">
                            <div class="col-md-12">
                                <div class="col-md-12">
                                    <div class="account_balance">
                                        <h5> LAST TEN TRANSACTIONS </h5>
                                        <table class="table account_table account_table_full">
                                            <thead>
                                                <tr> 
                                                    <th>Transaction ID</th>
                                                    <th>Account</th>
                                                    <th>Transaction Type</th>
                                                    <th>Category</th>
                                                    <th>Amount</th>
                                                    <th>Balance</th>
                                                    <th>Date</th>
                                                </tr>
                                            </thead>

                                            <tbody>
                                                <tr class="account_table_text">
                                                    <td> ID: 123 </td>
                                                    <td> Account Name </td>
                                                    <td> Paypal </td>
                                                    <td> Transaction </td>
                                                    <td> 1000 </td>
                                                    <td> 10000 </td>
                                                    <td> 05-12-2018 </td>
                                                </tr>

                                                <tr class="account_table_text">
                                                    <td> ID: 123 </td>
                                                    <td> Account Name </td>
                                                    <td> Paypal </td>
                                                    <td> Transaction </td>
                                                    <td> 1000 </td>
                                                    <td> 10000 </td>
                                                    <td> 05-12-2018 </td>
                                                </tr>
                                                
                                                <tr class="account_table_text">
                                                    <td> ID: 123 </td>
                                                    <td> Account Name </td>
                                                    <td> Paypal </td>
                                                    <td> Transaction </td>
                                                    <td> 1000 </td>
                                                    <td> 10000 </td>
                                                    <td> 05-12-2018 </td>
                                                </tr>
                                                
                                                
                                            </tbody>

                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- row Part end-->
                        
                      
                        
                        <!-- row Part start-->
                        <div class="row mt_40">
                            <div class="col-md-12">
                                <div class="col-md-12">
                                    <div class="account_balance">
                                        <h5> CALENDAR PART </h5>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- row Part end-->
                        
                    </div>
                </div>
            
                <footer>
                    <div class="footer_part">
                        <p> © 2018 All rights reserved. </p>
                    </div>
                </footer>
            
            </div>
        
    
<script>
    $("#click").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
</script>
<script src="js/bootstrap.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/accordion.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script src="js/index-graph-1.js"></script>
</body>
</html>