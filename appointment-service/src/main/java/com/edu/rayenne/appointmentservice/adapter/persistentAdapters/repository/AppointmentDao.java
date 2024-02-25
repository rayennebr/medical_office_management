package com.edu.rayenne.appointmentservice.adapter.persistentAdapters.repository;

import com.edu.rayenne.appointmentservice.adapter.mapper.AppointmentMapper;
import com.edu.rayenne.appointmentservice.adapter.persistentAdapters.entity.AppointmentEntity;
import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;
import com.edu.rayenne.appointmentservice.domain.persistentPort.AppointmentPersistent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
@Slf4j
public class AppointmentDao implements AppointmentPersistent {

    private final AppointmentRepository repository;
    private final AppointmentMapper mapper;

    @Override
    public AppointmentModel addAppointment(AppointmentModel AppointmentModel) {
        return mapper
                .mapAppointmentToModel(
                        repository.save(mapper.mapAppointmentToEntity(AppointmentModel)));
    }

    @Override
    public List<AppointmentModel> getAllAppointment() {

        return repository.findAll()
                .stream()
                .map(mapper::mapAppointmentToModel)
                .toList();
    }

    @Override
    public List<AppointmentModel> deleteAppointment(String id) {
        AppointmentEntity appointment=repository.findById(id)
                .orElseThrow(()->new NoSuchElementException("appointment not found"));
        repository.delete(appointment);
        return getAllAppointment();
    }

    @Override
    public AppointmentModel updateAppointment(String id, AppointmentModel AppointmentModel) {
        return null;
    }
}
