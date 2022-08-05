package com.projects.emmanuelAdama.springProject.controller;

import com.projects.emmanuelAdama.springProject.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
}
