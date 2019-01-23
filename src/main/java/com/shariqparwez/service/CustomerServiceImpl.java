package com.shariqparwez.service;

import java.util.List;

import com.shariqparwez.model.Customer;
import com.shariqparwez.repository.CustomerRepository;
import com.shariqparwez.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.shariqparwez.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
