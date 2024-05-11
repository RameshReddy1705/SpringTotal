package org.jspiders.getApp;
import java.io.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException
 {
	String sid=req.getParameter("i");
	int id=Integer.parseInt(sid);
	
	
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String qry="select*from btm.student where id=?";//DQL
	try {
		PrintWriter out=resp.getWriter();
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		pstmt=con.prepareStatement(qry);
		//set the data for Place Holder
		pstmt.setInt(1,id);
		rs=pstmt.executeQuery();
		if(rs.next())
		{
			String name=rs.getString(2);
			String dept=rs.getString(3);
			out.println("<html><body bgcolor='yelow'>"
					+ "<h1>Student name is "+name+"from"+dept+"</h1>"
							+ "</body></html>");
			out.close();
		}
		else {
			out.println("<html><body bgcolor='pink'>"
					+ "<h1>No data found for id"+id+"</h1>"
							+ "</body></html");
			out.close();
		}
		
		
		
		
		
	} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
	}
	finally
	{
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}
	}
	
 }
}
