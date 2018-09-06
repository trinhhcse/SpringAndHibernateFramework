package com.springmvc.hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.hibernate.entity.Customer;

@Repository// spring use it for component scan and auto register the dao implementation bean in spring container
public class CustomerDAOImpl implements CustomerDAO {
	
	//need to inject the sessionFactory bean config from xml file
	@Autowired //Dependency injection
	private SessionFactory sessionFactory;

	@Override
	public boolean saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		return true;
	}

	@Override
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		
		//get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		//create query using HQL
		Query<Customer> query = session.createQuery("from Customer order by lastName",Customer.class);
		
		//get the result list
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

	@Override
	public boolean deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", id).executeUpdate();
		return true;
	}
	
	
}
 