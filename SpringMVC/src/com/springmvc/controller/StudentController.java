package com.springmvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.javafx.collections.MappingChange.Map;

@Component
@RequestMapping("/student")
public class StudentController {
	
	//Model attribute is a bean that will hold data for the data binding
	@RequestMapping("/showForm")//Sub mapping (relative)  /hello/showForm
	public String showForm(Model model) {
		model.addAttribute("student",new Student());
		return "student-form";
	}
	//	/@ModelAttribute("student") Student student -> binding form data to object
	@RequestMapping("/processForm")//Sub mapping (relative)  /hello/showForm
	public String processForm(
			@ModelAttribute("student") Student student) {
		System.out.println("LOG:"+student.getFirstName()+" "+student.getLastName());
		return "student-confirm";
	}
}
