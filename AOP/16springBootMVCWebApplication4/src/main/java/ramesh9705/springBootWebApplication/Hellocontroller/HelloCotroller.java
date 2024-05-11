package ramesh9705.springBootWebApplication.Hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCotroller
{
	@RequestMapping("hello")
//	@ResponseBody
	public String hello()
	{
		return "Hello";
	}
}
