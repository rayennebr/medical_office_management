package com.edu.rayenne.patientservice.adapters.persistentAdapters.repository.dao;

import com.edu.rayenne.patientservice.adapters.mapper.PatientMapper;
import com.edu.rayenne.patientservice.adapters.persistentAdapters.entity.PatientEntity;
import com.edu.rayenne.patientservice.adapters.persistentAdapters.repository.PatientRepository;
import com.edu.rayenne.patientservice.domain.model.PatientModel;
import com.edu.rayenne.patientservice.domain.persistantPort.PatientPersistent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PatientDao implements PatientPersistent {

    private final PatientRepository patientRepository;
    private final PatientMapper mapper;

    @Override
    public PatientModel addPatient(PatientModel patientModel) {
        return mapper.mapPatientToModel(patientRepository.save(mapper.mapPatientToEntity(patientModel)));
    }

    @Override
    public List<PatientModel> getAllPatient() {
        return patientRepository.findAll()
                .stream()
                .map(mapper::mapPatientToModel)
                .toList();
    }

    @Override
    public List<PatientModel> deletePatient(Long id) {
        Optional<PatientEntity> patientEntity=patientRepository.findById(id);
        if(patientEntity.isPresent())
        {
            patientRepository.delete(patientEntity.get());
        }
        return patientRepository.findAll()
                .stream()
                .map(mapper::mapPatientToModel)
                .toList();
    }

    @Override
    public PatientModel updatePatient(Long id, PatientModel patientModel) {
        Optional<PatientEntity> patientEntity=patientRepository.findById(id);
        if(patientEntity.isPresent())
        {
            PatientEntity updatedPatient=mapper.mapPatientToEntity(patientModel);
            updatedPatient.setPatientUid(id);
            return mapper.mapPatientToModel(patientRepository.saveAndFlush(updatedPatient));
        }
        return null;
    }
}
