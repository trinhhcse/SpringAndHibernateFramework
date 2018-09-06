package com.spring.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class MembershipDAOImpl implements MembershipDAO {
	
	@Override
	public void addMembership() {
		System.out.println("addMembership() MembershipDAOImpl");

	}
	public void setMemberShip() {
		System.out.println("setMemberShip() MembershipDAOImpl");
	}

}
