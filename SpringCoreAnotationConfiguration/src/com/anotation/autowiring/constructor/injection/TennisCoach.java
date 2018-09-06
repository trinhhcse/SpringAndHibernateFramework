package com.anotation.autowiring.constructor.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoach implements Coach{
	private FortuneService fortuneService;
	private A a;
	@Autowired
	private FortuneService service;
	
//	@Autowired can be omit from spring 4.3 and above
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService,@Qualifier("b") A a) {
		this.fortuneService = fortuneService;
		this.a = a;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TennisCoach";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyOtherWork() {
		System.out.println(service.getFortune());
		return a.doST();
	}
	
}

interface A{
	String doST();
}
@Component
class B implements A{
	@Override
	public String doST() {
		return "Do st";
	}
}