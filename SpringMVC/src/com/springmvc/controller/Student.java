package com.springmvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private List<String> operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private List<String> favoriteLanguageOptions;
	private List<String> operatingSystemOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("EN", "England");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Gemany");
		
		favoriteLanguageOptions = Arrays.asList(
				"C",
				"C#",
				"JAVA",
				"PHP"
				);
		
		operatingSystemOptions = Arrays.asList(
				"Windows",
				"Mac OS",
				"Linux"
				);
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public List<String> getOperatingSystems() {
		return operatingSystems;
	}
	
	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public List<String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public List<String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}
	
	
}
