 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
    
   
   
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body
{
background-color: silver-aqua;
}
#form
{
 
  margin: auto;
  display: block;
  text-align: center;

}
#button
{
 margin-top: 200px;
 margin-bottom: 50px;
 padding: 15px 15px 15px 15px;
 font-size: medium;
 font-weight: bold;
}
#report
{
 padding: 15px 15px 15px 15px;
 font-size: medium;
 font-weight: bold;

}


</style>

 </head>
<body>
<h1>LOGIN SUCCESSFUL!!</h1>
<form id="form" name="f1"  action="Attendance.html" onsubmit="validations()">
<input  id="button" type="submit" name="submit" value="Enter attendance">

</form>

<form action="report.jsp" id="form">
<% 
String userid = session.getAttribute("user").toString();
session.setAttribute("userId", userid);
%> 
<input  id="report" type="submit" name="submit" value="View report">


</form>


</body>
</html>