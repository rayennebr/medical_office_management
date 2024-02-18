package com.edu.rayenne.appointmentservice.adapter.persistentAdapters.repository;

import com.edu.rayenne.appointmentservice.adapter.persistentAdapters.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity,Long> {
}
