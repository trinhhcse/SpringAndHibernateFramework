package com.xmlconfiguration.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//Create a spring container from xml 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/xmlconfiguration/dependencyinjection/applicationContext.xml");
		
		//retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		
		//close context
		context.close();
	}
}
 