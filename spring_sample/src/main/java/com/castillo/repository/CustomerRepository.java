package com.castillo.repository;

import com.castillo.model.Customer;
import java.util.List;

public interface CustomerRepository {
  
  List<Customer> findAll();

}
