package com.springmvc.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
//StartWith our annotation 
//String is type of data value pass to 
public class StartWithConstraintValidator implements ConstraintValidator<StartWith,String> {
	private String prefix;
	@Override
	public void initialize(StartWith constraintAnnotation) {
		this.prefix = constraintAnnotation.value(); //prefix  = value in @StartWith(value="StartString",message="Error message")
	}
	@Override
	public boolean isValid(String value/*HTML form data enter by user here*/, 
			ConstraintValidatorContext arg1 /*Additional error messages here*/) {
		if(value!=null) {
			return value.startsWith(prefix);
		}else {
			return true;
		}
	}

}
