package org.ramesh9705.springBootRestApi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.ramesh9705.springBootRestApi.Todo.Todo;
import org.ramesh9705.springBootRestApi.Todo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests
{
	@Autowired
	TodoRepository todoRepository;
	
	@Test
	public void testCreate()
	{
		Todo t = new Todo();
		t.setId(20);
		t.setDescription("Test");
		t.setTargetDate(LocalDate.now());
		t.setDone(false);
		
		todoRepository.save(t);
		
		assertNotNull(todoRepository.findById(20).get());
	}

}
