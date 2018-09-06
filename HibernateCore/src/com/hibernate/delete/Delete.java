package com.hibernate.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			
			
			//Update 1 record
			int id = 2;
			
			Student student = session.get(Student.class, id);
			
			//delete using object
			session.delete(student);
			
			//delete using id
			int $new = 4;
			session.createQuery("delete from Student s where s.id ="+$new).executeUpdate();
			
			session.getTransaction().commit(); // Apply change to data base
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
