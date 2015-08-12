package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	private List<Customer> listOfAllCustomer = new ArrayList<Customer>();

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return listOfAllCustomer;
	}
	
	public InMemoryCustomerRepository(){
		Customer customer1 = new Customer();
		/*customer1.setCustomerId(1);
		customer1.setAddress("address1");
		customer1.setName("Andy");
		customer1.setNoOfOrdersMade(2);
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setAddress("address2");
		customer2.setName("Mary");
		customer2.setNoOfOrdersMade(3);
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(3);
		customer3.setAddress("address3");
		customer3.setName("Cindy");
		customer3.setNoOfOrdersMade(7);*/
		
		/*listOfAllCustomer.add(customer1);
		listOfAllCustomer.add(customer2);
		listOfAllCustomer.add(customer3);*/
	}

}
