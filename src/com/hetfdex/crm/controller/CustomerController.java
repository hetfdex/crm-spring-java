package com.hetfdex.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hetfdex.crm.entity.Customer;
import com.hetfdex.crm.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String getCustomers(Model model) {
		model.addAttribute("customers", customerService.getCustomers());

		return "list-customers";
	}

	@GetMapping("/add")
	public String addCustomer(Model model) {
		Customer customer = new Customer();

		model.addAttribute("customer", customer);

		return "add-customer";
	}

	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);

		return "redirect:/customer/list";
	}

	@GetMapping("/update")
	public String updateCustomer(@RequestParam("customerID") long id, Model model) {
		Customer customer = customerService.getCustomer(id);
		
		model.addAttribute("customer", customer);

		return "add-customer";
	}
}