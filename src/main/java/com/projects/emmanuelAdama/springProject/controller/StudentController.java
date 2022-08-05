package com.projects.emmanuelAdama.springProject.controller;

import com.projects.emmanuelAdama.springProject.dto.StudentDTO;
import com.projects.emmanuelAdama.springProject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/university")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<?> createStudent(StudentDTO studentDTO) {
       return studentService.createStudent(studentDTO);
    }

    @GetMapping("/student")
    public ResponseEntity<?> getStudent(String email) {
        return studentService.findUsingEmail(email);
    }

    @GetMapping("/allStudent")
    public ResponseEntity<?> getAllStudents(){
        return studentService.findAllStudent();
    }

//    @PatchMapping
//    public ResponseEntity<?> updateStudent(String email, StudentDTO studentDTO) {
//        return studentService.updateStudent(email,studentDTO);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<?> deleteStudent(String email){
//        return studentService.deleteStudent(email);
//    }
}
