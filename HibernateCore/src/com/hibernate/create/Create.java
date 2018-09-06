package com.hibernate.create;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Create {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			Student stu = new Student("Join", "Doe", "join@gmail.com");
			
			session.beginTransaction();
			
			session.save(stu);
			
			Student newStu = session.get(Student.class, stu.getId());
			
			System.out.println(newStu);
			
			System.out.println(stu == newStu);
			
			session.getTransaction().commit();
			
			
			System.out.println(stu);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sessionFactory.close();
		}

	}

}
