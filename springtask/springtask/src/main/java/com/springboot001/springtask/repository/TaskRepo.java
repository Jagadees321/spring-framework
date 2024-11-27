package com.springboot001.springtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot001.springtask.entity.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
