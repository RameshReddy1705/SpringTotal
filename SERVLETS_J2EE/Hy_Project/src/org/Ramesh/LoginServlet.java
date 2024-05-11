package org.Ramesh;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("./Login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		long phone =Long.parseLong(req.getParameter("phone"));
		String password=req.getParameter("password");
		RequestDispatcher dispatcher=null;
		
		if(phone==9705 && password.equals("R@9705"))
		{
			dispatcher=req.getRequestDispatcher("Home.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
