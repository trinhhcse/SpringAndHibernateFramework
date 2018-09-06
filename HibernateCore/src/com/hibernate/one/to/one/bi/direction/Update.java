package com.hibernate.one.to.one.bi.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Update {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Instructor.class)
											.addAnnotatedClass(InstructorDetail.class)
											.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			
			
			//Update 1 record
			int id = 3;
			
			///get instructor
			Instructor instructor = session.get(Instructor.class, 2);
			
			InstructorDetail instructorDetail = instructor.getInstructorDetail();
			
			instructorDetail.setHobby("Sport1");
			
			session.getTransaction().commit(); // Apply change to data base
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
