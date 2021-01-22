package com.eps.hrm.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Data
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String street;
    private String houseNr;
    private String postCode;
    private String city;
    private String country;
    private String phone;
    private String mobile;
    private String email;
    private LocalDate birthDate;
    private String sex;

    public void setPostcode(String postCode) {
        if(checkPostcode(postCode))
        {
            this.postCode = postCode;
        } else {
            //TODO: Reformat Postcode or throw exception
        }
    }
    private boolean checkPostcode(String postCode) {
        if (postCode.matches("/^[1-9][0-9]{3} ?[A-Z]{2}$/")) {
            return true;
        } else {
            return false;
        }
    }


}
