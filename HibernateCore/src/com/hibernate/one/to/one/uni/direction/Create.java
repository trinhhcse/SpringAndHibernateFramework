package com.hibernate.one.to.one.uni.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;
import com.hibernate.one.to.one.bi.direction.Instructor;
import com.hibernate.one.to.one.bi.direction.InstructorDetail;

public class Create {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			//create object 
//			Instructor instructor = new Instructor("Join", "Doe", "ABC@gmail.com");
//			InstructorDetail instructorDetail = new InstructorDetail("youtube.com/doe", "Coding");
//			
			Instructor instructor = new Instructor("Mark", "Liee", "ABC@gmail.com");
			InstructorDetail instructorDetail = new InstructorDetail("youtube.com/liee", "Coding");
					
			//associate object together
//			instructor.setInstructorDetail(instructorDetail);

			
			
			session.beginTransaction();
			session.save(instructor);
			
			session.getTransaction().commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sessionFactory.close();
		}

	}
}
