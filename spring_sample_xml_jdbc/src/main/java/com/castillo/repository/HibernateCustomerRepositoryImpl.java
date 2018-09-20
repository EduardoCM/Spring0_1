package com.castillo.repository;

import com.castillo.model.Customer;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	

	private DataSource dataSource;
	
	
  
  public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



public List<Customer> findAll(){
       List<Customer> customers = new ArrayList<Customer>();
       
       
       return customers;
  }



@Override
public void insert(Customer customer) {
	
	String sql = "INSERT INTO customer (name, last_name) VALUES (?, ?)";
	Connection conn = null;
	
	
	try {
		conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, customer.getFirstName());
		ps.setString(2, customer.getLastName());
		
		ps.executeUpdate();
		ps.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

}
