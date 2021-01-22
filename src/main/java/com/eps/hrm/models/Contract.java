package com.eps.hrm.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private ContractType contractType;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private int contractHrs;
    private int leaveHrs;

}
