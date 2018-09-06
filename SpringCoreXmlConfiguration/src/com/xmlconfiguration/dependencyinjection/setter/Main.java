package com.xmlconfiguration.dependencyinjection.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/xmlconfiguration/dependencyinjection/setter/applicationContext.xml");
		
		//retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		//close context
		context.close();
	}
}
 