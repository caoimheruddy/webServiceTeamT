package com.mycompany.webServiceProject.services;

import com.mycompany.webServiceProject.models.Customer;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author caoimheRuddy
 */
public class CustomerService {
    public static List<Customer> list  = new ArrayList<>();
    public static boolean init = true;
    
    public CustomerService(){
        if(init){
            Customer c1 = new Customer(1, "Caoimhe Ruddy", "caoimherud@yahoo.com", "087266880");
            Customer c2 = new Customer(2, "Sean Hallahan", "seanh@gmail.com", "085117654");
            Customer c3 = new Customer(3, "Brandon Caffrey", "brando@caffrey.com", "083334879");
            Customer c4 = new Customer(4, "Cristina Muntean", "cristinam@hotmail.com", "0895793321");
            
            
            list.add(c1);
            list.add(c2);
            list.add(c3);
            list.add(c4);
            init=false;
        }
    }
            public List<Customer> getAllCustomers(){
                return list;
            }
            
            public Customer getCustomerID(int customerID){
                return list.get(customerID-1);
            }
            
        
    }
