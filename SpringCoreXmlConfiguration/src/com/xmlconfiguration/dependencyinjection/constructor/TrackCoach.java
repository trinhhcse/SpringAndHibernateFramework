package com.xmlconfiguration.dependencyinjection.constructor;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TrackCoach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
