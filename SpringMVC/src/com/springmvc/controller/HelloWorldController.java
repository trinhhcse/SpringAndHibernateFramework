package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Controller request mapping
@Controller
@RequestMapping("/hello") //parent mapping
public class HelloWorldController {
	//method request mapping
//	Phương thức nào sẽ xử lý request từ URL nào
//	InternalResourceViewResolver sẽ map tên view mà chúng ta trả về trong controller với một tên file nằm trong một thư mục được chỉ định.
	@RequestMapping("/showForm")//Sub mapping (relative)  /hello/showForm
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//HttpServletRequest Container form data
	//Model container your data (empty when init)
	@RequestMapping("/processFormVersionTwo")//Sub mapping (relative) /hello/processFormVersionTwo 
	public String processFormVersionTwo(HttpServletRequest request,Model model) {
		//read request params from the html form
		String studentName  = request.getParameter("studentName");
		
		//convert string to upper case
		studentName = studentName.toUpperCase();
		
		//add data to the model
		model.addAttribute("message",studentName);
		
		//return the view  page name
		return "helloworld";
	}
	//@RequestParam use to bind data of studentName parameter to studentName variable
	//or assign the studentName to value of request parameter
	//@RequestParam("studentName") String studentName <=> String studentName = request.getParameter("studentName")
	@RequestMapping("/processFormVersionThree")//Sub mapping (relative) /hello/processFormVersionThree
	public String processFormVersionThree(
			@RequestParam("studentName") String studentName,
			Model model) {
		 
		//convert string to upper case
		studentName = studentName.toUpperCase();
		
		//add data to the model
		model.addAttribute("message",studentName);
		
		//return the view  page name
		return "helloworld";
	}
}
