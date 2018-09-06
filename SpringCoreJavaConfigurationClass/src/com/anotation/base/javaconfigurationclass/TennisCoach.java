package com.anotation.base.javaconfigurationclass;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TennisCoach";
		
	}
}

