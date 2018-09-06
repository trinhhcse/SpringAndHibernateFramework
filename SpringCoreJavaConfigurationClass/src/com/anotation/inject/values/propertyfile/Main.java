package com.anotation.inject.values.propertyfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Reading Java configuration class to create Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		
		//retrieve bean from spring container
		TennisCoach myCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		
		//close context
		context.close();
	}
}
 