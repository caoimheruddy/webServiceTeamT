package com.mycompany.webServiceProject.resources;

import javax.xml.bind.annotation.XmlRootElement;
import com.mycompany.webServiceProject.models.Customer;
import com.mycompany.webServiceProject.services.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import com.mycompany.webServiceProject.models.Account;
import com.mycompany.webServiceProject.services.AccountService;
/**
 *
 * @author caoimheRuddy
 */
@Path("/accounts")
public class AccountResource {
    
    AccountService accountService = new AccountService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List <Account> getAccountsXML(){
        return accountService.getAllAccounts();  
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List <Account> getAccountsJSON(){
        return accountService.getAllAccounts();  
    }
    
    
    @GET
    @Path("/accountID")
    @Produces(MediaType.APPLICATION_XML)
    public Account getAccountXML (@PathParam("accountID") int accountID){
        return accountService.getAccountID(accountID);
    }
    
    @GET
    @Path("/accountID")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccountJSON (@PathParam("accountID") int accountID){
        return accountService.getAccountID(accountID);
    }
}
