package com.hetfdex.crm.service;

import java.util.List;

import com.hetfdex.crm.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(long id);
}