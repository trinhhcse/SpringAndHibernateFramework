package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Controller request mapping
@Controller
public class SillyController {

	@RequestMapping("/showForm")
	public String displayForm() {
		return "silly";
	}
}
