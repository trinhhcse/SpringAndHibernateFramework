package com.anotation.autowiring.field.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/anotation/autowiring/field/injection/applicationContext.xml");
		
		//retrieve bean from spring container
//		Coach myCoach = context.getBean("myTennisCoach", Coach.class);
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		//close context
		context.close();
	}
}
 