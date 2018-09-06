package com.anotation.bean.post.processor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/anotation/bean/post/processor/applicationContext.xml");
		
		//retrieve bean from spring container
//		Coach myCoach = context.getBean("myTennisCoach", Coach.class);
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach myCoach2 = context.getBean("baseballCoach", Coach.class);
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		
		//close context
		context.close();
	}
}
 