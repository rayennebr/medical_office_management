package com.edu.rayenne.patientservice.domain.persistantPort;

import com.edu.rayenne.patientservice.domain.model.PatientModel;

import java.util.List;


public interface PatientPersistent {

    PatientModel addPatient(PatientModel patientModel);
    List<PatientModel> getAllPatient();
    List<PatientModel> deletePatient(Long id);
    PatientModel updatePatient(Long id,PatientModel patientModel);

}
