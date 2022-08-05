package com.projects.emmanuelAdama.springProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "studentId")
    private String studentId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "department_Students")
    private Department departmentName;

    @Column(name = "student_firstname")
    private String firstName;

    @Column(name = "student_lastname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "student_DoB")
    private String DoB;

    @Column(name = "student_nationality")
    private String nationality;

    @Column(name = "student_stateOfOrigin")
    private String stateOfOrigin;

    @Column(name = "student_degree")
    private String degree;

    public Student(String firstName, String studentId, String lastName, String email, String doB, String nationality, String stateOfOrigin, String degree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.DoB = doB;
        this.nationality = nationality;
        this.stateOfOrigin = stateOfOrigin;
        this.degree = degree;
    }

}
