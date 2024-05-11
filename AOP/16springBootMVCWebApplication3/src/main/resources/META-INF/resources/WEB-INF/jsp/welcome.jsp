<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
		<div class="container">
			<h1>Welcome ${name}</h1>
			<a href="list-todos">Manage</a> your todos
		</div>
	
</body>
</html>