package com.xmlconfiguration.dependencyinjection;

import com.xmlconfiguration.dependencyinjection.constructor.FortuneService;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on BaseballCoach";
		
	}
}
