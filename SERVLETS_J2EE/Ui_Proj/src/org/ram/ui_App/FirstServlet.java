package org.ram.ui_App;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fs")
public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		String Name=req.getParameter("nm");
		String Place=req.getParameter("pl");
		
		
		//DISPLAY RESPONSE ON NEW HTML FILE
		
		PrintWriter pr=resp.getWriter();
		pr.println("<html><body bgcolor='yellow'>"
				+ "<h1>"+ "welcome"+Name+"from "+Place+"<h1>"+"</body>"+"</html>");
		pr.close();
	}
	
}
