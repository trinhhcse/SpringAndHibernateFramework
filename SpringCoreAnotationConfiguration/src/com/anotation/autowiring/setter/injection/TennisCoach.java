package com.anotation.autowiring.setter.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	//or with any method name
	@Autowired
	public void customSetFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TennisCoach";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

