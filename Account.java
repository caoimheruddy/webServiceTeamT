package com.mycompany.webServiceProject.models;

import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author caoimheRuddy
 */
@XmlRootElement
public class Account {
    private int accountID;
    private int sortCode;
    private String accountIBAN;
    private String accountType;
    private float accountBalance;
    
    public Account(){
        
    }
    
    public Account(int accountID, int sortCode, String accountIBAN, String accountType, float accountBalance){
        this.accountID = accountID;
        this.sortCode = sortCode;
        this.accountIBAN = accountIBAN;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    public int getAccountID(){
        return accountID;
    }
    
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    
    public int getSortCode(){
        return sortCode;
    }
    
    public void setSortCode(int sortCode){
        this.sortCode = sortCode;
    }
    
    public String getAccountIBAN(){
        return accountIBAN;
    }
    
    public void setAccountIBAN(String accountIBAN){
        this.accountIBAN = accountIBAN;
    }
    
    public String getAccountType(){
        return accountType;
    }
    
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    
    public float getAccountBalance(){
        return accountBalance;
    }
    
    public void setAccountBalance(float accountBalance){
        this.accountBalance = accountBalance;
    }
    
}
