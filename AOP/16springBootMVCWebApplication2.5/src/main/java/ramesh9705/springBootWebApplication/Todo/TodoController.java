package ramesh9705.springBootWebApplication.Todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController
{
	@Autowired
	private TodoService todoService;
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model)
	{
		List<Todo> todos=todoService.findByUsername("Ramesh");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
}


//<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
//<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
//<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

//<dependency>
//<groupId>org.webjars</groupId>
//<artifactId>bootstrap</artifactId>
//<version>5.1.3</version>
//</dependency>
//
//<dependency>
//<groupId>org.webjars</groupId>
//<artifactId>jquery</artifactId>
//<version>3.6.0</version>
//</dependency>


