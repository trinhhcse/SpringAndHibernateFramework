package com.xmlconfiguration.dependencyinjection.constructor;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is lucky day";
	}

}
