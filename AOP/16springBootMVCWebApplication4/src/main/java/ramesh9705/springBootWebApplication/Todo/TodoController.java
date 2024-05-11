package ramesh9705.springBootWebApplication.Todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController
{
	@Autowired
	private TodoService todoService;
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model)
	{
//		String username = (String) model.get("name");
		String username = getLoggedInUsername(model);
		List<Todo> todos=todoService.findByUsername(username);
		model.addAttribute("todos", todos);
		return "listTodos";
	}

	private String getLoggedInUsername(ModelMap model)
	{
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
//		return (String) model.get("name");
	}
	
//	private String getLoggedInUsername()
//	{
//		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
//		return authentication.getName();
//	}
//	@RequestMapping(value = "create-todo", method = RequestMethod.GET)
//	public String showTodo()
//	{
//		return "createtodo";
//	}
//	@RequestMapping(value = "create-todo", method = RequestMethod.POST)
//	public String addTodo(@RequestParam String description, ModelMap modelMap)
//	{
//		String username = (String) modelMap.get("name");
//		todoService.addTodo(username ,description,LocalDate.now().plusYears(2),false);
//		return "redirect:list-todos";
//	}
	@RequestMapping(value = "create-todo", method = RequestMethod.GET)
	public String showTodo(ModelMap modelMap)
	{
		String username = getLoggedInUsername(modelMap);
		Todo todo= new Todo(0, username, "", LocalDate.now(), false);
		modelMap.put("todo", todo);
		return "createtodo";
	}
	@RequestMapping(value = "create-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap modelMap, @Valid Todo todo, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "createtodo";
		}
		String username = getLoggedInUsername(modelMap);
		todoService.addTodo(username ,todo.getDescription(),todo.getTargetDate(),false);
		return "redirect:list-todos";
	}
	@RequestMapping("delete-todo")
	public String deleteById(@RequestParam int id)
	{
		todoService.DeleteById(id);
		return "redirect:list-todos";
		
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String ShowUpdate(@RequestParam int id, ModelMap modelMap)
	{
		Todo todo = todoService.findById(id);
		modelMap.addAttribute("todo", todo);
		return "createtodo";
	}
	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String UpdateTodo(@Valid Todo todo,BindingResult result, ModelMap modelMap)
	{
		if(result.hasErrors())
		{
			return "createtodo";
		}
		String username = getLoggedInUsername(modelMap);
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:list-todos";
	}
	
}


