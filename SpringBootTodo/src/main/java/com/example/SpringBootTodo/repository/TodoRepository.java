package com.example.SpringBootTodo.repository;

import org.springframework.stereotype.Repository;
import com.example.SpringBootTodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository // Repositoryクラスであることを示す
public interface TodoRepository extends JpaRepository<Todo, Long> {

}