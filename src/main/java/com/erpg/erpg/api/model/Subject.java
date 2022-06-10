package com.erpg.erpg.api.model;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "subject_name")
    private String name;

    @Column(name = "subject_description")
    private String description;

    @Column(name = "subject_workload")
    private Long workload;

}