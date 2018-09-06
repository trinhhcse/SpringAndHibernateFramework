package com.anotation.autowiring.inject.collection;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes";
		
	}
}
