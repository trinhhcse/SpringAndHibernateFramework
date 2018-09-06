package com.springmvc.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = StartWithConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartWith{
	
	//define default value start with
	public String value() default "";
//	public String[] value() default {};
	
	
	//define default message start with
	public String message() default "";
	
	//define default groups validation constraint together 
	//relative constraint
	public Class<?>[] groups() default {};
	
	//define default payloads additional information about validation error
	//provide custom details about validation failure severity level error code etc
	public Class<? extends Payload>[] payload() default {};
	
	
}
	
