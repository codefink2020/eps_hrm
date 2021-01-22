package com.eps.hrm.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Employee extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate employedDate;
    private LocalDate terminationDate;
    @OneToOne
    private Contract contract;
    @OneToMany
    private List<Vacation> vacations;

    @OneToOne
    List<Certification> certificates;
}
