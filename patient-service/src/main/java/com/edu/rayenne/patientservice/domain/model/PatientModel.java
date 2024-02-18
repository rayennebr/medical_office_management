package com.edu.rayenne.patientservice.domain.model;

import lombok.Builder;
import lombok.Data;

@Builder
public record PatientModel(
        Long patientUid,
        String firstname,
        String lastname,
        String cin,
        String insuranceCode
) {
}
