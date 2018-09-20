package com.castillo.repository;

import com.castillo.model.Customer;
import java.util.List;

public interface CustomerRepository {
  
  public void insert(Customer customer);
  List<Customer> findAll();

}
