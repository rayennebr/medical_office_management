package com.edu.rayenne.appointmentservice.adapter.persistentAdapters.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_appointment")
public class AppointmentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentUid;
    private Date appointmentDate;
    private String appointmentStatus;
    private String appointmentLabel;
    private Long patientUid;
}
