package com.oleksiidev.incidentdashboard.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String username;

    private Role role;

    private String email;
}
