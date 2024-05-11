package org.jsp.RameshApp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Lovely_weds_ramesh extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException
	{
		String name=arg0.getParameter("n");
		String phonenum=arg0.getParameter("p");
		PrintWriter pw=arg1.getWriter();
		pw.println("<html><body bg color='yellow'>"
				+ "<h1>welcome"+"  "+name+"  from"+"  "+phonenum+"  </h1>"+"</body> </html>");
		pw.close();
	}
	
}
