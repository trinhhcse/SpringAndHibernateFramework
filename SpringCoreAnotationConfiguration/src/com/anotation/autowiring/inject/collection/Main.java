package com.anotation.autowiring.inject.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/anotation/autowiring/inject/collection/applicationContext.xml");
		
		//retrieve bean from spring container
//		Coach myCoach = context.getBean("myTennisCoach", Coach.class);
		TennisCoach myCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		//call method on bean
		System.out.println(myCoach.getIntegerList());
		
		//close context
		context.close();
	}
}
 