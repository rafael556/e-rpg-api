package com.erpg.erpg.api.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id", nullable = false)
    private Long PersonId;

    @NotBlank
    @Column(name = "person_name")
    private String PersonName;

    @NotBlank
    @Email
    @Column(name = "person_email", unique = true)
    private String PersonEmail;

    @NotBlank
    @CPF
    @Column(name = "person_document")
    private String PersonDocument;

    @Column(name = "institution_id", unique = true)
    private Long institutionalId;

    @Column(name = "person_is_active")
    private Boolean personIsActive;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @CreationTimestamp
    @Column(name = "creation_timestamp")
    private LocalDateTime creationTimeStamp;
}