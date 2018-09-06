package com.xmlconfiguration.dependencyinjection.setter;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is lucky day";
	}

}
