package com.mycompany.webServiceProject.models;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author caoimheRuddy
 */
@XmlRootElement
public class Customer {
    private int customerID;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


public Customer(){

}

public Customer(int customerID, String customerName, String customerEmail, String customerPhone){
    this.customerID = customerID;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhone = customerPhone;
    }

public int getCustomerID(){
    return customerID;
}

public void setCustomerID(int customerID){
    this.customerID = customerID;
}

public String getCustomerName(){
    return customerName;
    
}

public void setCustomerName(String customerName){
    this.customerName = customerName;
}

public String getCustomerEmail(){
    return customerEmail;
}

public void getCustomerEmail(String customerEmail){
    this.customerEmail = customerEmail;
}

public String getCustomerPhone(){
    return customerPhone;
}

public void setCustomerPhone(String customerPhone){
    this.customerPhone = customerPhone;
}

}
