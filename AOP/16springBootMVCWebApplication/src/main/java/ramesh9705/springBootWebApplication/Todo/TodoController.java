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
