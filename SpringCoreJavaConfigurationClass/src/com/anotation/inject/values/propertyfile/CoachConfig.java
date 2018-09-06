package com.anotation.inject.values.propertyfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.anotation.inject.values.propertyfile")
//load property file 
@PropertySource("classpath:com/anotation/inject/values/propertyfile/sport.properties")
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
