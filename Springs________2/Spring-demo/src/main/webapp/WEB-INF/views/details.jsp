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
<c:if test="${u!=null}">

<h1>User Id:- ${u.getId()}</h1>
<h1>User Name:- ${u.getName()}</h1>
<h1>User Age:- ${u.getAge()}</h1>
<h1>User Phone:- ${u.getPhone()}</h1>

</c:if>
</body>
</html>