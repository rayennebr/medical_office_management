package com.edu.rayenne.appointmentservice.adapter.persistentAdapters.repository;

import com.edu.rayenne.appointmentservice.adapter.persistentAdapters.entity.AppointmentEntity;
import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<AppointmentEntity,String> {
    AppointmentEntity findByAppointmentUid(String appointmentUid);
}
