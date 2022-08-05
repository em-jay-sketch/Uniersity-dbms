package com.projects.emmanuelAdama.springProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private Long id;

    private String name;

    private String abbreviation;

    @ManyToMany()
    @JoinColumn(name = "department_present")
    private List<Department> department;

    @ManyToMany(mappedBy = "courseList")
    private List<Degree> degreeList;
}
