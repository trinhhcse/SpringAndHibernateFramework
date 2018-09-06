package com.xmlconfiguration.dependencyinjection.literalvalues;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is lucky day";
	}

}
