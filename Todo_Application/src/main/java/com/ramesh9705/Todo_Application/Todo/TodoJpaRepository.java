package com.ramesh9705.Todo_Application.Todo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoJpaRepository extends JpaRepository<Todo, Integer>
{

//	Todo retriveTodo(int id);

}
