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
public class Degree {
    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "Department")
    private Department department;

    @ManyToMany
    @JoinColumn(name = "Courses_provided")
    private List<Course> courseList;

    private int capacity;

    public Degree(String name, Department department, int capacity) {
        this.name = name;
        this.department = department;
        this.capacity = capacity;
    }
}
