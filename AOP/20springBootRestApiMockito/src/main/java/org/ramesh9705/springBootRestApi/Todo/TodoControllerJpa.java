package org.ramesh9705.springBootRestApi.Todo;

import java.util.List;
import java.util.Optional;

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
public class TodoControllerJpa
{
	@Autowired
	private TodoService1 todoService1;
	@GetMapping("/basicauth")
	public String basicAuth()
	{
		return "success";
	}
	
	@GetMapping(path = "/users/{username}/todos")
	public List<Todo> retriveAllTodos(@PathVariable String username)
	{
		return todoService1.findByUsername(username); 
	}
	@GetMapping("/users/{username}/todos/{id}")
	public Optional<Todo> retriveTodo(@PathVariable String username, @PathVariable int id)
	{
		return todoService1.findById(id);
	}
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username,
			@PathVariable int id) {
		todoService1.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	@PostMapping("/users/{username}/todos")
	public Todo saveTodo(@PathVariable String username, @RequestBody Todo todo)
	{
		todo.setUsername(username);
		todo.setId(null);
		return todoService1.save(todo);
	}
	@PutMapping("/users/{username}/todos/{id}")
	public Todo updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody Todo todo)
	{
		
		return todoService1.save(todo);
	}
	
}


