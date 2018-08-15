package com.CRM.CRM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Participant {


    @Id
    @GeneratedValue
    Long id;

    private String firstName;

    private String lastName;

    private String responsibleName;

    private String phoneNo;

    private String motherPhoneNo;

    private Integer postNO;

    private String Adress;

    private Date birthDate;

    public Participant() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
