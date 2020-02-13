package com.learn.kafka.kafkaconsumer.entity;

import com.learn.kafka.kafkaconsumer.model.CreditModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CONSUMER", schema="REWARDS")
public class CreditEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTIONID")
    private int transactionid;

    @Column(name = "MEMBERID")
    private int memberId;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "TRANSACTIONTYPE")
    private String transactionType;

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "TOPIC")
    private String topic;

    public CreditEntity() {
    }

    public CreditEntity(CreditModel creditModel) {
        this.memberId = creditModel.getMemberId();
        this.message = creditModel.getMessage();
        this.transactionType = creditModel.getTransactionType();
        this.amount = creditModel.getAmount();
        this.topic=creditModel.getTopic();
    }


    public CreditEntity(Integer memberId, String message, String transactionType, Double amount, String topic) {
        this.memberId = memberId;
        this.message = message;
        this.transactionType = transactionType;
        this.amount = amount;
        this.topic=topic;
    }

    public int getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTransactionType() {    return transactionType; }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
