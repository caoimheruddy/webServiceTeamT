/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.models;

/**
 *
 * @author bcaff
 */
public class Transaction {
    public enum TransactionType {
        LODGEMENT, WITHDRAWAL, TRANSFER
    }
    
    //data members
    private TransactionType transactionType;
    private String modifier;
    private double amount;
    private String transactionDate;
    private String description;
    
    public Transaction() {
    }
    
    //constructor
    public Transaction(TransactionType transactionType, double amount, String transactionDate, String description) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.description = description;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
    
    //getters and setter
    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
