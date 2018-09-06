package com.anotation.autowiring.field.injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "get fortune service for field injection ";
	}

}
