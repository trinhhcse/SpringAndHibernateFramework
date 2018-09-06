package com.xmlconfiguration.bean.lifecycle.method;

public interface Coach {
	void initMethod();
	void destroyMethod();
	String getDailyWorkout();
	String getDailyFortune();
}
