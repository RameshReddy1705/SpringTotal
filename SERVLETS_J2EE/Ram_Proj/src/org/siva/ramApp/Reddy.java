package org.siva.ramApp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/NTR")

public class Reddy extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		String FirstName=req.getParameter("f");
		String LastName=req.getParameter("l");
		String FatherName=req.getParameter("n");
		String PhoneNo=req.getParameter("p");
		
		
		PrintWriter ott=resp.getWriter();
		ott.println("<html><body bgcolor='yellow'>"
				+ "<h1>"+"Welcome"+FirstName+LastName+"<br><br>"+"PhoneNo: "+PhoneNo+"<br><br>"+FatherName+"</body></html>");
		ott.close();
	}
	
}
