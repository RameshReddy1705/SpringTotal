<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = request.getParameter("name");
String empId= request.getParameter("id");
String password = request.getParameter("password");
String reportingManager = request.getParameter("manager");

try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection
			("jdbc:mysql://127.0.0.1:3306/registration","root","Siva@149");
	
	Statement st = con.createStatement();
	st.executeUpdate("insert into user (name,employee_id,password,reporting_manager) values('"+name+"','"+empId+"','"+password+"','"+reportingManager+"')");
	//response.sendRedirect("save.html");
	out.println("SUCCESSFULLY UPLOADED");
	
	
	
} catch (Exception e) {
	//response.sendRedirect("error.html");
	out.println("ERROR OCCURED");
}
%>