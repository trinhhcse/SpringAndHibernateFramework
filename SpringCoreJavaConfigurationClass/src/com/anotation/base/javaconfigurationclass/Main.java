package com.anotation.base.javaconfigurationclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Reading Java configuration class to create Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		
		//retrieve bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		
		//close context
		context.close();
	}
}
 