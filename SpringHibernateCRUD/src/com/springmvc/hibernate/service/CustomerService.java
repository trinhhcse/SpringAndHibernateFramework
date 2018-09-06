package com.springmvc.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.hibernate.dao.CustomerDAO;
import com.springmvc.hibernate.entity.Customer;


public interface CustomerService {
	boolean saveCustomer(Customer customer);
	Customer getCustomer(int id);
	List<Customer> getCustomers();
	boolean deleteCustomer(int id);
}
