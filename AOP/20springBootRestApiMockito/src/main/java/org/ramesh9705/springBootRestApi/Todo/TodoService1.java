package org.ramesh9705.springBootRestApi.Todo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
public class TodoService1
{
	TodoRepository todoRepository;

	public List<Todo> findByUsername(String username)
	{
		return todoRepository.findByUsername(username);
	}

	public Optional<Todo> findById(int id)
	{
		return todoRepository.findById(id);
	}

	public void deleteById(int id)
	{
		todoRepository.deleteById(id);
	}

	public Todo save(Todo todo)
	{
		return todoRepository.save(todo);
	}
	
}
