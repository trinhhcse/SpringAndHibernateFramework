package com.xmlconfiguration.bean.lifecycle.method;
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on TrackCoach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Override
	public void initMethod() {
		System.out.println("init method of trackCoach");
	}
	@Override
	public void destroyMethod() {
		System.out.println("destroy method of trackCoach");
	}

}
