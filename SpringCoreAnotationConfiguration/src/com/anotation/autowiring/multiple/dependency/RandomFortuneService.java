package com.anotation.autowiring.multiple.dependency;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	String[] strs = { DatabaseFortuneService.class.getSimpleName(), HappyFortuneService.class.getSimpleName(),
			RESTFortuneService.class.getSimpleName() };

	@Override
	public String getFortune() {
		return "fortune service of " + strs[new Random().nextInt(strs.length)];
	}

}
