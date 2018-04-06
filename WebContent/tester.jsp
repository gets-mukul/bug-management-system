<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link id="bs-css" href="css/bootstrap-cerulean.min.css" rel="stylesheet">

<link href="css/charisma-app.css" rel="stylesheet">
<link href='css/fullcalendar.css' rel='stylesheet'>
<link href='css/fullcalendar.print.css' rel='stylesheet' media='print'>
<link href='css/chosen.min.css' rel='stylesheet'>
<link href='css/colorbox.css' rel='stylesheet'>
<link href='css/responsive-tables.css' rel='stylesheet'>
<link href='css/bootstrap-tour.min.css' rel='stylesheet'>
<link href='css/jquery.noty.css' rel='stylesheet'>
<link href='css/noty_theme_default.css' rel='stylesheet'>
<link href='css/elfinder.min.css' rel='stylesheet'>
<link href='css/elfinder.theme.css' rel='stylesheet'>
<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
<link href='css/uploadify.css' rel='stylesheet'>
<link href='css/animate.min.css' rel='stylesheet'>

<!-- jQuery -->
<script src="jquery/jquery.min.js"></script>

<!-- The fav icon -->
<link rel="shortcut icon" href="img/favicon.ico">
<title>BMS | Dashboard</title>
</head>
<body>


	<!-- topbar starts -->
	<div class="navbar navbar-default" role="navigation">

		<div class="navbar-inner">

			<a class="navbar-brand" href="index.html"> </a>

			<!-- user dropdown starts -->
			<div class="btn-group pull-right">
				<button class="btn btn-default">
					<form>
						<a href="index.jsp"> <i class="glyphicon glyphicon-user"></i><span>
								Logout</span>
					</form>
				</button>

			</div>


			<ul class="collapse navbar-collapse nav navbar-nav top-menu">

				<li>
					<form>
						<input placeholder="Search"
							class="search-query form-control col-md-10" name="query"
							type="text">
					</form>
				</li>
			</ul>

		</div>
	</div>
	<!-- topbar ends -->
	<div class="ch-container">
		<div class="row">
			<div id="content" class="col-lg-12 col-sm-12">
				<!-- content starts -->
				<div>
					<ul class="breadcrumb">
						<li><a href="#">Home</a></li>
						<li><a href="#">Dashboard</a></li>
					</ul>
				</div>

				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header" style="height: 41px;"
								data-original-title="">
								
									<div class="col-sm-6"><h2>BUG REPORT</h2></div>
									<div class="col-sm-6"><button class="btn btn-primary btn-sm pull-right">Add Bug</button></div>
								
							</div>
							<div class="box-content">
								<table
									class="table table-striped table-bordered bootstrap-datatable datatable responsive">
									<thead>
										<tr>
											<th>Id</th>
											<th>Bug</th>
											<th>Defect Severity</th>
											<th>Defect Status</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>David R</td>
											<td class="center">2012/01/01</td>
											<td class="center">Member</td>
											<td class="center"><span
												class="label-success label label-default">Active</span></td>
											<td class="center"><a class="btn btn-success" href="#">
													<i class="glyphicon glyphicon-zoom-in icon-white"></i> View
											</a>
												<button class="btn btn-info edit-user">
													<i class="glyphicon glyphicon-edit icon-white"></i> Edit
												</button></td>
										</tr>

									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->

				<!--/row-->
				<!-- content ends -->
			</div>
			<!--/#content.col-md-0-->
		</div>
		<!--/fluid-row-->

		<!-- Ad, you can remove it -->

		<!-- Ad ends -->

		<hr>

		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">

			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>Settings</h3>
					</div>
					<div class="modal-body">
						<p>Here settings can be configured...</p>
					</div>
					<div class="modal-footer">
						<a href="#" class="btn btn-default" data-dismiss="modal">Close</a>
						<a href="#" class="btn btn-primary" data-dismiss="modal">Save
							changes</a>
					</div>
				</div>
			</div>
		</div>

		<footer class="row">
		<p class="col-md-9 col-sm-9 col-xs-12 copyright">
			&copy; <a href="http://usman.it" target="_blank">Muhammad Usman</a>
			2012 - 2015
		</p>

		<p class="col-md-3 col-sm-3 col-xs-12 powered-by">
			Powered by: <a href="http://usman.it/free-responsive-admin-template">Charisma</a>
		</p>
		</footer>

	</div>
	<!--/.fluid-container-->

	<!-- external javascript -->

	<script src="js/bootstrap.min.js"></script>

	<!-- library for cookie management -->
	<script src="js/jquery.cookie.js"></script>
	<!-- calender plugin -->
	<script src='../js/moment.min.js'></script>
	<script src='../js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='js/jquery.dataTables.min.js'></script>

	<!-- select or dropdown enhancer -->
	<script src="js/chosen.jquery.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="js/jquery.colorbox-min.js"></script>
	<!-- notification plugin -->
	<script src="js/jquery.noty.js"></script>
	<!-- library for making tables responsive -->
	<script src="js/responsive-tables.js"></script>
	<!-- tour plugin -->
	<script src="js/bootstrap-tour.min.js"></script>
	<!-- star rating plugin -->
	<script src="js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="js/charisma.js"></script>

	<script>
$( ".edit-user" ).click(function() {
    
    var tds = $(this).closest('tr').children('td');
    //alert(tds[0].innerHTML) 
    var name = tds[0].innerHTML;
    var email = tds[1].innerHTML; 
    var password = tds[2].innerHTML; 
    
    $('#edit_name').val(name);
    $('#edit_email').val(email);
    $('#edit_password').val(password);
    
    current_edit_row_details.name = name;
    current_edit_row_details.email = email;
    current_edit_row_details.password = password;
    current_edit_row_details.current_row = $(this).closest('tr'); 
     
    edit_dialogs.dialog( "open" );
    //console.log(tds); 
 });     
</script>

</body>
</html>