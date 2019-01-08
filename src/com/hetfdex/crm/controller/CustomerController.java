package com.hetfdex.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hetfdex.crm.dao.CustomerDAO;
import com.hetfdex.crm.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerDAO customerDAO;

	@GetMapping("/list")
	public String getCustomers(Model model) {
		List<Customer> customers = customerDAO.getCustomers();

		model.addAttribute("customers", customers);

		return "list-customers";
	}
}