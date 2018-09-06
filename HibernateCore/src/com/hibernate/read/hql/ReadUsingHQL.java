package com.hibernate.read.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class ReadUsingHQL {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			
			List<Student> students = session
										.createQuery("from Student")
										.list();
			System.out.println(students);
			
			List<Student> results = session
										.createQuery("from Student s where s.lastName = 'persee'"
												+ " or s.firstName = 'ro'")
										.list();
			System.out.println(results);
			
			List<Student> resultsLike = session
										.createQuery("from Student s where s.email like '%yahoo.com'")
										.list();
			System.out.println(resultsLike);
			
			session.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sessionFactory.close();
		}

	}
}
