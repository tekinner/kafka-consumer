package com.learn.kafka.kafkaconsumer.model;

public class CreditModel {
    private int memberId;
    private String message;
    private String transactionType;
    private double amount;
    private String topic;

    public CreditModel() {
    }

    public CreditModel(int memberId, String message, String transactionType, double amount, String topic) {
        this.memberId = memberId;
        this.message = message;
        this.transactionType = transactionType;
        this.amount = amount;
        this.topic=topic;
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

    public String getTransactionType() {
        return transactionType;
    }

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

    @Override
    public String toString() {
        return "****************************************CreditService{" +
                "memberid=" + memberId +
                ", message='" + message + '\'' +
                ", transactiontype='" + transactionType + '\'' +
                ", amount=" + amount +
                ", topic=" + topic +
                '}';
    }
}
