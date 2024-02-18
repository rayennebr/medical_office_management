package com.edu.rayenne.patientservice.adapters.apiAdapter;

import com.edu.rayenne.patientservice.domain.apiPort.PatientService;
import com.edu.rayenne.patientservice.domain.model.PatientModel;
import com.edu.rayenne.patientservice.domain.persistantPort.PatientPersistent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PatientApiService implements PatientService {

    private final PatientPersistent patientPersistent;

    @Override
    public PatientModel addPatient(PatientModel patientModel) {
        return patientPersistent.addPatient(patientModel);
    }

    @Override
    public List<PatientModel> getAllPatient() {
        return patientPersistent.getAllPatient();
    }

    @Override
    public List<PatientModel> deletePatient(Long id) {
        return patientPersistent.deletePatient(id);
    }

    @Override
    public PatientModel updatePatient(Long id, PatientModel patientModel) {
        return patientPersistent.updatePatient(id,patientModel);
    }
}
