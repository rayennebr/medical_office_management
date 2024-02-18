package com.edu.rayenne.appointmentservice.domain.model;

import lombok.Builder;

import java.util.Date;

@Builder
public record AppointmentModel(
        Long appointmentUid,
        Date appointmentDate,
        String appointmentStatus,
        String appointmentLabel,
        Long patientUid
) {
}
