package com.springmvc.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Customer {
	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Max(value=80,message="must be less than or equal to 80")
	@Min(value=18,message="must be greater than or equal to 18")
	private Integer age;
	
//	@NotNull
//	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Only 5 chars/digits")
	@StartWith(value="ABC",message = "Must Start with ABC")
	private String postCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	
	
	
}
