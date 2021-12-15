package com.mycompany.webServiceProject.services;

import com.mycompany.webServiceProject.models.Account;
import com.mycompany.webServiceProject.models.Customer;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author caoimheRuddy
 */
public class AccountService {
    public static List<Account> list  = new ArrayList<>();
    public static boolean init = true;
    
    public AccountService(){
        if(init){
            Account a1 = new Account(1, 98713, "BI78356AP", "Savings Account", (float) 985.90);
            Account a2 = new Account(2, 333618, "IE957463E", "Current Account", (float) 11500.00);
            Account a3 = new Account(3, 671245, "PA32781920", "Current Account", (float) 9200.50);
            Account a4 = new Account(4, 885320, "TR0019765", "Savings Account", (float)734.20 );
            
            
            list.add(a1);
            list.add(a2);
            list.add(a3);
            list.add(a4);
            init=false;
        }
    }
            public List<Account> getAllAccounts(){
                return list;
            }
            
            public Account getAccountID(int accountID){
                return list.get(accountID-1);
            }
}
