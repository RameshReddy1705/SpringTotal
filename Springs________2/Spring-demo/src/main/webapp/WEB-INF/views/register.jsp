<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter a user Details</h1>
<hr>
<form:form  modelAttribute="user" action="reg" method="post">

<form:label path="name">Name</form:label>
<form:input path="name"  name="name"/>

<br>
<form:label path="age">age</form:label>
<form:input path="age"  name="age"/>
<br>

<form:label path="phone">phone</form:label>
<form:input path="phone"  name="phone"/>
<br>
<form:label path="Password">Password</form:label>
<form:input path="Password"  name="Password"/>
<br>

<form:button>Register</form:button>

</form:form>

</body>
</html>