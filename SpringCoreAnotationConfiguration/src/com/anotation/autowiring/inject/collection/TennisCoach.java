package com.anotation.autowiring.inject.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")
@Component
public class TennisCoach implements Coach{
	@Autowired
	private List<Integer> integerList;
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TennisCoach";
		
	}
	public List<Integer> getIntegerList() {
		return integerList;
	}
	
	
}

