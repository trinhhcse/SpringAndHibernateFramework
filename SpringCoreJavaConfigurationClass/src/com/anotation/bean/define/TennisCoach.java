package com.anotation.bean.define;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;

	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout of TennisCoach";
		
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

