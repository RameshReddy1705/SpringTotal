<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
		<h1>Welcome ${name}</h1>
		<h1>Your Todos ${todos}</h1>
		<div>
			<h1>Your Todos</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		
</body>
</html>
S