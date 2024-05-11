<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<%@ include file="common/navigation.jspf" %>
		<h1>Welcome ${name}</h1>
		<div>
			<h1>Your Todos</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th>Delete</th>
						<th>Update</th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td><a href="delete-todo?id=${todo.id}">Delete-${todo.id}</a></td>
							<td><a href="update-todo?id=${todo.id}">Update-${todo.id}</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<a href="create-todo" class="btn btn-success">Add Todo</a>
</body>
</html>
