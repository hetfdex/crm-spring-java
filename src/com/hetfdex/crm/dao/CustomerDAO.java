package com.hetfdex.crm.dao;

import java.util.List;

import com.hetfdex.crm.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
}