package com.edu.rayenne.patientservice.adapters.persistentAdapters.repository;

import com.edu.rayenne.patientservice.adapters.persistentAdapters.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
}
