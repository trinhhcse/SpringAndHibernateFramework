package com.xmlconfiguration.dependencyinjection.constructor;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on BaseballCoach";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

