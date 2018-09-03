package com.CRM.CRM.model;


import org.hibernate.Transaction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class TransDetails {

    @ManyToOne
    private Transaction TransNo;

    private Long transDetail;

    private Long amount;

    @OneToOne
    private DetailType type;


}
