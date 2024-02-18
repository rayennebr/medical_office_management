package com.edu.rayenne.appointmentservice.adapter.mapper;

import com.edu.rayenne.appointmentservice.adapter.persistentAdapters.entity.AppointmentEntity;
import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;
import org.springframework.stereotype.Component;

@Component
public class AppointmentMapper {

    public AppointmentModel mapAppointmentToModel(AppointmentEntity appointment)
    {
        return AppointmentModel.builder()
                .appointmentUid(appointment.getAppointmentUid())
                .appointmentDate(appointment.getAppointmentDate())
                .appointmentLabel(appointment.getAppointmentLabel())
                .appointmentStatus(appointment.getAppointmentStatus())
                .patientUid(appointment.getPatientUid())
                .build();
    }

    public AppointmentEntity mapAppointmentToEntity(AppointmentModel appointment)
    {
        return AppointmentEntity.builder()
                .appointmentUid(appointment.appointmentUid())
                .appointmentDate(appointment.appointmentDate())
                .appointmentLabel(appointment.appointmentLabel())
                .appointmentStatus(appointment.appointmentStatus())
                .patientUid(appointment.patientUid())
                .build();
    }
}
