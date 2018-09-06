package com.anotation.autowiring.bean.lifecycle.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/anotation/autowiring/bean/lifecycle/method/applicationContext.xml");
		
		//retrieve bean from spring container
//		Coach myCoach = context.getBean("myTennisCoach", Coach.class);
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		//close context
		context.close();
	}
}
 