package org.ramesh9705.springBootRestApi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.ramesh9705.springBootRestApi.Todo.Todo;
import org.ramesh9705.springBootRestApi.Todo.TodoRepository;
import org.ramesh9705.springBootRestApi.Todo.TodoService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ApplicationTestsMockito
{
//	@Autowired
	@InjectMocks
	private TodoService1 todoService1;
	
//	@MockBean
	@Mock
	private TodoRepository todoRepository;
	@Test
	public void getTodoTest()
	{
		when(todoRepository.findByUsername("Ramesh")).thenReturn(Stream.of(new Todo(1, "Ramesh", "Java", LocalDate.now(), false)).collect(Collectors.toList()));
		
		assertEquals(1, todoService1.findByUsername("Ramesh").size());
	}
	
	@Test
	public void saveTodo()
	{
		Todo todo = new Todo(3, "Ramesh", "Java", LocalDate.now(), false);
		when(todoRepository.save(todo )).thenReturn(todo);
		
		assertEquals(todo, todoService1.save(todo));
	}
	
	@Test
	public void deleteTodo()
	{
		Todo todo = new Todo(3, "Ramesh", "Java", LocalDate.now(), false);
		todoService1.deleteById(3);
		
		verify(todoRepository, times(3)).delete(todo);
		
	}
	
//	@Test
//	public void getTodoId()
//	{
//		Todo todo = new Todo(4, "Ramesh", "Java", LocalDate.now(), false);
//		when(todoRepository.findById(4).get()).thenReturn(todo);
//		
//		assertEquals(todo, todo.getId());
//	}

}
