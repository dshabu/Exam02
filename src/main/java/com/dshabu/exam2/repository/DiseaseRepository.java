package com.dshabu.exam2.repository;

import com.dshabu.exam2.model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiseaseRepository extends JpaRepository<Disease, Integer> {
    @Override
    List<Disease> findAll();
}
