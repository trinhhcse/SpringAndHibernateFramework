package com.anotation.autowiring.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/anotation/autowiring/scope/applicationContext.xml");
		
		//retrieve bean from spring container
//		Coach myCoach = context.getBean("myTennisCoach", Coach.class);
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach myCoach2 = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(myCoach);
		System.out.println(myCoach2);
		System.out.println(myCoach==myCoach2);
		
		//close context
		context.close();
	}
}
 