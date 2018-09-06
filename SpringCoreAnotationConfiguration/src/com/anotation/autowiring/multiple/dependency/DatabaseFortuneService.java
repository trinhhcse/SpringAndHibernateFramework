package com.anotation.autowiring.multiple.dependency;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune for DatabaseFortuneService";
	}

}
