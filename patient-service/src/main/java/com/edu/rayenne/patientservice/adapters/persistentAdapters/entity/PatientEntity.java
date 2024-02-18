package com.edu.rayenne.patientservice.adapters.persistentAdapters.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "_patient")
@EntityListeners(AuditingEntityListener.class)
public class PatientEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientUid;
    private String firstname;
    private String lastname;
    private String cin;
    private String insuranceCode;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedDate;
}
