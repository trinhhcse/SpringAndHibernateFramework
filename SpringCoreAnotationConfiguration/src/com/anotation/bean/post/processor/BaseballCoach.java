package com.anotation.bean.post.processor;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes";
		
	}
}
