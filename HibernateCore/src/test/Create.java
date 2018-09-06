package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.Student;

public class Create {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();

			Instructor instructor = new Instructor("Join", "Doe", "abc@gmail.com");

			Course course1 = new Course("JAVA");
			Course course2 = new Course("C#");
			
			
			instructor.add(course1);
			instructor.add(course2);
			
			session.save(instructor);
			
			session.getTransaction().commit();
			System.out.println(instructor);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}
}
