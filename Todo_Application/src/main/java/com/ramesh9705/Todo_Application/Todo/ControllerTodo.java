package com.ramesh9705.Todo_Application.Todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class ControllerTodo
{
	@Autowired
	private TodoJpaRepository jpaRepository;
	
	@PostMapping("/todos")
	public Todo createTodo(@RequestBody Todo todo)
	{
		return jpaRepository.save(todo);
	}
	@PutMapping("/todos/{id}")
	public void updateTodo(@RequestBody Todo todo, @PathVariable int id)
	{
//		Optional<Todo> todoupdate=jpaRepository.findById(id);
//		todoupdate.setUserName(todo.getUserName());
//		todoupdate.setDescription(todo.getDescription());
//		todoupdate.setTargetDate(todo.getTargetDate());
//		todoupdate.setDone(todo.isDone());
		jpaRepository.save(todo);
	}
	@GetMapping("/todos")
	public List<Todo> retriveAllTodos()
	{
		return jpaRepository.findAll();
		
	}
	@GetMapping("/todos/{id}")
	public Optional<Todo> retriveTodo(@PathVariable int id)
	{
		return jpaRepository.findById(id);
	}
	@DeleteMapping("/todos/{id}")
	public void Tododelete(@PathVariable int id)
	{
		jpaRepository.deleteById(id);
	}

}
