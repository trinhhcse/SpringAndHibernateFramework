package com.springmvc.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EndWithConstrainValidator implements ConstraintValidator<EndWith, String>{
	private String suffix;
	
	@Override
	public void initialize(EndWith constraintAnnotation) {
		suffix = constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
		if(value!=null) {
			return value.endsWith(suffix);
		}
		return true;
	}
	
}
