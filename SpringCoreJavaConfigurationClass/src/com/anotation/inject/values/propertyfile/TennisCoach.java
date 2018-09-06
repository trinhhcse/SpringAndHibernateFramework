package com.anotation.inject.values.propertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

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
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	
}

