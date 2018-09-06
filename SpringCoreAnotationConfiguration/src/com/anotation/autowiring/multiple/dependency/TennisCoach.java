package com.anotation.autowiring.multiple.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoach implements Coach{
	
	//no need setter method
	//setting field values even private field
	//using java reflection
	//use qualifier to specific what dependency we want to be inject
	@Autowired
	@Qualifier("randomFortuneService")
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

