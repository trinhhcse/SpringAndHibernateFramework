package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/showForm")//Sub mapping (relative)  /hello/showForm
	public String showForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm( 
			@Valid @ModelAttribute("customer") Customer customer,//Perform validation rules on Customer object
			BindingResult bindingResult//Result of validation placed in the BindingResult
			) {
		System.out.println("Last name: |"+ customer.getLastName() +"|");
		System.out.println("Age: |"+ customer.getAge() +"|");
		System.out.println("Post Code: |"+ customer.getPostCode() +"|");
		System.out.println("Binding result: |"+ bindingResult +"|");
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
		
	}
	
	//Pre-process all web request coming into our controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		//Design in Spring API: Remove white space leading and trailing
		//trim to null if all white space
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		//Pre-processing every String form data
		//trim white space
		//trim to null if String only has white space
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
}
