package com.projects.emmanuelAdama.springProject.service;

import com.projects.emmanuelAdama.springProject.dto.StudentDTO;
import com.projects.emmanuelAdama.springProject.model.Student;
import com.projects.emmanuelAdama.springProject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.lang.*;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public ResponseEntity<?> createStudent(StudentDTO studentDTO) {
        boolean exists = studentRepository.existsByEmail(studentDTO.getEmail());
        if (exists) {
            return new ResponseEntity<>(HttpStatus.IM_USED);
        }
        Student student = new Student();

        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setDegree(studentDTO.getDegree());
        student.setStudentId(studentDTO.getStudentId());
        student.setDoB(studentDTO.getDoB());
        student.setEmail(studentDTO.getEmail());
        student.setNationality(studentDTO.getNationality());
        student.setStateOfOrigin(studentDTO.getStateOfOrigin());

        studentRepository.save(student);

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    public ResponseEntity<?> findUsingEmail(String studentEmail) {
        Optional<Student> student = studentRepository.findByEmail(studentEmail);
        if (student.isPresent()) {
            return new ResponseEntity<>(student, HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<?> findAllStudent(){
        List<Student> students = studentRepository.findAll();
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(students, HttpStatus.FOUND);
    }

//    public ResponseEntity<?> updateStudent(String email, StudentDTO studentDTO){
//
//    }
//
//    public ResponseEntity<?> deleteStudent(String email) {
//
//    }

}
