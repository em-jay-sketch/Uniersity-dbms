package com.projects.emmanuelAdama.springProject.dto;

import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class StudentDTO {

    private String firstName;
    private String lastName;
    private String studentId;
    @Email
    private String email;
    private String DoB;
    private String nationality;
    private String stateOfOrigin;
    private String degree;
}
