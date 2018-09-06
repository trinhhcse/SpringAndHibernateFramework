package com.anotation.bean.post.processor;

import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TennisCoach";
		
	}
}

