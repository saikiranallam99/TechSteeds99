<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>
<meta name="viewport" content="width=device-width, initial-acale=1">
<link rel="stylesheet" href="./bootstrap.css">
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/main-styles.css">
<link rel="stylesheet" href="./css/font-awesome.min.css">
<link rel="stylesheet" href="./css/font-awesome.min.css">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<style type="text/css">
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
/* Content Part */
.main_heading h5 {
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

.index-boxes {
	padding: 50px 0;
	display: flex;
}

.index-boxes-part {
	padding: 10px 0 0px 0;
	border-radius: 5px;
	box-shadow: 1px 1px 2px 0px #00000036;
}

.index-boxes-part h3 {
	font-family: fantasy;
	padding: 6px 0;
	color: #fff;
}

.index-boxes-part h5 {
	color: #fff;
	font-size: 14px;
	text-transform: uppercase;
}

.index-boxes-part h6 {
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

.index-boxes-part h6 a span {
	padding-right: 10px;
}

.index-boxes-part h5 {
	font-size: 16px;
	text-transform: uppercase;
	font-weight: bold;
	color: #fff;
}

.fa_index_1 i {
	font-size: 32px;
	color: #fff;
	padding-bottom: 30px;
	background: #46c37b;
	border-radius: 50px;
	padding: 20px 23px;
	margin-top: -40px;
	display: table-caption;
	transition: all ease-in-out 0.5s;
}

.fa_index_2 i {
	font-size: 32px;
	color: #fff;
	padding-bottom: 30px;
	background: #f3b760;
	border-radius: 50px;
	padding: 20px 23px;
	margin-top: -40px;
	display: table-caption;
	transition: all ease-in-out 0.5s;
}

.fa_index_3 i {
	font-size: 32px;
	color: #fff;
	padding-bottom: 30px;
	background: #d26a5c;
	border-radius: 50px;
	padding: 20px 23px;
	margin-top: -40px;
	display: table-caption;
	transition: all ease-in-out 0.5s;
}

.fa_index_4 i {
	font-size: 32px;
	color: #fff;
	padding-bottom: 30px;
	background: linear-gradient(to right, #555299 0%, #2574ab 100%);
	border-radius: 50px;
	padding: 20px 23px;
	margin-top: -40px;
	display: table-caption;
	transition: all ease-in-out 0.5s;
}

.fa_index_1::before {
	position: absolute;
	top: -38px;
	left: 0;
	right: 0;
	content: '';
	width: 90px;
	height: 90px;
	margin: 0px auto;
	background: transparent;
	border: 2px solid #46c37b;
	border-radius: 50px;
	z-index: -1;
}

.fa_index_2::before {
	position: absolute;
	top: -38px;
	left: 0;
	right: 0;
	content: '';
	width: 90px;
	height: 90px;
	margin: 0px auto;
	background: transparent;
	border: 2px solid #f3b760;
	border-radius: 50px;
	z-index: -1;
}

.fa_index_3::before {
	position: absolute;
	top: -38px;
	left: 0;
	right: 0;
	content: '';
	width: 90px;
	height: 90px;
	margin: 0px auto;
	background: transparent;
	border: 2px solid #d26a5c;
	border-radius: 50px;
	z-index: -1;
}

.fa_index_4::before {
	position: absolute;
	top: -38px;
	left: 0;
	right: 0;
	content: '';
	width: 90px;
	height: 90px;
	margin: 0px auto;
	background: transparent;
	border: 2px solid #555299;
	border-radius: 50px;
	z-index: -1;
}

.fa_index_1:hover i,.fa_index_2:hover i,.fa_index_3:hover i,.fa_index_4:hover i
	{
	transform: rotate(-360deg);
}

.footer_part p {
	font-size: 16px;
	background: #222d32;
	padding: 15px 30px;
	color: #fff;
}
/* accountbalance */

/* Graph */
#bar-chart {
	height: 100% !important;
}

.highcharts-button {
	display: none !important;
}

.highcharts-credits {
	display: none !important;
}

.highcharts-point,.highcharts-color-0 {
	fill: #4a65a9 !important;
}
</style>
</head>
<body>


	
<!-- 
		<div id="page-content-wrapper ">
			<div class="container-fluid">
				row Part start
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
									<h3>999</h3>

									<h6>
										<a href="#"> <span class="fa fa-user"></span>Students
										</a>
									</h6>
								</div>
							</div>

							<div class="col-md-3">
								<div align="center" class="index-boxes-part linear-g fa_index_4">
									<i class="fa fa-globe"></i>
									<h3>999</h3>

									<h6>
										<a href="#"> <span class="fa fa-user-secret"></span>Teachers
										</a>
									</h6>
								</div>
							</div>
						</div>
					</div>
				</div>
				row Part end

			</div>
		</div>

		<footer>
			<div class="footer_part">
				<p>© 2018 All rights reserved.</p>
			</div>
		</footer>

 -->


	<script>
		$("#click").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>
	<script src="./js/bootstrap.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/accordion.js"></script>
	<script src="http://code.highcharts.com/highcharts.js"></script>
	<script src="http://code.highcharts.com/modules/exporting.js"></script>
	<script src="js/index-graph-1.js"></script>
</body>
</html>