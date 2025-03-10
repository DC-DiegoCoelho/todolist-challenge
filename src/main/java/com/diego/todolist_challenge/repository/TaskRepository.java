package com.diego.todolist_challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.todolist_challenge.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
