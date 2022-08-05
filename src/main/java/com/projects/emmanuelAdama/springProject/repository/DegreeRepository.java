package com.projects.emmanuelAdama.springProject.repository;

import com.projects.emmanuelAdama.springProject.model.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeRepository extends JpaRepository<Degree, Long> {
    boolean existsByName(String name);
}
