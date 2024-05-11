<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> this is home page</h1>
<c:if test="${u!=null}">

<h1><a href="load?choice=2">edit</a></h1>
<h1><a href="profile">profile</a></h1>
<h1><a href="delete?id=${u.getId()}">Delete</a></h1>
<h1><a href="Logout">Logout</a></h1>


</c:if>
</body>
</html>