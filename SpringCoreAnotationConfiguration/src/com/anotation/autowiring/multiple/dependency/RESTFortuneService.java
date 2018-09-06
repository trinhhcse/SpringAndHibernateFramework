package com.anotation.autowiring.multiple.dependency;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune for RESTFortuneService";
	}

}
