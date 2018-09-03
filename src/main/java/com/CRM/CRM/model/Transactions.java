package com.CRM.CRM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Transactions  {

    @Id
    @GeneratedValue
    Long Trans_No;

    private String description;

    private Date  execDate;

    private TransactionStatus Status;

    private User user;


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

    public Date getExecDate() {
        return execDate;
    }

    public void setExecDate(Date execDate) {
        this.execDate = execDate;
    }

    public TransactionStatus getStatus() {
        return Status;
    }

    public void setStatus(TransactionStatus status) {
        Status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
