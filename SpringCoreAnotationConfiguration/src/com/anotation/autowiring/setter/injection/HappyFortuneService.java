package com.anotation.autowiring.setter.injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is lucky day";
	}

}
