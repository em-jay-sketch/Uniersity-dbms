package com.projects.emmanuelAdama.springProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    Long id;

    String name;

    @OneToMany(mappedBy = "departmentName")
    List<Student> studentInDepartment;

    @OneToMany(mappedBy = "department")
    List<Degree> degreeList;

    @OneToMany(mappedBy = "department")
    List<Course> courseList;

}
