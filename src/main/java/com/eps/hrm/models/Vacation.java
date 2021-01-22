package com.eps.hrm.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Employee taker;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean approved;
    @OneToOne
    private Manager approvedBy;

}
