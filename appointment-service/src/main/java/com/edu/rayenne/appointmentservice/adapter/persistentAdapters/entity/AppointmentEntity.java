package com.edu.rayenne.appointmentservice.adapter.persistentAdapters.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "_appointment")
public class AppointmentEntity implements Serializable {

    @Id
    private String appointmentUid;
    private Date appointmentDate;
    private String appointmentStatus;
    private String appointmentLabel;
    private Long patientUid;
}
