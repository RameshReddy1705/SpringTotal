<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="common/navigation.jspf" %>
	<h1>Create Todo ${name }</h1>
	<div class="container">
		<h1>Enter Todo Details</h1>
		<form:form method="post" modelAttribute="todo">
				<fieldset class="mb-3">				
					<form:label path="description">Description</form:label>
					<form:input type="text" path="description" required="required"/>
					<form:errors path="description" cssClass="text-warning"/>
				</fieldset>
				<fieldset class="mb-3">				
					<form:label path="targetDate">Target Date</form:label>
					<form:input type="text" path="targetDate" required="required"/>
					<form:errors path="targetDate" cssClass="text-warning"/>
				</fieldset>
			<form:errors path="description" cssClass="text-warning"/>
			<form:input type="hidden" path="id"/>
			<form:input type="hidden" path="done"/>
			<input type="submit" class="btn btn-success"/>
		</form:form>
	</div>
	
</body>
</html>