package com.anotation.autowiring.inject.collection;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class BeanPostProcessorImplement implements org.springframework.beans.factory.config.BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization of bean :"+beanName);
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization of bean :"+beanName);
		return bean;
	}
	@Bean
	public List<Integer> integerList(){
		return Arrays.asList(1,2,3,4,5);
	}
}
