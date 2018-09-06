package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Component scan auto scan java class with special anotation
//auto register controller bean to spring container

@Controller
public class HomeController {
	
	
	//it use view name for view resolver to get view page
	@RequestMapping("/") 
	public String showPage() {
		return "main-menu";
	}

}
