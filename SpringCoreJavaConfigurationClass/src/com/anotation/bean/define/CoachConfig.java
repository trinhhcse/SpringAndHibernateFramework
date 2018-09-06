package com.anotation.bean.define;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.anotation.bean.define")
public class CoachConfig {
	{
		System.out.println("Run CoachConfig");
	}
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(happyFortuneService());
	}

}
