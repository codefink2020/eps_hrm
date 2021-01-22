package com.eps.hrm.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
