<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Employee List</title>
</head>
<body>
	<%@ include file="common/navigation.jspf"  %>
	<h1>Employee List</h1>
	<h3><a href="add-employee" class="btn btn-success">Add Employee</a></h3>
	<table class="table">
		<thead>
			<tr>
				<td>Id</td>
				<td>UserName</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Location</td>
				<td>AdminReference</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.id }</td>
					<td>${employee.username }</td>
					<td>${employee.firstname }</td>
					<td>${employee.lastname }</td>
					<td>${employee.location }</td>
					<td>${employee.adminref }</td>
					<td><a href="update-employee?id=${employee.id }" class="btn btn-success">Update</a></td>
					<td><a href="delete-employee?id=${employee.id }" class="btn btn-warning">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>