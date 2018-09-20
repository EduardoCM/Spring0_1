package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.castillo.model.Customer;
import com.castillo.repository.CustomerRepository;

public class Application {

  public static void main(String[] args) {

    //CustomerService service = new CustomerServiceImpl();
    
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    CustomerRepository service = appContext.getBean("customerRepository", CustomerRepository.class);

    Customer customer = new Customer();
    customer.setFirstName("Eduardoo");
    customer.setLastName("Castilloo");
    service.insert(customer);
  }

}
