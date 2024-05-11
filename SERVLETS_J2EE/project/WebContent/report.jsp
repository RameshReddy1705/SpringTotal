<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*"%>
     
 
 <%
	
	try
	{
	    String userid = session.getAttribute("userId").toString();
	    out.println(userid);
	
		//String name="Rahul";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registration","root","Siva@149");
		PreparedStatement ps=con.prepareStatement("select* from user where reporting_manager=?");
	     ps.setString(1,userid);
		ResultSet rs= ps.executeQuery();
		if(rs.next()) {
			 //a =true;
			
			session.setAttribute("name",userid);
			
		   response.sendRedirect("report2.jsp");
		}
		else
		{
		   
		
			out.println("<a href=loginpage1.jsp>Sorry!!no access</a>");
			
		}
		
	}

	catch(Exception e)
	{
		response.sendRedirect("error.html");
	}
	
	
%>