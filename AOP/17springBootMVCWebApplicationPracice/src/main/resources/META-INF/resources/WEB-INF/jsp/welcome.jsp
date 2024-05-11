<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Welcome Page</title>
</head>
<body>
	<%@ include file="common/navigation.jspf"  %>
	<div class="container">
		<h1>Welcome ${name }</h1>
		<h3><a href="add-employee" class="btn btn-success">Add Employee</a>
		<a href="list-employee" class="btn btn-warning">Click Here To View Employee Details</a>
		</h3>
	</div>
	
	
	<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>