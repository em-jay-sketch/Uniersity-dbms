package com.projects.emmanuelAdama.springProject.service;

import com.projects.emmanuelAdama.springProject.model.Degree;
import com.projects.emmanuelAdama.springProject.repository.DegreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DegreeService {
    private final DegreeRepository degreeRepository;

    public ResponseEntity<?> createDegree(Degree degree) {
        boolean exists = degreeRepository.existsByName(degree.getName());
        if (exists) {
            return new ResponseEntity<>(HttpStatus.IM_USED);
        }

        Degree newDegree = new Degree();
        newDegree.setName(degree.getName());
        newDegree.setDepartment(degree.getDepartment());
        newDegree.setCapacity(degree.getCapacity());

        degreeRepository.save(newDegree);

        return new ResponseEntity<>(degree, HttpStatus.CREATED);
    }

}
