package com.castillo.service;

import com.castillo.model.Customer;
import com.castillo.repository.CustomerRepository;
import com.castillo.repository.HibernateCustomerRepositoryImpl;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }
  
}
