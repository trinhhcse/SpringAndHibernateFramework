package com.hibernate.lazy.loader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.core.Student;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();

//			Instructor instructor = session.get(Instructor.class, 12);
			
//			//Option 1:call setter before session close
//			System.out.println(instructor.getCourses());
			
			//Option 2: Load data of Instructor at once using hql
			
			Query<Instructor> query = session.createQuery("select i from Instructor i "
					+ "JOIN FETCH i.courses "
					+ "where i.id =:instructorIdParam",Instructor.class);
			
			Instructor instructor = query.setParameter("instructorIdParam", 12).getSingleResult();
			
			session.getTransaction().commit();
			System.out.println(instructor);
			
			//close session here
			session.close();
			
			
			//To load data of lazy loading after close session
			//Two option
			//1. call setter before session close
			//2 load data once using hql
			System.out.println(instructor.getCourses());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
