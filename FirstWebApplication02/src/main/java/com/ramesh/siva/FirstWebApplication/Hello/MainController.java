package com.ramesh.siva.FirstWebApplication.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController
{
	@RequestMapping("Ramesh")
	@ResponseBody
	public String Ramesh()
	{
		return "Ramesh Reddy";
	}
	
	
	@RequestMapping("Siva")
	@ResponseBody
	public String Siva()
	{
		StringBuffer s=new StringBuffer();
		s.append("<html>");
		s.append("<head>");
		s.append("<title>Siva Reddy</title>");
		s.append("</head>");
		s.append("<body>");
		s.append("Siva Reddy");
		s.append("</body>");
		s.append("</html>");
		return s.toString();
	}
	
	@RequestMapping("family")
	public String Savithri()
	{
		return "family";
	}
}
