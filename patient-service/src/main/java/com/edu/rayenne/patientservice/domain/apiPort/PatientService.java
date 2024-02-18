package com.edu.rayenne.patientservice.domain.apiPort;

import com.edu.rayenne.patientservice.domain.model.PatientModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    PatientModel addPatient(PatientModel patientModel);
    List<PatientModel> getAllPatient();
    List<PatientModel> deletePatient(Long id);
    PatientModel updatePatient(Long id,PatientModel patientModel);
}
