package com.springmvc.hibernate.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.hibernate.dao.CustomerDAO;
import com.springmvc.hibernate.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	// inject customerDao because 1 implement of customerDAO so not need to
	// qualifier
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional //automatic begin and end transaction
	public List<Customer> getCustomers() {
		
		//get customer from dao
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public boolean saveCustomer(Customer customer) {
		return customerDAO.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return customerDAO.getCustomer(id);
	}

	@Override
	@Transactional
	public boolean deleteCustomer(int id) {
		return customerDAO.deleteCustomer(id);
	}

}
