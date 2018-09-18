package com.castillo.repository;

import com.castillo.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
  
  public List<Customer> findAll(){
       List<Customer> customers = new ArrayList<Customer>();
       
       Customer customer = new Customer();
       customer.setFirstName("Eduardo");
       customer.setLastName("Castillo");
       
       customers.add(customer);
       
       return customers;
  }

}
