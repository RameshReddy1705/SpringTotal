package org.ramesh9705.springBootRestApi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.ramesh9705.springBootRestApi.Todo.Todo;
import org.ramesh9705.springBootRestApi.Todo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ApplicationTests {


	@Autowired
	TodoRepository todoRepository;
	
	@Test
	@Order(1)
	public void testCreate()
	{
		Todo t = new Todo();
//		t.setId(5);
		t.setDescription("Test");
		t.setTargetDate(LocalDate.now());
		t.setDone(false);
		
		todoRepository.save(t);
		
		assertNotNull(todoRepository.findById(1).get());
	}
	@Test
	@Order(2)
	public void testAll()
	{		
		List<Todo> list = todoRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testSingleTodo()
	{		
		Todo todo = todoRepository.findById(1).get();
		assertEquals("Test", todo.getDescription());
	}
	
	@Test
	@Order(4)
	public void testUpdateTodo()
	{		
		Todo todo = todoRepository.findById(1).get();
		todo.setDescription("Ramesh");
		todoRepository.save(todo);
		assertNotEquals("Test", todoRepository.findById(1).get().getDescription());
	}
	
	@Test
	@Order(6)
	public void testDeleteTodo()
	{		

		todoRepository.deleteById(1);
		assertThat(todoRepository.existsById(1)).isFalse();
	}

}
