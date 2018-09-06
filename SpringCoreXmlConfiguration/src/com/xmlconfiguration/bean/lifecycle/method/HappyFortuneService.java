package com.xmlconfiguration.bean.lifecycle.method;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is lucky day";
	}

}
