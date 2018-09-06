package com.anotation.autowiring.field.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoach implements Coach{
	
	//no need setter method
	//setting field values even private field
	//using java reflection
	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TennisCoach";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

