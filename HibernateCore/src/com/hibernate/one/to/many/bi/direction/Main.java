package com.hibernate.one.to.many.bi.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();
			
//			//create source
//			Course course = new Course("JAVA");
//			
//			//add some reviews
//			course.addReview(new Review("Great course!"));
//			course.addReview(new Review("Bad course!"));
//			course.addReview(new Review("Not bad course!"));
//			
//			
//			//save the course
//			session.save(course);
			
			Course course = session.get(Course.class, 10);
			
			System.out.println(course);
			
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
