<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

<title>Employee Details</title>
</head>
<body>
	<%@ include file="common/navigation.jspf"  %>
	<div class="container">
	<h1>Employee Details</h1>
	<form class="form-inline" method="post" modelAttribute="employee">
		<div  class="mb-3">
			<label class="form-label">First Name :</label>
			<input type="text" class="form-control" name="firstname"/>
		</div>
		
		<div class="mb-3">
			<label>Last Name :</label>
			<input class="form-control" type="text" name="lastname"/>
		</div>
		<div class="mb-3">
			<label>Location :</label>
			<input class="form-control" type="text" name="location"/>
		</div>
		
		
		<div class="mb-3">
			<label>Adminref :</label>
			<input class="form-control" type="text" name="adminref"/>
		</div>
		
		<input type="submit" class="btn btn-success"/>
	</form>
	</div>
	
	
	<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>