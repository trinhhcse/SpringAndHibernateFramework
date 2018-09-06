package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AccountConfig;
import com.spring.dao.AccountDAO;
import com.spring.dao.MembershipDAO;
import com.spring.dao.MembershipDAOImpl;

public class Main {

	public static void main(String[] args) {

		// Read spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);

		// Get bean from SC
		AccountDAO accountDAO = context.getBean("accountDAOImpl", AccountDAO.class);
		MembershipDAOImpl membershipDAO = context.getBean("membershipDAOImpl", MembershipDAOImpl.class);

		// call method
		accountDAO.addAccount(); 

		membershipDAO.addMembership();
		
		System.out.println("Call setMembership() on membershipDaoImpl");
		membershipDAO.setMemberShip();

		// close context
		context.close();

		
	}

}
