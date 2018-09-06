package com.hibernate.one.to.one.uni.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();

			//get instructor
			Instructor instructor = session.get(Instructor.class, 1);
//			 instructorDetail = session.get(InstructorDetail.class, 2);
			
			session.delete(instructor);
//			session.delete(instructorDetail);// You cannot instructorDetail alone here because instructorDetail is constraint with Instructor
			//and It is uni-direction associate

			
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
