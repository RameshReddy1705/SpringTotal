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
<c:if test="${u!=null}">
<form:form  modelAttribute="user" action="editt">
<form:label path="id">ID</form:label>
<form:input path="id"  value="${u.getId()}" readonly="true"/>
<br>
<form:label path="name">Name</form:label>
<form:input path="name"  value="${u.getName()}"/>
<br>
<form:label path="age">age</form:label>
<form:input path="age"  value="${u.getAge()}"/>
<br>
<form:label path="phone">phone</form:label>
<form:input path="phone"  value="${u.getPhone()}"/>
<br>
<form:label path="Password">Password</form:label>
<form:input path="Password"  value="${u.getPassword()}"/>
<br>
<form:button>Update</form:button>
</form:form>
</c:if>
</body>
</html>