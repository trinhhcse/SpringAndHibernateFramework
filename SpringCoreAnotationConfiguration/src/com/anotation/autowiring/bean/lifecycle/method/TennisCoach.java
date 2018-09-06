package com.anotation.autowiring.bean.lifecycle.method;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
//@Scope("prototype")
public class TennisCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TennisCoach";
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init Bean");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Bean");
	}
}

