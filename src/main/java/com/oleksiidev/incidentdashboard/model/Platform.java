package com.oleksiidev.incidentdashboard.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode (callSuper = true)
@Data
@Entity
@Table(name = "`PLATFORM`")
public class Platform extends BaseModel {

    @Column(name = "`Name`")
    private String name;
}
