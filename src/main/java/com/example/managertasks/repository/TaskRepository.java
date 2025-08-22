package com.example.managertasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.managertasks.model.Task;

@Repository
public interface TaskRepository extends JpaRepository <Task, Long>{

}
