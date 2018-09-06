package com.springmvc.hibernate.dao;

import java.util.List;

import com.springmvc.hibernate.entity.Customer;

public interface CustomerDAO{
	boolean saveCustomer(Customer customer);
	Customer getCustomer(int id);
	List<Customer> getCustomers();
	boolean deleteCustomer(int id);
}
