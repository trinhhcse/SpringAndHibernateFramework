package com.hibernate.one.to.one.bi.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Load {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			int id = 2;

			session.beginTransaction();

			InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);

			System.out.println(instructorDetail);
			System.out.println(instructorDetail.getInstructor());
			
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
