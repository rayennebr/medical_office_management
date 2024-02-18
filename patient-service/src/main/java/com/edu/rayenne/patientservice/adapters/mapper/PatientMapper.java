package com.edu.rayenne.patientservice.adapters.mapper;

import com.edu.rayenne.patientservice.adapters.persistentAdapters.entity.PatientEntity;
import com.edu.rayenne.patientservice.domain.model.PatientModel;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {

    public PatientModel mapPatientToModel(PatientEntity patientEntity)
    {
        return PatientModel.builder()
                .patientUid(patientEntity.getPatientUid())
                .cin(patientEntity.getCin())
                .firstname(patientEntity.getFirstname())
                .lastname(patientEntity.getLastname())
                .insuranceCode(patientEntity.getInsuranceCode())
                .build();
    }

    public PatientEntity mapPatientToEntity(PatientModel patientModel)
    {
        return PatientEntity.builder()
                .patientUid(patientModel.patientUid())
                .cin(patientModel.cin())
                .firstname(patientModel.firstname())
                .lastname(patientModel.lastname())
                .insuranceCode(patientModel.insuranceCode())
                .build();
    }
}
