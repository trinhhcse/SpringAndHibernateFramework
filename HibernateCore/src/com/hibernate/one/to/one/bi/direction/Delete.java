package com.hibernate.one.to.one.bi.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			
			session.beginTransaction();
			
			// delete both instructor if cascade ALL
			// delete both instructor if cascade ALL
//			Instructor instructor = session.get(Instructor.class, 3);
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 5);
			instructorDetail.getInstructor().setInstructorDetail(null);
//			session.delete(instructor);
			session.delete(instructorDetail);

			
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
