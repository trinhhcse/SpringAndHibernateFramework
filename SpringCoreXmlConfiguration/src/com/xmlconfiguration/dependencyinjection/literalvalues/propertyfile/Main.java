package com.xmlconfiguration.dependencyinjection.literalvalues.propertyfile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/xmlconfiguration/dependencyinjection/literalvalues/propertyfile/applicationContext.xml");
		
		//retrieve bean from spring container
		BaseballCoach myCoach = context.getBean("myCoach", BaseballCoach.class);
		
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		
		//close context
		context.close();
	}
}
 