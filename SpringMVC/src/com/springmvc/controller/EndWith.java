package com.springmvc.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EndWithConstrainValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})//Apply anotation to a field or method
@Retention(RetentionPolicy.RUNTIME)//Retain this anotation in class and process it at runtime
public @interface EndWith {
	//value Attribute with default value
	public String value() default "";
	
	//message attribute with default value
	public String message() default "";
	
	//groups relative constraint use with this constraint
	public Class<?>[] groups() default {};
	
	//Payload provide custom detail about validation failure (error....)
	public Class<? extends Payload>[] payloads() default {};
}
