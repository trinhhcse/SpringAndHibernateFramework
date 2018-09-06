package com.springmvc.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.hibernate.dao.CustomerDAO;
import com.springmvc.hibernate.entity.Customer;
import com.springmvc.hibernate.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//inject customerDao because 1 implement of customerDAO so not need to qualifier
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		
		//get customers from customer service
		List<Customer> customers = customerService.getCustomers();
		
		//Add List Customer to model
		model.addAttribute("customers",customers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute(name="customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam(name="customerId") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam(name="customerId") int id
									,Model model) {
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customer",customer);
		return "customer-form";
	}
	
	
}
