package com.projects.emmanuelAdama.springProject.service;

import com.projects.emmanuelAdama.springProject.model.Department;
import com.projects.emmanuelAdama.springProject.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public void createDepartment(Department department){

    }
}
