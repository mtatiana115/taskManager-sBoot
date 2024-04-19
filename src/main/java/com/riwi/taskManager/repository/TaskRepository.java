package com.riwi.taskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.taskManager.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
