package com.xmlconfiguration.bean.lifecycle.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Spring does not manage the complete lifecycle of a prototype bean
		//Destroy method is not called for beans of scope prototype.
		//Create a spring container from xml config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/xmlconfiguration/bean/lifecycle/method/applicationContext.xml");
		
		//retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		//call method on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		//close context
		context.close();
	}
}
 