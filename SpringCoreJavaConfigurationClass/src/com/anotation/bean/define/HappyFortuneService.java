package com.anotation.bean.define;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortuney of HappyFortuneService";
	}

}
