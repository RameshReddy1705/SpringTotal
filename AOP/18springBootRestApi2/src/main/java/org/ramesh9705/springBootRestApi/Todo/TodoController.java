package org.ramesh9705.springBootRestApi.Todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
public class TodoController
{
	@Autowired
	private TodoService todoService;
	
	@GetMapping(path = "/users/{username}/todos")
	public List<Todo> retriveAllTodos(@PathVariable String username)
	{
		return todoService.findByUsername(username); 
	}
	@GetMapping("/users/{username}/todos/{id}")
	public Todo retriveTodo(@PathVariable String username, @PathVariable int id)
	{
		return todoService.findById(id);
	}
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username,
			@PathVariable int id) {
		todoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	@PostMapping("/users/{username}/todos")
	public Todo saveTodo(@PathVariable String username, @RequestBody Todo todo)
	{
		Todo createTodo = todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), todo.isDone());
		return createTodo;
	}
	@PutMapping("/users/{username}/todos/{id}")
	public Todo updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody Todo todo)
	{
		todoService.updateTodo(todo);
		return todo;
	}
	
}
