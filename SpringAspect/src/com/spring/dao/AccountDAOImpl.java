package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAOImpl implements AccountDAO{
	public void addAccount() {
		System.out.println("addAccount() AccountDAOImpl");
	}
}
