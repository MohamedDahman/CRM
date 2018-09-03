package com.CRM.CRM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionStatus {

    @Id
    @GeneratedValue
    Long Trans_No;

    private String description;

    public TransactionStatus() {
    }

    public Long getTrans_No() {
        return Trans_No;
    }

    public void setTrans_No(Long trans_No) {
        Trans_No = trans_No;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
