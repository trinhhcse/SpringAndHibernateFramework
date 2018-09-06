package com.hibernate.many.to.many.bi.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();
			
//			//create course
//			Course course = new Course("Java OOP1");
//			Course course2 = new Course("C#1");
//			Course course3 = new Course("C1");
//			
//			//create student
//			Student student = new Student("Nguyen","Anh","anh@gmail.com");
//			
//			student.addCourse(course);
//			student.addCourse(course2);
//			student.addCourse(course3);		
//			
//			//Save the student
//			session.save(student);
//			session.save(course);
//			session.save(course2);
//			session.save(course3);
			
			Course course = session.get(Course.class, 37);
			
			session.delete(course);
			
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
