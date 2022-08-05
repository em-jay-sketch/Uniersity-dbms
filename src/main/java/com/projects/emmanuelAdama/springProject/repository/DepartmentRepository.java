package com.projects.emmanuelAdama.springProject.repository;

import com.projects.emmanuelAdama.springProject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    boolean existsByName(String name);
}
