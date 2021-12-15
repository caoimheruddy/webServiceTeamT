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
/*
 * * @author caoimheRuddy
 */
@Path("/customers")
public class CustomerResource {
    
    CustomerService customerService = new CustomerService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List <Customer> getCustomersXML(){
        return customerService.getAllCustomers();  
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List <Customer> getCustomersJSON(){
        return customerService.getAllCustomers();  
    }
    
    
    @GET
    @Path("/customerID")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerXML (@PathParam("customerID") int customerID){
        return customerService.getCustomerID(customerID);
    }
    
    @GET
    @Path("/customerID")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomerJSON (@PathParam("customerID") int customerID){
        return customerService.getCustomerID(customerID);
    }
}
    

