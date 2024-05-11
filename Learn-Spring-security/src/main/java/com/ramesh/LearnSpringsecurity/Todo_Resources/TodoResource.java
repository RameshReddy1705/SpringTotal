package com.ramesh.LearnSpringsecurity.Todo_Resources;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TodoResource
{
	private org.slf4j.Logger logger= LoggerFactory.getLogger(getClass());
	private static final List<Todo> TODOS_LIST=
			List.of(new Todo("Ramesh", "Spring Boot"),
					new Todo("Ramesh", "Spring")
					);
	@GetMapping("/todos")
	public List<Todo> listAllTodos()
	{
		return TODOS_LIST;
		
	}
	
	@GetMapping("/users/{username}/todos")
	public Todo retriveTodo(@PathVariable("username") String username)
	{
		return TODOS_LIST.get(1);
	}
	@PostMapping("/users/{username}/todos")
	public void createTodo(@PathVariable("username") String username, @RequestBody Todo todo)
	{
		logger.info("create {} for {} ", todo, username);
	}

}
record Todo(String username, String description) {}
