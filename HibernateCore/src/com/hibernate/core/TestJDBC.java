package com.hibernate.core;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user= "hbstudent";
		String pass= "hbstudent";
		try {
			Connection myConnection = DriverManager.getConnection(jdbcUrl , user, pass);
			if (myConnection!=null) {
				System.out.println("Connection successfully");
			}else {
				System.out.println("Connection Failt");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
