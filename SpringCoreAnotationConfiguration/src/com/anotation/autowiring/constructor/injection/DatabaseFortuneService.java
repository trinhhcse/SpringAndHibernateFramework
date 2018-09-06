package com.anotation.autowiring.constructor.injection;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune for DatabaseFortuneService";
	}

}
