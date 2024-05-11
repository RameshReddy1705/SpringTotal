<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String n= request.getParameter("txtName");
String p= request.getParameter("txtPwd");
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registration","root","Siva@149");
	PreparedStatement ps=con.prepareStatement("select* from user where name=? and password=?");
	 ps.setString(1, n);
	
	 ps.setString(2, p);
	ResultSet rs= ps.executeQuery();
	if(rs.next()) {
		session.setAttribute("user",n);
		
	   response.sendRedirect("afterlogin.jsp");
	}
	else
	{
	   
		out.println("<font color=red size =18>login failed<br>");
		out.println("<a href=loginpage1.jsp>Try Again!!</a>");
		
	}
	
}

catch(Exception e)
{
	System.out.println(" occured error");
}
%>

</body>
</html>