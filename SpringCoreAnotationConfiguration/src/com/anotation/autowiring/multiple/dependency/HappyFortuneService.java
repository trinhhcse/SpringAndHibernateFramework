package com.anotation.autowiring.multiple.dependency;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "fortune service for HappyFortuneService ";
	}

}
