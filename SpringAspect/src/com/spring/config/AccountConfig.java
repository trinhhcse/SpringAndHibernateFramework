package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Spring container use it as source bean difination
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true) //Spring AOP Proxy support
@ComponentScan(basePackages= {
		"com.spring.dao",
		"com.spring.aspect"
})
public class AccountConfig {
	
	
	
}
