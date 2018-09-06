package com.hibernate.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Update {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			
			
			//Update 1 record
			int id = 3;
			
			Student student = session.get(Student.class, id);
			
			System.out.println(student);
			
			student.setFirstName("David");// Change only change in memory
			
			session.getTransaction().commit(); // Apply change to data base
			
			//Update many record
			session.beginTransaction();
			
			session.createQuery("update Student set email= 'ABC@gmail.com'")
					.executeUpdate();// Change only change in memory
			
			session.getTransaction().commit(); // Apply change to data base
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
