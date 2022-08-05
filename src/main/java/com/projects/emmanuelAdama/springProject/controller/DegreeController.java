package com.projects.emmanuelAdama.springProject.controller;

import com.projects.emmanuelAdama.springProject.model.Degree;
import com.projects.emmanuelAdama.springProject.service.DegreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/v1/college")
public class DegreeController {
    private final DegreeService degreeService;

    @PostMapping("/add_department")
    public ResponseEntity<?> addDegree(Degree degree){
        return degreeService.createDegree(degree);
    }

}
